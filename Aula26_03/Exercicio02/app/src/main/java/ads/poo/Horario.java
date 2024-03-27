package ads.poo;

public class Horario {
    private int horas;
    private int minutos;
    private int segundos;
    
    private final String[] hE = { "zero", "uma", "duas", "três", "quatro", "cinco",
"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze",
"dezesseis", "dezessete", "dezoito", "dezenove", "vinte", "vinte e uma", "vinte e duas",
"vinte e três" };

    private final String[] mE = { "zero", "um", "dois", "três", "quatro", "cinco",
"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze",
"dezesseis", "dezessete", "dezoito", "dezenove" };

    private final String[] dezenas = { "", "", "vinte", "trinta", "quarenta", "cinquenta" };
    
    public Horario(){
        this(0, 0, 0);
    }

    public Horario(int horas) {
        if (!setHoras(horas)) setHoras(0);
        setMinutos(0);
        setSegundos(0);
    }

    public Horario(int horas, int minutos) {
        if (!setHoras(horas)) setHoras(0);
        if (!setMinutos(minutos)) setMinutos(0);
        setSegundos(0);
    }

    public Horario(int horas, int minutos, int segundos) {
        if (!setHoras(horas)) setHoras(0);
        if (!setMinutos(minutos)) setMinutos(0);
        if (!setSegundos(segundos)) setSegundos(0);
    }

    public boolean setHoras(int horas) {
        if (horas >= 0 && horas <= 23){
            this.horas = horas;
            return true;
        }
        else return false;
    }

    public boolean setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
            return true;
        }
        else return false;
    }

    public boolean setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return horas + ":" + minutos + ":" + segundos;
    }

    public String porExtenso(){
        String extenso = hE[horas] + " horas, ";

        if (minutos < 20) {
            extenso += mE[minutos] + " minutos, ";
        }
        else {
            int d = minutos / 10;
            String mExt = dezenas[d];

            mExt += " e " + mE[minutos % 10] + " minutos, ";

            extenso += mExt;
        }

        if (segundos < 20) {
            extenso += mE[segundos] + " segundos";
        }
        else {
            int d = segundos / 10;
            String sE = dezenas[d];

            sE += " e " + mE[segundos % 10] + " segundos";

            extenso += sE;
        }

        return extenso;
    }

    public long horasEmSegundos(){
        long seg = horas*60*60 + minutos*60 + segundos;

        return seg;
    }

    public long diferencaEmSegundos(Horario h){
        long dif = this.horasEmSegundos() - h.horasEmSegundos();

        return dif;
    }
    
}
