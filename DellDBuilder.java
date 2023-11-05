package designpatterns.builder;

public class DellDBuilder extends DesktopBuilder {

    @Override
    public void setProcessor() {
        desktop.setProcessor("Dell Processor");
    }

    @Override
    public void setMemory() {
        desktop.setMemory("Dell Memory");
    }

    @Override
    public void setStorage() {
       desktop.setStorage("Dell Storage");
    }

    @Override
    public void setMotherboard() {
       desktop.setMotherboard("Dell Motherboard");
    }

    @Override
    public void setGraphicsCard() {
        desktop.setGraphicsCard("Dell Graphics Card");
    }
    
}
