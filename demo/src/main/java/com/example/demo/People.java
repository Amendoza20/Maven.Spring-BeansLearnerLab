package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>{

    private ArrayList<PersonType> personList;

    public People(PersonType... personList){
        if (personList != null){
            this.personList = new ArrayList<>(Arrays.asList(personList));
        }else this.personList = new ArrayList<>();
    }

    public void addPerson(PersonType person){
        personList.add(person);
    }
    public void removePerson(PersonType person){
        personList.remove(person);
    }
    public void clearPersonList(){
        personList.clear();
    }
    public void getListSize(){
        personList.size();
    }
    public void addAll(Iterable<PersonType> list){
        list.forEach(person -> personList.add(person));
    }
    public PersonType findByID(Long id){
        return personList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
    public ArrayList<PersonType> findAll(){
        return personList;
    }
    public Iterator<PersonType> iterator(){
        return personList.iterator();
    }
}
