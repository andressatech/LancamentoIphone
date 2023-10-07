import aparelho.Aparelho;
import funcoes.Navegador;
import funcoes.Reprodutor;
import funcoes.Telefone;

public class Iphone {
    public static void main (String[] args){
        Aparelho iphone = new Aparelho();

        Navegador navegador = iphone;
        Reprodutor reprodutor = iphone;
        Telefone telefone = iphone;

        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.exibirPagina();

        reprodutor.pausar();
        reprodutor.tocar();
        reprodutor.selecionarMusica();

        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorrerioVoz();

    }
}
