package trabalhoFinal;

public abstract class Pessoa {
    private int id;
    private String nome;
    

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa() {
    	
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	
	public String verDetalhes() {
		return "ID:" + id + "\nNome=" + nome;
	}


  
   
}

