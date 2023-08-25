import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {

        String filePath = "e:\\note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('H');
            fileWriter.write(chars);
            fileWriter.write("韩顺平教育".toCharArray(), 0, 3);
            fileWriter.write(" 你好北京~");
            fileWriter.write("风雨之后，定见彩虹");
            fileWriter.write("上海天津", 0, 2);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        System.out.println("程序结束...");


    }
}
