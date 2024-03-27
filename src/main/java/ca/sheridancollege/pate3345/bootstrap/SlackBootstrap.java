package ca.sheridancollege.pate3345.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.pate3345.beans.Slack;
import ca.sheridancollege.pate3345.services.SlackService;

@Component
public class SlackBootstrap implements CommandLineRunner {

	@Autowired
	private SlackService slackService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
        Slack slack1 = new Slack("John Doe", "Sample Title 1", "Sample Description 1", LocalDate.of(2023, 1, 15));
        Slack slack2 = new Slack("Jane Smith", "Sample Title 2", "Sample Description 2", LocalDate.of(2023, 3, 10));
        Slack slack3 = new Slack("Alice Johnson", "Sample Title 3", "Sample Description 3", LocalDate.of(2023, 5, 20));

        slackService.save(slack1);
        slackService.save(slack2);
        slackService.save(slack3);

		
		

	}

}
