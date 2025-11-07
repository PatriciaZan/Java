package java_course;

public class Main {
    public static void main(String[] args) {
        //Carro meuCarro = new Carro("Ford");
        //Carro meuCarro2 = new Carro("BMW");

        //meuCarro.acelerar();
        //meuCarro2.acelerar();

        Car meuCarro = new Sandero();
        Car meuCarro2 = new Mobi();

        SerVivo meuSer = new Humano();
        meuSer.respirar();

        meuCarro2.acelerar();
        meuCarro.acelerar();

        Carro meuCarroFurado = null;
        try{
            meuCarroFurado.acelerar();
        }catch (NullPointerException exception){
            System.out.println("Vende o carro furado!");
        }

    }
}
    // Class
    /*class Carro{
        // Atributos - vars
        String modelo;

        // method - implementações - funções - lógica
        public Carro(String modelo){
            this.modelo = modelo;
        }

        public void acelerar(){
            System.out.println("Acelerando o carro!" + " " + this.modelo);
        }
    }*/