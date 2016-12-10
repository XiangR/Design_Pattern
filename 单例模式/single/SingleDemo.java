package Single_Pattern;

public class SingleDemo {
	
	public static void main(String[] args) {
	
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		
		System.out.println(s1 == s2);
		
		s1.setNum(10);
		s2.setNum(20);
		
		System.out.println( s1.getNum() == s2.getNum() );
	}
}
