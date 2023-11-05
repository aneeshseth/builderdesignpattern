package designpatterns.builder;

public class Desktop {
    private String motherboard;
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;

    public String getMotherboard() {
        return motherboard;
    }
    public void setMotherboard(String m) {
        this.motherboard = m;
    }
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String p) {
        this.processor = p;
    }
    public String getStorage() {
        return storage;
    }
    public void setStorage(String s) {
        this.storage = s;
    }
    public String getMemory() {
        return memory;
    }
    public void setMemory(String mem) {
        this.memory = mem;
    }
    public String getGraphicsCard() {
        return graphicsCard;
    }
    public void setGraphicsCard(String g) {
        this.graphicsCard = g;
    }
}
