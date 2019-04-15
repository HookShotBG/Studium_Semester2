package mp;

public class Mp {
    public static void main(String[] args) { int [] z = new int[5];
        int k = 2;
        for (int i = z.length-1; i>=0; i--) {
            z[i] = i*k;
            k++; }
        for (int i=0; i<z.length; i++) {
            System.out.print(z[i]); }
    }

}