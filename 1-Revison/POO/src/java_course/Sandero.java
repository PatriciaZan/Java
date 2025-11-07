package java_course;

public class Sandero implements Car{
    final int limiteVelocidade = 150;

    public int velocidadeAtual = 0;

    @Override
    public void acelerar() {
        if(this.velocidadeAtual < limiteVelocidade){
            this.velocidadeAtual += 10;
            System.out.println("Acelerando ...");
            System.out.println("Velocidade " + this.velocidadeAtual);
        } else{
            System.out.println("No talooo");
            System.out.println("Velocidade maxima atingida " + this.limiteVelocidade);
        }

    }

    @Override
    public void frear() {

    }

    @Override
    public void parar() {

    }
}
