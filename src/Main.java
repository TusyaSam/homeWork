public class Main {
    public static void main (String[] args){
        Human human1 = new Human("Виктор");
        Human human2 = new Human("Иван", "Валерьевич", 34);
        Human human3 = new Human("Иван", "Васильев", "Валерьевич", 28);
        //People people4 = new Mother("Николай", "Иванов", "Иванович", 18, );

        GenThree genThree = new GenThree();
        genThree.addHuman(human1);
        genThree.addHuman(human2);
        genThree.addHuman(human3);
        //genThree.addPeople(people4);

        System.out.println(genThree.getInfo());


    }
}
