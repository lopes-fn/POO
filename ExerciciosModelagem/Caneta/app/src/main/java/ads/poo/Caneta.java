package ads.poo;

public class Caneta {
    private String cor;
    private int nivelTinta;

    

    public Caneta(String cor, int nivelTinta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }

    public Caneta(String cor) {
        this(cor, 100);
    }

    public Caneta() {
        this("vermelho", 100);
    }

    public String desenhar() {
        
        if (nivelTinta > 0) {
            nivelTinta--;
            return "desenhando,caneta na cor " + cor;
        }
        else return "caneta está sem tinta";
    }
}
