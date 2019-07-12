package practice02;

public class Student extends Person{
    private  int kclass;

    public Student(String name,int age,int kclass) {
        super(name,age);
        this.kclass = kclass;
    }

    public int getKclass() {
        return kclass;
    }
}
