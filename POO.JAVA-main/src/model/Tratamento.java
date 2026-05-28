package model;
import java.util.*;

public class Tratamento {
    private String tipo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private Paciente pacientes;
    private List<Proficional> proficionais;
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
    public Paciente getPacientes() {
        return pacientes;
    }
    public List<Proficional> getProficionais() {
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
    public void setPacientes(Paciente pacientes) {
        this.pacientes = pacientes;
    }
    public void setProficionais(List<Proficional> proficionais) {
        this.proficionais = proficionais;
    }
    public Tratamento(String tipo, String descricao, String dataInicio, String dataFim, Paciente pacientes,
            List<Proficional> proficionais) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.pacientes = pacientes;
        this.proficionais = proficionais;
    }

    
}
