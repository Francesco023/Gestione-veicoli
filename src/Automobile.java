public class Automobile implements Veicolo{


    private String modello;
    private int anno;
    private int porte;

    public Automobile(String modello, int anno, int porte){
        this.modello = modello;
        this.anno = anno;
        this.porte = porte;
    }

    public String getModello(){
        return this.modello;
    }

    public int getAnno(){
        return this.anno;
    }
    public int getPorte(){
        return this.porte;
    }

    public void startMotore(){
        System.out.println("Vroomm!");
    }

}
