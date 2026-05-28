package model;
import model.Consulta;
import java.util.*;
import model.Exame;
import model.Tratamento;
import model.Internamento;


public class Paciente {
    private int idPaciente;
    private int altura;
    private float peso;
    private int idade;
    private String nome;
    private String dataNacimento;
    private char genero;
    private String endereco;
    private List<String> contacto;
    private List<String> contactoEmergencia;
    private List<Consulta> consultas;
    private List<Exame> exames;
    private List<Tratamento> tratamentos;
    private List<Internamento> internamentos;

    
    
    public Paciente(int idPaciente, int altura, float peso, int idade, String nome, String dataNacimento, char genero,
            String endereco, List<String> contacto, List<String> contactoEmergencia, List<Consulta> consultas,
            List<Exame> exames, List<Tratamento> tratamentos, List<Internamento> internamentos) {
        this.idPaciente = idPaciente;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.nome = nome;
        this.dataNacimento = dataNacimento;
        this.genero = genero;
        this.endereco = endereco;
        this.contacto = contacto;
        this.contactoEmergencia = contactoEmergencia;
        this.consultas = consultas;
        this.exames = exames;
        this.tratamentos = tratamentos;
        this.internamentos = internamentos;
    }

    

    public int getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public char getGenero() {
        return genero;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getContacto() {
        return contacto;
    }
    public void setContacto(List<String> contacto) {
        this.contacto = contacto;
    }

    public List<String> getContactoEmergencia() {
        return contactoEmergencia;
    }
    public void setContactoEmergencia(List<String> contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Exame> getExames() {
        return exames;
    }
    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }
    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

    public List<Internamento> getInternamentos() {
        return internamentos;
    }
    public void setInternamentos(List<Internamento> internamentos) {
        this.internamentos = internamentos;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    

    //METODOS ADICIONAIS
    public void marcarConsulta(Consulta c){

    }
    public void cancelarConsulta(String codigo){

    }
    public void reagendarConsulta(String codConsulta, String novaData, String novaHora){

    }
    public List<Consulta> listarConsultas(){
        return this.consultas;
    }

    public float calcularIMC(){
        return this.peso/(this.altura*this.altura);
    }

    public void verificarIMC(){
        float imc= calcularIMC();
        if(imc<18.5) System.out.print("Abaixo do Peso");
        else if(imc<24.9) System.out.println("Peso normal");
        else if(imc<29.9) System.out.println("Um pouco acima do peso.");
        else if(imc<34.9) System.out.println("Obesidade de Grau I");
        else if(imc<39.9) System.out.println("Obesidade de Grau II (severa)");
        else System.out.println("Obesidade de Grau III (morbida)");
        
    }






   

    
}
    