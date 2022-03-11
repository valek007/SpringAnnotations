package es.pildoras.pruebaanotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnotations4 {

	public static void main(String[] args) {
		
		//Cargar class de configuración
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

		// Pedir un Bean al contenedor

		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println("Email del director: "+empleado.getEmail());
		System.out.println("Nombre de empresa: "+empleado.getNombreEmpresa());

		// Cerrar el contexto
		contexto.close();

	}

}
