package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
/*Para evitar uma possivel quebra de valores dos enumerados, foi acresentado manualmente valores*/	

	private int code;//codigo do tipo enum
	
	private OrderStatus(int code) { // construtor espacial só da class
		this.code= code;
	}
	
	public int getCode() {//metodo pulico para acessar o cod em outras class
		return code;
	}
	
	public static OrderStatus valueOf(int code) {//metodo que retorna o nome do status conforme o codigopassado
		for(OrderStatus value: OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
