public class Item {
    private String description;
    private int weight;
    private String name;

    public Item(String description, int weight, String name) {
        this.description = description;
        this.weight = weight;
        this.name = description;
    }
    public String getDescription() {
        return description;
    }
    public int getWeight() {
        return weight;
    }
}
