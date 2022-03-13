import cv2 as cv
import numpy as np
import random
import math
import copy

UNIT = 50
class point:
    """Simple point with an x coordinate and an y coordinate in the cartesian plane. Each unit in the plane represents 50 pixels in the
    graphic interface and, thus, UNIT=50."""
    def __init__(self,y,x,px=False):
        if not px:
            self.x = round(x*UNIT)
            self.y = round(y*UNIT)
        else:
            self.x = x
            self.y = y

    def __str__(self):
        return "("+str(self.x)+","+str(self.y)+")"

    def __repr__(self):
        return "("+str(self.x)+","+str(self.y)+")"

    def tuple(self):
        return (int(self.x),int(self.y))

def rotateAround(p : point, pivot : point, angle):
    angle = math.radians(angle)
    x = p.x-pivot.x
    y = p.y-pivot.y
    xf = x*math.cos(angle) - y*math.sin(angle)
    yf = x*math.sin(angle) + y*math.cos(angle)
    xf = xf + pivot.x
    yf = yf + pivot.y
    v = point(0,0)
    v.x = xf
    v.y = yf
    return v

class drawable:
    def __init__(self,position=point(0,0),hidden=False):
        self.position = position
        self.hidden = hidden
        self.center = point(0,0)
        self.angle = 0
        self.layer = 0

    def moveBy(self,vector):
        self.position.x=self.position.x+vector.x
        self.position.y=self.position.y+vector.y

    def moveTo(self,coords):
        self.position.x=coords.x
        self.position.y=coords.y

    def hide(self):
        """Hide a figure, as in make it not visible"""
        self.hidden=True

    def show(self):
        """Show a figure, as in make it visible"""
        self.hidden=False

def getLayer(d):
    return d[1].layer


class figure(drawable):
    """Composite figure, contains other figures/primitives"""
    def __init__(self,position=point(0,0),hidden=False):
        super().__init__(position,hidden)
        self.contents={}                                        # Dictionary which will hold the figures - is the container
        self.vars={}
        self.randomID=0                                         # This will be used to assign a label to figures that don't have them

    def add(self,figure,idx=None):
        """Add a figure/primitive to a composite figure"""
        if idx==None:                                           # If there's no label given, get a computer-generated one
            self.randomID=self.randomID+1                       
            idx=str(self.randomID)
        self.contents[idx]=figure                               # Add to the dictionary both the figure itself and it's offset (relative position to where the composite will be drawn)

    def addVar(self,value,label):
        self.vars[label] = value

    def remove(self,idx):
        """Remove a figure/primitive from a composite figure"""
        self.contents.pop(idx)

    def draw(self,canvas):
        """Draw the figure on the given canvas"""     
        for fig in sorted(list(self.contents.items()),key=getLayer):    
            self.contents[fig[0]].angle = self.angle                           
            y= self.position.y + self.center.y + self.contents[fig[0]].position.y + self.contents[fig[0]].center.y
            x= self.position.x + self.center.x + self.contents[fig[0]].position.x + self.contents[fig[0]].center.x
            self.contents[fig[0]].drawAt(canvas,point(y,x,True))

    def drawAt(self,canvas,pointt):
        """Draw the figure on the given canvas"""
        for fig in sorted(list(self.contents.items()),key=getLayer): 
            self.contents[fig[0]].angle = self.angle                            
            y= pointt.y + self.center.y + self.contents[fig[0]].position.y + self.contents[fig[0]].center.y
            x= pointt.x + self.center.x + self.contents[fig[0]].position.x + self.contents[fig[0]].center.x
            self.contents[fig[0]].drawAt(canvas,point(y,x,True))
            
    def rotate(self, pivot : point, angle):
        self.angle += angle
        for fig in self.contents:
            if isinstance(self.contents[fig],figure):
                newpivot = diffPoint(pivot,self.contents[fig].position)
                self.contents[fig].rotate(newpivot, angle)
            else:
                self.contents[fig].position = rotateAround(self.contents[fig].position,pivot,angle)
                self.contents[fig].angle += angle
                

    def recolorFill(self,color,who):
        """Change the fill color of the figure"""
        if who==None:
            for fig in self.contents:
                self.contents[fig][0].recolorFill(color,who)
        else:
            self.contents[fig][0].recolorFill(color,who)

    def recolorBorder(self,border_color,who):
        """Change the border color of the figure"""
        if who==None:
            for fig in self.contents:
                self.contents[fig][0].recolorBorder(border_color,who)
        else:
            self.contents[fig][0].recolorBorder(border_color,who)

    def rethicc(self,thickness,who):
        """Change the thiccness of the figure"""
        if who==None:
            for fig in self.contents:
                self.contents[fig][0].rethicc(thickness,who)
        else:
            self.contents[fig][0].rethicc(thickness,who)

    def moveBy(self,vector):
        """Move the figure relatively to its current position, according to a given vector"""
        for fig in self.contents:
            self.contents[fig].moveBy(vector)

    def moveTo(self,coords):
        """Move the figure to an absolute position, according to a given point"""
        super().moveTo(coords)

    def hide(self):
        """Hide a figure, as in make it not visible"""
        for fig in self.contents:
            self.contents[fig].hide()

    def show(self):
        """Hide a figure, as in make it not visible"""
        for fig in self.contents:
            self.contents[fig][0].show()
            
    def getHitboxPoints(self) : #list
        hitboxList=[]
        for fig in self.contents.values():
            temp=fig.getHitboxPoints()
            if len(temp) >1:
                for hit in temp:
                    hitboxList.append(hit)
            else:
                hitboxList.append(temp)
        return hitboxList

    def checkCollision(self,hitbox)  : #Bool
        #print(hitbox,"hugbox")
        if len(hitbox)==1:
            for fig in self.contents.values():
                if fig.checkCollision(hitbox):
                   #print("amogus")
                    return True
        else:
            for outHit in hitbox:
                if self.checkCollision(outHit):
                    return True
        return False      

class primitive(drawable):
    """Base class that serves as a mold for the primitives."""
    def __init__(self,position=point(0,0),fill_color=(255,255,255),border_color=(255,255,255),thickness=3,fill=True,hidden=False):
        super().__init__(position,hidden)
        self.border_color = border_color
        self.fill = fill
        self.fill_color = fill_color
        self.thickness=thickness

    def recolor(self,color):
        self.fill_color=fill_color
        self.border_color = border_color

    def recolorFill(self,color,who):
        self.fill_color=fill_color

    def recolorBorder(self,border_color,who):
        self.border_color = border_color
        
    def rethicc(self,thickness,who):
        self.thickness=thickness

    def moveBy(self,vector):
        self.position.x=self.position.x+vector.x
        self.position.y=self.position.y+vector.y

    def moveTo(self,coords):
        self.position.x=coords.x
        self.position.y=coords.y

    def hide(self):
        """Hide a figure, as in make it not visible"""
        self.hidden=True

    def show(self):
        """Show a figure, as in make it visible"""
        self.hidden=False

    def noFill(self):
        self.fill = False

    def fillWith(self,fill_color):
        self.fill = True
        self.fill_color = fill_color

class circle(primitive):
    """Primitive circle class. Is round, has center.""" # Have circle will travel
    def __init__(self,position=point(0,0),radius=1,fill_color=(255,255,255),border_color=(255,255,255),thickness=3,fill=True,hidden=False):
        super().__init__(position,fill_color,border_color,thickness,fill,hidden)
        self.radius=radius*UNIT
        self.hitbox =[self.position.x-self.radius*UNIT,self.position.y-self.radius*UNIT,self.position.x+self.radius*UNIT,self.position.y+self.radius*UNIT]
        self.points=[point(self.hitbox[0],self.hitbox[1],True),
                     point(self.hitbox[0],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[1],True)]


    def draw(self,canvas):
        """Draw a circle using OpenCV"""
        if self.fill: cv.circle(canvas,sumPoint(self.center,self.position).tuple(),int(self.radius*UNIT),self.fill_color,-1)
        cv.circle(canvas,sumPoint(self.center,self.position).tuple(),int(self.radius*UNIT),self.border_color,self.thickness)
        self.hitbox =[self.center.x+self.position.x-self.radius*UNIT,
                        self.center.y+self.position.y-self.radius*UNIT,
                        self.center.x+self.position.x+self.radius*UNIT,
                        self.center.y+self.position.y+self.radius*UNIT]

        self.points=[point(self.hitbox[0],self.hitbox[1],True),
                     point(self.hitbox[0],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[1],True)]

    def drawAt(self,canvas,pointA):
        """Draw a circle using OpenCV"""
        if self.fill: cv.circle(canvas,sumPoint(self.center,pointA).tuple(),int(self.radius*UNIT),self.fill_color,-1)
        cv.circle(canvas,sumPoint(self.center,pointA).tuple(),int(self.radius*UNIT),self.border_color,self.thickness)
        
        
        self.hitbox =[self.center.x+pointA.x-self.radius*UNIT,
                      self.center.y+pointA.y-self.radius*UNIT,
                      self.center.x+pointA.x+self.radius*UNIT,
                      self.center.y+pointA.y+self.radius*UNIT]
        self.points=[point(self.hitbox[0],self.hitbox[1],True),
                     point(self.hitbox[0],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[1],True)]


    def rotate(self, pivot : point, angle):
        self.center = rotateAround(self.center, pivot, angle)
        
    def recolorFill(self,color,who):
        super().recolorFill(color,who)
        
    def recolorBorder(self,border_color,who):
        super().recolorBorder(border_color,who)
        
    def rethicc(self,thickness,who):
        super().rethicc(thickness,who)
        
    def moveBy(self,vector):
        super().moveBy(vector)

    def moveTo(self,coords):
        super().moveTo(coords)

    def hide(self):
        super().hide()

    def show(self):
        super().show()

    def noFill(self):
        super().noFill()

    def fillWith(self, fill_color):
        super().fillWith(fill_color)

    def getHitboxPoints(self) : #list
        return [[self.hitbox[0],self.hitbox[1],self.hitbox[2],self.hitbox[3]]]

    #hitbox -> [smolX smolY bigX bigY]
    def checkCollision(self,hitboxCaixa)  : #Bool
        for hitbox in hitboxCaixa:
            if type(hitbox[0])!=int:
                while len(hitbox[0])!=4:
                    hitbox=hitbox[0]
                hitbox=hitbox[0]
            if len(self.points) == 0:
                return False                
            bigX = hitbox[0]
            bigY = hitbox[1]
            smolX = hitbox[2]
            smolY = hitbox[3]
            for pt in self.points:
                #print(str(point))
                if pt.x >= smolX and pt.x<=bigX and pt.y>=smolY and pt.y<=bigY:
                    return True
        return False
 
class ellipse(primitive):
    """Primitive ellipse class. Like a circle but a bit wonky."""
    def __init__(self,position=point(0,0),width=2,height=1,fill_color=(255,255,255),border_color=(255,255,255),thickness=3,fill=True,hidden=False):
        super().__init__(position,fill_color,border_color,thickness,fill,hidden)
        self.width = width
        self.height = height
    
        self.hitbox =[  self.position.x-self.width*UNIT,
                        self.position.y-self.height*UNIT,
                        self.position.x+self.width*UNIT,
                        self.position.y+self.height*UNIT]

        self.points=[point(self.hitbox[0],self.hitbox[1],True),
                     point(self.hitbox[0],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[1],True)]
    def draw(self,canvas):
        """Draw an ellipse using OpenCV"""
        if self.fill:
            cv.ellipse(canvas,sumPoint(self.center,self.position).tuple(),(int(self.width*UNIT),int(self.height*UNIT)),self.angle,0,360,self.fill_color,-1)
        cv.ellipse(canvas,sumPoint(self.center,self.position).tuple(),(int(self.width*UNIT),int(self.height*UNIT)),self.angle,0,360,self.border_color,self.thickness)

        self.hitbox =[self.center.x+self.position.x-self.width*UNIT,
                        self.center.y+self.position.y-self.height*UNIT,
                        self.center.x+self.position.x+self.width*UNIT,
                        self.center.y+self.position.y+self.height*UNIT]

        self.points=[point(self.hitbox[0],self.hitbox[1],True),
                     point(self.hitbox[0],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[1],True)]
    def drawAt(self,canvas,pointA):
        """Draw an ellipse using OpenCV"""
        if self.fill:
            cv.ellipse(canvas,sumPoint(self.center,pointA).tuple(),(int(self.width*UNIT),int(self.height*UNIT)),self.angle,0,360,self.fill_color,-1)
        cv.ellipse(canvas,sumPoint(self.center,pointA).tuple(),(int(self.width*UNIT),int(self.height*UNIT)),self.angle,0,360,self.border_color,self.thickness)

        self.hitbox =[self.center.x+pointA.x-self.width*UNIT,
                      self.center.y+pointA.y-self.height*UNIT,
                      self.center.x+pointA.x+self.width*UNIT,
                      self.center.y+pointA.y+self.height*UNIT]
        self.points=[point(self.hitbox[0],self.hitbox[1],True),
                     point(self.hitbox[0],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[3],True),
                     point(self.hitbox[2],self.hitbox[1],True)]

    def rotate(self, pivot : point, angle):
        self.center = rotateAround(self.center, pivot, angle)
        self.angle += angle
    
    def recolorFill(self,color,who):
        super().recolorFill(color,who)
        
    def recolorBorder(self,border_color,who):
        super().recolorBorder(border_color,who)
        
    def rethicc(self,thickness,who):
        super().rethicc(thickness,who)
        
    def moveBy(self,vector):
        super().moveBy(vector)

    def moveTo(self,coords):
        super().moveTo(coords)

    def hide(self):
        super().hide()

    def show(self):
        super().show()

    def noFill(self):
        super().noFill()

    def fillWith(self, fill_color):
        super().fillWith(fill_color)

             
    def getHitboxPoints(self) : #list
        return [[int(self.hitbox[0]),self.hitbox[1],self.hitbox[2],self.hitbox[3]]]

    #hitbox -> [smolX smolY bigX bigY]
    def checkCollision(self,hitboxCaixa)  : #Bool
        for hitbox in hitboxCaixa:
            if type(hitbox[0])!=int:
                while len(hitbox[0])!=4:
                    hitbox=hitbox[0]
                hitbox=hitbox[0]

            if len(self.points) == 0:
                return False               
            bigX = hitbox[0]
            bigY = hitbox[1]
            smolX = hitbox[2]
            smolY = hitbox[3]
            for pt in self.points:
               #print("ha, sou um circulo cringe")
                #print(str(point))
                if pt.x >= smolX and pt.x<=bigX and pt.y>=smolY and pt.y<=bigY:
                    return True
        return False
class arc(primitive): 
    """Primitive elliptical arc class, a portion of an ellipse defined by a certain angle."""
    def __init__(self,position=point(0,0),height=1,width=2,angle=180,border_color=(255,255,255),thickness=3,hidden=False):
        super().__init__(position,(0,0,0),border_color,thickness,False,hidden)
        self.height = height
        self.width = width
        self.angle = angle

    def draw(self,canvas):
        """Draw an elliptical arc using OpenCV"""
        cv.ellipse(canvas,(int(self.position.y),int(self.position.x)),(self.width,self.height),0,0,self.angle,self.color,self.thickness)

    def drawAt(self,canvas,point):
        """Draw an elliptical arc using OpenCV"""
        cv.ellipse(canvas,(int(point.y),int(point.x)),(self.width,self.height),0,0,self.angle,self.color,self.thickness)
    
    def recolorFill(self,color,who):
        super().recolorFill(color,who)
        
    def recolorBorder(self,border_color,who):
        super().recolorBorder(border_color,who)
        
    def rethicc(self,thickness,who):
        super().rethicc(thickness,who)
        
    def moveBy(self,vector):
        super().moveBy(vector)

    def moveTo(self,coords):
        super().moveTo(coords)
            
    def hide(self):
        super().hide()

    def show(self):
        super().show()

    def noFill(self):
        super().noFill()

    def fillWith(self, fill_color):
        super().fillWith(fill_color)

#TODO: Finish this thing \/
class polygon(primitive):
    def __init__(self,position=point(0,0),points=[point(0,0),point(1,1),point(0,2)],fill_color=(255,255,255),border_color=(255,255,255),thickness=3,fill=True,hidden=False):
        super().__init__(position,fill_color,border_color,thickness,fill,hidden)
        self.points = points
        self.position = position
        self.pnt = points
        for i in range(4):
                    bigX = None
                    bigY = None
                    smolX = None
                    smolY = None
                    for pt in self.pnt:
                        if bigX == None or pt.x>bigX:
                            bigX=pt.x
                        if bigY == None or pt.y>bigY:
                            bigY=pt.y
                        if smolX == None or pt.x<smolX:
                            smolX=pt.x
                        if smolY == None or pt.y<smolY:
                            smolY=pt.y
        
                    self.bigX = bigX
                    self.bigY = bigY
                    self.smolX = smolX
                    self.smolY = smolY
                    break
        
        
    def rotate(self, pivot : point, angle):
        self.angle += angle
        self.center = rotateAround(self.center,pivot,angle)
        # for i in range(len(self.points)):
        #     self.points[i] = rotateAround(self.points[i],pivot,angle)

    def selfRot(self,angle,pts):
        pivot = point(0,0)
        for i in range(len(pts)):
            pts[i] = rotateAround(pts[i],pivot,angle)
        return pts

    def draw(self,canvas):
        """Draw a polygon using OpenCV"""
        pts = copy.deepcopy(self.points)
        pts = self.selfRot(self.angle,pts)
        self.CVpts = []
        self.pnt = []
        for pt in pts:
            x = self.position.x+self.center.x+pt.x
            y = self.position.y+self.center.y+pt.y
            self.CVpts.append([int(x),int(y)])
            self.pnt.append([int(x),int(y)])
            for i in range(4):
                if self.pnt[i]!=self.points[i]:
                    bigX = None
                    bigY = None
                    smolX = None
                    smolY = None
                    for pt in self.CVpts:
                        if bigX == None or pt[0]>bigX:
                            bigX=pt[0]
                        if bigY == None or pt[1]>bigY:
                            bigY=pt[1]
                        if smolX == None or pt[0]<smolX:
                            smolX=pt[0]
                        if smolY == None or pt[1]<smolY:
                            smolY=pt[1]
        
                    self.bigX = bigX
                    self.bigY = bigY
                    self.smolX = smolX
                    self.smolY = smolY
                    break
        self.CVpts = np.array(self.CVpts)
        #print("cvpts:",self.CVpts)

        if self.fill:
            cv.fillPoly(canvas, np.int32([self.CVpts]), self.fill_color)
        cv.polylines(canvas, np.int32([self.CVpts]), True, self.border_color, self.thickness)

    def drawAt(self,canvas,pointt):
        """Draw a polygon using OpenCV"""
        pts = copy.deepcopy(self.points)
        pts = self.selfRot(self.angle,pts)
        self.CVpts = []
        self.pnt=[]
        for pt in pts:
            x = pointt.x+self.center.x+pt.x
            y = pointt.y+self.center.y+pt.y
            self.CVpts.append([int(x),int(y)])
            self.pnt.append([int(x),int(y)])
        self.CVpts = np.array(self.CVpts)

        if self.fill:
            cv.fillPoly(canvas, np.int32([self.CVpts]), self.fill_color)
        cv.polylines(canvas, np.int32([self.CVpts]), True, self.border_color, self.thickness)
        for i in range(4):
            #print(self.ourpts)
            if self.pnt[i]!=self.points[i]:
                bigX = None
                bigY = None
                smolX = None
                smolY = None
                for pt in self.pnt:
                    if bigX == None or pt[0]>bigX:
                        bigX=pt[0]
                    if bigY == None or pt[1]>bigY:
                        bigY=pt[1]
                    if smolX == None or pt[0]<smolX:
                        smolX=pt[0]
                    if smolY == None or pt[1]<smolY:
                        smolY=pt[1]
                self.bigX = bigX
                self.bigY = bigY
                self.smolX = smolX
                self.smolY = smolY
                break

    def recolorFill(self,color,who):
        super().recolorFill(color,who)
        
    def recolorBorder(self,border_color,who):
        super().recolorBorder(border_color,who)
        
    def rethicc(self,thickness,who):
        super().rethicc(thickness,who)
        
    def moveBy(self,vector):
        super().moveBy(vector)

    def moveTo(self,coords):
        super().moveTo(coords)
        
    def hide(self):
        super().hide()

    def show(self):
        super().show()

    def noFill(self):
        super().noFill()

    def fillWith(self, fill_color):
        super().fillWith(fill_color)
     
    def getHitboxPoints(self) : #list
        toRet=[self.smolX,self.smolY,self.bigX,self.bigY]
        return [toRet]

    def checkCollision(self,hitboxCaixa)  : #Boolean
        for hitbox in hitboxCaixa:
            if type(hitbox[0])!=int:
               while len(hitbox[0])!=4:
                   hitbox=hitbox[0]
               hitbox=hitbox[0]
           #print("poly:",hitboxCaixa)
            if len(self.pnt) == 0:
                return False 
            smolX = hitbox[0]
            smolY = hitbox[1]
            bigX = hitbox[2]
            bigY = hitbox[3]
            #print("poly hitting this s",hitbox)
            for pt in self.pnt:
               #print("cringe polygon")
                try:
                    if pt.x >= smolX and pt.x<=bigX and pt.y>=smolY and pt.y<=bigY:
                       #print("1:",pt.x, pt.y)
                        return True
                except:
                    if pt[0] >= smolX and pt[0]<=bigX and pt[1]>=smolY and pt[1]<=bigY:
                       #print("2:",pt[0], pt[1])
                        return True
        return False

class polyline(primitive):
    def __init__(self,position=point(0,0),points=[point(0,0),point(1,1),point(0,2)],border_color=(255,255,255),thickness=3,hidden=False):
        super().__init__(position,(0,0,0),border_color,thickness,False,hidden)
        self.points = points
        self.position = position
        self.pnt = points
        for i in range(4):
            bigX = None
            bigY = None
            smolX = None
            smolY = None
            for pt in self.points:
                if bigX == None or pt.x>bigX:
                    bigX=pt.x
                if bigY == None or pt.y>bigY:
                    bigY=pt.y
                if smolX == None or pt.x<smolX:
                    smolX=pt.x
                if smolY == None or pt.y<smolY:
                    smolY=pt.y

            self.bigX = bigX
            self.bigY = bigY
            self.smolX = smolX
            self.smolY = smolY
            break
        
        
    def rotate(self, pivot : point, angle):
        for i in range(len(self.points)):
            self.points[i] = rotateAround(self.points[i],pivot,angle)

    def selfRot(self,angle,pts):
        pivot = point(0,0)
        for i in range(len(pts)):
            pts[i] = rotateAround(pts[i],pivot,angle)
        return pts

    def draw(self,canvas):
        """Draw a polygon using OpenCV"""
        #cv.polylines(canvas,self.points,True,self.color,self.thickness) 
        pts = copy.deepcopy(self.points)
        pts = self.selfRot(self.angle,pts)
        self.pnt = []
        CVpts = []
        for pt in pts:
            x = self.position.x+self.center.x+pt.x
            y = self.position.y+self.center.y+pt.y
            self.pnt.append([int(x),int(y)])
            CVpts.append([int(x),int(y)])
        CVpts = np.array(CVpts)
        cv.polylines(canvas, np.int32([CVpts]), False, self.border_color, self.thickness)
        for i in range(4):
            if self.pnt[i]!=self.points[i]:
                bigX = None
                bigY = None
                smolX = None
                smolY = None
                for pt in self.pnt:
                    if bigX == None or pt[0]>bigX:
                        bigX=pt[0]
                    if bigY == None or pt[1]>bigY:
                        bigY=pt[1]
                    if smolX == None or pt[0]<smolX:
                        smolX=pt[0]
                    if smolY == None or pt[1]<smolY:
                        smolY=pt[1]
                self.bigX = bigX
                self.bigY = bigY
                self.smolX = smolX
                self.smolY = smolY
                break






    def drawAt(self,canvas,pointt):
        """Draw a polygon using OpenCV"""
        #cv.polylines(canvas,self.points,True,self.color,self.thickness) 
        pts = copy.deepcopy(self.points)
        pts = self.selfRot(self.angle,pts)
        self.pnt = []
        CVpts = []
        for pt in pts:
            x = pointt.x+self.center.x+pt.x
            y = pointt.y+self.center.y+pt.y
            self.pnt.append([int(x),int(y)])
            CVpts.append([int(x),int(y)])
        CVpts = np.array(CVpts)
        cv.polylines(canvas, np.int32([CVpts]), False, self.border_color, self.thickness)
        for i in range(4):
            if self.pnt[i]!=self.points[i]:
                bigX = None
                bigY = None
                smolX = None
                smolY = None
                for pt in self.pnt:
                    if bigX == None or pt[0]>bigX:
                        bigX=pt[0]
                    if bigY == None or pt[1]>bigY:
                        bigY=pt[1]
                    if smolX == None or pt[0]<smolX:
                        smolX=pt[0]
                    if smolY == None or pt[1]<smolY:
                        smolY=pt[1]
                self.bigX = bigX
                self.bigY = bigY
                self.smolX = smolX
                self.smolY = smolY
                break

    def recolorFill(self,color,who):
        super().recolorFill(color,who)
        
    def recolorBorder(self,border_color,who):
        super().recolorBorder(border_color,who)
        
    def rethicc(self,thickness,who):
        super().rethicc(thickness,who)
        
    def moveBy(self,vector):
        super().moveBy(vector)

    def moveTo(self,coords):
        super().moveTo(coords)
        
    def hide(self):
        super().hide()

    def show(self):
        super().show()

    def noFill(self):
        super().noFill()

    def fillWith(self, fill_color):
        super().fillWith(fill_color)

    def getHitboxPoints(self) : #list
        toRet=[self.smolX,self.smolY,self.bigX,self.bigY]
        return [toRet]

    def checkCollision(self,hitboxCaixa)  : #Bool
        for hitbox in hitboxCaixa:
            if type(hitbox[0])!=int:
               while len(hitbox[0])!=4:
                   hitbox=hitbox[0]
               hitbox=hitbox[0]

            if len(self.pnt) == 0:
                return False 
            bigX = hitbox[0]
            bigY = hitbox[1]
            smolX = hitbox[2]
            smolY = hitbox[3]
            isColliding=False
            for pt in self.pnt:
                try:
                    if pt.x >= smolX and pt.x<=bigX and pt.y>=smolY and pt.y<=bigY:
                        return True
                except:
                    if pt[0] >= smolX and pt[0]<=bigX and pt[1]>=smolY and pt[1]<=bigY:
                        return True

        return False

class line(polyline):
    """Simple line defined by two points."""
    def __init__(self,position=point(0,0),pts=[point(0,0),point(1,1)],border_color=(255,255,255),thickness=3,hidden=False):
        super().__init__(position,pts,border_color,thickness,hidden)

class rectangle(polygon):
    def __init__(self,position=point(0,0),width=3,height=2,fill_color=(255,255,255),border_color=(255,255,255),thickness=3,fill=True,hidden=False):
        self.width = width
        self.height = height
        p1 = point(0,0)
        p2 = point(0,self.width)
        p3 = point(self.height,self.width)
        p4 = point(self.height,0)
        pts = [p1,p2,p3,p4]
        self.hitb=[]

        super().__init__(position,pts,fill_color,border_color,thickness,fill,hidden)

        
        
        
    def selfRot(self,angle):
        pivot = point(0,0)
        for i in range(len(self.points)):
            self.points[i] = rotateAround(self.points[i],pivot,angle)
    
    def rotate(self, pivot : point, angle):
        self.angle += angle
        self.center = rotateAround(self.center,pivot,angle)

    def draw(self,canvas):
        p1 = point(0,0)
        p2 = point(0,self.width)
        p3 = point(self.height,self.width)
        p4 = point(self.height,0)
        self.points = [p1,p2,p3,p4]
        self.selfRot(self.angle)
        pts = []
        self.hitb=[]

        for pointt in self.points:
            x = self.center.x+self.position.x+pointt.x
            y = self.center.y+self.position.y+pointt.y
            pts.append([int(x),int(y)])
            self.hitb.append([int(x),int(y)])

        pts = np.array(pts)
        if self.fill:
            cv.fillPoly(canvas, np.int32([pts]), self.fill_color)
        cv.polylines(canvas, np.int32([pts]), True, self.border_color, self.thickness)
        bigX = None
        bigY = None
        smolX = None
        smolY = None
        for pnt in self.hitb:
            if pnt!=None:
                    if bigX == None or pnt[0]>bigX:
                        bigX=pnt[0]
                    if bigY == None or pnt[1]>bigY:
                        bigY=pnt[1]
                    if smolX == None or pnt[0]<smolX:
                        smolX=pnt[0]
                    if smolY == None or pnt[1]<smolY:
                        smolY=pnt[1]
        self.bigX = bigX
        self.bigY = bigY
        self.smolX = smolX
        self.smolY = smolY

    def drawAt(self,canvas,pointtt):
        p1 = point(0,0)
        p2 = point(0,self.width)
        p3 = point(self.height,self.width)
        p4 = point(self.height,0)
        self.points = [p1,p2,p3,p4]
        self.selfRot(self.angle)
        pts = []
        self.hitb = []
        for pointt in self.points:
            x = self.center.x+pointtt.x+pointt.x
            y = self.center.y+pointtt.y+pointt.y
            pts.append([int(x),int(y)])
            self.hitb.append([int(x),int(y)])

        pts = np.array(pts)
        if self.fill:
            cv.fillPoly(canvas, np.int32([pts]), self.fill_color)
        cv.polylines(canvas, np.int32([pts]), True, self.border_color, self.thickness)
        bigX = None
        bigY = None
        smolX = None
        smolY = None
        for pnt in self.hitb:
            if pnt!=None:
                    if bigX == None or pnt[0]>bigX:
                        bigX=pnt[0]
                    if bigY == None or pnt[1]>bigY:
                        bigY=pnt[1]
                    if smolX == None or pnt[0]<smolX:
                        smolX=pnt[0]
                    if smolY == None or pnt[1]<smolY:
                        smolY=pnt[1]
        self.bigX = bigX
        self.bigY = bigY
        self.smolX = smolX
        self.smolY = smolY
        ##print(f"{bigX=}")
        ##print(f"{bigY=}")
        ##print(f"{smolX=}")
        ##print(f"{smolY=}")

    def recolorFill(self,color,who):
        super().recolorFill(color,who)

    def recolorBorder(self,border_color,who):
        super().recolorBorder(border_color,who)
        
    def rethicc(self,thickness,who):
        super().rethicc(thickness,who)

    def moveBy(self,vector):
        super().moveBy(vector)

    def moveTo(self,coords):
        super().moveTo(coords)

    def hide(self):
        super().hide()

    def show(self):
        super().show()

    def noFill(self):
        super().noFill()

    def fillWith(self, fill_color):
        super().fillWith(fill_color)
    
    def getHitboxPoints(self) : #list
        
        toRet=[int(self.smolX),self.smolY,self.bigX,self.bigY]
        return [toRet]
    
    def checkCollision(self,hitboxCaixa)  : #Bool
        for hitbox in hitboxCaixa:
            if type(hitbox[0])!=int:
               while len(hitbox[0])!=4:
                   hitbox=hitbox[0]
               hitbox=hitbox[0]
           #print("rect coords: ",self.hitb)    
           #print(hitboxCaixa)
            if len(self.hitb) == 0:
                return False 
           #print("other coords",hitbox)   
            smolX = hitbox[0]
            smolY = hitbox[1]
            bigX = hitbox[2]
            bigY = hitbox[3]
            for pt in self.hitb:
               #print("smolX:",pt[0],smolX)
               #print("bigX:",pt[0],bigX)
               #print("smolY:",pt[1],smolY)
               #print("bigY:",pt[1],bigY)
                if pt[0] >= smolX and pt[0]<=bigX and pt[1]>=smolY and pt[1]<=bigY:
                    return True
        return False

class square(polygon):
    def __init__(self,position=point(0,0),length=1,fill_color=(255,255,255),border_color=(255,255,255),thickness=3,fill=True,hidden=False):
      #  super().__init__(position,fill_color,border_color,thickness,fill,hidden)
        self.length = length
        self.angle = 0
        self.center = point(0,0)
        p1 = point(0,0)
        p2 = point(0,self.length)
        p3 = point(self.length,self.length)
        p4 = point(self.length,0)
        pts = [p1,p2,p3,p4]
        self.hitb=pts

        super().__init__(position,pts,fill_color,border_color,thickness,fill,hidden)
        

    def selfRot(self,angle):
        pivot = point(0,0)
        for i in range(len(self.points)):
            self.points[i] = rotateAround(self.points[i],pivot,angle)

    def rotate(self, pivot : point, angle):
        self.angle += angle
        self.center = rotateAround(self.center,pivot,angle)

    def draw(self,canvas):
        p1 = point(0,0)
        p2 = point(0,self.length)
        p3 = point(self.length,self.length)
        p4 = point(self.length,0)
        self.points = [p1,p2,p3,p4]
        self.selfRot(self.angle)
        pts = []
        self.hitb=[]
        for pointt in self.points:
            x = self.center.x+self.position.x+pointt.x
            y = self.center.y+self.position.y+pointt.y
            pts.append([int(x),int(y)])
            self.hitb.append([int(x),int(y)])
        pts = np.array(pts)
        if self.fill:
            cv.fillPoly(canvas, np.int32([pts]), self.fill_color)
        cv.polylines(canvas, np.int32([pts]), True, self.border_color, self.thickness)
        bigX = None
        bigY = None
        smolX = None
        smolY = None
        #print("hitb:",self.hitb)
        for pnt in self.hitb:
            if pnt!=None:
                    if bigX == None or pnt[0]>bigX:
                        bigX=pnt[0]
                    if bigY == None or pnt[1]>bigY:
                        bigY=pnt[1]
                    if smolX == None or pnt[0]<smolX:
                        smolX=pnt[0]
                    if smolY == None or pnt[1]<smolY:
                        smolY=pnt[1]
        
        self.bigX = bigX
        self.bigY = bigY
        self.smolX = smolX
        self.smolY = smolY
        
    def drawAt(self,canvas,pointtt):
        p1 = point(0,0)
        p2 = point(0,self.length)
        p3 = point(self.length,self.length)
        p4 = point(self.length,0)
        self.points = [p1,p2,p3,p4]
        self.selfRot(self.angle)
        pts = []
        self.hitb=[]

        for pointt in self.points:
            x = self.center.x+pointtt.x+pointt.x
            y = self.center.y+pointtt.y+pointt.y
            pts.append([int(x),int(y)])
            self.hitb.append([int(x),int(y)])

        pts = np.array(pts)
        if self.fill:
            cv.fillPoly(canvas, np.int32([pts]), self.fill_color)
        cv.polylines(canvas, np.int32([pts]), True, self.border_color, self.thickness)
        bigX = None
        bigY = None
        smolX = None
        smolY = None
        for pnt in self.hitb:
            if bigX == None or pnt.x>bigX:
                bigX=pnt.x
            if bigY == None or pnt.y>bigY:
                bigY=pnt.y
            if smolX == None or pnt.x<smolX:
                smolX=pnt.x
            if smolY == None or pnt.y<smolY:
                smolY=pnt.y
        
        self.bigX = bigX
        self.bigY = bigY
        self.smolX = smolX
        self.smolY = smolY

    def recolorFill(self,color,who):
        super().recolorFill(color,who)
        
    def recolorBorder(self,border_color,who):
        super().recolorBorder(border_color,who)
        
    def rethicc(self,thickness,who):
        super().rethicc(thickness,who)
        
    def moveBy(self,vector):
        super().moveBy(vector)

    def moveTo(self,coords):
        super().moveTo(coords)
        
    def hide(self):
        super().hide()

    def show(self):
        super().show()

    def noFill(self):
        super().noFill()

    def fillWith(self, fill_color):
        super().fillWith(fill_color)
    
    def getHitboxPoints(self) : #list
        toRet=[int(self.smolX),self.smolY,self.bigX,self.bigY]
        return [toRet]
    
    def checkCollision(self,hitboxCaixa)  : #Bool
        for hitbox in hitboxCaixa:
            if type(hitbox[0])!=int:
               while len(hitbox[0])!=4:
                   hitbox=hitbox[0]
               hitbox=hitbox[0]

            if len(self.hitb) == 0:
                return False 
            smolX = hitbox[0]
            smolY = hitbox[1]
            bigX = hitbox[2]
            bigY = hitbox[3]
           #print("my  coords: ",self.hitb)     
           #print("other coords",hitbox)       
            for pt in self.hitb:
                try:
                    if pt.x >= smolX and pt.x<=bigX and pt.y>=smolY and pt.y<=bigY:
                        return True
                except:
                    if pt[0] >= smolX and pt[0]<=bigX and pt[1]>=smolY and pt[1]<=bigY:
                        return True

        return False

def render(img, TODRAW, TITLE, waitTime=0):
    for figure in sorted(list(TODRAW.items()),key=getLayer): # draw the figures
        if not figure[1].hidden:
            figure[1].draw(img)
    cv.imshow(TITLE, img) # show image
    key = cv.waitKey(waitTime) # wait specified time and retrieve pressed key
    return key

def sumPoint(pointA: point, pointB: point):
    x = pointA.x + pointB.x
    y = pointA.y + pointB.y
    ret = point(y,x,True)
    return ret

def diffPoint(pointA: point, pointB: point):
    x = pointA.x - pointB.x
    y = pointA.y - pointB.y
    ret = point(y,x,True)
    return ret

def sumPointNum(pointP: point, num):
    x = pointP.x + num*UNIT
    y = pointP.y + num*UNIT
    ret = point(y,x,True)
    return ret

def diffPointNum(pointP: point, num):
    x = pointP.x - num*UNIT
    y = pointP.y - num*UNIT
    ret = point(y,x,True)
    return ret

def mulPointNum(pointP: point, num):
    x = pointP.x * num*UNIT
    y = pointP.y * num*UNIT
    ret = point(y,x,True)
    return ret

def divPointNum(pointP: point, num):
    x = pointP.x / num*UNIT
    y = pointP.y / num*UNIT
    ret = point(y,x,True)
    return ret

def remPointNum(pointP: point, num):
    x = pointP.x % num*UNIT
    y = pointP.y % num*UNIT
    ret = point(y,x,True)
    return ret

# class circularArc(primitive):
#     "Primitive circular arc class, a portion of a circle defined by a certain angle."
#     def __init__(self,position=point(0,0),angle=180,radius=1,border_color=(255,255,255),thickness=3,hidden=False):
#         super().__init__(position,(0,0,0),border_color,thickness,False,hidden)
#         self.angle = angle
#         self.radius = radius

#     def draw(self,canvas):
#         """Draw a circular arc using OpenCV"""
#         cv.ellipse(canvas,(int(self.position.y),int(self.position.x)),(self.radius*2,self.radius*2),0,0,self.angle,self.border_color,self.thickness)
    
#     def drawAt(self,canvas,point):
#         """Draw a circular arc using OpenCV"""
#         cv.ellipse(canvas,(int(point.y),int(point.x)),(self.radius*2,self.radius*2),0,0,self.angle,self.border_color,self.thickness)
    
#     def recolorFill(self,color,who):
#         super().recolorFill(color,who)
        
#     def recolorBorder(self,border_color,who):
#         super().recolorBorder(border_color,who)
        
#     def rethicc(self,thickness,who):
#         super().rethicc(thickness,who)
        
#     def moveBy(self,vector):
#         super().moveBy(vector)

#     def moveTo(self,coords):
#         super().moveTo(coords)

#     def hide(self):
#         super().hide()

#     def show(self):
#         super().show()

#     def noFill(self):
#         super().noFill()

#     def fillWith(self, fill_color):
#         super().fillWith(fill_color)

# def render(self,img):
#     cv.imshow('cvOut',img)
#     cv.waitKey()

# def draw(TODRAW, TITLE, img):
#     for figure in TODRAW:
#         figure.draw(img)
#     cv.imshow(TITLE, img)