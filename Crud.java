import java.util.ArrayList;

public class Crud {

    ArrayList<Usuario> usuarios = new ArrayList<>(); //create ArrayList for store users

    public void adicionarNome(String n){
        Usuario u = new Usuario(n); // Create Object
        usuarios.add(u); // Add user in Array
    }

    public boolean atualizarUsuario(String nomeAntigo, int idadeAntiga, String novoNome, int novaIdade) {
        for (Usuario u : usuarios) {
            if (u.getNome().equalsIgnoreCase(nomeAntigo) && u.getIdade() == idadeAntiga) {
                u.setNome(novoNome);
                u.setIdade(novaIdade);
                return true;
            }
        }
        return false;
    }

    public void removerNome(String n){
        usuarios.removeIf(u -> u.getNome().equalsIgnoreCase(n)); //Para cada usuário da lista, se o nome dele for igual ao nome digitado, REMOVE da lista
    }

    public ArrayList<Usuario> procurarNomes(){
        return usuarios; // First create methodo return Array and after return users
    }
}
