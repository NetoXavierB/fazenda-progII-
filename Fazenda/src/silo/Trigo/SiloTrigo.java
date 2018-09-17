package silo.Trigo;


public class SiloTrigo {

    public SiloTrigo() {
    }

    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        this.numNota = numNota;
    }

    public double getQtdSacas() {
        return QtdSacas;
    }

    public void setQtdSacas(double QtdSacas) {
        this.QtdSacas = QtdSacas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeNota() {
        return nomeNota;
    }

    public void setNomeNota(String nomeNota) {
        this.nomeNota = nomeNota;
    }

    public String getDataNota() {
        return dataNota;
    }

    public void setDataNota(String dataNota) {
        this.dataNota = dataNota;
    }
 
    public SiloTrigo(int numNota, double QtdSacas, String tipo, String nomeNota, String dataNota) {
        this.numNota = numNota;
        this.QtdSacas = QtdSacas;
        this.tipo = tipo;
        this.nomeNota = nomeNota;
        this.dataNota = dataNota;
    }
    protected String nomeNota;
    protected String dataNota;
    protected int numNota;
    protected double QtdSacas;
    protected String tipo;

}
