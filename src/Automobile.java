public class Automobile extends Veicolo{
    @Override

    String modello;
    int anno;
    int porte;

    public Automobile(String modello, int anno, int porte){
        this.modello = modello;
        this.anno = anno;
        this.porte = porte;
    }

    public void startMotore(){
        System.out.println("Vroomm!");
    }

}
