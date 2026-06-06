package model;

import java.io.Serializable;
import java.util.*;

public class Tratamento implements Serializable {

    private int idTratamento;
    private String tipo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private Paciente paciente;
    private List<Profissional> proficionais;

    public Tratamento(String tipo, String descricao, String dataInicio, String dataFim, Paciente paciente,
            List<Profissional> proficionais) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.paciente = paciente;
        this.proficionais = proficionais;
    }

    public int getIdTratamento() {
        return idTratamento;
    }
    public String getTipo() {
        return tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public String getDataFim() {
        return dataFim;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public List<Profissional> getProficionais() {
        return proficionais;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void setProficionais(List<Profissional> proficionais) {
        this.proficionais = proficionais;
    }

}
