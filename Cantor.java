package trabalhoFinal;

public class Cantor extends Pessoa {
    private String generoMusical;

    //herda a classe abstrata pessoa
    public Cantor(int id, String nome, String generoMusical) {
        super(id, nome);
        this.generoMusical = generoMusical;
    }

    public Cantor() {
    	
    };

    public String getGeneroMusical() {
        return generoMusical;
    }

   
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    
  //sobreescrita de metodo
    public String verDetalhes() {
        return "ID: " + getId() + "\nNome: " + getNome() + "\nGênero Musical: " + generoMusical;
    }
    
    
}

