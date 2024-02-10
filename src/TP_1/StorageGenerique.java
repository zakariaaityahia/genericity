package TP_1;

import java.util.ArrayList;
import java.util.List;

public class StorageGenerique <T>{
    private List<T> elements;


    public StorageGenerique() {
        this.elements = new ArrayList<>();
    }

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    public boolean addElement(T o) {
        elements.add(o);
        return false;
    }

    public T getElement(int index) {
        if (index < 0 || index > elements.size()) {
            throw new ArrayIndexOutOfBoundsException("invalid index, try to insert a valid index");
        }
        return elements.get(index);
    }

    public boolean removeElement(int index) {
        if (index < 0 || index > elements.size()) {
            throw new ArrayIndexOutOfBoundsException("Invalid index, try to insert a valid index");
        }
        elements.remove(index);
        return false;
    }

    public int getSize() {
        return elements.size();
    }
}
