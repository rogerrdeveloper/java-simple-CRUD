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
            System.out.println("4 - SAIR DO CRUD");
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
                    System.out.println("OBRIGADO POR USAR O CRUD");
                    sc.close();
                    return; //exit program

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}