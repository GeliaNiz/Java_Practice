package practice5;

public class Main {
    public static void main(String[]args){
        MovablePoint mv=new MovablePoint(1,1,4,6);
        MovableCircle mc=new MovableCircle(4,6,2,1,3);
        mv.moveRight();
        mv.moveDown();
        System.out.println(mv.toString());
        mc.moveUp();
        mc.moveRight();
        System.out.println(mc.toString());

    }
}
