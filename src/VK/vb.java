package VK;

import java.io.File;
import java.io.FileInputStream;

public class vb {

		public static void main(String[] args) throws Exception {

			File file = new File("testfile.txt");
			FileInputStream fis = new FileInputStream(file);

			int oneByte;
			while ((oneByte = fis.read()) != -1) {
				System.out.write(oneByte);
				// System.out.print((char)oneByte); // could also do this
			}
			System.out.flush();
		}
	}



