public class Player extends Space{
    private String name;
    public Player(String name) {
        super(name.substring(0,1));
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
