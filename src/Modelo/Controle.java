//APS - Fernando / Luis / Isabela / Samuel
package Modelo;

import DAL.pergrespDAO;
import java.util.ArrayList;
import java.util.List;

public class Controle
{

    public String mensagem;

    public void EditarPerguntaResposta(List<String> listaDadosPerguntas)
    {
        mensagem = "";
        pergrespDAO respDAO = new pergrespDAO();
        Validacao valida = new Validacao();
        perguntasRespostas pergResp = new perguntasRespostas();
        pergResp = valida.ValidarPergunta(listaDadosPerguntas);
        if (valida.mensagem.equals(""))
        {
            respDAO.EditarPerguntasRespostas(pergResp);
            this.mensagem = respDAO.mensagem;
        } else
        {
            this.mensagem = valida.mensagem;
        }
    }

    public void SalvarJogadorNovo(List<String> listaDadosPergunta)
    {
        mensagem = "";
        pergrespDAO pergunta = new pergrespDAO();
        Validacao valida = new Validacao();
        Pontuacao jogadorPont = valida.Validarjogador(listaDadosPergunta);

        if (valida.mensagem.equals(""))
        {
            pergunta.salvarNovoJogador(jogadorPont);
            this.mensagem = pergunta.mensagem;
        } else
        {
            mensagem = valida.mensagem;
        }
    }

    public void SalvarPerguntaNova(List<String> listaDadosPergunta)
    {
        mensagem = "";
        pergrespDAO pergunta = new pergrespDAO();
        Validacao valida = new Validacao();
        perguntasRespostas pergResp = valida.ValidarPergunta(listaDadosPergunta);

        if (valida.mensagem.equals(""))
        {
            pergunta.salvarNovaQuestao(pergResp);
            this.mensagem = pergunta.mensagem;
        } else
        {
            mensagem = valida.mensagem;
        }
    }

    public List<String> PesquisarPerguntasAleatorias(String idString)
    {
        mensagem = "";
        pergrespDAO pergDAO = new pergrespDAO();
        perguntasRespostas perguntasErespostas = new perguntasRespostas();
        Validacao valida = new Validacao();
        List<String> listaDadosperguntas = new ArrayList<>();
        perguntasErespostas = valida.ValidarPesquisa(idString);
        if (valida.mensagem.equals(""))
        {
            perguntasErespostas = pergDAO.pesquisaPerguntasAleatorias(perguntasErespostas);
            listaDadosperguntas.add(idString);
            listaDadosperguntas.add(perguntasErespostas.perguntaC);
            listaDadosperguntas.add(perguntasErespostas.respostaC);
            listaDadosperguntas.add(perguntasErespostas.pontos);
        } else
        {
            this.mensagem = valida.mensagem;
        }
        return listaDadosperguntas;
    }
    
    public List<String> PesquisarPerguntas(String idString)
    {
        mensagem = "";
        pergrespDAO pergDAO = new pergrespDAO();
        perguntasRespostas perguntasErespostas = new perguntasRespostas();
        Validacao valida = new Validacao();
        List<String> listaDadosperguntas = new ArrayList<>();
        perguntasErespostas = valida.ValidarPesquisa(idString);
        if (valida.mensagem.equals(""))
        {
            perguntasErespostas = pergDAO.pesquisaPerguntas(perguntasErespostas);
            listaDadosperguntas.add(idString);
            listaDadosperguntas.add(perguntasErespostas.perguntaC);
            listaDadosperguntas.add(perguntasErespostas.respostaC);
            listaDadosperguntas.add(perguntasErespostas.pontos);
        } else
        {
            this.mensagem = valida.mensagem;
        }
        return listaDadosperguntas;
    }
}
