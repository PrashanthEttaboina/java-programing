class Game
{
void type()
{
System.out.println("Sports are of two types they are \n 1.Indoor  \n 2.Outdoor ");
}
}
class Indoor extends Game 
{
void play()
{
System.out.println("This game is an indoor game ");
}
void players()
{
System.out.println("This game need 2 players to play");
}
public static void main(String [] args)
{
Indoor chess= new Indoor();
chess.type();
chess.play();
chess.players();
}
}


class Outdoor extends Game 
{
void play()
{
System.out.println("This game is an outdoor game ");
}
void players()
{
System.out.println("This game need 22 players to play");
}
public static void main(String [] args)
{
Outdoor soccer= new Outdoor();
soccer.type();
soccer.play();
soccer.players();
}
}