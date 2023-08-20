package string1;

public class RevesingString1 {

	public static void main(String[] args) {

		String s = "java html css", str = "";

		String[] obj = s.split(" ");

		for (int i = 0; i < obj.length; i++) {

			str = obj[i]+ " " + str;

		}
		System.out.print(str);
	}

}
