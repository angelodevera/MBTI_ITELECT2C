package designpatterns.itelect2c.iterator;

import java.util.Arrays;

public class GenericRepository<T> implements Container {
    private T generics[];

    public GenericRepository(T generics[]) {
        this.generics = generics;
    }

    @Override
    public String toString() {
        return "GenericRepository{" +
                "generics=" + Arrays.toString(generics) +
                '}';
    }

    @Override
    public Iterator getIterator() {
        return new GenericIterator();
    }

    public class GenericIterator implements Iterator<T>{
        int index;

        @Override
        public boolean hasNext() {
            if(index < generics.length){
                return true;
            }
            return false;
        }

        @Override
        public boolean hasPrevious() {
            if(index > 0){
                return true;
            }
            return false;
        }

        @Override
        public T current(){
            if(index<generics.length){
                return generics[index];
            }
            return null;
        }

        @Override
        public void update(T el){
            T tmp = el;
            generics[index] = (T) tmp;

        }

        @Override
        public T next() {
            if(this.hasNext()){
                return (T) generics[index++];
            }
            return null;
        }

        @Override
        public T previous() {
            if(this.hasPrevious()){
                return (T) generics[--index];
            }
            return null;
        }
    }
}
