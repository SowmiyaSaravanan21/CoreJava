package ProBasic;
public class SwitchCase {

	public static void main(String[] args) {
		
		char x='l';
		switch(x)
		{
		case'l':
		case'L':
			System.out.println(x+" is a letting go");
			break;
		case 'd':
		case 'D':
		   System.out.println(x+" is a Danderous");
		   break;
		case 'w':
		case 'W':
			System.out.println(x+" is women");
			break;
		case 's':
		case 'S':
			System.out.println(x+" is a snake");
		default:
			System.out.println(x+ "this letter not found");
		   }
	}

}
