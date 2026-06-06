package model;
import model.Profissional;
import java.util.*;

public class Departamento {
    private String nome;
    private int idDepartamento;
    private List<Profissional> profissionais;
    public String getNome() {
        return nome;
    }
    public int getIdDepartamento() {
        return idDepartamento;
    }
    public List<Proficional> getProfissionais() {
        return profissionais;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
     public void setProfissionais(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }
    
    public Departamento(String nome, int idDepartamento) {
        this.nome = nome;
        this.idDepartamento = idDepartamento;
        this.profissionais=profissionais;
    }
    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", idDepartamento=" + idDepartamento + ", profissionais=" + profissionais + "]";
    }
   
    
    


}
