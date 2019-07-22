package com.sistemaventasrestaurant.model;

import java.util.HashMap;
import java.util.Map;

public enum TipoDocumento {
    BOLETA(1),
    FACTURA(2);
    
    private int value;
    private static Map<Object, Object> map = new HashMap<Object, Object>();

    private TipoDocumento(int value) {
        this.value = value;
    }

    static {
        for (TipoDocumento tipoDocumento : TipoDocumento.values()) {
            map.put(tipoDocumento.value, tipoDocumento);
        }
    }

    public static TipoDocumento valueOf(int tipoDocumento) {
        return (TipoDocumento) map.get(tipoDocumento);
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

   
}