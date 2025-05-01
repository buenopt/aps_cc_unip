//APS - Fernando / Luis / Isabela / Samuel
package Classes;

import DAL.pergrespDAO;
import javax.swing.JTextField;

public class somadorPontos
{
    public static String pontosFinais;

    public void somarPontos(JTextField valorReceber, JTextField valorEnviar)
    {
        int aux;
        aux = Integer.parseInt(valorReceber.getText());
        aux = aux + pergrespDAO.pontoBD;
        valorEnviar.setText(String.valueOf(aux));
    }
}
