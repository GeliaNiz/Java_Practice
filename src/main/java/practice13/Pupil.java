package practice13;

class Pupil {
    String name;
    int mark;
    int class_number[]=new int[2];

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public int[] getClass_number() {
        return class_number;
    }

    public void setName(String name)throws Exception {
        if (name.length() >= 4) {
            this.name = name;
        } else {
            throw new Exception();
        }
    }

    public void setMark(int mark) throws IncorrectMarkException {
        if((mark!=2)&&(mark!=3)&&(mark!=4)&&(mark!=5)){
            throw new IncorrectMarkException("некорректная оценка");
        }
        else {
            this.mark = mark;
        }
    }

    public void setClass_number(byte[] class_number,int size)throws IncorrectClassNumberException {
        for(int i=0;i<size;i++){
            this.class_number[i]=class_number[i];
        }

    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                ", class_number=" + class_number +
                '}';
    }
}
