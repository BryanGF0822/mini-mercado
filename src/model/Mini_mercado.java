package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Exceptions.IdNumberException;
import Exceptions.TarjetaDeIdentidadException;

public class Mini_mercado {
		
	private List<Client> clients;
	
	public Mini_mercado() {
		
		clients = new ArrayList<Client>();
	}
	
	public void addClient(TypeofDocument documentType, long idNumber) throws TarjetaDeIdentidadException {
		
		boolean e = false;
		Client cl = new Client(documentType, idNumber);
		
		if(documentType == TypeofDocument.TARJETA_DE_IDENTIDAD) {
			
			throw new TarjetaDeIdentidadException("Tarjeta de Identidad");
			
		}else {
			
			for (int i = 0; i < clients.size() && !e; i++) {
				if (clients.get(i) == null) {
					clients.add(i,cl);
					e = true; 
				}
			}
		
		}
		
	}

	public List<Client> getClients() {
		return clients;
	}
	
	public void puedeIngresar(int j) throws IdNumberException {
		
		boolean retorno = false;
		LocalDate ld = LocalDate.now();
		int dia = ld.getDayOfMonth();
		if (j%2 == 0) {
			if (!(dia%2==0)) {
				retorno = true;
			}
		}else {
			if (dia%2==0) {
				retorno = true;
			}
		}
		if(retorno == false) {
			throw new IdNumberException(j+""); 
		}
	}

}
