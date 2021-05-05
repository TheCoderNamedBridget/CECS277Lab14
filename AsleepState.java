

/*
The asleep state is fed into by EatingState and PlayState but can only feed into the EatingState
*/
public class AsleepState implements PuppyState
{
  /*
  @description prints the puppy's reaction to PlayState from SleepState
  @param the current puppy
  */
  @Override
  public void play(Puppy p)
  {
    System.out.println("The puppy is asleep. It doesn't want to play right now.");
  }

  /*
  @description prints the puppy's reaction to EatingState from AsleepState
  @param the current puppy
  */
  @Override
  public void feed(Puppy p)
  {
    
    p.giveFood();
    
    p.setState(new EatingState());
  }
}