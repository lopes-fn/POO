package ads.poo;

public class Email {
    private String rotulo;
    private String valor;

    public Email(String rotulo, String valor) {
        this.rotulo = rotulo;

        this.valor = "";
        this.setValor(valor);
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getValor() {
        return valor;
    }

    public boolean setValor(String valor) {
        if (validarEmail(valor)) {
            this.valor = valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Email: " + rotulo + " " + valor + "\n";
    }

    private boolean validarEmail(String email) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

        return email.matches(eR);
    }

}
