
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle-pc
 */
public class Mymain {
    private String Mymain()
    {
        return null;
    }
   String SOUND_FILENAME="out.mid";
    public static void mainMy(String[] args) {
        System.out.println("My main class");
    }
    public static void main(String[] args) {
       int i=0;
         System.out.println("My main class");
  Mymain m=new Mymain();
        m.playSound();
         
    }
    private void playSound() 
{
  try
  {
      int i=10;
    // get the sound file as a resource out of my jar file;
    // the sound file must be in the same directory as this class file.
    // the input stream portion of this recipe comes from a javaworld.com article.
      System.out.println("into play sound");
    InputStream inputStream = getClass().getResourceAsStream(SOUND_FILENAME);
     System.out.println("after getting stream");
    AudioStream audioStream = new AudioStream(inputStream);
    System.out.println("after getting audio stream"); 
    AudioPlayer.player.start(audioStream);
    
   
  }
  catch (Exception e)
  {
    // a special way i'm handling logging in this application
//    if (debugFileWriter!=null) e.printStackTrace(debugFileWriter);
      e.printStackTrace();
  }
}
}
