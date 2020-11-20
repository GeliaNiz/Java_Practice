package practice3;

 class Circle {
    private double radius;
    private double Ox;
    private double Oy;
    void setRadius(double radius){this.radius=radius;}
    double getRadius(){return radius;}
    void setOx(double Ox){this.Ox=Ox;}
    void setOy(double Oy){this.Oy=Oy;}
    double getOx(){return Ox;}
    double getOy(){return Oy;}

     @Override
     public String toString() {
         return "Circle{" +
                 "radius=" + radius +
                 ", Ox=" + Ox +
                 ", Oy=" + Oy +
                 '}';
     }
 }

public class CircleTest{
    public static void main(String[]args){
        Circle cr=new Circle();
        cr.setRadius(6);
        cr.setOx(4.3);
        cr.setOy(2.16);
       System.out.print(cr.toString());
    }
}
