package trabalhoFinal;

import java.util.Scanner;

public class Playlist {
    private String nomePlay;
    private String streaming;

    public String getNomePlay() {
        return nomePlay;
    }

    public void setNomePlay(String nomePlay) {
        this.nomePlay = nomePlay;
    }

    public String getStreaming() {
        return streaming;
    }

    public void setStreaming(String streaming) {
        this.streaming = streaming;
    }

    public Playlist(String nomePlay, String streaming) {
        this.nomePlay = nomePlay;
        this.streaming = streaming;
    }

    public Playlist() {
    }

    // cadastrar a palylist
    public void cadastrarPlaylist() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o nome que deseja para a Playlist: ");
        this.nomePlay = leitor.nextLine();
        System.out.println("Informe o serviço de streaming que deseja para a Playlist: ");
        this.streaming = leitor.nextLine();
    }
    
   
}
