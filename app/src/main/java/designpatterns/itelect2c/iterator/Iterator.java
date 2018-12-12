package designpatterns.itelect2c.iterator;

public interface Iterator<T> {
    public boolean hasNext();
    public boolean hasPrevious();
    public T next();
    public T previous();
    public void update(T el);
    public T current();
}
