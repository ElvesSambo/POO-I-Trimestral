package model;
import model.Proficional;
import java.util.*;

public class Departamento {
    private String nome;
    private int idDepartamento;
    private List<Proficional> proficionais;
    public String getNome() {
        return nome;
    }
    public int getIdDepartamento() {
        return idDepartamento;
    }
    public List<Proficional> getProficionais() {
        return proficionais;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
     public void setProficionais(List<Proficional> proficionais) {
        this.proficionais = proficionais;
    }
    
    public Departamento(String nome, int idDepartamento) {
        this.nome = nome;
        this.idDepartamento = idDepartamento;
        this.proficionais=proficionais;
    }
    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", idDepartamento=" + idDepartamento + ", proficionais=" + proficionais + "]";
    }
   
    
    


}
