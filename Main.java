package trabalhoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Cantor cantor = new Cantor();
        Musica musica = new Musica();
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Playlist playlist = new Playlist();
        playlist.cadastrarPlaylist();

        String nomePlaylist = playlist.getNomePlay();

        String textoMenu = "****** PLAYLIST " + nomePlaylist.toUpperCase() + " ****\n"
                + "1 - Adicionar música;\n"
                + "2 - Listar músicas;\n"
                + "3 - Editar Playlist;\n"
                + "4 - Ver detalhes de uma música específica;\n"
                + "5 - Excluir uma música;\n"
                + "6 - Cadastrar Usuário;\n"
                + "7 - Sair";

        int opcaoMenu;

        do {
            System.out.println(textoMenu);
            System.out.print("Escolha uma opção para a playlist " + nomePlaylist + ": ");
            opcaoMenu = leitor.nextInt();
            leitor.nextLine();

            if (opcaoMenu == 1) {
                musica.cadastrarMusica();
                pessoas.add(cantor);
            } else if (opcaoMenu == 2) {
                System.out.println("Playlist " + nomePlaylist);
                musica.listarMusicas();
            } else if (opcaoMenu == 3) {
                System.out.print("Digite o ID da música a ser editada: ");
                int idEditar = leitor.nextInt();
                leitor.nextLine();
                musica.editarTitulo(idEditar);
            } else if (opcaoMenu == 4) {
                System.out.print("Informe o ID da música que deseja ver os detalhes: ");
                int idDetalhes = leitor.nextInt();
                musica.detalhesMusica(idDetalhes);
            } else if (opcaoMenu == 5) {
                System.out.print("Digite o ID da música a ser excluída: ");
                int idExcluir = leitor.nextInt();
                musica.excluirMusica(idExcluir);
            } else if (opcaoMenu == 6) {
                usuario.cadastrarUsuario();
                pessoas.add(usuario);
                System.out.println(usuario.verDetalhes());
            } else if (opcaoMenu == 7) {
                System.out.println("---------Finalizando o sistema-------");
            } else {
                System.out.println("Opção inválida!! Tente novamente!!");
            }
        } while (opcaoMenu != 7);

        leitor.close();
    }
}
