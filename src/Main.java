import java.io.IOException;


public class Main {
    public static void main (String[] args) throws IOException{
        Human human1 = new Human(1, "Виктор");
        Human human2 = new Human(2, "Алина", "Васильева", Gender.fermale, "25.02.1991");
        Human human3 = new Human(3,"Иван", "Васильев", Gender.male, "28.03.2013");
        Human human4 = new Human(4, "Николай", "Петров", Gender.male, "12.05.1991");

        GenThree genThree = new GenThree();
        FilesWorking filesWorking = new SaveWrite();

        genThree.addHuman(human1);
        genThree.addHuman(human2);
        genThree.addHuman(human3);
        genThree.addHuman(human4);

        System.out.println(genThree.getInfo());

        filesWorking.save(genThree);



    }
}
