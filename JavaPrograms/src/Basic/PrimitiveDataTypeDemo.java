package Basic;

public class PrimitiveDataTypeDemo {

	public static void main(String[] args) {
	
		//byte takes 1byte
		byte byteMax=127;
		byte byteMin=-128;
		System.out.println("Min range of byte is"+byteMin+"Max range of byte is"+byteMax);
		
		//short-2bytes
		short shortMax=23456;
		short shortMin=-23456;
		System.out.println("Min range of byte is"+shortMin+"Max range of byte is"+shortMin);
		
		//int-4bytes
		int maxInt=1234567892;
		int minInt=-1234567892;
		System.out.println("Min range of byte is"+minInt+"Max range of byte is"+maxInt);
		
		//long=8bytes
		long maxLong=234567898765432L;
		long minLong=-234567898765432L;
		System.out.println("Min range of bytye is"+maxLong+"Max range of byte is"+minLong);
		
		float f=3245.12345678987f;
		double d=2345.1234567898723f;
		System.out.println("float value is"+f+"double value is"+d);
		
		//boolean 
		boolean flag=false;
		System.out.println("boolean value is"+flag);
	}

}
