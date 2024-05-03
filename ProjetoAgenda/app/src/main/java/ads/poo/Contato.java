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

    public boolean addTelefone(String rotulo, String numero) {
        Telefone t = new Telefone(rotulo, numero);

        return telefones.add(t);
    }

    public boolean addEmail(String rotulo, String email) {
        Email e = new Email(rotulo, email);

        if (!e.getValor().isEmpty() ) {
            return emails.add(e);
        }

        return false;
    }

    public boolean removeTelefone(String rotulo) {
        return telefones.removeIf(t -> t.getRotulo().equals(rotulo));
    }

    public boolean removeEmail(String rotulo) {
        return emails.removeIf(e -> e.getRotulo().equals(rotulo));
    }

    public boolean updateEmail(String rotulo, String email) {

        for (Email e : emails) {
            
            if (e.getRotulo().equals(rotulo)) {
                return e.setValor(email);
            }

        }

        return false;
    }

    public boolean updateTelefone(String rotulo, String numero) {
        
        for (Telefone t : telefones) {
            
            if (t.getRotulo().equals(rotulo)) {
                t.setValor(numero);
                
                return true;
            }

        }
        
        return false;
    }


}
