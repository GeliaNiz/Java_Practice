package practice5;


import practice4.Circle;

class MovableCircle extends Circle implements Movable{
    private MovablePoint center;

    MovableCircle(int x,int y,int radius){
        super(radius);
        center=new MovablePoint(x,y);
    }

    @Override
    public void moveUp(int Speed) {
        center.moveUp(Speed);
    }

    @Override
    public void moveDown(int Speed) {
        center.moveDown(Speed);
    }

    @Override
    public void moveLeft(int Speed) {
        center.moveLeft(Speed);
    }

    @Override
    public void moveRight(int Speed) {
        center.moveRight(Speed);
    }

     @Override
     public String toString() {
         return "MovableCircle{" +
                 ", center=" + center +
                 '}';
     }

     public MovablePoint getCenter() {
         return center;
     }

     public void setCenter(MovablePoint center) {
         this.center = center;
     }
 }
