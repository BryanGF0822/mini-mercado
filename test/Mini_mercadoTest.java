import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exceptions.IdNumberException;
import Exceptions.TarjetaDeIdentidadException;
import model.Client;
import model.Mini_mercado;
import model.TypeofDocument;

class Mini_mercadoTest {
	
	public Mini_mercado miniM;
	
	

	@Test
	public void addClientTest() {
		
		miniM = new Mini_mercado();
		try {
			miniM.addClient(TypeofDocument.CEDULA_DE_CIUDADANIA	, 115040);
			
			assertEquals(1, miniM.getClients().size());
		} catch (TarjetaDeIdentidadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertThrows(TarjetaDeIdentidadException.class,()->miniM.addClient(TypeofDocument.TARJETA_DE_IDENTIDAD,115040));
		
		
	}
	
	@Test
	public void puedeIngresarTest() {
		
		miniM = new Mini_mercado();
		
		try {
			miniM.addClient(TypeofDocument.CEDULA_DE_CIUDADANIA	, 115070);
			
		} catch (TarjetaDeIdentidadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String s = String.valueOf(miniM.getClients().get(0).getIdNumber());
		int i =s.length();
		String c = s.charAt(i-2)+"";
		int j = Integer.parseInt(c);//5
		
		assertThrows(IdNumberException.class,()->miniM.puedeIngresar(j));
	}

}
