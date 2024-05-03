package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    private Scanner teclado;
    private DateTimeFormatter fmt;

    private Agenda agenda;

    public App() {
        this.teclado = new Scanner(System.in);
        this.fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        this.agenda = new Agenda();
    }

    public static void main(String[] args) {
        App app = new App();
        int op;
       
        do {
            op = app.menu();

            switch (op) {
                case 1:
                    if (app.addContato()) {
                        System.out.println("Contato adicionado com sucesso!\n");
                    } else {
                        System.out.println("Erro ao adicionar contato!\n");
                    }    
                    break;
                case 2:
                    if (app.removeContato()) {
                        System.out.println("Contato removido com sucesso!\n");
                    }
                    else {
                        System.out.println("Erro ao remover contato!\n");
                    }
                    break;
                case 3:
                    if (app.atualizaContato()) {
                        System.out.println("Contato atualizado com sucesso!\n");
                    }
                    else {
                        System.out.println("Erro ao atualizar contato!\n");
                    }
                    break;
                case 4:
                    System.out.println(app.listarContato());
                    break;
                case 5:
                    System.out.println(app.agenda.toString());
                    break;
                case 6:
                    System.out.println("Tem certeza que você deseja remover a Agenda? (S/N)");
                    char opEx = app.teclado.nextLine().charAt(0); 
                    if (opEx == 'S') {
                        if (app.agenda.removeAll()) {
                            System.out.println("Dados da Agenda excluídos com sucesso!");
                        }
                        else {
                            System.out.println("Erro ao apagar agenda!\n");
                        }
                    }
                    break;
                case 7:
                    System.out.println("Encerrando Programa!!!");
                    break;
                default:
                    System.out.println("Opção Inválida!\n");
                    break;
            }
        } while (op != 7);
        
    }

    private int menu() {
        int op = 0;

        System.out.println("----- MENU -----\n");
        System.out.println("1 - Adicionar novo contato");
        System.out.println("2 - Remover contato");
        System.out.println("3 - Atualizar contato existente");
        System.out.println("4 - Listar dados de um contato");
        System.out.println("5 - Listar todos os contatos");
        System.out.println("6 - Apagar Agenda");
        System.out.println("7 - Sair do programa");

        System.out.print("\nInforme a opção desejada: ");

        op = teclado.nextInt();
        teclado.nextLine();

        return op;

    }

    private boolean addContato() {
        String nome;
        String sobrenome;
        LocalDate dataNasc;

        Contato c;

        String rotulo;
        String valor;

        System.out.println("Informações para Novo Contato: ");
        System.out.print("Nome: ");
        nome = teclado.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = teclado.nextLine();
        System.out.print("Data de Nascimento (DD/MM/AAAA): ");
        dataNasc = LocalDate.parse(teclado.nextLine(), fmt);

        c = new Contato(nome, sobrenome, dataNasc);

        do {
            System.out.print("Tipo de Telefone: ");
            rotulo = teclado.nextLine();
            System.out.print("Numero de Telefone: ");
            valor = teclado.nextLine();

            c.addTelefone(rotulo, valor);

            System.out.print("Deseja adicionar outro número de Telefone? (S/N): ");
            char opT = teclado.nextLine().charAt(0);
            if (opT != 'S') {
                break;
            }
        } while (true);

        do {
            System.out.print("Tipo de Email: ");
            rotulo = teclado.nextLine();
            System.out.print("Endereço de Email: ");
            valor = teclado.nextLine();

            if (!c.addEmail(rotulo, valor)) {
                System.out.println("Endereço de Email inválido, tente novamente!");
                continue;
            }

            System.out.print("Deseja adicionar outro endereço de Email? (S/N): ");
            char opE = teclado.nextLine().charAt(0);

            if (opE != 'S') {
                break;
            }
        } while (true);

        return agenda.addContato(c);
    }

    private boolean removeContato() {
        String nome;
        String sobrenome;

        System.out.println("Dados do contato a ser excluído: ");
        System.out.print("Nome: ");
        nome = teclado.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = teclado.nextLine();

        return agenda.removeContato(nome, sobrenome);
    }

    private boolean atualizaContato() {

        return false;
    }

    private String listarContato() {
        String nome;
        String sobrenome;

        System.out.println("Dados do contato a ser listado: ");
        System.out.print("Nome: ");
        nome = teclado.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = teclado.nextLine();

        return agenda.listarContato(nome, sobrenome);

    }

}
