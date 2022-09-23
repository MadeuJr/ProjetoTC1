package repository;

import java.util.ArrayList;

public abstract class GenericRepository<T extends ModelWithPK<K>, K> {
    private final ArrayList<T> data = new ArrayList<>();

    public void insert(T model){
        T m = findOne(model.getPK());
        if(m == null) data.add(model);
   }

    public void edit(T model){
       int indexToEdit = -1;
       for (int i = 0; i < data.size(); i++) {
           T m = data.get(i);
           if(!m.getPK().equals(model.getPK())) continue;
           indexToEdit = i;
           break;
       }
       if(indexToEdit == -1) return;
       data.set(indexToEdit, model);
   }

    public  void remove(K key){
        int indexToRemove = -1;
        for (int i = 0; i < data.size(); i++) {
            T model = data.get(i);
            if(!model.getPK().equals(key)) continue;
            indexToRemove = i;
            break;
        }
        if(indexToRemove == -1) return;
        data.remove(indexToRemove);
    }
    public  T findOne(K key){
       for (T model : data) {
           if(model.getPK().equals(key))  return model;
       }
       return null;
   }


    public ArrayList<T> findAll(){
        return data;
   }
}
