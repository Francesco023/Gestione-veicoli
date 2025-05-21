public class Moto extends Veicolo{

    @Override

    String modello;
    int anno;
    int cilindrata;

    public Moto(String modello, int anno, int cilindrata){
        this.modello = modello;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    public void startMotore(){
        System.out.println("Brruummm!");
    }
}
