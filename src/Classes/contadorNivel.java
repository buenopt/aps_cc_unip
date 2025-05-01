//APS - Fernando / Luis / Isabela / Samuel
package Classes;

import javax.swing.JLabel;

public class contadorNivel
{

    public void contagemNivel(JLabel valorReceber, JLabel valorEnviar)
    {    
            int aux;
            aux = Integer.parseInt(valorReceber.getText());
            aux = aux + 1;
            valorEnviar.setText(String.valueOf(aux));      
    }
}
