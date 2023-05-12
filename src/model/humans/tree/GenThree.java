package model.humans.tree;

import model.humans.comporator.HumanBirthdayComporator;
import model.humans.comporator.HumanNameComporator;
import model.humans.GenThreeItem;

import java.io.Serializable;
import java.util.*;

public class GenThree <E extends GenThreeItem> implements Serializable, Iterable<E>{

    private List<E> humanList;

    public GenThree() {
        this.humanList = new ArrayList<>();
    }

    public GenThree(List<E> humanList){
        this.humanList = humanList;
    }


    public void addHuman (E human) { /*добавление нового человека в список*/
       humanList.add(human);
//        if (human == null) {
//            return false;
//        }
//        if (!humanList.contains(human)) {
//            humanList.add(human);
//            if (human.getFather() != null) {
//                human.getFather().addChild(human);
//            }
//            if (human.getMother() != null) {
//                human.getMother().addChild(human);
//            }
//            return true;
//        }
//        return false;
    }


//    public model.humans.Human getByName (String name){/*Поиск по имени*/
//        for (E human: humanList ){
//            if (human.getName().equals(name)){
//                return human;
//            }
//        }
//        return null;
//    }

    public List<E> getHumanList(){
        return humanList;
    }


//    public String getInfo(){
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("В дереве ");
//        stringBuilder.append(humanList.size());
//        stringBuilder.append(" объектов " + "\n");
//        for (E human: humanList){
//            stringBuilder.append(human.getInfo());
//            stringBuilder.append("\n");
//        }
//        return stringBuilder.toString();
//    }


    public String listOfNames() {
        StringBuilder stringBuilder = new StringBuilder();;
        for (E human : humanList) {
            stringBuilder.append(human.getId() + " " + human.getName()+"\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new HumanIterator<>(humanList);
    }

    public Set<E> birthdaySort() {
        Set<E> humanSet = new TreeSet<E>(new HumanBirthdayComporator<>());
        for (E human : humanList) {
            humanSet.add(human);
        }
        return humanSet;
    }

    public Set<E> nameSort() {
        Set<E> humanSet = new TreeSet<E>(new HumanNameComporator<>());
        for (E human : humanList
        ) {
            humanSet.add(human);
        }
        return humanSet;
    }
    public void printFamilySet(Set<E> humanSet) {
        for (E human : humanSet) {
            System.out.println(human.toString());
        }
    }
}

