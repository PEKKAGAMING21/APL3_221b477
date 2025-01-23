class Application {
 public static void main (String args[]){
 Mother m= new Mother ( );
 m.x=55;
 m.show( ); // show of Mother is called
 Child ch=new Child ( );
 ch.x=20;
 ch. show ( ); // show ( ) inherited in Child from Mother is called
 }
}