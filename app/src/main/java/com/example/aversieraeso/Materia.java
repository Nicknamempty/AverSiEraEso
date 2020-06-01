package com.example.aversieraeso;

public class Materia {
    private String codmateria;
    private String nommateria;
    private String unidadesval;

    public Materia(){}

    public Materia(String codmateria, String nomateria, String unidadesval) {
        this.codmateria = codmateria;
        this.nommateria = nomateria;
        this.unidadesval = unidadesval;
    }

    public String getCodmateria() {
        return codmateria;
    }

    public void setCodmateria(String codmateria) {
        this.codmateria = codmateria;
    }

    public String getNommateria() {
        return nommateria;
    }

    public void setNommateria(String nomateria) {
        this.nommateria = nomateria;
    }

    public String getUnidadesval() {
        return unidadesval;
    }

    public void setUnidadesval(String unidadesval) {
        this.unidadesval = unidadesval;
    }
}
