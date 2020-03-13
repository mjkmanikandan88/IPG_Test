import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long noOfLines = 10000;

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream("F:\\output\\Output.txt")));
			for (int i = 0; i < noOfLines; i++) {

				writer.write(getRandomString(100));
				writer.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	static String getRandomString(int n) {

		String randomString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {
			int index = (int) (randomString.length() * Math.random());
			sb.append(randomString.charAt(index));
		}

		return sb.toString();
	}

}
