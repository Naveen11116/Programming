class Dumble2{

 public static void main(String[] args){
   
  int star=9,space=-1;
  
 for(int i=1;i<=7;i++){

if(i<=4){

space++;
star-=2;

}

else if(i>=4){

space--;
star+=2;
}

for(int j=1;j<=space;j++){

System.out.print(" "); 
}

for(int j=1;j<=star;j++){

if(i==4&&j==1){

System.out.print("@");

}

else{

System.out.print("*");

}

}

System.out.println();

}
}
}