public class UniqueID {
    private static int nextID = 1;
    private int id;

    public UniqueID() {
        this.id = nextID++;
    }
    public int getId() {
        return id;
    }
}