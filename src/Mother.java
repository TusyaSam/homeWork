public class Mother extends Human{ // класс генетика расширяет класс человек
    private Human children;

    public Mother(String name, String surname, String patronymic, int age, Human children) {
        super(name, surname, patronymic, age);
        this.children = children;
    }

    public Human getChild() {
        return children;
    }

    @Override
    public String toString(){
        return super.toString() + " , есть ребенок:" + children ;

    }


}