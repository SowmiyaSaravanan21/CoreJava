package Basic;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// Widening / implicit type casting
		
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int i2=ch;
		System.out.println(i2);
		
		char var1='\u00A7';
		int i3=var1;
		System.out.println(i3);
		
		// narrow / explicit type casting
		
		double f1=10.34f;
		long l=(long)f1;
		System.out.println(l);
		
		
		float f2=34.56f;
		int i5=(int)f2;
		System.out.println(i5);
		
		byte b1=90;
		char ch1=(char)b1;
		System.out.println(ch1);
	}

}
