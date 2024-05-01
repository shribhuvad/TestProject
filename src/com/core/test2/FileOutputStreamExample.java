import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String args[]) throws IOException {
		FileOutputStream fout = new FileOutputStream("D:\\testout1.csv");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to javaTpoin,\n";
		byte b[] = s.getBytes();
		String s1 = "Welcome to javaTpoint,";
		byte b1[] = s1.getBytes();
		bout.write(b);
		bout.write(b1);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
	}

}