package ca.sheridancollege.pate3345.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.pate3345.beans.Slack;
import ca.sheridancollege.pate3345.services.SlackService;

@RestController
@RequestMapping("/api/v1/slacks")
public class SlackController {

	@Autowired
	private SlackService slackService;
	
	@GetMapping(value = { "", "/" })
	public List<Slack> getCollection() {
		return slackService.findAll();
	}
	
	@PostMapping(value = { "", "/" })
	public Slack save(@RequestBody Slack slack) {
		return slackService.save(slack);
	}
}
