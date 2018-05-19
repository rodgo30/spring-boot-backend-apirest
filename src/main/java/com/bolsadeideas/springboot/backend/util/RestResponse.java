package com.bolsadeideas.springboot.backend.util;


public class RestResponse {
	public Integer codigoRespuesta;
	public String mensajeError;
	
	public RestResponse(Integer codigoRespuesta) {
		super();
		this.codigoRespuesta = codigoRespuesta;
	}
	
	public RestResponse(Integer codigoRespuesta, String mensajeError) {
		super();
		this.codigoRespuesta = codigoRespuesta;
		this.mensajeError = mensajeError;
	}
	
	public Integer getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(Integer codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
}
