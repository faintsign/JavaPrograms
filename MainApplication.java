
public class MainApplication {
    // Entry point of the driver (testing) program
    public static void main(String[] args){
        Implementation set = new Implementation();

        // Add 19 elements to the ADT
        for(int index = 0; index < 20; index++){
            set.add(index);
        }

        // Output the elements
        System.out.println(set.toString());
    }
}
