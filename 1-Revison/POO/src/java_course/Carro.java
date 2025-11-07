package java_course;

public class Carro {
    // Atributos - vars
    String modelo;

    // method - implementações - funções - lógica
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    // public -> visible from all places
    // private -> only inside the class
    // protected -> only inside the same package
    protected void acelerar() {
        System.out.println("Acelerando o carro!" + " " + this.modelo);
    }
}

class Rodas{
    public Rodas(){
        Carro carro = new Carro("Rodas");
        carro.acelerar();
    }
}