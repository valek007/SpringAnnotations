package es.pildoras.pruebaanotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentaci�n del informe catastr�fico del trimestre 2. ";
	}

}
