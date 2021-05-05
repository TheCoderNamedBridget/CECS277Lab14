


/*
Names: Bridget Naylor, Athena Jacob
Lab: 14 Puppy Simulator
Date: 5/3/2021

*/


class Main {
  public static void main(String[] args) {
    System.out.println("Congratulations on your new puppy!");
    int userinput = 0;
    Puppy P = new Puppy();
    while ( userinput != 3 )
    {
      System.out.println("What would you like to do?");
      System.out.println("1. Feed");
      System.out.println("2. Play");
      System.out.println("3. Quit");
      userinput = CheckInput.getIntRange(1,3);

      if ( userinput == 1)
      {
        EatingState eat = new EatingState();
        P.setState( eat);
        eat.feed(P);
        System.out.println("here1");
      }
      else if ( userinput == 2 )
      {
        PlayState play1 = new PlayState();
        P.setState( play1);
        play1.play(P);
        System.out.println("here2");
      }
    }

  }
}