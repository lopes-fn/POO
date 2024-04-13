
package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    
    private HashMap<String, Aluno> bancoDeDados;
    private Scanner teclado;

    public App() {
        this.bancoDeDados = new HashMap<>();
        this.teclado = new Scanner(System.in);
    }

    private int menu() {
        int opcao = 0;

        System.out.println("..:: SIGAA 2 ::..");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Editar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Listar dados de um aluno");
        System.out.println("5 - Listar todos os alunos");
        System.out.println("6 - Sair");

        System.out.println();
        System.out.print("Opção: ");
        
        opcao = teclado.nextInt();
        teclado.nextLine();

        return opcao;
    }

    private boolean cadastrar(){

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Informe os dados do Aluno: ");
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Matricula: ");
        String matricula = teclado.nextLine();
        System.out.print("Curso: ");
        String curso = teclado.nextLine();
        System.out.print("Telefone: ");
        String telefone = teclado.nextLine();
        System.out.print("Email: ");
        String email = teclado.nextLine();
        System.out.print("Data de Nascimento (dd/mm/aaaa): ");
        LocalDate dataNascimento =  LocalDate.parse(teclado.nextLine(), fmt);
        
        
        Aluno a = new Aluno(nome, matricula, curso, telefone, email, dataNascimento);
        
        if (!this.bancoDeDados.containsKey(matricula)) {
            this.bancoDeDados.put(matricula, a);
            return true;
        } 
        else return false;

    }

    private boolean editar() {
        return false;
    }

    private boolean excluir() {
        
        System.out.println("Informe a Matricula do Aluno a ser excluído: ");
        String matricula = teclado.nextLine();
        
        if (bancoDeDados.remove(matricula) != null) {
            return true;
        }
        return false;
    }

    private void listarTodos() {
        System.out.println(this.bancoDeDados);
    }

    private void listarAluno() {
        System.out.print("Informe a matricula do aluno: ");
        String matricula = teclado.nextLine();

        System.out.println(bancoDeDados.get(matricula));
    }

    public static void main(String[] args) {
        App app = new App();
        int opcao = 0;

        do {
            opcao = app.menu();
            
            switch (opcao) {
                case 1 -> app.cadastrar();
                case 2 -> System.out.println("Editando");
                case 3 -> System.out.println("Excluindo");
                case 4 -> app.listarAluno();
                case 5 -> app.listarTodos();
                case 6 -> System.out.println("Programa encerrado");
                default -> System.out.println("Opção inválida");
                
            }
        } while(opcao != 6);

    }

}
