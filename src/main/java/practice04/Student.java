package practice04;

public class Student extends Person{
    private  int kclass;

    public Student(String name,int age,int kclass) {
        super(name,age);
        this.kclass = kclass;
    }

    public int getKlass() {
        return kclass;
    }
    @Override
    public String introduce(){
        return super.basicIntroduce()+" I am a Student. I am at Class 2.";
    }
}
