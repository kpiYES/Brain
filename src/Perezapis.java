
import java.io.*;

public class Perezapis {
 public static void main(String[] args) {
        int i;
        FileInputStream f;
        File file = new File("C:\\Users\\Misha\\Desktop\\Test.txt");
        OutputStream r;
        File result = new File("C:\\Users\\Misha\\Desktop\\Result.txt");
        // Попытка открыть файл
        try {
            f = new FileInputStream(file);
            r = new FileOutputStream(result);
            //Попытка прочитать файл
            try {
                do {
                    i = f.read();
                    if (i != -1) r.write(i);
                } while (i != -1);
            } catch (IOException e) {
                System.out.println("Файл не удалось прочитать или перезаписать" + e);
            }
            try{
                f.close();
            } catch (IOException e) {
                System.out.println("Файл не удалось закрыть" + e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не удалось открыть" + e);

        }


    }
}
