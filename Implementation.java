
public class Implementation {
    // Invariant of the class
    // 1. The private instance variable size is a non-negative number that relates to the number of elements in the ADT
    // 2. The private instance variable data is the ADT that is an int array.

    // Instance variables
    private int size;
    private int data[];

    // Constructors
    public Implementation(){
        data = new int[10];
        size = 0;
    }

    public Implementation(int arrayCapacity){
        data = new int[arrayCapacity];
        size = 0;
    }

    // Accessor methods
    int getSize(){
        return size;
    }

    int getCapacity(){
        return data.length;
    }

    // Add method
    public void add(int element){
        // Verify that we even have enough space to add elements
        if(size == data.length){
            growth(size*2 + 1);
        }

        data[size] = element;
        size++;
    }

    // Remove method
    public boolean remove(int target){
        // Algorithm:
        // 1. Loop thorugh the array
        // 2. find target
        //  2a. Make the current element equal the last element
        //  2b. Decrement size by one
        //  2c. return true

        for(int index = 0; index < size; index++){
            if(data[index] == target){
                data[index] = data[size - 1];
                size--;
                return true;
            }
        }

        return false;
    }

    // Growth method
    public void growth(int minCapacity){
        int[] newArray = new int[minCapacity];

        if(data.length < minCapacity){
            System.arraycopy(data, 0, newArray, 0, size);
            data = newArray;
        }
    }
    
    // Shrink method
    public void shrink(){
        // Algorithm:
        // 1. Check that the size is less than the length of data
        // 2. Initalize new array with capacity of size
        // 3. Copy over data to new array
        // 4. Make data equal new array

        if(size != data.length){
            int[] smallArray = new int[size];
            System.arraycopy(data, 0, smallArray, 0, size);
            data = smallArray;
        }
    }

    // toString method
    public String toString(){
        String message = "";

        for(int index = 0; index < size; index++){
            message += data[index];
        }

        return message;
    }
}
