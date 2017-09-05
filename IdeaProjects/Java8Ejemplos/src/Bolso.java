/**
 * Created by mgamba on 11/06/2017.
 */
public class Bolso {
    String marca;
    String color;
    Long precio;
    Boolean rebajado;
    String modelo;

    public Bolso() {
    }

    public Bolso(String marca, String color, Long precio, Boolean rebajado, String modelo) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.rebajado = rebajado;
        this.modelo = modelo;
    }

    public Bolso(String rojo, String s, boolean b, String s1) {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Boolean getRebajado() {
        return rebajado;
    }

    public void setRebajado(Boolean rebajado) {
        this.rebajado = rebajado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void printModelo(){
        System.out.println(getModelo());
    }

    public void printMarca(){
        System.out.println(getMarca());
    }

    public void printColor(){
        System.out.println(getColor());
    }

    public void printPrecio(){
        System.out.println(getPrecio());
    }

    public void comprarBolso(){
        System.out.println("Me he comprado un "+ getModelo()+ " de "+ getMarca() + " por " +getPrecio()+ " euracos");
    }
}
