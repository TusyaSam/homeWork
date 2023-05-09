import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Service {
    private int id;
    private GenThree<Human> genThree;
    private List<GenThree> genThreeList;

    public Service(GenThree genThree) {
        this.genThree = genThree;
        genThreeList = new ArrayList<>();
        genThreeList.add(genThree);
    }

    public Service() {
        this(new GenThree());
    }

    public void addHuman (String name, String surname, String patronymic, int age, Gender gender,
                          String dateOfBirth, String dateOfDeath, Human mother, Human father){
            genThree.addHuman(new Human(id++, name, surname,patronymic, age, gender, dateOfBirth, dateOfDeath, mother, father));
    }
    public void addHumanList(GenThree genThree) {
        genThreeList.add(genThree);
    }

    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Human human: genThree ){
            stringBuilder.append(human).append("\n");
        }
        return stringBuilder.toString();
    }

    public Human searchByName(String find) {
        for (Human human : genThree) {
            if (human.getName().equals(find)) {
                return human;
            }
        }
        return null;
    }

    public Human searchByID(int find) {
        for (Human human : genThree) {
            if (human.getId()==find) {
                return human;
            }
        }
        return null;
    }

    public void PrintBirthdaySort () {
        Set<Human> humanSet = new TreeSet<Human>(new HumanBirthdayComporator());
        for (Human human : genThree) {
            humanSet.add(human);
        }

        for (Human human : humanSet) {
            System.out.println(human.toString());
        }
    }
    public void listOfNames() {
        genThree.listOfNames();
    }

    public Set<Human> birthdaySort (){
        return genThree.birthdaySort();
    }

    public void PrintNameSort() {
        Set<Human> humanSet = new TreeSet<>(new HumanNameComporator());
        for (Human human : genThree) {
            humanSet.add(human);
        }
        for (Human human : humanSet) {
            System.out.println(human.toString());
        }
    }
    public Set<Human> nameSort(){
        return genThree.nameSort();
    }

    public void printFamilySet(Set<Human> humanSet){
        genThree.printFamilySet(humanSet);
    }
    public GenThree<Human> getGenThree() {
        return genThree;
    }
}

