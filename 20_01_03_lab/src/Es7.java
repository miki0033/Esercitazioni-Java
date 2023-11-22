import java.util.Arrays;

public class Es7 {
    /*
     * Write a Java program to get the index of all the characters of the alphabet.
     */
    // a = 97 z=122
    public static void main() {
        int[] nalphabet = new int[122 - 97 + 1];
        for (int i = 97; i <= 122; i++) {
            nalphabet[i - 97] = i;
        }

        char[] alphabet = new char[122 - 97 + 1];
        for (int i = 97; i <= 122; i++) {
            alphabet[i - 97] = ((char) i);
        }
        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(nalphabet));
        for (int k = 0; k < nalphabet.length; k++) {
            System.out.println(alphabet[k] + "=" + nalphabet[k]);
        }
    }
}
