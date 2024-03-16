package ads.poo;

public class Carro {
    
    private double velocidadeAtual;

    public Carro(double velocidadeAtual) {
        if (velocidadeAtual > 200.00 || velocidadeAtual < 0.00) this.velocidadeAtual = 0.00;
        else this.velocidadeAtual = velocidadeAtual;
    }

    public Carro() {
        this(0.00);
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public double acelerar(double v) {
        if (v < 0.00) return velocidadeAtual;
              
        if (velocidadeAtual + v > 200.00) velocidadeAtual = 200.00;
        else velocidadeAtual += v;
        
        return velocidadeAtual;
    }

    public double frear(double v) {
        if (v < 0.00) return velocidadeAtual;
                
        if (velocidadeAtual - v < 0.00 ) velocidadeAtual = 0.00;
        else velocidadeAtual -= v; 

        return velocidadeAtual;
    }

}
