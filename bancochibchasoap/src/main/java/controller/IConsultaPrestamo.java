package controller;

import java.util.HashMap;

import javax.jws.WebService;

@WebService
public interface IConsultaPrestamo {
	public HashMap<String, String> consultaPrestamo();
}
