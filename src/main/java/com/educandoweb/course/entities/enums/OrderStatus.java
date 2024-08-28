package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3), 
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) { // CONTRUTOR DO ENUMERADO É PRIVATE MESMO
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) { // O .VALUES() ELE PERCORRE TODOS OS VALORES DESSE ORDERSTATUS
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Ivalid OrderStatus code!");
	}
}
