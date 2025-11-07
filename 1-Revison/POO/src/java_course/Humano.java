package java_course;

public class Humano extends SerVivo{
    public Humano(){
        super(12);
    }
    @Override
    public void respirar() {
        //this.idade;
        System.out.println("Respirando ....");
    }
}
