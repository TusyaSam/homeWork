import java.util.List;

public class Human {
    private String name;
    private String surname;
    private  String patronymic;
    private  int age;
    private Gender gender;
    private Human mother;
    private List<Human> children;






    public Human (String name, String surname, String patronymic, int age){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    public Human (String name, String patronymic, int age){
        this(name,"Иванов", patronymic, age);
    }
    public Human (String name){
        this(name,"н/д", 18);
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }

    public int getAge(){
        return age;
    }

    @Override // переопределяем метод, а не создаем новый. Реализация в классе объект
    public String toString() {
        return surname + " " + name + " " + patronymic + " возрвст: " + age ;
    }

}

