package structural.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> testVector = new Vector<>();

        testVector.add("Apple");
        testVector.add("Banana");
        testVector.add("Cherry");

        VectorToListAdapter<String> adapter = new VectorToListAdapter<String>(testVector);

        adapter.getList().forEach(System.out::println);
    }
}

interface IList<T> {
    List<T> getList();
}

class VectorToListAdapter<T> implements IList<T> {
    Vector<T> vector;

    public VectorToListAdapter(Vector<T> vector) {
        this.vector = vector;
    }

    @Override
    public List<T> getList() {
        List<T> data = new ArrayList<T>();

        for (T item : this.vector) {
            data.add(item);
        }

        return data;
    }
}
