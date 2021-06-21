package day1;

public class CharCount {
	public static int countChar(String str, char ch) {
		int count=0;
		for(int i=0; i<str.length();i++){
			char c = str.charAt(i);
			if(c==ch)
				break;
			count++;
			
			}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(CharCount.countChar("mehul",'u'));

	}

}
