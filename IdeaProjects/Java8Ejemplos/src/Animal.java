/**
 * Created by mgamba on 10/06/2017.
 */
public class Animal {


    private int numPatas;
    private String especie;
    private int numOjos;
    private boolean alas;

    public Animal() {
    }

    public Animal(int numPatas, String especie, int numOjos, boolean alas) {
        this.numPatas = numPatas;
        this.especie = especie;
        this.numOjos = numOjos;
        this.alas = alas;
    }

    public Animal(int numPatas, String especie, boolean alas) {
        this.numPatas = numPatas;
        this.especie = especie;
        this.alas = alas;
    }

    public Animal(int numPatas) {
        this.numPatas = numPatas;
    }

    public Animal(String especie) {
        this.especie = especie;
    }

    public Animal(boolean alas) {
        this.alas = alas;
    }

    public int getNumPatas() {
        String abxx;
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }



    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNumOjos() {
        return numOjos;
    }

    public void setNumOjos(int numOjos) {
        this.numOjos = numOjos;
    }

    public boolean isAlas() {
        return alas;
    }

    public void setAlas(boolean alas) {
        this.alas = alas;
    }
}
