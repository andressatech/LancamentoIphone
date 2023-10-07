package aparelho;
import funcoes.Navegador;
import funcoes.Reprodutor;
import funcoes.Telefone;

public class Aparelho implements Navegador, Reprodutor, Telefone{
   
    public void ligar (){
        System.out.println("Ligando");
    }

    public void atender (){
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorrerioVoz (){
        System.out.println("Iniciando Correrio de Voz");
    }

    public void adicionarNovaAba (){
        System.out.println("Adicionando Aba");
    };

    public void atualizarPagina (){
        System.out.println("Atualizando página");
    };

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void tocar (){
        System.out.println("Tocando música");
    }

    public void pausar (){
        System.out.println("Pausando música");
    }

    public void selecionarMusica (){
        System.out.println("Selecionando música");
    }



}
