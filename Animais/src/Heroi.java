
public abstract class Heroi {

    private String nome;
    private int vida;
    private int energia;
    private int velocidade;

    public Heroi (String nome, int vida, int energia, int velocidade) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.velocidade = velocidade;
    }

    public void apresentar() {
        System.out.println("Olá meu codinome de Heroi é " + nome  
        + "\nVida: " + vida
        + "\nEnergia: " + energia       
        + "\nVelocidade: " + energia);
       
    }
    
    public abstract void usarPoder();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }
     public void setVida(int vida) {
        if (vida < 0) {
            vida = 0;
        }
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia < 0) {
            energia = 0;
        }
        this.energia = energia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
}
