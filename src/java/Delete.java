import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.apache.tomcat.util.http.fileupload.FileUtils;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle1
 */
public class Delete {
    static int z;
    public static void main(String[] args) throws IOException {
    File index = new File("E:\\Midhu");
String[]entries = index.list();
Number a[]=new Number[5];
a[0]=new Double(10.9f);
Integer j=new Double(5.9f);
int i=0;
        System.out.println("i is "+i);
        System.out.println("z is"+ z);
        System.out.println("Enter your file name ");
        Scanner sc=new Scanner(System.in);
       String str=sc.next();
//       String str1;
       int result;
       
for(String s: entries){
    result=str.compareTo(s);
    System.out.println("String is "+s);
    File currentFile = new File(index.getPath(),s);
    System.out.println("result is "+result);
    if(result>0)
    { 
        System.out.println("current file is "+currentFile);
        FileUtils.deleteDirectory(currentFile);
//        currentFile.delete();
//    //
    System.out.println("Files deleted succesfully");
}}
   // FileUtils.cleanDirectory(index); 
    //FileUtils.deleteDirectory(new File("directory"));  
    System.out.println("Directory cleaned sucessfully");
//FileUtils.deleteDirectory(index);
//        System.out.println("Deleted successfully");
//    
    
    }
}