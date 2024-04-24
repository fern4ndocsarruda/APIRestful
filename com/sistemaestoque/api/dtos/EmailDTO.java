package com.sistemaestoque.api.dtos;

public class EmailDTO {
	
	private String emailFrom;
	private String emailTo;
	private String tituloEmail;
	private String corpoEmail;
	
	public EmailDTO(String emailFrom, String emailTo, String tituloEmail, String corpoEmail) {
		
		super();
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.tituloEmail = tituloEmail;
		this.corpoEmail = corpoEmail;
		
	}

	public String getEmailFrom() {
		return emailFrom;
	}
	
	
}
