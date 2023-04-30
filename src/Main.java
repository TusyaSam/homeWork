import java.io.IOException;
import java.util.Objects;



public class Main {
    public static void main (String[] args) throws IOException{
        String filePath = "src/file.txt";
        FilesWorking filesWorking = new FileHandler();

        GenThree genThree = new GenThree();
//        GenThree genThree = (GenThree) filesWorking.read(filePath);

        genThree.addHuman(new Human(1, "Виктор"));
        genThree.addHuman(new Human(2, "Алина", "Васильева", Gender.fermale, "25.02.1991"));
        genThree.addHuman(new Human(3,"Иван", "Васильев", Gender.male, "28.03.2013"));
        genThree.addHuman(new Human(4, "Николай", "Петров", Gender.male, "12.05.1991"));
        genThree.addHuman(new Human(5, "Семен", "Иванов", Gender.male, "12.01.1968", genThree.getByName("Иван"), genThree.getByName("Алина")));

        service.PrintNameSort();
        service.printFamilySet(service.nameSort());
        service.printFamilySet(service.birthdaySort());

        filesWorking.save(genThree, filePath);

        System.out.println(genThree.getInfo());


    }
}
