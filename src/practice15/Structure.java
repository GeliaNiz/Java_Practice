package practice15;

import java.util.ArrayList;

public class Structure {
    private ArrayList<Node> structure=new ArrayList<>();
    Node pointer;
    void initialPointer(){pointer=structure.get(0);}
    public void add(int count){
        for(int i=0;i<count;i++) {
            Node nd=new Node();
            structure.add(nd);
        }
    }
    public void initLinks(int index, Node one, Node zero, int action1, int action2){
        structure.get(index).setState(one,1);
        structure.get(index).setState(zero,0);
        structure.get(index).setAction(action1,0);
        structure.get(index).setAction(action2,1);
    }
    public void goToNextState(int state_number){
        pointer=pointer.getState(state_number);
    }
    Node getElement(int index){
        return structure.get(index);
    }
    String getCommand(int i){
        switch (i){
            case 1: {
                return "create_project";
            }
            case 2: {
                return "add_library";
            }
            case 3: {
                return "restart";
            }
            case 4: {
                return "test";
            }
            case 5: {
                return "deploy";
            }
            case 6: {
                return "drop_db";
            }
            default:{
                return "";
            }
        }
    }
}
