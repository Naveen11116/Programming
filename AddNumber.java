class AddNumber{

 public static void main(String[] args){
   
  int num=357,rem,add=0;

while (num!=0){

rem = num%10;

add = add+rem;

num = num/10;

}
  
System.out.println(add);
}
}