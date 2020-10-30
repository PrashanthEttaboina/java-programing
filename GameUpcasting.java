abstract class Game
{
abstract void type();

abstract void play();

abstract void players();
Game(String name )
{
System.out.println("The game name is "+name);
}
}



class Indoor extends Game 
{
Indoor()
{
super("chess");
}

void type()
{
System.out.println("This game is an indoor game ");
}
void play()
{
System.out.println("Play time is very less" );
}
void players()
{
System.out.println("This game need 2 players to play");
}

}


class Outdoor extends Game 
{
Outdoor()
{
super("soccer");
}
void type()
{
System.out.println("This is an outdoor game");
}
void play()
{
System.out.println("Play type is more");
}
void players()
{
System.out.println("This game need 22 players to play");
}
}


 class GameUpcasting
{
public static void main(String [] args)
{
System.out.println("==============Game Details 1======================");
Game g=new Indoor();
g.type();

g.play();
g.players();

System.out.println("==============Game Details 2======================");
g=new Outdoor();
g.type();

g.play();
g.players();

}

}
