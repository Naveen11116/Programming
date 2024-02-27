class NumberSquare{

 public static void main(String[] args){
   
  int num=123,rem,square=0;

while(num!=0){

rem= num%10;

square = rem*rem+square;

num = num/10;

}

System.out.println(square);

}
}		       																							