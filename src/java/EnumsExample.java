/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle-pc
 */
public class EnumsExample {
    
enum CoffeeSize { 
    BIG(0), HUGE(0), OVERWHELMING(024) ;
private int ounces;
CoffeeSize(int ounces) { // constructor
this.ounces = ounces;
}
        public int getOunces() {
            return ounces;
        }

}; // <--semicolon
enum Names{Midhu,Sai};
// is optional here
private CoffeeSize size;
Names name;
public static void main(String[] args) {
    
EnumsExample drink = new EnumsExample();
drink.size = CoffeeSize.OVERWHELMING;
drink.name=Names.Midhu;
    System.out.println("drink.size is "+drink.size);
    System.out.println("drink.size is "+drink.size.getOunces());
    System.out.println("drink.name is "+drink.name);
    System.out.println("values are "+Names.values().length);
}

}
