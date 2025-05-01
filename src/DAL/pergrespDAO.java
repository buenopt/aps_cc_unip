//APS - Fernando / Luis / Isabela / Samuel
package DAL;

import Modelo.Pontuacao;
import Modelo.perguntasRespostas;
import java.sql.*;

public class pergrespDAO
{

    Conexao conexao = new Conexao();
    public String mensagem;
    public static int pontoBD;
    public static String resposta;

    public void EditarPerguntasRespostas(perguntasRespostas perguntasRespostas)
    {
        mensagem = "";
        try
        {
            Connection con = conexao.conectar();
            String comsql = "UPDATE pergunta SET perguntaC=?,pontos=?,respostaC=? WHERE idPergunta=?";
            PreparedStatement stmt = con.prepareStatement(comsql);
            stmt.setString(1, perguntasRespostas.perguntaC);
            stmt.setString(2, perguntasRespostas.pontos);
            stmt.setString(3, perguntasRespostas.respostaC);
            stmt.setInt(4, perguntasRespostas.idPergunta);
            stmt.execute();
            conexao.desconectar();
            mensagem = "Questão editada com sucesso";
        } catch (Exception e)
        {
            mensagem = e.getMessage();
        }
    }

    public void salvarNovoJogador(Pontuacao jogador)
    {
        mensagem = "";
        try
        {
            Connection con = conexao.conectar();
            String comsql = "INSERT INTO pontuacao (nome,pontuacao) VALUES(?,?)";
            PreparedStatement stmt = con.prepareStatement(comsql);
            stmt.setString(1, jogador.Nome);
            stmt.setString(2, jogador.pontuacao);
            stmt.execute();
            conexao.desconectar();
            mensagem = "Parabéns, Jogador cadastrada com sucesso";
        } catch (Exception e)
        {
            mensagem = e.getMessage();
        }
    }

    public void salvarNovaQuestao(perguntasRespostas respPerg)
    {
        mensagem = "";
        try
        {
            Connection con = conexao.conectar();
            String comsql = "INSERT INTO pergunta (perguntaC,respostaC,pontos) VALUES(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(comsql);
            stmt.setString(1, respPerg.perguntaC);
            stmt.setString(2, respPerg.respostaC);
            stmt.setString(3, respPerg.pontos);
            stmt.execute();
            conexao.desconectar();
            mensagem = "Questão cadastrada com sucesso";
        } catch (Exception e)
        {
            mensagem = e.getMessage();
        }
    }

    public perguntasRespostas pesquisaPerguntasAleatorias(perguntasRespostas pergResp)
    {
        mensagem = "";
        try
        {
            String comsql;
            comsql = null;
            Connection con = conexao.conectar();
            comsql = "SELECT TOP 10 *FROM pergunta ORDER BY NEWID()";
            PreparedStatement stmt = con.prepareStatement(comsql);
            ResultSet resultset = stmt.executeQuery();
            if (resultset.next())
            {
                pergResp.idPergunta = resultset.getInt("idPErgunta");
                pergResp.perguntaC = resultset.getString("perguntaC");
                resposta = resultset.getString("respostaC");
                pontoBD = resultset.getInt("pontos");
            }

            conexao.desconectar();
        } catch (Exception e)
        {
            mensagem = e.getMessage();
        }
        return pergResp;

    }

    public perguntasRespostas pesquisaPerguntas(perguntasRespostas pergResp)
    {
        mensagem = "";
        try
        {
            String comsql;
            Connection con = conexao.conectar();
            comsql = "SELECT *FROM pergunta WHERE idPergunta=?";
            PreparedStatement stmt = con.prepareStatement(comsql);
            stmt.setInt(1, pergResp.idPergunta);
            ResultSet resultset = stmt.executeQuery();
            if (resultset.next())
            {
                pergResp.pontos = resultset.getString("pontos");
                pergResp.perguntaC = resultset.getString("perguntaC");
                pergResp.respostaC = resultset.getString("respostaC");
                pergResp.idPergunta = resultset.getInt("idPergunta");
            }

            conexao.desconectar();
        } catch (Exception e)
        {
            mensagem = e.getMessage();
        }
        return pergResp;

    }

}
