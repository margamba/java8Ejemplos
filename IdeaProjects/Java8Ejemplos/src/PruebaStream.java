import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by mgamba on 10/06/2017.
 */
public class PruebaStream {

    public static void main(String[] args) {

        Animal tigre = new Animal(4,"mamifero",2,false);
        Animal aguila = new Animal(2, "ave", 2, true);
        Animal iguana = new Animal(4, "reptil", 2, false);
        Animal delfin = new Animal(0, "pez", 2, false);
        Animal mejillon = new Animal(0, "molusco", 0, false);

        Set<Animal> animales = new HashSet<>();
        animales.add(tigre);
        animales.add(aguila);
        animales.add(iguana);
        animales.add(delfin);
        animales.add(mejillon);


        Set<Animal> animales2 = Stream.of(tigre, aguila, iguana, delfin, mejillon).collect(Collectors.toSet());
        //Lista de numero de patas, ordenado por especie ascendente
        List<Integer> patas=animales2.stream().sorted(Comparator.comparing(Animal::getEspecie)
                                    ).map(Animal::getNumPatas).collect(Collectors.toList());

        for (Integer numPatas : patas) {
            System.out.println(numPatas);
        }

        System.out.println("Ejemplo con lambda, imprime numero de patas,  ordenado por especie des");
        animales2.stream().sorted(Comparator.comparing(Animal::getEspecie).reversed())
                .map( a ->  {
                                System.out.println(a.getNumPatas());
                                return a.getNumPatas();
                            }
                    ).collect(Collectors.toList());

        System.out.println("Ejemplo con lambda, imprime especies ordenado por número de patas asc");
        animales2.stream().sorted(Comparator.comparing(Animal::getNumPatas))
                 .map(a -> {
                    System.out.println(a.getEspecie());
                    return a.getEspecie();
                 }).collect(Collectors.toList());

        System.out.println("Ejemplo con lambda, imprime especies con ojos, ordenado por número de patas desc");
        animales2.stream().filter(a -> a.getNumOjos() > 0)
                 .sorted(Comparator.comparing(Animal::getNumPatas).reversed())
                 .map(a -> {
                    System.out.println(a.getEspecie());
                    return a.getEspecie();
                 }).collect(Collectors.toList());

        System.out.println("*Ejemplo con lambda, imprime especies ordenado por número de patas y especie asc");
        animales2.stream().sorted(Comparator.comparing(Animal::getNumPatas).thenComparing(Animal::getEspecie))
                .forEach(a -> {System.out.println(a.getEspecie());
                            //   return a.getEspecie();
                });
               /*  .map(a -> {
                   System.out.println(a.getEspecie());
                    return a.getEspecie();
                })
            .collect(Collectors.toList());*/
        System.out.println("Ejemplo con lambda, imprime especies sin alas ordenado por número de patas y especie asc");
        List<String> especies = animales2.stream().sorted(Comparator.comparing(Animal::getNumPatas).thenComparing(Animal::getEspecie))
                .filter(a -> !a.isAlas())
                .map(a -> {
                    System.out.println(a.getEspecie());
                    return a.getEspecie();
                })
                .collect(Collectors.toList());
        System.out.println("-----------------");
        for (String especie:especies) {
            System.out.println(especie);
        }


        List<Animal> listAnimales = animales2.stream().collect(Collectors.toList());
        List<String>listEspecies = animales2.stream().map(Animal::getEspecie).collect(Collectors.toList());
        List<Integer> listNumPatas = animales2.stream().map(Animal::getNumPatas).collect(Collectors.toList());
        List<Integer> listNumOjos = animales.stream().map(Animal::getNumOjos).collect(Collectors.toList());
        List<Boolean> listAlas = animales2.stream().map(Animal::isAlas).collect(Collectors.toList());


        List <String>  listEspecies2 = Arrays.asList("Insecto", "Aracnido", "Anfibio", "Crustaceo");

        System.out.println("--------------------------");
        List<Animal> animalesPorEspecie =  listEspecies2.stream().map(e ->new Animal(e)).collect(Collectors.toList());

        for (Animal animal: animalesPorEspecie) {
            System.out.println(animal.getEspecie());
        }




    }




}
