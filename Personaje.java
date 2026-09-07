package src;

    public class Personaje {
    String nombre;
    String apallido;
    private int vida;
    boolean esta_vivo = true;
    

    public void setVida(int vida){
        if(vida < 0){
            System.out.println("la vida no puede ser negativa!!");
            this.vida = 0;
        }else{
            this.vida = vida;
        }
    }
    public int getVida(){
        return vida;
    }
}