package designpatterns.builder;

public abstract class DesktopBuilder {
    Desktop desktop = new Desktop();
    public abstract void setProcessor();
    public abstract void setMemory();
    public abstract void setStorage();
    public abstract void setMotherboard();
    public abstract void setGraphicsCard();
    public Desktop getDesktop() {
        return desktop;
    }
}
