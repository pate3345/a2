package ca.sheridancollege.pate3345.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ca.sheridancollege.pate3345.beans.Slack;

//@Service
public interface SlackService {

	public List<Slack> findAll();
	public Optional<Slack> findById(Long id);
	public Optional<Slack> findByAuthor(String author);
	public Slack save(Slack slack);
}
