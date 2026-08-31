
public class MarcãoVB extends Heroi {
    
    public MarcãoVB(){
        super("MarcãoVB" ,999 ,999 ,999 );
    }
    
     @Override
    public void usarPoder() {
        System.out.println(getNome() + " soltou uma frase 'só o ouro' ");
    }
    
}
