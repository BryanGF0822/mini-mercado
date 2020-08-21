package model;

enum TypeofDocument{
	
	TARJETA_DE_IDENTIDAD, CEDULA_DE_CIUDADANIA, 
	PASAPORTE, CEDULA_DE_EXTRANJERIA
}

public class Client {
	
	private TypeofDocument documentType;
	private long idNumber;
	
	public Client(TypeofDocument documentType, long idNumber) {
		
		this.documentType = documentType;
		this.idNumber = idNumber;
	}

	public TypeofDocument getDocumentType() {
		return documentType;
	}

	public long getIdNumber() {
		return idNumber;
	}
	
	
	
	
}
