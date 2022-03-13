
from imports.library import *
from pygame import mixer

import numpy as np
import cv2 as cv
import copy

TITLE = "SpaceInvaders"
UNIT = 50
HEIGHT = 20
WIDTH = 20
FRAMERATE = 24
RET = -1
TODRAW = {}
KEYS = {}
STAMPS = {}
mixer.init()
mixer.music.load("./bin/imports/pew.ogg")
img = np.zeros((UNIT*WIDTH,UNIT*HEIGHT,3),np.uint8)

HEIGHT=18
WIDTH=12
img = np.zeros((UNIT*WIDTH,UNIT*HEIGHT,3),np.uint8)
STAMPS["spaceship"] = copy.deepcopy(figure())
obj = copy.deepcopy(rectangle())
obj.width=1
obj.height=1
obj.fill_color=(0,0,255)
STAMPS["spaceship"].add(obj,"base")
obj = copy.deepcopy(polygon())
obj.points=[point(1,0),point(1,-0.5),point(0,0)]
obj.fill_color=(255,0,0)
STAMPS["spaceship"].add(obj,"left_wing")
obj = copy.deepcopy(polygon())
obj.points=[point(1,1),point(1,1.5),point(0,1)]
obj.fill_color=(255,0,0)
STAMPS["spaceship"].add(obj,"right_wing")
obj = copy.deepcopy(polygon())
obj.points=[point(0,0),point(-1,0.5),point(0,1)]
obj.fill_color=(0,255,255)
STAMPS["spaceship"].add(obj,"front")
STAMPS["eye"] = copy.deepcopy(figure())
obj = copy.deepcopy(circle())
obj.fill_color=(0,0,0)
obj.border_color=(0,0,0)
obj.radius=0.075
STAMPS["eye"].add(obj,"left_eye")
STAMPS["alien"] = copy.deepcopy(figure())
obj = copy.deepcopy(rectangle())
obj.fill_color=(0,255,0)
obj.width=0.5
obj.height=0.5
obj.thickness=1
STAMPS["alien"].add(obj,"base")
obj = copy.deepcopy(STAMPS["eye"])
obj.moveTo(point(0.25,0.125))
STAMPS["alien"].add(obj,"left_eye")
obj = copy.deepcopy(STAMPS["eye"])
obj.moveTo(point(0.25,0.375))
STAMPS["alien"].add(obj,"right_eye")
STAMPS["bullet"] = copy.deepcopy(rectangle())
STAMPS["bullet"].width=0.25
STAMPS["bullet"].height=1
STAMPS["bullet"].fill_color=(0,255,255)
STAMPS["bullet"].hidden=True
STAMPS["teste"] = copy.deepcopy(circle())
STAMPS["teste"].radius=5
STAMPS["teste"].fill_color=(0,255,0)
x = 5
y = 10
ySpeed = 0.5
bY = -1
enemySpeed = 0.05
alienX = 2
isDestroyed = True
gameOver = False
firstRound = True
obj = copy.deepcopy(STAMPS["spaceship"])
obj.moveTo(point(100,100))
TODRAW["ship"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(2,2))
TODRAW["a1"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(2,3))
TODRAW["a2"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(2,4))
TODRAW["a3"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(2,5))
TODRAW["a4"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(3,2))
TODRAW["a5"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(3,3))
TODRAW["a6"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(3,4))
TODRAW["a7"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(3,5))
TODRAW["a8"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(4,2))
TODRAW["a9"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(4,3))
TODRAW["a10"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(4,4))
TODRAW["a11"] = obj
obj = copy.deepcopy(STAMPS["alien"])
obj.moveTo(point(4,5))
TODRAW["a12"] = obj
obj = copy.deepcopy(STAMPS["bullet"])
obj.moveTo(point(-5,-5))
TODRAW["b"] = obj
TODRAW["ship"].moveTo(point(x,y))
while not gameOver :
    if  RET==ord('a')  :
        x=x - 0.5
    if  RET==ord('d')  :
        x=x + 0.5
    if x < 0 :
        x=0
    if x > 17 :
        x=17
    if bY < 0 :
        if not isDestroyed :
            TODRAW["b"].hide()
            TODRAW["b"].moveTo(point(-5,-5))
            isDestroyed=True
        if  RET==ord('k')  :
            TODRAW["b"].moveTo(point(y,x+0.4))
            TODRAW["b"].show()
            bY=10
            isDestroyed=False
            mixer.music.play()
    elif not isDestroyed :
        TODRAW["b"].moveBy(point(-ySpeed,0))
        bY=bY - ySpeed
    TODRAW["a1"].moveBy(point(0,enemySpeed))
    TODRAW["a2"].moveBy(point(0,enemySpeed))
    TODRAW["a3"].moveBy(point(0,enemySpeed))
    TODRAW["a4"].moveBy(point(0,enemySpeed))
    TODRAW["a5"].moveBy(point(0,enemySpeed))
    TODRAW["a6"].moveBy(point(0,enemySpeed))
    TODRAW["a7"].moveBy(point(0,enemySpeed))
    TODRAW["a8"].moveBy(point(0,enemySpeed))
    TODRAW["a9"].moveBy(point(0,enemySpeed))
    TODRAW["a10"].moveBy(point(0,enemySpeed))
    TODRAW["a11"].moveBy(point(0,enemySpeed))
    TODRAW["a12"].moveBy(point(0,enemySpeed))
    alienX=alienX + enemySpeed
    if alienX > 14 or alienX < 1 :
        enemySpeed=enemySpeed * (-1)
        TODRAW["a1"].moveBy(point(1,0))
        TODRAW["a2"].moveBy(point(1,0))
        TODRAW["a3"].moveBy(point(1,0))
        TODRAW["a4"].moveBy(point(1,0))
        TODRAW["a5"].moveBy(point(1,0))
        TODRAW["a6"].moveBy(point(1,0))
        TODRAW["a7"].moveBy(point(1,0))
        TODRAW["a8"].moveBy(point(1,0))
        TODRAW["a9"].moveBy(point(1,0))
        TODRAW["a10"].moveBy(point(1,0))
        TODRAW["a11"].moveBy(point(1,0))
        TODRAW["a12"].moveBy(point(1,0))
    if not firstRound :
        hit = False
        if (not isDestroyed) and ((TODRAW["a1"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a1"].getHitboxPoints()))) :
            TODRAW["a1"].hide()
            TODRAW["a1"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a2"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a2"].getHitboxPoints()))) :
            TODRAW["a2"].hide()
            TODRAW["a2"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a3"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a3"].getHitboxPoints()))) :
            TODRAW["a3"].hide()
            TODRAW["a3"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a4"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a4"].getHitboxPoints()))) :
            TODRAW["a4"].hide()
            TODRAW["a4"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a5"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a5"].getHitboxPoints()))) :
            TODRAW["a5"].hide()
            TODRAW["a5"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a6"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a6"].getHitboxPoints()))) :
            TODRAW["a6"].hide()
            TODRAW["a6"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a7"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a7"].getHitboxPoints()))) :
            TODRAW["a7"].hide()
            TODRAW["a7"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a8"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a8"].getHitboxPoints()))) :
            TODRAW["a8"].hide()
            TODRAW["a8"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a9"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a9"].getHitboxPoints()))) :
            TODRAW["a9"].hide()
            TODRAW["a9"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a10"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a10"].getHitboxPoints()))) :
            TODRAW["a10"].hide()
            TODRAW["a10"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a11"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a11"].getHitboxPoints()))) :
            TODRAW["a11"].hide()
            TODRAW["a11"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if (not isDestroyed) and ((TODRAW["a12"].checkCollision(TODRAW["b"].getHitboxPoints()) or TODRAW["b"].checkCollision(TODRAW["a12"].getHitboxPoints()))) :
            TODRAW["a12"].hide()
            TODRAW["a12"].moveTo(point(100,100))
            hit=True
            isDestroyed=True
        if hit :
            TODRAW["b"].hide()
            TODRAW["b"].moveTo(point(-5,0))
            bY=-1
            if enemySpeed < 0 :
                enemySpeed=enemySpeed - 0.02
            else:
                enemySpeed=enemySpeed + 0.02
        if ((TODRAW["a1"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a1"].getHitboxPoints()))) or ((TODRAW["a2"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a2"].getHitboxPoints()))) or ((TODRAW["a3"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a3"].getHitboxPoints()))) or ((TODRAW["a4"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a4"].getHitboxPoints()))) or ((TODRAW["a5"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a5"].getHitboxPoints()))) or ((TODRAW["a6"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a6"].getHitboxPoints()))) or ((TODRAW["a7"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a7"].getHitboxPoints()))) or ((TODRAW["a8"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a8"].getHitboxPoints()))) or ((TODRAW["a9"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a9"].getHitboxPoints()))) or ((TODRAW["a10"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a10"].getHitboxPoints()))) or ((TODRAW["a11"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a11"].getHitboxPoints()))) or ((TODRAW["a12"].checkCollision(TODRAW["ship"].getHitboxPoints()) or TODRAW["ship"].checkCollision(TODRAW["a12"].getHitboxPoints()))) :
            gameOver=True
            break
    else:
        firstRound=False
    TODRAW["ship"].moveTo(point(y,x))
    RET = render(img, TODRAW, TITLE, 1*(int(1000/FRAMERATE)))
    img = np.zeros((UNIT*WIDTH,UNIT*HEIGHT,3),np.uint8)
