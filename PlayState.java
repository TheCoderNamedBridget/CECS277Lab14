

/*
The PlayState feeds into AsleepState, and PlayState but can only be fed into by EatingState
*/
public class PlayState implements PuppyState
{
  /*
  @description prints the puppy's reaction to PlayState from PlayState
  @param the current puppy
  */
  @Override
  public void play(Puppy p)
  {
    int numPlayed = 0;
    if ( p.numFeeds >= 1 )
    {
      numPlayed = p.incPlays();
    }
    System.out.println("p.numFeeds " + p.numFeeds);
    if ( numPlayed == 3 )
    {
      System.out.println("You throw the ball again and the puppy excitedly chases it. The puppy played so much it fell asleep.");
      p.reset();
      p.setState(new AsleepState());
    }
    else if ( p.numPlays == 2 )
    {
      System.out.println("You throw the ball again and the puppy excitedly chases it.");
    }
    else if ( p.numFeeds == 1 )
    {
      System.out.println("The puppy looks up from its food and chases the ball you threw.");
      p.setState(new PlayState());
    }
    else if ( p.numFeeds < 1 )
    {
      AsleepState sleep = new AsleepState();
      p.setState(sleep);
      sleep.play( p );
    }
    
  }

  /*
  @description prints the puppy's reaction to EatingState from PlayState
  @param the current puppy
  */
  @Override
  public void feed(Puppy p)
  {
    System.out.println("The puppy wakes up and comes running to eat.");
    int numFed = p.incFeeds();
    
    if ( numFed == 3 )
    {
      p.setState(new AsleepState());
    }
    else
    {
      p.setState(new EatingState());
    }
    
  }
}