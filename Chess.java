class Sports
{
void type()
{
System.out.println("Sports are of two types they are \n 1.Indoor  \n 2.Outdoor ");
}
}
class Indoor extends Sports 
{
void inside()
{
System.out.println("Indoor games doesnt need to play on ground ");
}
void fitness()
{
System.out.println("Indoor games doesnt need any physical fitness");
}
}
public class Chess extends Indoor  // Multilevel Inheritance is used here 
{
void game()
{
System.out.println("Chess is an indoor game ");
}
void players()
{
System.out.println("Chess needs 2 players to play");
}
public static void main(String args[])
{
Chess play=new Chess();
play.type();
play.fitness();
play.inside();
play.game();
play.players();



}
}