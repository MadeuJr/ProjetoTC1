package repository;

import java.util.ArrayList;

public abstract class GenericRepository<T extends ModelWithPK<K>, K> {
    private final ArrayList<T> data = new ArrayList<>();

    public boolean insert(T model) {
        T m = findOne(model.getPK());
        if (m == null) {
            data.add(model);
            return true;
        } else
            return false;
    }

    public boolean edit(T model) {
        int indexToEdit = -1;
        for (int i = 0; i < data.size(); i++) {
            T m = data.get(i);
            if (!m.getPK().equals(model.getPK()))
                continue;
            indexToEdit = i;
            break;
        }
        if (indexToEdit == -1) {
            data.set(indexToEdit, model);
            return true;
        }
        return false;
    }

    public boolean remove(K key) {
        int indexToRemove = -1;
        for (int i = 0; i < data.size(); i++) {
            T model = data.get(i);
            if (!model.getPK().equals(key))
                continue;
            indexToRemove = i;
            break;
        }
        if (indexToRemove == -1) {
            return false;
        }
        data.remove(indexToRemove);
        return true;
    }

    public T findOne(K key) {
        for (T model : data) {
            if (model.getPK().equals(key))
                return model;
        }
        return null;
    }

    public ArrayList<T> findAll() {
        return data;
    }

    public ArrayList<T> getData() {
        return data;
    }
}
