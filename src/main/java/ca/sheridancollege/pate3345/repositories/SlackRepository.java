package ca.sheridancollege.pate3345.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.pate3345.beans.Slack;

public interface SlackRepository extends JpaRepository<Slack, Long> {

		public Optional<Slack> findByAuthor(String author);
		List<Slack> findAllByOrderByAppdateDesc();

	
}
