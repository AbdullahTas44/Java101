//Abdullah_Taş

import java.util.*;



class Node   // node düğüm classı oluşturulur 
{

    Character ch;

    Integer freq;

    Node left = null;   // sol ve sağ atanır 
    Node right = null;

    Node(Character ch, Integer freq)
    {
        this.ch = ch;
        this.freq = freq;
    }
    public Node(Character ch, Integer freq, Node left, Node right)
    {
        this.ch = ch;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}
public class HuffmanCode
{

    public static void createHuffmanTree(String text)    // aldığımız text metin buraya gelir 
    {

        if (text == null || text.length() == 0)
        {
            return;
        }


        Map<Character, Integer> freq = new HashMap<>();

        for (char c: text.toCharArray())
        {

            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }


        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(l -> l.freq));
        // kuyruk oluşturulur buraya gelen node left right poll edilir

        for (Map.Entry<Character, Integer> entry:freq.entrySet())
        {

            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (pq.size() != 1)
        {

            Node left = pq.poll();
            Node right = pq.poll();


            int sum = left.freq + right.freq;

            pq.add(new Node(null, sum, left, right));
        }

        Node root = pq.peek();    // pq.peek  root olarak atanır 

        Map<Character, String> huffmanCode = new HashMap<>();
        encodeData(root, "", huffmanCode);  // kodu kurmak için encode fonksiyonuna atama yapılır 



        System.out.println("Girdiğimiz metin " + text);

        StringBuilder sb = new StringBuilder();

        for (char c: text.toCharArray())
        {

            sb.append(huffmanCode.get(c));
        }
        System.out.println("Huffman kodumuz : " + sb);


        if (isLeaf(root))  // sol sağ dolu mu boş mu diye leaf (yaprak) fonksiyonuna yollarız true ise devam
        {

            while (root.freq-- > 0)
            {
                System.out.print(root.ch);
            }
        }

    }


    public static void encodeData(Node root, String str, Map<Character, String> huffmanCode)
    {    // kodu encode edeceğimiz fonksiyonu oluştururuz...
        if (root == null)
        {//root boş ise işlem yapmadan döner
            return;
        }

        if (isLeaf(root))
        {
            huffmanCode.put(root.ch, str.length() > 0 ? str : "1");
        }
        encodeData(root.left, str + '0', huffmanCode);  // geri döndürme yaparız sol ise 0 ile sağ ise 1 ile...
        encodeData(root.right, str + '1', huffmanCode);
    }


    public static boolean isLeaf(Node root)
    {
        // hangi taraf boş sol mu sağ mı burada onu kontrol ederiz
        return root.left == null && root.right == null;
    }

    public static void main(String args[])
    { // main class da metnimizi alırız
        String text = "merhabalar"; // deneme metnini buraya yazarız

        createHuffmanTree(text);  // aldığımız metni huffman ağacını kurmak için yollarız
    }
}