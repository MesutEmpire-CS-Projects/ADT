public interface List<T>{
    public boolean isEmpty();
    public int size();
    public T get(int pos);
    public void add(int pos, T newItem)
            throws ListIndexOutOfBoundsException;
    public void remove(int pos);

}