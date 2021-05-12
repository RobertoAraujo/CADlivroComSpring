package com.roberto.dto;

import java.util.Objects;

public class MessageResponseDTO {
	private static String message;

	public static String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		MessageResponseDTO.message = message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(message);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return Objects.equals(message, MessageResponseDTO.message);
	}

	@Override
	public String toString() {
		return "MessageResponseDTO [message=" + message + "]";
	}

	
	
	
}
