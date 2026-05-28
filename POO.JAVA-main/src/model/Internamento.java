package model;
import model.Departamento;
import model.Proficional;
import java.util.*;

public class Internamento {
    private String dadaEntrada;
    private String dataSaida;
    private String motivo;
    private List<Proficional> proficionais;
    private Departamento departamento;
    private Paciente paciente;
    public String getDadaEntrada() {
        return dadaEntrada;
    }
    public String getDataSaida() {
        return dataSaida;
    }
    public String getMotivo() {
        return motivo;
    }
    public List<Proficional> getProficionais() {
        return proficionais;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setDadaEntrada(String dadaEntrada) {
        this.dadaEntrada = dadaEntrada;
    }
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public void setProficionais(List<Proficional> proficionais) {
        this.proficionais = proficionais;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Internamento(String dadaEntrada, String dataSaida, String motivo, Departamento departamento,
            Paciente paciente) {
        this.dadaEntrada = dadaEntrada;
        this.dataSaida = dataSaida;
        this.motivo = motivo;
        this.departamento = departamento;
        this.paciente = paciente;
        this.proficionais = proficionais;
    }

    
}
