package practice07;

public class Teacher extends Person{
    private  Klass kclass;
    public Teacher(String name,int age) {
        super(name,age);
    }

    public Teacher(String name,int age,Klass kclass) {
        super(name,age);
        this.kclass = kclass;
    }

    public Klass getKlass() {
        return kclass;
    }
    @Override
    public String introduce(){
        if(kclass==null){return super.introduce()+" I am a Teacher. I teach No Class.";}
        else return super.introduce()+" I am a Teacher. I teach Class "+kclass.getNumber()+".";
    }
    public String introduceWith(Student student){
        if(this.kclass.getNumber()==student.getKlass().getNumber()){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        else{
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}
