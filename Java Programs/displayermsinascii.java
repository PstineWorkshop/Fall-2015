public class displayermsinascii
{
    public static void main(String[] args)
{
      
      int i;
      
      int count=0;
   
      for( i =33; i <126;i++)
   {
               
         System.out.print((char)i + " ");
            
            
            count++;  
            
            if (count == 10)
            {
               System.out.println();
               count=0;
            }
   
   
   }
  }
  }
  /*---------------------------------------------------------
     ----jGRASP exec: java displayermsinascii
 
 ! " # $ % & ' ( ) * 
 + , - . / 0 1 2 3 4 
 5 6 7 8 9 : ; < = > 
 ? @ A B C D E F G H 
 I J K L M N O P Q R 
 S T U V W X Y Z [ \ 
 ] ^ _ ` a b c d e f 
 g h i j k l m n o p 
 q r s t u v w x y z 
 { | } ~ 
  ----jGRASP: operation complete.
 
 ----------------------------------------------------------*/