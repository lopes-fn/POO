package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;

        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nData de Nascimento: " + dataNasc + "\nTelefones: "
                + telefones + "Emails: " + emails + "\n";
    }

    public boolean addTelefone(String r, String n) {
        Telefone t = new Telefone(r, n);

        return telefones.add(t);
    }

    public boolean addEmail(String r, String n) {
        Email e = new Email(r, n);

        if (!e.getValor().isEmpty() ) {
            return emails.add(e);
        }

        return false;
    }

    public boolean removeTelefone(String r) {
        return telefones.removeIf(t -> t.getRotulo().equals(r));
    }

    public boolean removeEmail(String r) {
        return emails.removeIf(e -> e.getRotulo().equals(r));
    }

    public boolean updateEmail(String r, String n) {

        for (Email e : emails) {
            
            if (e.getRotulo().equals(r)) {
                return e.setValor(n);
            }

        }

        return false;
    }

    public boolean updateTelefone(String r, String n) {
        
        for (Telefone t : telefones) {
            
            if (t.getRotulo().equals(r)) {
                t.setValor(n);
                
                return true;
            }

        }
        
        return false;
    }


}
