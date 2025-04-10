package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.random.RandomGenerator;

public class PersonsList {
private HashMap <String, Person> personsList;

    public PersonsList() {
       personsList = new HashMap<String, Person>();
    }

    public Person findByName(String name) throws IllegalArgumentException{
    if(!(checkCorrectName(name)){
        throw new IllegalArgumentException();
        }
    // return person if exists.
    if (personsList.containsKey(name)){return personsList.get(name);}
    }


    public Person clone(Person p){
        Random random= new Random();
        int newId= random.nextInt();
        Person person= new Person(newId,p.getName(),
                p.getAge(),p.getOccupation());
        return person;
    }

    public boolean checkCorrectName (String name){
        String[] nameSurname= name.trim().split("");
        if (nameSurname.length != 2){return false;}
        return true;
    }


    public void writePersonToFile(String fileName, Person p) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(p.toString());

    }


}
