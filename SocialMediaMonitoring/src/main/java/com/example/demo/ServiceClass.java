package com.example.demo;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sentimentalAnalysis.DriverClass;
import tweets.GetTweets;
import twitter4j.Status;

@Service
public class ServiceClass 
{
     @Autowired 
	 private Jpainterface jpainterface;
	 @PostConstruct
	 public void loadData()
	  {
		  GetTweets tweet = new GetTweets();
		  DriverClass driver = new DriverClass();
		  for(Status status :tweet.getTweetMention())
		  {  
			 Bean bean = new Bean();
			 bean.setUser_name(status.getUser().getScreenName());
			 bean.setTweet(status.getText());
			 bean.setResult(driver.sentiment(status.getText()));
			 bean.setTweet_id(Long.toString(status.getId()));
			 jpainterface.save(bean); 
		   }
	     //   if(.equals("Negative"))
	     //   {
//	        	tweet.postTweet(status.getId(), status.getUser().getScreenName(),"Negative");
	     //   }
	     //   else if(.equals("Positive"))
	      //  {
//	        	tweet.postTweet(status.getId(), status.getUser().getScreenName(),"Negative");
	   //     }
	   //     else
	     //   {
//	        	tweet.postTweet(status.getId(), status.getUser().getScreenName(),"Negative");
	        	
	       // }
	        	
	//	  }
	  }  
}
