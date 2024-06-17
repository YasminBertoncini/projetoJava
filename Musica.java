package trabalhoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Musica {
    private int id;
    private String titulo;
    private Cantor cantor;
    private ArrayList<Musica> listaMusicas = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);

    public Musica(int id, String titulo, Cantor cantor) {
        this.id = id;
        this.titulo = titulo;
        this.cantor = cantor;
    }

    public Musica() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }

    public void cadastrarMusica() {
        System.out.print("ID: ");
        int id = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Titulo: ");
        String titulo = leitor.nextLine();

        System.out.print("ID do cantor: ");
        int cantorId = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Nome do cantor: ");
        String nomeCantor = leitor.nextLine();

        System.out.print("Gênero musical do cantor ");
        String generoMusical = leitor.nextLine();

        Cantor cantor = new Cantor(cantorId, nomeCantor, generoMusical);
        
        

        Musica musica = new Musica(id, titulo, cantor);
        listaMusicas.add(musica);

        System.out.println("Música cadastrada com sucesso!");
    }

    public void listarMusicas() {
        System.out.println("Lista de músicas:");
        for (Musica musica : listaMusicas) {
            System.out.println(musica.getTitulo());
        }
    }

    public void detalhesMusica(int id) {
        Musica musicaDetalhada = null;
        for (Musica musica : listaMusicas) {
            if (musica.getId() == id) {
                musicaDetalhada = musica;
                break;
            }
        }
        if (musicaDetalhada != null) {
            System.out.println("*****Detalhes da Música*****");
            System.out.println("ID: " + musicaDetalhada.getId());
            System.out.println("Titulo: " + musicaDetalhada.getTitulo());
            System.out.println("Cantor: " + musicaDetalhada.getCantor().verDetalhes());
        } else {
            System.out.println("Música não encontrada.");
        }
    }

    public void excluirMusica(int id) {
        Musica musicaExcluir = null;
        for (Musica musica : listaMusicas) {
            if (musica.getId() == id) {
                musicaExcluir = musica;
                break;
            }
        }
        if (musicaExcluir != null) {
            listaMusicas.remove(musicaExcluir);
            System.out.println("Música excluída");
        } else {
            System.out.println("Música não encontrada");
        }
    }

    public void editarTitulo(int id) {
        Musica musicaEditar = null;
        for (Musica musica : listaMusicas) {
            if (musica.getId() == id) {
                musicaEditar = musica;
                break;
            }
        }
        if (musicaEditar != null) {
            System.out.print("Digite o novo título da música: ");
            String novoTitulo = leitor.nextLine();
            musicaEditar.setTitulo(novoTitulo);
            System.out.println("Título atualizado!");
        } else {
            System.out.println("Música não encontrada.");
        }
    }
}
