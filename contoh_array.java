import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContohArrayStream {
    public static void main(String[] args) {
        // Contoh dengan array integer
        int[] angka = {1, 2, 3, 4, 5};

        // Membuat Stream dari array integer
        IntStream streamAngka = Arrays.stream(angka);

        // Menampilkan elemen-elemen array menggunakan Stream
        streamAngka.forEach(System.out::println);

        // Contoh dengan array string
        String[] kata = {"apel", "banana", "ceri", "durian", "anggur"};

        // Membuat Stream dari array string
        Stream<String> streamKata = Arrays.stream(kata);

        // Menampilkan elemen-elemen array menggunakan Stream
        streamKata.forEach(System.out::println);
    }
}
