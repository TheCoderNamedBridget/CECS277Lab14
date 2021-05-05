
/*
class to control the puppy, the state classes will call this class
*/
public class Puppy
{
  //instance variables
  PuppyState state;
  int numFeeds;
  int numPlays;

  /*
  Puppy constructor
  */
  Puppy()
  {
    numFeeds = 0;
    numPlays = 0;
    state = new AsleepState();
  }

  /*
  @description sets the next puppy state
  @param the next puppy state
  */
  void setState( PuppyState s )
  {
    state = s;
  }

  /*
  @description 
  @param 
  */
  void throwBall()
  {
    incPlays();
  }

  /*
  @description 
  @param 
  */
  void giveFood()
  {
    incFeeds();
  }

  /*
  @description increments the numfeeds
  @return the total numOfTimes the dog has fed
  */
  int incFeeds()
  {
    numFeeds ++;
    return numFeeds;
  }

  /*
  @description increments the numplays
  @return the total numOfTimes the dog has played 
  */
  int incPlays()
  {
    numPlays++;
    return numPlays;
  }

  /*
  @description resets numplays and numfeeds
  */
  void reset()
  {
    numPlays = 0;
    numFeeds = 0;
    state = new AsleepState();
  }
}