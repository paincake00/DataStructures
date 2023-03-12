package cs.vsu.ru.LinkedList;

public interface SimpleQueue<T> {
    void add(T value);
    T remove() throws Exception;
    T element() throws Exception;
    int count();
    boolean empty();
}
