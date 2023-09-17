package DSA_from_basics.Collections;

public class Student implements Comparable<Student> {

    private int roll;

    private String name;

    private int mark;

    public Student(){

    }

    public Student(int roll, String name, int mark) {
        this.roll = roll;
        this.name = name;
        this.mark = mark;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", mark=" + mark + "]";
    }

    @Override
    public int compareTo(Student o) {
        if (this.mark > o.mark){
            return 1;
        }else if (this.mark < o.mark){
            return -1;
        }
        return 0;
    }

    
}
