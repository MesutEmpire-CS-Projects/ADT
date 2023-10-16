public class ArrayList<T> implements List<T>{
    private T[] array;
    private int size;
@SuppressWarnings("unchecked")
    public ArrayList(T[] capacity){
        this.array = (T[]) new Object[capacity.length];
        this.size=capacity.length;

    System.arraycopy(capacity, 0, this.array, 0, capacity.length);
    }

    @Override
    public boolean isEmpty(){
    return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int pos) {
    if(pos < 0 || pos >= this.size ){
        throw new ListIndexOutOfBoundsException("Invalid Position");
    }
        return this.array[pos];
    }

    @Override
    public void add(int pos, T newItem)
    {
        if(pos<0 || pos > this.size ){
            throw new ListIndexOutOfBoundsException("Invalid Position");
        }
        if (this.size == this.array.length){
            resizeArray(this.array.length *2);
        }



        for ( int i = this.size ;i>pos;i-- ){
            this.array[i] = this.array[i-1];
        }
        this.array[pos] = newItem;
        this.size++;
    }

    @Override
    public void remove(int pos) {
        if(pos<0 || pos >= this.size ){
            throw new ListIndexOutOfBoundsException("Invalid Position");
        }

        for (int i = pos;i<this.size-1;i++){
            this.array[i] = this.array[i+1];
        }

        this.array[this.size-1]= null;
        this.size--;
        if (this.size <= array.length / 2) {
            resizeArray(array.length / 2);
        }
    }
@SuppressWarnings("unchecked")
    private void resizeArray(int newCapacity) {
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(this.array, 0, newArray, 0, this.size);
        this.array = (T[]) newArray;
    }

    public T[] getArray() {
        return this.array;
    }
}