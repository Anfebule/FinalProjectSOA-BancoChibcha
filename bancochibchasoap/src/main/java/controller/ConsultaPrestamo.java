package controller;

import java.util.HashMap;

import javax.jws.WebService;

@WebService(endpointInterface="controller.IConsultaPrestamo")
public class ConsultaPrestamo implements IConsultaPrestamo {

	@Override
	public HashMap<String, String> consultaPrestamo() {
		HashMap<String, String> respuesta = new HashMap<String, String>();
		respuesta.put("Tasa", "30");
		respuesta.put("Tipo", "EA");
		return respuesta;
	}

}
