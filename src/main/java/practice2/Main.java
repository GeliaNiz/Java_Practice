package practice2;

import java.util.ArrayList;

class Shape {
    int height=3;
    int P=25;
    String name="Triangle";

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                '}';
    }
}
class Ball{

}
class Book{

}
class Dog{
    private String name;
    private int age;
    Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    int TohumanAge(){return age*7;}

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String getName(){return name;}
    int gatAge(){return age;}
    void getName(String name){this.name=name;}
    void getAge(int age){this.age=age;}
}
class DogKennels{
    ArrayList<Dog> dogs=new ArrayList<Dog>();
    void Push(Dog d){
        dogs.add(d);
    }
}
public class Main{
    public static void main(String[]args){
        Shape sh=new Shape();
        DogKennels dk=new DogKennels();
        Dog d=new Dog("Kenny",6);
        dk.Push(d);
        System.out.println(sh);
        System.out.print(dk.dogs.get(0));
    }
}
