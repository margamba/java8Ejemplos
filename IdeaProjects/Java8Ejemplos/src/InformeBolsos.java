import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by mgamba on 11/06/2017.
 */
public class InformeBolsos {

    List<Bolso> bolsos = new ArrayList<Bolso>();

    public static void main(String[] args) {
        InformeBolsos informeBolsos = new InformeBolsos();
        informeBolsos.cargarBolsos();
//        informeBolsos.listarModelos(b -> "rojo".equalsIgnoreCase(b.getColor()) && b.getPrecio()> 500L);
//        informeBolsos.listarModelos(b -> "loewe".equalsIgnoreCase(b.getMarca()));
//        informeBolsos.listarMarcas(bolso -> bolso.getRebajado());
//        informeBolsos.procesarBolsos(bolso -> "armani".equalsIgnoreCase(bolso.getMarca()), bolso -> bolso.printModelo());
        informeBolsos.procesarBolsos(bolso -> true, bolso -> bolso.comprarBolso());
    }

    private void cargarBolsos(){
        bolsos.add(new Bolso("Guess","rojo", 250L, false, "Cosmopolitan"));
        bolsos.add(new Bolso("loewe","marron", 1200L, true, "NewYork"));
        bolsos.add(new Bolso("loewe","negro", 1500L, false, "Executive"));
        bolsos.add(new Bolso("Louis Vutton","gris", 1800L, false, "Night"));
        bolsos.add(new Bolso("Armani","rojo", 1950L, true, "Cocktail"));
        bolsos.add(new Bolso("Armani","verde", 1450L, false, "Exclusivity"));
        bolsos.add(new Bolso("Louis Vutton","negro", 2000L, false, "Fashion"));
        bolsos.add(new Bolso("Desigual","blanco", 90L, false, "Annita"));
    }

    private void listarModelos(Predicate<Bolso> tester){
        //lista modelos por atributo
        for (Bolso bolso : bolsos) {
            if(tester.test(bolso)){
                bolso.printModelo();
            }
        }

    }

    private void listarMarcas(Predicate<Bolso> tester){
        for (Bolso bolso : bolsos) {
            if(tester.test(bolso)){
                bolso.printMarca();
            }
        }
    }

    private void procesarBolsos(Predicate<Bolso> tester, Consumer<Bolso> operacion){
        for(Bolso bolso: bolsos){
            if(tester.test(bolso)){
                operacion.accept(bolso);
            }
        }
    }

}
