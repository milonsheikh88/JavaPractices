package singleton;

public class SingletonExample {
    public static void main(String[] args) {
        Database db=Database.getInstance();
        db.getConnection();
    }
}
