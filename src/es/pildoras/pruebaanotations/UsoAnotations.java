package es.pildoras.pruebaanotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations {

	public static void main(String[] args) {
		
		//Cargar XML de configuración
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		
		//Pedir un Bean al contenedor
		
		Empleados antonio=contexto.getBean("comercialExperimentado", Empleados.class);
		
		
		//Usar el Bean
		
		System.out.println(antonio.getTareas()+"\n"+antonio.getInforme()+"\n");
		
		//Cerrar el contexto
		
		contexto.close();

	}

}
