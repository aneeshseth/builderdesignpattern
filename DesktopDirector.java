package designpatterns.builder;

public class DesktopDirector {
    public Desktop builDesktop(DesktopBuilder desktop) {
        desktop.setGraphicsCard();
        desktop.setMemory();
        desktop.setMotherboard();
        desktop.setProcessor();
        desktop.setStorage();
        return desktop.getDesktop();
    }
}
