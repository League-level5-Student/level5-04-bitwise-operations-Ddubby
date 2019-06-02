package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printIntBinary(63);
	}
	public void printByteBinary(byte b) {

	}
	
	public void printShortBinary(short s) {

	}
	
	public void printIntBinary(int i) {
		String b = "";
		int j = 1;
		int count = 0;
		while(i > j) {
			j *= 2;
			count++;
		}
		for (int k = count; k > 0; k--) {
			if ((i - 2^count) < 0) {
				break;
			}
			if ((i - 2^count) % 2 != 1) {
				i = i - 2^count;
				b += "1";
			}
		}
	}
	
	public void printLongBinary(long l) {
		
	}

}
