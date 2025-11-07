package java_course;

public abstract class SerVivo {
    protected int idade;

    public SerVivo(int idade){
       this.idade = idade;
    }
    // Pode colocar metodos
    public abstract void respirar();

    public void dormir(){
        System.out.println("Dormindo...");
    }
}
