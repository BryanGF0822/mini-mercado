package model;



public class Client {
	
	private String documentType;
	private long idNumber;
	
	public Client(String documentType, long idNumber) {
		
		this.documentType = documentType;
		this.idNumber = idNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

	public long getIdNumber() {
		return idNumber;
	}
	
	
	
	
}
