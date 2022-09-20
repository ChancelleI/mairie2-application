package com.applicationweb.other.payload.request;

public class ActRequest {

	private Long idTypeActe;

	private Long idCommune;

	public Long getIdTypeActe() {
		return idTypeActe;
	}

	public void setIdTypeActe(Long idTypeActe) {
		this.idTypeActe = idTypeActe;
	}

	public Long getIdCommune() {
		return idCommune;
	}

	public void setIdCommune(Long idCommune) {
		this.idCommune = idCommune;
	}

	@Override
	public String toString() {
		return "ActRequest [typeActe=" + idTypeActe + ", idCommune=" + idCommune + "]";
	}

}
