package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Agenda:\n" + contatos;
    }

    public boolean addContato(Contato c) {
        return contatos.add(c);
    }

    public boolean removeContato(String n, String s) {
        return contatos.removeIf(c -> c.getNome().equals(n) && c.getSobrenome().equals(s));
    }

    public boolean addTelefone() {
        return false;
    }
}
