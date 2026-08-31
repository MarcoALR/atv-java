import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        
        List<Heroi> herois = new ArrayList<>();
        herois.add(new MarcãoVB());
        
        
        for (Heroi heroi: herois){
            heroi.apresentar();
            heroi.usarPoder();
            System.out.println("-------------------------------------");
        }
        
        
    }
           
}
