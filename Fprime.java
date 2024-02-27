class  Fprime{
	public static void main(String[] args) 
	{
		int n1 = 0,n2=1,n3, a=0;

		//System.out.print(n1+" ");
		//System.out.print(n2+" ");

		while (n1+n2<=100){

			n3 = n1+n2;

			if (prime(n3)==true)
			{
               a = a+n3;
			}

            n1= n2;

			n2=n3;
		}

		System.out.println(a);
	}

public static boolean prime(int a){

 int count = 0;

  for (int i=1;i<=a/2 ; i++ ){

	  if (a%i==0)
	  {
          count++;
	  }
  }

  if (count==1){
    return true ;
}

  else 

	  return false;

}

}
