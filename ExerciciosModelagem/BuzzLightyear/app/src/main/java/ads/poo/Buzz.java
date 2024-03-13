package ads.poo;

import java.util.Random;

public class Buzz {
    private boolean capaceteAberto = false;
    private boolean asaAberta = false;

    private String []frases = {"Ao infinito e além!", "Eu sou seu Buzz Lightyear.", 
    "Comando estelar, pronto para voar", 
    "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.", 
    "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!", 
    "Consigo resolver todas as missões do universo"};
    
    public String falar(){
        Random r = new Random();

        return frases[r.nextInt(6)];
    }

    public boolean isEstadoCapacete() {
        return capaceteAberto;
    }

    public boolean botaoCapacete() {
        capaceteAberto = !capaceteAberto;

        return capaceteAberto;
    }

    public double dispararLaser() {
        Random r = new Random();

        return r.nextDouble(250); //damege
    }

    public double golpear() {
        Random r = new Random();

        return r.nextDouble(100); //damege
    }

    public boolean botaoAsas() {
        asaAberta = !asaAberta;

        return asaAberta;
    }
}
