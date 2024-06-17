package trabalhoFinal;

import java.util.Scanner;

public class Usuario extends Pessoa {
	private String userName;
	
	// herda a clsse abstrata pessoa
	public Usuario(int id, String nome, String userName) {
        super(id, nome);
        this.userName = userName;
    }

    public Usuario() {
    	
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    Scanner leitor = new Scanner(System.in);
    
    public void cadastrarUsuario() {
        System.out.print("ID: ");
        int id = leitor.nextInt();
        leitor.nextLine(); 

        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Nome de usuário: ");
        String userName = leitor.nextLine();

        this.setId(id);
        this.setNome(nome);
        this.setUserName(userName);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    
    //sobreescrita de metodo
    public String verDetalhes() {
      return "ID: " + getId() + "\n Nome: " + getNome() + "\nNome de usuario " + userName;
    }
}


