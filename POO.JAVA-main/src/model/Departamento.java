package model;

import java.io.Serializable;
import java.util.*;

public class Departamento implements Serializable {

    private String nomeDepartamento;
    private int idDepartamento;
    private ArrayList<Profissional> profissionaisDoDepartamento;

    public Departamento(String nomeDepartamento, int idDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
        this.idDepartamento = idDepartamento;
        this.profissionaisDoDepartamento = new ArrayList<>();
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }
    public int getIdDepartamento() {
        return idDepartamento;
    }
    public ArrayList<Profissional> getProfissionaisDoDepartamento() {
        return profissionaisDoDepartamento;
    }
    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }
    public void setProfissionaisDoDepartamento(ArrayList<Profissional> profissionaisDoDepartamento) {
        this.profissionaisDoDepartamento = profissionaisDoDepartamento;
    }

    @Override
    public String toString() {
        return "Departamento [idDepartamento=" + idDepartamento + ", nomeDepartamento=" + nomeDepartamento + ", profissionais=" + profissionaisDoDepartamento + "]";
    }

}
