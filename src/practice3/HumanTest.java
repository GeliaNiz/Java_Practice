package practice3;

class Human{
    Head head=new Head();
    Leg legleft=new Leg();
    Leg legrigh=new Leg();
    Hand handleft=new Hand();
    Hand handright=new Hand();
    void Create(){
        legleft.setSize(38);
        legrigh.setSize(35);
        handright.setHand_length(51);
        handleft.setHand_length(50);
        head.setHair_color("blonde");
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", legleft=" + legleft +
                ", legrigh=" + legrigh +
                ", handleft=" + handleft +
                ", handright=" + handright +
                '}';
    }

    class Head{
        private String hair_color;
        void setHair_color(String hair_color){this.hair_color=hair_color;}
        String getHair_color(){return hair_color;}

    }
     class Leg{
        private double leg_length;
        private double size;
        void setLeg_length(double leg_length){this.leg_length=leg_length;}
        void setSize(double size){this.size=size;}
        double getLeg_length(){return leg_length;}
        double getSize(){return size;}
    }
   class Hand{
        private double hand_length;
        private double hand_width;
        void setHand_length(double hand_length){this.hand_length=hand_length;}
        void setHand_width(double hand_width){this.hand_width=hand_width;}
        double getHand_length(){return hand_length;}
        double getHand_width(){return hand_width;}
    }
}
public class HumanTest{
    public static void main(String[]args){
        Human human=new Human();
        human.Create();
        human.toString();


    }
}
