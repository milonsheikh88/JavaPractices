package singleton;

public class SingletonExample {
    public static void main(String[] args) {
        Database db;

        // refers to the only object of Database
        db= Database.getInstance();
        db.getConnection();
    }
}
