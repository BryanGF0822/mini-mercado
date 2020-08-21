package model;

import java.util.ArrayList;
import java.util.List;

public class Mini_mercado {
	
	private List<Client> clients;
	
	public Mini_mercado() {
		
		clients = new ArrayList<Client>();
	}
	
	public boolean add(TypeofDocument documentType, long idNumber) {
		boolean e = false;
		Client cl = new Client(documentType, idNumber);
		for (int i = 0; i < clients.size() && !e; i++) {
			if (clients.get(i) == null) {
				clients.add(i,cl);
				e = true; 
			}
		}
		return e;
	}

	public List<Client> getClients() {
		return clients;
	}

}
