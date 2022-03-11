package es.pildoras.pruebaanotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentación del informe catastrófico del trimestre 2. ";
	}

}
