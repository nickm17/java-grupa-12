package ro.siit.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import ro.siit.oop.Address;

public class ObjectStreams {


    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Bobita",4,'M', "yellow", new Address("Splai"))); // pentru ObjectOutputStream trebuie ca si obiectul  Address sa implementeze Serializable( arunca exceptie)
        animals.add(new Animal("Rex",5,'F',"red", new Address("Splai")));
        Animal.race = "Bichon";
        File file = new File("src/main/resources/dogs.data");

        writeAnimalsToFile(animals, file);

        List<Animal> animalsFromFile = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){
            while(true){
                Object o = in.readObject();
                if(o instanceof Animal) {
                    animalsFromFile.add((Animal) o );
                }
            }

        } catch (EOFException e) {
            // ingnorata intentionat
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(animalsFromFile);
        System.out.println(animalsFromFile.get(0).race);
    }

    private static void writeAnimalsToFile(List<Animal> animals, File file) {
        try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
            //animals.forEach(System.out::println);
            for (Animal animal : animals){
                System.out.println(animal);
                out.writeObject(animal);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
