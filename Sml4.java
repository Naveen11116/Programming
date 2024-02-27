class Sml4{
	public static void main(String[] args){

		int a= 10, b= 20, c = 25, d = 1;

		int e = (a<b)?(a<c)?a:b:(b<c)?b:c;

		int f= (e<d)?e:d;

		System.out.println(f);
	}
}
