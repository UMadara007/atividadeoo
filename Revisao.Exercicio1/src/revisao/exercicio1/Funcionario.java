
package revisao.exercicio1;

import java.time.LocalDate;



public class Funcionario {
    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean estaAtivo;
    public String membros;

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
     public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setestaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

       
    
    
    public void atualizarSalario(double attSalario){
       salario+= attSalario;
       
    }
    public void demitirFuncionario(){
        estaAtivo = false;
        System.out.println("Demitido Com Sucesso!!!!");
        }
    public void imprimir(){
        System.out.println("ID do Funcionario: " +idFunc);
        System.out.println("Nome do Funcionario: "+nomeFunc);
        System.out.println("Departamento: "+departamento);
        System.out.println("Data de Contratacao: "+dataContratacao);
        System.out.println("Salario: "+salario);
        System.out.println("Documento do Funcionario: "+documento);
        if(estaAtivo){
            System.out.println("Funcionario Ativo!!!!");
        }else
            System.out.println("Funcionario não Existe");
    
        }
    
    
    
}
