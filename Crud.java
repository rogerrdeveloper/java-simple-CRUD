import java.util.ArrayList;

public class Crud {

    ArrayList<Usuario> usuarios = new ArrayList<>(); //create ArrayList for store users

    public void adicionarNome(String n){
        Usuario u = new Usuario(n); // Create Object
        usuarios.add(u); // Add user in Array
    }

    public void removerNome(String n){
        usuarios.removeIf(u -> u.getNome().equalsIgnoreCase(n)); //Para cada usuário da lista, se o nome dele for igual ao nome digitado, REMOVE da lista
    }

    public ArrayList<Usuario> procurarNomes(){
        return usuarios; // First create methodo return Array and after return users
    }
}