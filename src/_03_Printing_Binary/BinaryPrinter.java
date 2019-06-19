package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		byte b = 13;
		short s = 13;
		long l = 13;
		bp.printIntBinary(13);
		System.out.println();
		bp.printByteBinary(b);
		System.out.println();
		bp.printShortBinary(s);
		System.out.println();
		bp.printLongBinary(l);
	}

	public void printByteBinary(byte b) {
		String s = "";
		if (b > 0) {
			if ((b & 1) == 1) {
				s = "1";
			} else {
				s = "0";
			}
			printByteBinary((byte)(b >> 1));
			System.out.print(s);
		}
	}

	public void printShortBinary(short s) {
		String a = "";
		if (s > 0) {
			if ((s & 1) == 1) {
				a = "1";
			} else {
				a = "0";
			}
			printShortBinary((short)(s >> 1));
			System.out.print(a);
		}
	}

	public void printIntBinary(int i) {
		String s = "";
		if (i > 0) {
			if (i % 2 == 1) {
				i = (i - 1) / 2;
				s = "1";
			} else {
				i = i / 2;
				s = "0";
			}
			printIntBinary(i);
			System.out.print(s);
		}
	}

	public void printLongBinary(long l) {
		String s = "";
		if (l > 0) {
			if ((l & 1) == 1) {
				s = "1";
			} else {
				s = "0";
			}
			printByteBinary((byte)(l >> 1));
			System.out.print(s);
		}
	}

}
