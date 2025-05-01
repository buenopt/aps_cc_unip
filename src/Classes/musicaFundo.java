//APS - Fernando / Luis / Isabela / Samuel
package Classes;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class musicaFundo
{

    public void IniciarSomFundo(String nomeDoAudio)
    {
        try
        {
            URL url = getClass().getResource(nomeDoAudio + ".wav");
            AudioClip audio = Applet.newAudioClip(url);
            audio.loop();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void pararSomfundo(String NomedoAudio)
    {
        try
        {
            URL url = getClass().getResource(NomedoAudio + ".wav");
            AudioClip audio = Applet.newAudioClip(url);
            audio.stop();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
