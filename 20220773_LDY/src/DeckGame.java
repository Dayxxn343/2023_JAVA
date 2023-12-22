import java.util.Arrays;

public class DeckGame {
 public static void main(String[] args) {
  Card c = new Card(2,3);
  System.out.println(c.toString());
  Deck d= new Deck();
  System.out.println(Arrays.toString(d.c));
 }
}

class Card{
 static final int KIND_MAX=4;
 static final int NUM_MAX=13;
 static final int SPADE=1; //숫자로 종류 관리 //상수
 static final int CLOVER=2;
 static final int DIMOND=3;
 static final int HEART=4;

 int kind;
 int number; //13

 Card(int kind, int number){
 this.kind=kind;
 this.number=number;
 }

 Card(){
 this(SPADE,1);//상수
 }

 @Override
 public String toString(){
   String kind =""; //1=A, 11=J,  12=Q,  13K
   String number ="";

   switch(this.kind){
     case 1:
     kind="SPADE";
     break;

     case 2:
     kind="CLOVER";
     break;

     case 3:
     kind="DIMOND";
     break;

     default:
     kind="HEART";
     break;
   }
	
   switch(this.number){
     case 1:
     number="A";
     break;

     case 11:
     number="j";
     break;

     case 12:
     number="Q";
     break;

     case 13:
     number="K";
     break;

     default:
     number=""+this.number;
     break;
   }

  return kind + " " + number;
 }

}


class Deck{
 static final int CARD_NUM = Card.KIND_MAX*Card.NUM_MAX ;
 Card[] c  = new Card[CARD_NUM];

 Deck(){
   int num=0;
   for(int i=0;i<Card.KIND_MAX;i++){
     for(int j=0;j<Card.NUM_MAX;j++){
        c[num++]=new Card(i+1,j+1);
     }
   }
 }

 Card pick(int a){
   Card result = c[a];
   return result;
 }

 Card pick(){
   Card random = pick((int)(Math.random()*52+0)) ;
   return random;
 }

 void shuffle(){
   for(int i=0; i< CARD_NUM;i++) {
     Card j = pick();
     Card tmp = c[i];
     c[i] = j;
     j = tmp;
   } 
 }

 void shuffle(int num){
   for(int k=0; k< num; k++) {
     Card a = pick();
     Card b = pick();
     Card tmp = a;

     a = b;
     b = tmp;
   }
 }
}