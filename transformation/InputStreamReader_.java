import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {

        String filePath = "e:\\a.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(
                                                    new FileInputStream(filePath), "gbk"));

        String s = br.readLine();
        System.out.println("读取内容=" + s);
        br.close();

    }


}
