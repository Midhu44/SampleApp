
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
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
public class AlarmApplication {
     AudioStream audioStream;
      InputStream inputStream ;
      String SOUND_FILENAME="out.mid";
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to alarm application");
       AlarmApplication a=new AlarmApplication();
        a.startAlarm();
        System.out.println("Press 1 to stop and 2 to snooze alarm");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a choice: ");
        int n = reader.nextInt();
        if(n==1)
        {
            a.stopAlarm();
        }
        else
        {
            a.snoozeAlarm();
        }
        
        
    }
    public void startAlarm() 
    {
        try{
          
          inputStream = getClass().getResourceAsStream(SOUND_FILENAME);
           audioStream = new AudioStream(inputStream);
          AudioPlayer.player.start(audioStream);
    }
    
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    public void stopAlarm()
    {
         AudioPlayer.player.stop(audioStream);
    }
    public void snoozeAlarm() throws IOException
    {
        AudioPlayer.player.stop(audioStream);
        int i=0;
        while(i<1000){
             if(i>550)
             {
                 AudioPlayer.player.start(audioStream);
          }
           i++;
            System.out.println("i is "+i);
        }
        
    }
}
