import java.util.*;

public class SymbolTree {

    private Node curr_node;
    private Node root;

    public SymbolTree() {
        this.root = new Node();
        this.curr_node = this.root;
    }

    public void putSymbol(Symbol s){
        curr_node.putSymbol(s);
    }

    public void addChild() {
        curr_node.addChild();
    }

    public void leaveContext() {
        curr_node = curr_node.father;
    }

    public void nextChild() {
        Node next = curr_node.nextChild();
        if (next == null) {
            return;
        }
        curr_node = next;
    }

    public boolean hasNext() {
        return curr_node.hasNext();
    }

    public boolean symbolExists(String id){
        return curr_node.symbolExists(id);
    }

    public Symbol findSymbol(String id) {
        return curr_node.findSymbol(id);
    }

    public void reset() {
        curr_node = root;
        curr_node.reset();
    }

    @Override 
    public String toString(){
        return root.toString();
    }

    public void removeSymbol(String s){
        root.removeSymbol(s);
    }

    public void putInRoot(Symbol s) {
        root.putSymbol(s);
    }

    public void setSymbolTable(Map<String,Symbol> m){
        curr_node.setSymbolTable(m);
    }

    private class Node {
        private Node father;
        private ArrayList<Node> children = new ArrayList<>();
        private Map<String,Symbol> symbolTable = new HashMap<>();
        private int child_idx = 0;

        public Node() {
            father = null;
        }

        public Node(Node father){
            this.father = father;
        }

        public void putSymbol(Symbol s){
            symbolTable.put(s.getName(), s);
        }

        public void removeSymbol(String s){
            symbolTable.remove(s);
        }

        public boolean symbolExists(String id) {
            
            if (symbolTable.containsKey(id)) {
                return true;
            }
            if(father != null){
                return father.symbolExists(id);
            }
            else {
                return false;
            }       
        }

        public Symbol findSymbol(String id) {
            if (symbolTable.containsKey(id)) {
                return symbolTable.get(id);
            }
            if (father != null) {
                return father.findSymbol(id);
            }
            return null;
        }
        
        public Node nextChild() {
            if (child_idx <= children.size())
                return children.get(child_idx++);
            return null;
        }

        public boolean hasNext() {
            return child_idx <= children.size();
        }

        public void addChild() {
            children.add(new Node(this));
        }

        public void reset() {
            child_idx = 0;
            for (Node child : children) {
                child.reset();
            }
        }

        public void setSymbolTable(Map<String,Symbol> m){
            symbolTable = m;
        }
        

        public String toString() {
            String ret = "[";

            for (Node child : children) {
                //ret += "\t" + child.toString() + "\n";
                ret += child.toString() + ",";
            }

            ret += "]";
            
            return ret;
        }
    }
}