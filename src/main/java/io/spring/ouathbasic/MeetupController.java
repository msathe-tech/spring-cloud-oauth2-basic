package io.spring.ouathbasic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class MeetupController {

	private List<Meetup> meetups = new ArrayList<Meetup>();
	
	@GetMapping("/")
	public List<Meetup> home() {
		if(meetups.isEmpty()) {
			meetups.add(new Meetup("Cloud Native", "Raghu"));
		}
		return meetups;
	}
}
