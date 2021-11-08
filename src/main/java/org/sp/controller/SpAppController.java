package org.sp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpAppController {

	@GetMapping("/first/{email}")
	public ResponseEntity<String> firstController(@PathVariable String email) {
		boolean isEmailValid = email.matches(Constants.EMAIL_REGEX);
		return new ResponseEntity<>(isEmailValid ? "Email valid!" : "Email not valid!", HttpStatus.OK);
	}

}
