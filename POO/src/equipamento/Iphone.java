package equipamento;

import apple.iphone.internet.Navegador;
import apple.iphone.reprodutorMusical.Ipod;
import apple.iphone.telefone.Telefone;

public class Iphone implements Ipod, Telefone, Navegador {


    public void tocar() {
        System.out.println("TOCANDO MÚSICA VIA IPHONE");
    }


    public void pausar() {
        System.out.println("PAUSANDO MÚSICA VIA IPHONE");
    }


    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA VIA IPHONE");

    }


    public void ligar() {
        System.out.println("LIGANDO VIA IPHONE");

    }


    public void atender() {
        System.out.println("ATENDENDO CHAMADA VIA IPHONE");

    }


    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ VIA IPHONE");

    }


    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA VIA IPHONE");

    }


    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA VIA IPHONE");

    }


    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA VIA IPHONE");

    }
}
