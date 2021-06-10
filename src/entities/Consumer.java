package entities;

public interface Consumer<T> {
    void accept(T t);
}
