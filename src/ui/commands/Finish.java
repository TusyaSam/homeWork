package ui.commands;

import ui.Console;

public class Finish implements Command{
    private Console console;

    public Finish(Console console) {
        this.console = console;
    }

    @Override
    public String getDescription() {
        return "Завершить работу";
    }

    @Override
    public void execute() {
        console.finish();
    }
}
