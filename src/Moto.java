public class Moto implements Veicolo{



    private String modello;
    private int anno;
    private int cilindrata;

    public Moto(String modello, int anno, int cilindrata){
        this.modello = modello;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }
    public String getModello(){
        return this.modello;
    }
    public int getAnno(){
        return this.anno;
    }
    public int getCilindrata(){
        return this.cilindrata;
    }
    public int getCilindrata(){
        return this.cilindrata;
    }

    public void startMotore(){
        System.out.println("Brruummm!");
    }
}
