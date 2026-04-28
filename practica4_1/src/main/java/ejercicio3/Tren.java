package ejercicio3;

public class Tren {
    private int CV;
    private Vagon primerVagon;


    public Tren(int CV) {
        this.CV = CV;
    }

    public void setPrimerVagon(Vagon primerVagon) {
        this.primerVagon = primerVagon;
    }

    public Vagon getPrimerVagon() {
        return primerVagon;
    }

    public int getNumVagones() {
        return this.primerVagon != null ? 1 + this.primerVagon.cuantosMeSiguenB() : 0;
    }
}
