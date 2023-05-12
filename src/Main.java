import model.Service;
import model.humans.Gender;
import model.humans.Human;
import model.humans.tree.GenThree;
import presenter.Presenter;
import ui.Console;
import ui.View;

import java.io.IOException;


public class Main {
    public static void main (String[] args) throws IOException{
        String filePath = "src/file.txt";
        FilesWorking filesWorking = new FileHandler();
        View view = new Console();
        GenThree genThree = new GenThree();
        Service service = new Service();
//        model.humans.tree.GenThree genThree = (model.humans.tree.GenThree) filesWorking.read(filePath);

//        genThree.addHuman(new Human(1, "Виктор"));
//        genThree.addHuman(new Human(2, "Алина", "Васильева", Gender.fermale, "25.02.1991"));
//        genThree.addHuman(new Human(3,"Иван", "Васильев", Gender.male, "28.03.2013"));
//        genThree.addHuman(new Human(4, "Николай", "Петров", Gender.male, "12.05.1991"));
//        genThree.addHuman(new Human(5, "Семен", "Иванов", Gender.male, "12.01.1968", genThree.getByName("Иван"), genThree.getByName("Алина")));

//        service.PrintNameSort();
//        service.printFamilySet(service.nameSort());
//        service.printFamilySet(service.birthdaySort());

//        filesWorking.save(genThree, filePath);
//        filesWorking.read(filePath);

//        System.out.println(genThree.getInfo());

        new Presenter(view,service);
        view.start();

    }
}
