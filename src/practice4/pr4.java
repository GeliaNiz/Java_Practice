package practice4;

abstract class Shape{
    String color;
    boolean filled;
    Shape(){

    }
    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    String getColor(){return color;}
    void setColor(String color){this.color=color;}
    boolean isFilled(){return filled;}
    void setFilled(boolean filled){this.filled=filled;}
    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();

}

class Rectangle extends Shape{
    double width;
    double length;
    Rectangle(){super();}
    Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }
    Rectangle(double width,double length,String color,boolean filled){
        this.length=length;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }
    double getWidth(){return width;}
    void setWidth(double width){this.width=width;}
    double getLength(){return length;}
    void setLength(double length){this.length=length;}
    double getArea(){return width*length;}
    double getPerimeter(){return 2*(width+length);}
    public String toString(){return "width: "+getWidth()+" length: "+getLength()+" Area: "+getArea()+" Perimeter: "+getPerimeter();}
}
class Square extends Shape{
    double side;
    Square(){super();}
    Square(double side){this.side=side;}
    Square(double side, String color,boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    double getSide(){return side;}
    void setSide(double side){this.side=side;}
    double getArea(){return side*side;}
    double getPerimeter(){return 4*side;}
    public String toString(){return "side: "+getSide()+" Area: "+getArea()+" Perimeter: "+getPerimeter();}


}
public class pr4 {
    public static void main(String[]args){
        Circle circle=new Circle();
        circle.setRadius(4);
        System.out.println(circle.toString());
        Rectangle rect=new Rectangle(12.5,6,"red",true);
        System.out.println(rect.toString());
        Square sq=new Square(6.3);
        sq.setSide(7);
        System.out.println(sq.toString());

    }
}
