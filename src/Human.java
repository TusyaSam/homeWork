import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Human implements Serializable {
    private int id;
    private String name;
    private String surname;
    private  String patronymic;
    private  int age;
    private Gender gender;
    private Human mother;
    private Human father;
    private List<Human> children;
    private String dateOfBirth;
    private String dateOfDeath;



    public Human (int id, String name, String surname, String patronymic, int age, Gender gender,
                  String dateOfBirth, String dateOfDeath, Human mother, Human father, List<Human> children){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Human (int id, String name, String surname, Gender gender, String dateOfBirth) {
        this (id, name, surname, "Отчество", 18, gender, dateOfBirth, null, null, null, null);
    }
    public Human (int id, String name){
        this(id, name,"н/д", null, null);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){

        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic(){

        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge(){

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human newMother) {
        this.mother = newMother;
        newMother.addChild(this);
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human newFather) {
        this.father = newFather;
        newFather.children = new ArrayList<>();
        newFather.children.add(this);
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public boolean equals(Object obj) {
        if (this.name == name || this.surname == surname || this.dateOfBirth == dateOfBirth)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirth);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id= " + id + "\n");
        stringBuilder.append("Имя= " + name + "\n");
        stringBuilder.append("Фамилия= " + surname + "\n");
        stringBuilder.append("Пол= " + gender + "\n");
        stringBuilder.append("Дата рождения= " + dateOfBirth + "\n");
        if (dateOfDeath != null) stringBuilder.append("Дата смерти= " + dateOfDeath + "\n");
        else stringBuilder.append("Дата смерти= н/д" + "\n");
        if (mother != null) stringBuilder.append("Мать= " + mother.getFullName() + "\n");
        else stringBuilder.append("Мать= н/д" + "\n");
        if (father != null) stringBuilder.append("Отец= " + mother.getFullName() + "\n");
        else stringBuilder.append("Отец= н/д" + "\n");
        if (children == null) stringBuilder.append("Дети= н/д"  + "\n");
        else {
            stringBuilder.append("Дети: ");
            for (Human child : children) {
                stringBuilder.append(child.getFullName());
            }
        }
        return stringBuilder.toString();
    }

    public String getFullName() {
        return this.getSurname() + " " + this.getName();
    }

    public String getInfo(Human human) {
        return human.toString();
    }

    public boolean addChild(Human child){
        if(children == null){
            children = new ArrayList<>();
        }
        if (!children.contains(child)){
            children.add(child);
            return true;
        }
        return false;
    }

}

