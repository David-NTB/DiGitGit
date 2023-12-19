import java.util.ArrayList;
import java.util.Random;

public class Sorting{
    ArrayList <Integer> array = new ArrayList<>();
    Random random = new Random();
    int arraySize = 10;

    public static void main(String[] args) {
        Sorting arr = new Sorting();

        arr.AscArray();
        arr.DscArray();

    }

    public void AscArray(){
        System.out.println("Ascending Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortArrayAsc();
        showArray();
        System.out.println();
    }
    
    public void DscArray(){
        System.out.println("Descending Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortArrayDsc();
        showArray();
        System.out.println();
    }

    public void showArray(){
        System.out.print("Array : ");
        for(int i = 0; i <= array.size() - 1; i++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }

    public void sortArrayAsc(){
        for(int i = 0; i < array.size() - 1; i++){
            for(int j = 0; j < array.size() - 1; j++){
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }
    
    public void sortArrayDsc(){
        for(int i = array.size() - 1; i > 0; i--){
            for(int j = array.size() - 1; j > 0; j--){
                if (array.get(j) > array.get(j-1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, temp);
                }
            }
        }
    }
    
    public void generateArray(){
        for(int i = 1; i <= arraySize; i++){
            array.add(random.nextInt(10));
        }
    }

}