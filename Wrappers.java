package fundamentos;

public class Wrappers {
	public static void main(String[] args) {

		// Byte

		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); // int
		Long l = 10000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(i * 3);
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
	}
}
