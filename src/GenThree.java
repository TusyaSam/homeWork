import java.io.Serializable;
import java.util.*;

public class GenThree implements Serializable, Iterable<Human>{

    private List<Human> humanList;

    public GenThree() {
        this.humanList = new ArrayList<>();
    }

    public GenThree(List<Human> humanList){
        this.humanList = humanList;
    }


    public boolean addHuman (Human human) { /*добавление нового человека в список*/
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)) {
            humanList.add(human);
            if (human.getFather() != null) {
                human.getFather().addChild(human);
            }
            if (human.getMother() != null) {
                human.getMother().addChild(human);
            }
            return true;
        }
        return false;
    }


    public Human getByName (String name){/*Поиск по имени*/
        for (Human human: humanList ){
            if (human.getName().equals(name)){
                return human;
            }
        }
        return null;
    }

    public List<Human> getHumanList(){
        return humanList;
    }


    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("В дереве ");
        stringBuilder.append(humanList.size());
        stringBuilder.append(" объектов " + "\n");
        for (Human human: humanList){
            stringBuilder.append(human.getInfo());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(humanList);
    }

    public Set<Human> birthdaySort() {
        Set<Human> humanSet = new TreeSet<Human>(new HumanBirthdayComporator());
        for (Human human : humanList) {
            humanSet.add(human);
        }
        return humanSet;
    }

    public Set<Human> nameSort() {
        Set<Human> humanSet = new TreeSet<>(new HumanNameComporator());
        for (Human human : humanList
        ) {
            humanSet.add(human);
        }
        return humanSet;
    }
    public void printFamilySet(Set<Human> humanSet) {
        for (Human human : humanSet) {
            System.out.println(human.toString());
        }
    }
}

