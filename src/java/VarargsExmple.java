/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle-pc
 */
public class VarargsExmple {
    public static void main(String[] args) {
        VarargsExmple e=new VarargsExmple();
        e.doStuff(10,20);
    }
    public void doStuff(int... i)
    {
        System.out.println(" "+i.length);
        System.out.println(" "+i);
          for(int s:i){  
   System.out.println(s);  
  }  
    }
}
