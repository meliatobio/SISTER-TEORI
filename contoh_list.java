import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContohListStream {
    public static void main(String[] args) {
        // Membuat List dengan elemen string
        List<String> daftarKata = new ArrayList<>();
        daftarKata.add("apel");
        daftarKata.add("banana");
        daftarKata.add("ceri");
        daftarKata.add("durian");
        daftarKata.add("anggur");

        // Menggunakan Stream untuk memfilter dan mencetak elemen-elemen yang dimulai dengan huruf "a"
        System.out.println("Elemen yang dimulai dengan huruf 'a':");
        daftarKata.stream()
                .filter(kata -> kata.startsWith("a"))
                .forEach(System.out::println);

        // Menggunakan Stream untuk menggandakan panjang setiap kata dan mengumpulkannya ke dalam List baru
        List<Integer> panjangKata = daftarKata.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("Panjang kata dalam list baru:");
        panjangKata.forEach(System.out::println);
        
        // Menggunakan Stream untuk menggabungkan semua kata menjadi satu string dengan pemisah
        String hasilGabung = daftarKata.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Hasil penggabungan kata: " + hasilGabung);
    }
}
