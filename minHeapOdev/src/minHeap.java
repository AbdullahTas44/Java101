import java.util.*;

public class minHeap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan girdi alınır
        System.out.print("Lütfen sayıları virgül ile ayrılmış olarak giriniz: ");
        String input = scanner.nextLine();

        // Girdi virgülle ayrılarak diziye atılır
        String[] numbers = input.split(",");
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        // Dizinin üçlü min heap olup olmadığı kontrol edilir
        boolean isMinHeap = isMinHeap(array);
        if (isMinHeap) {   // sonuç true olarak geldi ise sorun yok yazdıralım diziyi
            System.out.println("Girmiş olduğunuz dizi üçlü heap kuralına uymaktadır");
            printMinHeap(array);  // yazdırma işlemini metot içinde yapalım
        } else { // sonuç false geldi ise küçük büyük sıralamasından mı yoksa yetersiz elemandan mı diye bakmamız lazım
            System.out.println("Girmiş olduğunuz dizi üçlü heap kuralına uymamaktadır");
            // üçlü min heap olmamasının sebebi eleman sayısının az olması ise ekleme yapmalıyız
            while (((array.length-1) % 3) != 0) {
                array = Arrays.copyOf(array, array.length + 1);
                array[array.length - 1] = (int)(Math.random() * 100);
            }
            // eğer eleman sayısında sorun yok ise while girmeden devam ederiz
            // diziye ekleme yapsakta yapmasakta küçük büyük sıralamasına yollamamız gerekir.
            minHeapify(array);
        }
    }
        public static boolean isMinHeap(int[] array) {
            // Eğer dizi boşsa üçlü min heap değildir
            if (array.length == 0) {
                return false;
            }
            //eğer dizi min 4 elemanlı değil yada eleman sayısı -1  3 ün katı değil ise false dönmemiz lazım
            if ((array.length-1)%3 !=0){
                return false;
            }
            // Dizinin her elemanının altındaki elemanları kontrol edilir küçük büyük kuralına uymuyor ise false dönmeli
            for (int i = 0; i < array.length; i++) {
                // Sol alt eleman
                int leftChildIndex = 3 * i + 1;
                if (leftChildIndex < array.length && array[i] > array[leftChildIndex]) {
                    return false;
                }
                // Sağ alt eleman
                int rightChildIndex = 3 * i + 2;
                if (rightChildIndex < array.length && array[i] > array[rightChildIndex]) {
                    return false;
                }
                // Orta alt eleman
                int middleChildIndex = 3 * i + 3;
                if (middleChildIndex < array.length && array[i] > array[middleChildIndex]) {
                    return false;
                }
            }
            return true;
        }

        public static void minHeapify(int[] array) {
             // Dizi boşsa işlem yapılmaz
             if (array.length == 0) {
                return ;
             }
            // Dizi üçlü min heap haline getirilir
            for (int i = array.length / 3 - 1; i >= 0; i--) {
                minHeapify(array, i);  // index numarasını belirleyerek tekrar overide olan minHeapify içine atarız
            }
            return ;
        }

         // Dizinin belirli bir (sol, sağ yada orta) düğümünü sıralayarak 3 lü min heap haline getiren metod

        public static void minHeapify(int[] array, int index) {
            // Sol alt düğüm
            int leftChildIndex = 3 * index + 1;
            // Sağ alt düğüm
            int rightChildIndex = 3 * index + 2;
            // Orta alt düğüm
            int middleChildIndex = 3 * index + 3;
            // En küçük elemanın index'i
            int smallest = index;
            // Sol alt düğüm var ise ve sol alt düğüm en küçükse, en küçük elemanın index'i güncellenir
            if (leftChildIndex < array.length && array[leftChildIndex] < array[smallest]) {
                smallest = leftChildIndex;
            }
            // Sağ alt düğüm var ise ve sağ alt düğüm en küçükse, en küçük elemanın index'i güncellenir
            if (rightChildIndex < array.length && array[rightChildIndex] < array[smallest]) {
                smallest = rightChildIndex;
            }
            // Orta alt düğüm var ise ve orta alt düğüm en küçükse, en küçük elemanın index'i güncellenir
            if (middleChildIndex < array.length && array[middleChildIndex] < array[smallest]) {
                smallest = middleChildIndex;
            }
            // Eğer en küçük elemanın index'i değişmişse, yerlerini değiştirir ve yine minHeapify metodunu çağırırız
            if (smallest != index) {
                int temp = array[index];
                array[index] = array[smallest];
                array[smallest] = temp;
                minHeapify(array, smallest);

            }else {  // herşey artık doğru ise sıralama yapıldktan sonra artık ekrana yazdırma yapabiliriz
                System.out.print("Dizinizin düzeltilmiş hali : ");
                printMinHeap(array);
            }
        }

        public static void printMinHeap ( int [] array){

            for ( int x : array){
                System.out.print(x + " ");
            }
        }



}

