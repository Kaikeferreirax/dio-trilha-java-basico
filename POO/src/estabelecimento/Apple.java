package estabelecimento;

import apple.iphone.internet.Navegador;
import apple.iphone.reprodutorMusical.Ipod;
import apple.iphone.telefone.Telefone;
import equipamento.Iphone;

public class Apple {
    public static void main(String[] args) {

        // Criando objetos de iphone

        Ipod ipod = new Iphone();
        Telefone tell = new Iphone();
        Navegador nav = new Iphone();

        // executando seus métodos e certificando que serão a partir de um Iphone

        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();

        tell.ligar();
        tell.atender();
        tell.iniciarCorreioVoz();

        nav.adicionarNovaAba();
        nav.atualizarPagina();
        nav.exibirPagina();

        //concluído!
    }
}
