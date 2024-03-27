package ca.sheridancollege.pate3345.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.pate3345.beans.Slack;
import ca.sheridancollege.pate3345.repositories.SlackRepository;

@Service
public class SlackServiceImpl implements SlackService {

	@Autowired
	private SlackRepository slackRepository;
	
	@Override
	public List<Slack> findAll() {
		// TODO Auto-generated method stub
		return slackRepository.findAllByOrderByAppdateDesc();
//				findAll();
	}

	@Override
	public Optional<Slack> findById(Long id) {
		// TODO Auto-generated method stub
		return slackRepository.findById(id);
	}

	@Override
	public Optional<Slack> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return slackRepository.findByAuthor(author);
	}

	@Override
	public Slack save(Slack slack) {
		// TODO Auto-generated method stub
		return slackRepository.save(slack);
	}

}
