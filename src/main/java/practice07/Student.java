package practice07;

public class Student extends Person{
    private  Klass kclass;

    public Student(String name,int age,Klass kclass) {
        super(name,age);
        this.kclass = kclass;
    }


    public Klass getKlass() {
        return kclass;
    }
    @Override
    public String introduce(){
        return super.introduce()+" I am a Student. I am at Class "+kclass.getNumber()+".";
    }
}
