class Dumble{

 public static void main(String[] args){
   
  int star=0,space=4;
  
 for(int i=1;i<=7;i++){
  
if(i<=4){

   space--;
   
   star++;
}
else if(i>=4){
  
  space++;
    
  star--;
}
 
 for(int j=1;j<=space;j++){

  System.out.print(" ");
}

  for(int j=1;j<=star;j++){
   
   System.out.print("*");
}

//  if(i==1||i==2||i==6||i==7){
//
// for(int j=1;j<=4;j++){
//
//
//   System.out.print(" ");
//}

}

// for(int j=1;j<=star;j++){
//   
//   System.out.print("*");
//}


if(i==3||i==4||i==5){

for(int j=1;j<=4;j++){
   
   System.out.print("*");
}
}

System.out.println();

}
}
}