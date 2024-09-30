import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    static String[] codes={"p1","p2","p3"};
    static String[] descricion ={"parafusos","cravos ","tachas"};
    static int[] prices ={3,4,5};

    public static void main(String[] args) {
        escribirleerArchivo();
    }

    public static void escribirleerArchivo() {
        try (RandomAccessFile raf = new RandomAccessFile("productos.dat", "rw")) {
            for (int i = 0; i < codes.length; i++) {
                raf.writeChars(formatString(codes[i], 3));
                raf.writeChars(formatString(descricion[i], 10));
                raf.writeInt(prices[i]);
            }
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                char[] codeChars = new char[3];
                for (int i = 0; i < 3; i++) {
                    codeChars[i] = raf.readChar();
                }
                String code = new String(codeChars).trim();

                char[] descricionChars = new char[10];
                for (int i = 0; i < 10; i++) {
                    descricionChars[i] = raf.readChar();
                }
                String descricion = new String(descricionChars).trim();

                int price = raf.readInt();

                System.out.println("Código: " + code);
                System.out.println("Descrición: " + descricion);
                System.out.println("Prezo: " + price);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String formatString(String str, int length) {
        return String.format("%-" + length + "s", str).replace(' ', ' ');
    }

}
