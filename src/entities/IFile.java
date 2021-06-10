package entities;

public interface IFile<T> {
    void empiler(T t);
    T depiler();
}
