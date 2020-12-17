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
        HashTable<Integer,Integer> ob2=new HashTable<>();
        ob2.add(423423,56);
        ob2.add(9,9);
        ob2.add(9,1);
        ob2.add(9,85936835);
        System.out.println(ob2.get(9));
        //System.out.println(ob1.get("Maks"));

        //System.out.println(ob1.remove("Kanye"));

    }
}
