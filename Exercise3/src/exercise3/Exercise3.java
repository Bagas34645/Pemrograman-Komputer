package exercise3; // Mendefinisikan package tempat file ini berada

// Deklarasi main class bernama Exercise3
public class Exercise3 {

    // Main method (entry point) program
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array angka (numbers)
        int[] numbers = {1, 1, 1, 2, 3, 4}; 
        
        // Elemen yang akan dicari jumlah kemunculannya
        int searchElement = 1;
        
        // Memanggil method getNumberOcc dan mencetak hasilnya ke terminal/console/output window
        System.out.println(getNumberOcc(numbers, searchElement));
    }
    
    /**
     * Method untuk menghitung jumlah kemunculan elemen tertentu dalam array.
     *
     * @param numbers       Array tempat elemen akan dicari
     * @param searchElement Elemen yang ingin dihitung jumlah kemunculannya
     * @return              Jumlah kemunculan elemen dalam array
     */
    public static int getNumberOcc(int[] numbers, int searchElement) {
        int occ = 0; // Variabel untuk menyimpan jumlah kemunculan elemen
        
        // Perulangan untuk memeriksa setiap elemen dalam array
        for (int i = 0; i < numbers.length; i++) {
            // Jika elemen array sama dengan elemen yang dicari, tambahkan 1 ke occ
            if (searchElement == numbers[i])
                occ++;
        }
        
        // Mengembalikan jumlah kemunculan elemen
        return occ;
    }
}
