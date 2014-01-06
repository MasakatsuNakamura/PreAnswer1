import java.io.*;

class RiceCake{
    void eat(){
        System.out.println("お餅");
    }
}
class Zenzai extends RiceCake{
    void eat(){
        System.out.println("善哉");
    }
}
public class PriAnswer1{
    public static void main(String[] args){
        RiceCake[] food = {new RiceCake() , new Zenzai()};
        
        food[0].eat(); //(1)
        food[1].eat(); //(2)
        ((RiceCake)food[1]).eat();     //(3)
        
    }
}

class Test {
    public static viod main (String[] args) {
        System.out.priteln("Hello, World!");
    }
}
