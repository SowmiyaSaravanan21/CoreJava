package ProBasic;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
	//for integer array
		for(int i:a)
		{
			System.out.println(i);
		}
		
		char ch[]= {'j','a','k','h'};
		for(char c:ch)
		{
			System.out.println(c);
		}
		System.out.println("");
		String s1[]= {"java","programming","language"};
   //for string array
		for(String s:s1)
		{
			System.out.println(s+"");
		}
	}

}
