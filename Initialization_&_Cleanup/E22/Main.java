package E22;

public class Main {
    public static void main(String args[]) {
        Forest birch = new Forest(Tree.DECIDUOUS);
        Forest fir = new Forest(Tree.CONIFER);

        birch.switchingTrees();
        fir.switchingTrees();
    }
}

enum Tree {  // class type, or written as "public enum [class name]"
    CONIFER, DECIDUOUS;
}

class Forest {
    Tree tree;
    Forest(Tree passedTree) {
        this.tree = passedTree;
    }
    void switchingTrees() {
        System.out.print("that is a ");
        switch(tree) {
            case CONIFER:
                System.out.println("conifer tree");
                break;
            case DECIDUOUS:
                System.out.println("deciduous tree");
                break;
            default:
                System.out.println("not a tree type");
                break;
        }       
    }
}