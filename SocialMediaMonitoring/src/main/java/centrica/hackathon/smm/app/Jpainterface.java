package centrica.hackathon.smm.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Jpainterface extends JpaRepository<Bean, Long>
{
	   @Query(value = "SELECT count(*) from twitterdata where journey = 'homeservice'", nativeQuery = true)
	   int homeservice();
	 //  @Query(value = "SELECT count(*) from twitterdata where journey = 'payments' group by tweet_id having count(tweet_id) = 1" , nativeQuery = true)
	//   int payments();
	   @Query(value = "SELECT count(*) from twitterdata where journey = 'smartmeter'" , nativeQuery = true)
	   int smartmeter();
	//   @Query(value = "SELECT count(*) from twitterdata where journey = 'installation' group by tweet_id having count(tweet_id) = 1" , nativeQuery = true)
	 //  int installation();
}
