package ro.siit.io;

import com.google.gson.Gson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import ro.siit.oop.Address;

public class JsonExamples {
    ObjectMapper om = null;

    public ObjectMapper getObjectMapperInstance () {
        if(om == null){
            om = new ObjectMapper();
        }
        return om;
    }

    public static void main(String[] args) throws IOException {
        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal("Bobita",4,'M', "yellow", new Address("Splai"));
        animals.add(new Animal("Bobita",4,'M', "yellow", new Address("Splai")));
        animals.add(new Animal("Rex",5,'F',"red", new Address("Iuliu")));
        Animal.race = "Bichon";
        File fileJackson = new File("src/main/resources/dogsJackson.json");
        File fileGson = new File("src/main/resources/dogsGson.json");


        // libraria jackson databind
        ObjectMapper om = new JsonExamples().getObjectMapperInstance();
//        JsonNode jn = om.valueToTree(animals); // serializan in format JSON
//        System.out.println(jn);
        ObjectWriter objectWriter = om.writer();
        objectWriter.writeValue(fileJackson, animals); //scriem lista de animale in fisier, lista va fi serializata tot in format JSON

        List<Animal> animalsFromJsonFile = om.readValue(new FileReader(fileJackson), List.class); // o citim din fisier
        System.out.println(animalsFromJsonFile); // TODO


        // libraria google gson
        Gson gson = new Gson();
        String animalsJson = gson.toJson(animals);
        System.out.println(animalsJson);
        Writer writer = new FileWriter(fileGson);
        gson.toJson(animals, writer);
        writer.flush();


        // reflection
        System.out.println(Animal.class.getDeclaredFields());
        Field[] fieldsFromAnimal = Animal.class.getDeclaredFields();
        fieldsFromAnimal[0].setAccessible(true);

        try {
            Method getAgeMethod = Animal.class.getMethod("getAge");
                // sau asa , obtinem obiectul .class din instanta clasei
//            Method getAgeMethod = animal.getClass().getMethod("getAge");
            System.out.println(getAgeMethod.invoke(animal)); // invocam metoda getAge() folosin reflection
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
