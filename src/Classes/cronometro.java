//APS - Fernando / Luis / Isabela / Samuel
package Classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

public class cronometro
{

    public Timer timer;
    private int zerarSegundos = 0;
    private int velocidadeTempo = 1000;

    public void iniciarCron(JLabel retornoContagem)
    {
        ActionListener action = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                zerarSegundos++;

                if (zerarSegundos == 61)
                {
                    zerarSegundos = 0;
                }
                String seg = zerarSegundos <= 9 ? "0" + zerarSegundos : zerarSegundos + "";
                retornoContagem.setText(seg);
            }
        };
        this.timer = new Timer(velocidadeTempo, action);
        this.timer.start();
    }

    public void pararCron(JLabel retornoPausaCron)
    {
        timer.stop();
        zerarSegundos = 0;
        retornoPausaCron.setText("00");
    }

}
