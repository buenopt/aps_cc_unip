//APS - Fernando / Luis / Isabela / Samuel
package Modelo;

import java.util.List;

public class Validacao
{

    public String mensagem;

    public perguntasRespostas ValidarPergunta(List<String> listaDadosPerguntasRespostas)
    {
        mensagem = "";
        perguntasRespostas pergResp = new perguntasRespostas();
        try
        {
            pergResp.idPergunta = Integer.parseInt(listaDadosPerguntasRespostas.get(0));
        } catch (NumberFormatException e)
        {
            mensagem = "Id inválido \n";
        }
        pergResp.perguntaC = listaDadosPerguntasRespostas.get(1);
        pergResp.respostaC = listaDadosPerguntasRespostas.get(2);
        pergResp.pontos = listaDadosPerguntasRespostas.get(3);
        if (pergResp.perguntaC.equals(""))
        {
            mensagem += "Pergunta não pode ser vazio \n";
        }
        if (pergResp.respostaC.equals(""))
        {
            mensagem += "Resposta não pode ser vazio \n";
        }
        if (pergResp.pontos.equals(""))
        {
            mensagem += "Quantidade de pontos não pode ser vazio \n";
        }
        return pergResp;
    }

    
    public Pontuacao Validarjogador(List<String> listaDadosJogadores)
    {
        mensagem = "";
        Pontuacao jogadores = new Pontuacao();
        try
        {
            jogadores.idPontuacao = Integer.parseInt(listaDadosJogadores.get(0));
        } catch (NumberFormatException e)
        {
            mensagem = "Id inválido \n";
        }
        jogadores.Nome = listaDadosJogadores.get(1);
        jogadores.pontuacao = listaDadosJogadores.get(2);
         if (jogadores.Nome.equals(""))
        {
            mensagem += "Nome não pode ser vazio \n";
        }
        if (jogadores.pontuacao.equals(""))
        {
            mensagem += "Pontuação não pode ser vazio \n";
        }
       
        return jogadores;
    }
    
    
    
    
    
    
    
    public Pontuacao ValidarPontuacao(List<String> listaDadosPontuacao)
    {
        mensagem = "";
        Pontuacao pontuacao = new Pontuacao();
        try
        {
            pontuacao.idPontuacao = Integer.parseInt(listaDadosPontuacao.get(0));
        } catch (NumberFormatException e)
        {
            mensagem = "Id inválido \n";
        }
        pontuacao.Nome = listaDadosPontuacao.get(1);
        pontuacao.pontuacao = listaDadosPontuacao.get(2);
        if (pontuacao.Nome.equals(""))
        {
            mensagem += "Nome não pode ser vazio \n";
        }
        if (pontuacao.pontuacao.equals(""))
        {
            mensagem += "Pontuação não pode ser vazio \n";
        }

        return pontuacao;
    }

 
    
    public perguntasRespostas ValidarPesquisa(String idString)
    {
        mensagem = "";
        perguntasRespostas pergResp = new perguntasRespostas();
        try
        {
            pergResp.idPergunta = Integer.parseInt(idString);
        } catch (NumberFormatException e)
        {
            mensagem = e.getMessage();
        }
        return pergResp;
    }

}
