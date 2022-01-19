package basique;

public class Buffer {

	public static void main(String arg[]) {

		String stringtest = "coucou";

		System.out.println(stringtest);

		StringBuffer buffer = new StringBuffer(stringtest);
		buffer.setCharAt(0, 'C');

		System.out.println(buffer.toString());

	}
}