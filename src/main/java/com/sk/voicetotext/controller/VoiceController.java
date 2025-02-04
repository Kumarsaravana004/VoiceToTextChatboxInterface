package com.sk.voicetotext.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/voice")
@CrossOrigin(origins = "*") // Allow requests from all origins
public class VoiceController {

	@PostMapping("/text")
	public ResponseEntity<String> processText(@RequestBody VoiceRequest request) {
		String receivedText = request.getText();

		// Log the received text
		System.out.println("Received text: " + receivedText);

		// Return a response to the client
		return ResponseEntity.ok("Response: " + receivedText);
	}

	// DTO for receiving the request
	public static class VoiceRequest {
		private String text;

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}
}
