
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import org.apache.tomcat.util.http.fileupload.FileUtils;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle-pc
 */
public class DateClass1 {
    public static void main(String[] args) throws IOException {
       File index = new File("E:\\Midhu");
        int days;
        int n;
        int result;
        String str;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days ");
        days=sc.nextInt();
//        System.out.println("Enter date");
//       str=sc.next();
       Date d=new Date();
       Calendar cal=Calendar.getInstance();
       cal.setTime(d);
       cal.add(Calendar.DATE,-85);
       Date date=cal.getTime();
     SimpleDateFormat ft = 
      new SimpleDateFormat ("yyyyMMdd");
       String cdate=ft.format(date);
        System.out.println("cdate is "+cdate);
//       String currentdate;
//         
//        
//         System.out.println("Current Date: " + ft.format(d));
//    
//   
//         n=Integer.parseInt(cdate);
//         result=n-days;
//              currentdate=Integer.toString(result);
//              System.out.println("Decremented date is "+currentdate);
       String[]entries = index.list();
       
                for(String s: entries){
                    System.out.println("Filename is "+s);
             num=cdate.compareTo(s);
              if(num==0)
              {
                   File currentFile = new File(index.getPath(),s);
                  System.out.println("current file is "+currentFile);
        FileUtils.deleteDirectory(currentFile);
                  System.out.println("Deleted "+currentFile );
              }
              else if(num>0)
              {
                   File currentFile = new File(index.getPath(),s);
                  System.out.println("current file is "+currentFile);
        FileUtils.deleteDirectory(currentFile);
        System.out.println("Deleted "+currentFile );
              }
              else
              {
                  System.out.println("Nothing to delete");
              }
                }
    }
}
