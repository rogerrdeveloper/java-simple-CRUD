import java.util.Scanner; //Import scanner into libraries

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create object Scanner
        Crud crud = new Crud(); // create object crud

        while (true) {
            System.out.println("\nCRUD JAVA");
            System.out.println("1 - ADICIONAR NOME");
            System.out.println("2 - REMOVER NOME");
            System.out.println("3 - MOSTRAR LISTA");
            System.out.println("4 - ATUALIZAR USUARIo");
            System.out.println("5 - SAIR DO CRUD");
            System.out.print("Escolha: ");

            int escolha = sc.nextInt();
            sc.nextLine(); //clean enter

            switch (escolha) {
                case 1:
                    System.out.print("Qual nome adicionar? = ");
                    String name = sc.nextLine();
                    crud.adicionarNome(name);
                    System.out.println(name + " FOI ADICIONADO.");
                    break;

                case 2:
                    System.out.print("Qual nome deseja remover? = ");
                    String name2 = sc.nextLine();
                    crud.removerNome(name2);
                    System.out.println(name2 + " FOI REMOVIDO.");
                    break;

                case 3:
                    for (Usuario u : crud.procurarNomes()) {
                        System.out.println(u.getNome());
                    }
                    break;

                case 4:
                    System.out.print("Nome atual: ");
                        String nomeAntigo = sc.nextLine();

                        System.out.print("Idade atual: ");
                        int idadeAntiga = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.print("Nova idade: ");
                        int novaIdade = sc.nextInt();
                        sc.nextLine();

                        boolean atualizado = crud.atualizarUsuario(nomeAntigo, idadeAntiga, novoNome, novaIdade);

                        if (atualizado) {
                            System.out.println("USUARIO ATUALIZADO.");
                        } else {
                            System.out.println("Usuario não encontrado.");
                        }
                        break;
                 case 5:
                     System.out.println("OBRIGADO POR USAR O CRUD");
                    sc.close();
                    return; 
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
