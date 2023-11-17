package inheritance;

public class Child extends Parent {
    Child(String name){
        super(name);
    }
    
    void serbisyo(){
        System.out.println(name + " kay nagserbisyo sa mga kabatan-onan");
    }
    
    void naghulat(){
        System.out.println(name + " kay naghulat sa honorarium sheeeeessshhhhh!!");
    }
}