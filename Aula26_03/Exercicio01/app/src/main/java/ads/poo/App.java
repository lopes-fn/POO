package ads.poo;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Ponto p1 = new Ponto(5.5, -3.9);
        Ponto p2 = new Ponto(-8.9, 1);

        System.out.println("Ponto 1: " + p1);
        System.out.println("Ponto 2: " + p2);
        System.out.printf("Diferença entre Ponto 1 e Ponto 2: %.2f", p1.distanciaDoisPontos(p2));
        System.out.println();
    }
}
