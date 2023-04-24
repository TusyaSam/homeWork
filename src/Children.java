public class Children extends Human{
    private Human mother;

    public Children(String name, String surname, String patronymic, int age, Human mother) {
        super(name, surname, patronymic, age);
        this.mother = mother;
    }

    public Human getMother() {
        return mother;
    }

    @Override
    public String toString(){
        return super.toString() + " , есть мать:" + mother ;

    }


}
