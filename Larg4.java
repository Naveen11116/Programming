class Larg4 {
	public static void main(String[] args){

		int a = 10, b = 20, c = 26, d = 28;
 
        int large = (a>b)?(a>c?a>d?a:d):(c>d?c:d):((b>c)?(b>d)?b:d):(c>d)?c:d);

		System.out.println(large);
	}
}
