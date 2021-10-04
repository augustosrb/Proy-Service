package com.proy.util;

public abstract class AbstractHandler {

	public static JsonMessageResult mensaje = new JsonMessageResult();

	public static JsonMessageResult resultSuccessList(Object objeto) {
		mensaje.setEstado("success");
		mensaje.setMensaje("Consulta exitosa");
		mensaje.setObjeto(objeto);
		return mensaje;
	}

	public static JsonMessageResult resultSuccessInsert(Object objeto) {
		mensaje.setEstado("success");
		mensaje.setMensaje("Registro satisfactorio");
		mensaje.setObjeto(objeto);
		return mensaje;
	}

	public static JsonMessageResult resultSuccessUpdate(Object objeto) {
		mensaje.setEstado("success");
		mensaje.setMensaje("Actualización satisfactorio");
		mensaje.setObjeto(objeto);
		return mensaje;
	}

	public static JsonMessageResult resultSuccessDelete(Object objeto) {
		mensaje.setEstado("success");
		mensaje.setMensaje("Eliminación satisfactoria");
		mensaje.setObjeto(objeto);
		return mensaje;
	}

	public static JsonMessageResult resultFail(String error) {
		mensaje.setEstado("error");
		mensaje.setMensaje("Registro Fallido : " + error);
		return mensaje;
	}
	
	public static JsonMessageResult result(String comentario) {
		mensaje.setEstado("success");
		mensaje.setMensaje(comentario);
		mensaje.setObjeto("");
		return mensaje;
	}
}