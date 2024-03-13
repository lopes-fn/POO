package ads.poo;

import java.util.Random;

public class Buzz {
    private boolean estadoCapacete;
    private String []frases = {"Ao infinito e além!", "Eu sou seu Buzz Lightyear.", 
    "Comando estelar, pronto para voar", 
    "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.", 
    "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!", 
    "Consigo resolver todas as missões do universo"};
    private boolean estadoAsa;

    public Buzz() {
        estadoCapacete = true;
        estadoAsa = false;
    }

    public String falar(){
        Random r = new Random();

        return frases[r.nextInt(6)];
    }

    public boolean botaoCapacete() {
        estadoCapacete = !estadoCapacete;

        return estadoCapacete;
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
        estadoAsa = !estadoAsa;

        return estadoAsa;
    }
}
