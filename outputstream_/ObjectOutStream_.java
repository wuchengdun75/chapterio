
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutStream_ {
	public static void main(String[] args) throws Exception {
		String filePath = "e:\\data.dat";

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

		oos.writeInt(100);
		oos.writeBoolean(true);
		oos.writeChar('a');
		oos.writeDouble(9.5);
		oos.writeUTF("韩顺平教育");

		oos.writeObject(new Dog("旺财", 10, "日本", "白色"));
		oos.close();
		System.out.println("数据保存完毕(序列化形式)");

	}
}
