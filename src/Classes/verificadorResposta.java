//APS - Fernando / Luis / Isabela / Samuel
package Classes;

import javax.swing.JRadioButton;

public class verificadorResposta
{

    public static Boolean verificarSelecao(JRadioButton recebeSelecao)
    {
        if (recebeSelecao.isSelected())
        {
            return true;
        }
        return false;

    }
}
