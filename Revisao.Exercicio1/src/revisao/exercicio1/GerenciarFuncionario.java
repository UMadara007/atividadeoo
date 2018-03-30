
package revisao.exercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;




public class GerenciarFuncionario {

    
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        Scanner sc = new Scanner(System.in);
        System.out.println("ID do Funcionario: ");
        func.setIdFunc(Integer.parseInt(sc.nextLine()));
        System.out.println("Nome do Funcionario: ");
        func.setNomeFunc(sc.nextLine());
        System.out.println("Departamento: ");
        func.setDepartamento(sc.nextLine());
        func.setDataContratacao(LocalDate.of(2018, Month.MARCH, 27));
        System.out.println("Salario: ");
        func.setSalario(Integer.parseInt(sc.nextLine()));
        System.out.println("Documento: ");
        func.setDocumento(sc.nextLine());
        func.setestaAtivo(true);
        System.out.println("-------------------------------------");
        func.imprimir();
        System.out.println("-------------------------");
        func.atualizarSalario(100);
        func.imprimir();
        func.demitirFuncionario();
        func.imprimir();
        
        
       
                
        
    }
    
}
