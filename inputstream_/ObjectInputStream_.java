
import java.io.*;

public class ObjectInputStream_ {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String filePath = "e:\\data.dat";

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

		System.out.println(ois.readInt());
		System.out.println(ois.readBoolean());

		System.out.println(ois.readChar());
		System.out.println(ois.readDouble());
		System.out.println(ois.readUTF());

		Object dog = ois.readObject();
		System.out.println("运行类型=" + dog.getClass());
		System.out.println("dog信息=" + dog);// 底层 Object -> Dog

		Dog dog2 = (Dog) dog;
		System.out.println(dog2.getName()); // 旺财..

		ois.close();

	}
}
