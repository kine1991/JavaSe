package patterns.adapter;

/**
 * Created by kine4599 on 08.07.17.
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void remote() {
        deleteObject();
    }

    @Override
    public void select() {
        loadObject();
    }
}
