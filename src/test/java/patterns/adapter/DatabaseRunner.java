package patterns.adapter;

/**
 * Created by kine4599 on 08.07.17.
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.remote();
        database.select();
        database.update();
    }
}
