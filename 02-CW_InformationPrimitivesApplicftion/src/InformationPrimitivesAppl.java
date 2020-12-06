import java.util.Scanner;

public class InformationPrimitivesAppl {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter primitive type or exit");
				String primitiveType = scanner.next();
				if (primitiveType.equals("exit")) {
					break;
				}
				System.out.println("Infomation type: max - maximal value, min - minimal value, bytes - number of bytes");
				String informationType = scanner.next();
				String res = getInformation(primitiveType, informationType);
				System.out.println(res);
			}
		}

	}
	private static String getInformation (String primitiveType, String informationType) {
		switch(primitiveType) {
		case "byte": return getByteInformation(informationType);
		case "short": return getShortInformation(informationType);
		case "int": return getIntInformation(informationType);
		case "long": return getLongtInformation(informationType);
		case "float": return getFloatInformation(informationType);
		case "double": return getDoubleInformation(informationType);
		case "char": return getCharInformation(informationType);
		default: return "Error: wrong primitive type";
		}
	}
	
	private static String getByteInformation(String informationType) {
		switch(informationType) {
		case "min": return "" + Byte.MIN_VALUE; 
		case "max": return "" + Byte.MAX_VALUE; 
		case "byte": return "" + Byte.BYTES;
		default: return "Error: wrong information type";
		}
	}
	
	private static String getShortInformation(String informationType) {
		switch(informationType) {
		case "min": return "" + Short.MIN_VALUE;
		case "max": return "" + Short.MAX_VALUE;
		case "byte": return "" + Short.BYTES;
		default: return "Error: wrong information type";
		}
	}
	
	private static String getIntInformation(String informationType) {
		switch(informationType) {
		case "min": return "" + Integer.MIN_VALUE;
		case "max": return "" + Integer.MAX_VALUE;
		case "byte": return "" + Integer.BYTES;
		default: return "Error: wrong information type";
		}
	}
	
	private static String getLongtInformation(String informationType) {
		switch(informationType) {
		case "min": return "" + Long.MIN_VALUE;
		case "max": return "" + Long.MAX_VALUE;
		case "byte": return "" + Long.BYTES;
		default: return "Error: wrong information type";
		}
	}
	
	private static String getFloatInformation(String informationType) {
		switch(informationType) {
		case "min": return "" + Float.MIN_VALUE;
		case "max": return "" + Float.MAX_VALUE;
		case "byte": return "" + Float.BYTES;
		default: return "Error: wrong information type";
		}
	}
	
	private static String getDoubleInformation(String informationType) {
		switch(informationType) {
		case "min": return "" + Double.MIN_VALUE;
		case "max": return "" + Double.MAX_VALUE;
		case "byte": return "" + Double.BYTES;
		default: return "Error: wrong information type";
		}
	}
	
	private static String getCharInformation(String informationType) {
		switch(informationType) {
		case "min": return "" + (int)Character.MIN_VALUE;
		case "max": return "" + (int)Character.MAX_VALUE;
		case "byte": return "" + Character.BYTES;
		default: return "Error: wrong information type";
		}
	}

}
