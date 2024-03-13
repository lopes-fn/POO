package ads.poo;

public class Caneta {
    private String cor;
    private int nivelTinta;

    public Caneta(String c) {
        cor = c;
        nivelTinta = 100;
    }

    public String desenhar() {
        
        if (nivelTinta > 0) {
            nivelTinta--;
            return "desenhando,caneta na cor " + cor;
        }
        else return "caneta está sem tinta";
    }
}
