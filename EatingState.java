

/*
The EatingState feeds into EatingState, AsleepState, and PlayState but can only be fed into by AsleepState
*/
public class EatingState implements PuppyState
{
  /*
  @description prints the puppy's reaction to PlayState from EatingState
  @param the current puppy
  */
  @Override
  public void play(Puppy p)
  {
    System.out.println("The puppy looks up from its food and chases the ball you threw.");
    int timesPlayed = p.incPlays();
    if ( timesPlayed == 2 )
    {
      p.setState(new AsleepState());
    }
    else 
    {
      p.setState(new PlayState());
    }
  }

  /*
  @description prints the puppy's reaction to EatingState from EatingState
  @param the current puppy
  */
  @Override
  public void feed(Puppy p)
  {
    int timesFed = p.incFeeds();
    System.out.println("times fed in eating state = " + timesFed);
    if ( timesFed == 2 )
    {
      System.out.println("The puppy continues to eat as you add another scoop of kibble to its bowl. The puppy ate so much it fell asleep.");
      p.reset();
      p.setState(new AsleepState());
    }
    else if ( timesFed == 1 )
    {
      System.out.println("The puppy wakes up and comes running to eat.");
      p.setState(new EatingState());
    }
  }
}