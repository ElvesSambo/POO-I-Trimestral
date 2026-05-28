package model;
import java.util.List;

import model.Paciente;
import model.Proficional;

public class Consulta {
    private String data;
    private String horas;
    private String tipo;
    private String obrservasoesClinicas;
    private Paciente paciente;
    private Proficional proficional;
    private String diagnostico;
    public String getData() {
        return data;
    }
    public String getHoras() {
        return horas;
    }
    public String getTipo() {
        return tipo;
    }
    public String getObrservasoesClinicas() {
        return obrservasoesClinicas;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public Proficional getProficional() {
        return proficional;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setHoras(String horas) {
        this.horas = horas;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setObrservasoesClinicas(String obrservasoesClinicas) {
        this.obrservasoesClinicas = obrservasoesClinicas;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void setProficional(Proficional proficional) {
        this.proficional = proficional;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public Consulta(String data, String horas, String tipo, String obrservasoesClinicas, Paciente paciente,
            Proficional proficional, String diagnostico) {
        this.data = data;
        this.horas = horas;
        this.tipo = tipo;
        this.obrservasoesClinicas = obrservasoesClinicas;
        this.paciente = paciente;
        this.proficional = proficional;
        this.diagnostico = diagnostico;
    }
    
}
