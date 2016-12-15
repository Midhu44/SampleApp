
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle-pc
 */
public class DateClass {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(" Date is "+date);
    String d;
    SimpleDateFormat df = new SimpleDateFormat("ddmmyyyy");
        System.out.println("Enter date");
        Scanner sc=new Scanner(System.in);
        d=sc.next();
        System.out.println("Entered String is "+d);
        Date date1 = df.parse(d);
        System.out.println("Entered date is "+date1.toString());
        System.out.println("Date is "+date1);
       // Date decrement=DateUtils.addDays(date1,-10);
//    DateTime dt=new DateTime();
//    
    }
    
}
