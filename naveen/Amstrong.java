����   = ^  naveen/Amstrong  java/lang/Object scan Ljava/util/Scanner; <clinit> ()V Code  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
 
    <init> (Ljava/io/InputStream;)V	     LineNumberTable LocalVariableTable
     this Lnaveen/Amstrong; main ([Ljava/lang/String;)V	  ! " # out Ljava/io/PrintStream; % Enter the size of array
 ' ) ( java/io/PrintStream * + println (Ljava/lang/String;)V
 
 - . / nextInt ()I 1 Enter the numbers of array:
 ' 3 4 + print
  6 7 8 isArmstrong (I)Z : java/lang/StringBuilder < )The number of armstrong number in array: 
 9 >  +
 9 @ A B append (I)Ljava/lang/StringBuilder;
 9 D E F toString ()Ljava/lang/String; args [Ljava/lang/String; a I b [I i StackMapTable L H
  R S T mul (II)I num rem count temp temp1 n m 
SourceFile Amstrong.java !                	   .      � 
Y� � � �                      	   /     *� �                        	    	       m�  $� &� � ,<�
M>� �  0� 2,� � ,O�,����,Y:�66� ).>� 5� �  � 9Y;� =� ?� C� &���ֱ       2      
          )  2  E  L  b  l     4    m G H    ^ I J   Z K L    M J  E  M J  N   ! �  O�   P O  O  " 
 7 8  	  	     K<>666� 
p=�
l<��� 
p=� Q`6
l6���� ��       :    !  #  %  '  )  # ! , $ . * 0 4 2 ; , @ 5 G 7 I :    R    K M J    I U J    V J  *  V J   G W J   D S J  
 A X J   > Y J  N    �      	 S T  	   {     =>� 
h=�����           >  @  B  @  E    *     Z J      [ J    S J    M J  N    �   \    ]