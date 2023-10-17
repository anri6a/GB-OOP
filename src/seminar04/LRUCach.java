package seminar04;

import java.util.ArrayList;
import java.util.List;

public class LRUCach<T> {
    private List<T> list;
    private final int size;

    public LRUCach(int size) {
        list = new ArrayList<>();
        this.size = size;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getSize() {
        return size;
    }
    public void addElement(T element){
        list.add(element);
        if (list.size()>size){
            list.remove(0);
        }
    }
    public T getElement(int index){
        return list.get(index);
    }
    public List<T> getAllElement(){
        return list;
    }
}
