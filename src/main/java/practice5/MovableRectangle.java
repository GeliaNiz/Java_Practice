package practice5;

public class MovableRectangle implements Movable {
private MovablePoint lUp;
private MovablePoint rDown;
MovableRectangle(int lx,int ly,int rx,int ry){
        lUp=new MovablePoint(lx,ly);
        rDown=new MovablePoint(rx,ry);
    }

    @Override
    public void moveUp(int Speed) {
        lUp.moveUp(Speed);
        rDown.moveUp(Speed);
    }

    @Override
    public void moveDown(int Speed) {
        lUp.moveDown(Speed);
        rDown.moveDown(Speed);
    }

    @Override
    public void moveLeft(int Speed) {
        lUp.moveLeft(Speed);
        rDown.moveLeft(Speed);
    }

    @Override
    public void moveRight(int Speed) {
        lUp.moveRight(Speed);
        rDown.moveRight(Speed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "lUp=" + lUp +
                ", rDown=" + rDown +
                '}';
    }
    void setWidth(int width){
        rDown.setX(rDown.getX()+width);
    }
    void setHeight(int height){
        rDown.setY(rDown.getY()+height);
    }
    int getWidth(){
         return rDown.getX()-lUp.getX();
    }
    int getHeight(){
        return rDown.getY()-lUp.getY();
    }
}

