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

    public boolean addTelefone(String r, String n, Contato c) {
        return c.addTelefone(r, n);
    }

    public boolean addEmail(String r, String e, Contato c) {
        return c.updateTelefone(r, e);
    }

    public boolean updateTelefone(String r, String n, Contato c) {
        return c.updateTelefone(r, n);
    }

    public boolean updateEmail(String r, String e, Contato c) {
        return c.updateEmail(r, e);
    }

    public boolean removeTelefone(String r, Contato c) {
        return c.removeTelefone(r);
    }

    public boolean removeEmail(String r, Contato c) {
        return c.removeEmail(r);
    }

    public boolean removeAll() {
        return contatos.removeAll(contatos);
    }

    public String listarContato(String n, String s) {
        
        for (Contato c : contatos) {
            if (c.getNome().equals(n) && c.getSobrenome().equals(n)) {
                return c.toString();
            }
        }

        return "Contato não encontrado!!!";
    }
}
