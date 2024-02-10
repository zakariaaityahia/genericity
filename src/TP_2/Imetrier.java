package TP_2;

import java.util.List;

public interface Imetrier <T, P>{
    void add (T o);
    public List<T> getAll();
    T getById(P id);
    public void delete(P id);
}
