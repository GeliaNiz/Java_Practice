package practice2526;

public class Main {
    public static void main(String[] args) {
        HashTable<String,Boolean> ob1=new HashTable<>();
        ob1.add("Angel",true);
        ob1.add("Maks",true);
        ob1.add("Misha",true);
        ob1.add("Kanye",false);
        for (Item i:ob1) {
            System.out.println(i.getValue());
        }

        //System.out.println(ob1.get("Maks"));

        //System.out.println(ob1.remove("Kanye"));

    }
}
