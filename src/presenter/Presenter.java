package presenter;

import model.Service;
import model.humans.Gender;
import model.humans.Human;
import ui.View;



public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addHuman(String name, String surname, Gender gender,
                         String dateOfBirth) {
        service.addHuman(name, surname, gender, dateOfBirth);
    }

    public void listOfNames() {
        view.print(service.listOfNames());
    }

    public void searchByName(String name) {
        view.print(service.searchByName(name));
    }

}
