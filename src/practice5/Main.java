package practice5;

public class Main {
    public static void main(String[]args){
        MovablePoint mv=new MovablePoint(1,1);
        MovableCircle mc=new MovableCircle(4,6,2);
        MovableRectangle mrect=new MovableRectangle(3,3,6,6);
        mv.moveRight(7);
        mv.moveDown(1);
        System.out.println(mv.toString());
        mc.moveUp(4);
        mc.moveRight(4);
        System.out.println(mc.toString());
        mrect.moveDown(1);
        mrect.moveRight(4);
        System.out.println(mrect.toString());
        System.out.println(mrect.getHeight());
        System.out.println(mrect.getWidth());


    }
}
