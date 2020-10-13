package practice12;

public enum Enum {
  YELLOW(93),
    RED(31),
    GREEN(92),
    BLUE(94),
    PURPLE(95);
 private final int number;
 Enum(int number){
     this.number=number;
 }

    public int getNumber() {
        return number;
    }
}
