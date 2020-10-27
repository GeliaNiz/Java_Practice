package practice15;
public class Node{
    private Node[] states=new Node[2];
    private int[] actions=new int[2];

    public Node() {

    }

    public int getAction(int i) {
        return actions[i];
    }

    public void setAction(int action,int i) {
        actions[i] = action;
    }

    public Node getState(int i) {
        return states[i];
    }

    public void setState(Node state,int i) {
         states[i]=state;
    }


}
