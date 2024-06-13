package ProBasic;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		//program to print the multiplication table in the given range by using nested forloop
		int start=10;
		int end=20;
		
		for(int i=start;i<=end;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}

}
