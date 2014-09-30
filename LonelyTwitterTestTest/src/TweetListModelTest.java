import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;



public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetListModelTest(){
		super(LonelyTwitterActivity.class);
	}
	
	public void testFiveIsFive(){
		assertEquals(5,5);
	}

	public void testAddTweets(){

		try{		
			TweetListModel tlm = new TweetListModel();
			LonelyTweetModel newTweet = new LonelyTweetModel("Test");
			if (testHasTweet(newTweet)){
				throw new IllegalArgumentException();
			}
			else{
				tlm.add(newTweet);
			}
			
		} catch (IllegalArgumentException e){
			assertEquals(e.getClass(), IllegalArgumentException.class);
		}
	}
	
	public void testGetItem(){
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("Test");
		tlm.add(firstTweet);
		assertSame(firstTweet, tlm.getItem(1));
	}

	public void testGetTweets(){
		TweetListModel tlm = new TweetListModel();
		for (int i=0;i<tlm.getCount();i++){
			System.out.println(tlm.getItem(i));
		}
	}
	
	public boolean testHasTweet(LonelyTweetModel test){
		TweetListModel tlm = new TweetListModel();
		for (int i=0;i<tlm.getCount();){
			if (test == tlm.getItem(i)){
				return true;
			}
			return false;
		}
		return false;
	}
	
	public int testGetCount(){
		TweetListModel tlm = new TweetListModel();
		return tlm.getCount();
	}
}
