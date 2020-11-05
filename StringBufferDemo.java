
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Prashanth");
		StringBuffer s2=new StringBuffer("Vasanth");
		System.out.println(s1);
		s1.append(s2);
		System.out.println(s1);
	}

}
