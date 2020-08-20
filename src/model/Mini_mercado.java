package model;

import java.util.ArrayList;
import java.util.List;

public class Mini_mercado {
	
	private List<Client> clients;
	
	public Mini_mercado() {
		
		clients = new ArrayList<Client>();
	}

	public List<Client> getClients() {
		return clients;
	}

}
