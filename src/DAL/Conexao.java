//APS - Fernando / Luis / Isabela / Samuel
package DAL;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao
{
    private Connection conexao;

    public Connection conectar()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Garante o carregamento do driver
            conexao = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=apscc;encrypt=true;trustServerCertificate=true",
                    "sa",
                    "Senha1983@@" // Substitua pela sua senha  sua instancia de banco de dados
            );
        }
        catch (ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Driver JDBC não encontrado: " + e.getMessage());
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro de conexão: " + e.getMessage());
        }
        return conexao;
    }

    public void desconectar()
    {
        try
        {
            if (conexao != null && !conexao.isClosed())
            {
                conexao.close();
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar: " + e.getMessage());
        }
    }
}
