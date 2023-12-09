import java.util.Arrays;

public class test {
    int[] x;

    public static void main(String[] args) {
        test a = new test();

        a.show();  // Memanggil show() sebelum menginisialisasi array x
        a.x = new int[5];
        a.show();  // Memanggil show() setelah menginisialisasi array x
    }

    void show() {
        System.out.println(Arrays.toString(x));
    }
}
