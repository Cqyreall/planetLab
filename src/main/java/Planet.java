public class Planet {

    private String name;
    private int size;
    public String explodeStatement;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String explode(){
        this.explodeStatement = String.format("Boom %s has exploded", this.name);
        return this.explodeStatement;
    }
}
