package November.Monday4;

public class Student implements Comparable {
    private int strength;
    private int wisdom;
    private int moxy;
    private String name;

    public Student(int strength, int wisdom, int moxy, String name) {
        this.strength = strength;
        this.wisdom = wisdom;
        this.moxy = moxy;
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setMoxy(int moxy) {
        this.moxy = moxy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getMoxy() {
        return moxy;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student{" +
                "strength=" + strength +
                ", wisdom=" + wisdom +
                ", moxy=" + moxy +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Object a) {
        Student other = (Student)a;
        if (this.getMoxy()>other.getMoxy()) return 1;
        if (this.getMoxy()<other.getMoxy()) return -1;
        return 0;
    }
}
