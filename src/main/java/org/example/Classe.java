package org.example;

public class Classe implements Cloneable {
    private String nomeClasse;
    private String tipoArma;
    private String tipoClasse;


    public Classe (String nomeClasse, String tipoArma, String tipoClasse){
        super();
        this.nomeClasse = nomeClasse;
        this.tipoArma = tipoArma;
        this.tipoClasse = tipoClasse;
    }

    public String getNomeClasse(){
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse){
        this.nomeClasse = nomeClasse;
    }

    public String getTipoArma(){
        return tipoArma;
    }
    public void setTipoArma(String tipoArma){
        this.tipoArma = tipoArma;
    }

    public String getTipoClasse(){
        return tipoClasse;
    }

    public void setTipoClasse(String tipoClasse){
        this.tipoClasse = tipoClasse;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Classe{" +
                "nomeClasse='" + nomeClasse + '\'' +
                ", tipoArma=" + tipoArma +
                ", tipoClasse=" + tipoClasse +
                '}';
    }
}

