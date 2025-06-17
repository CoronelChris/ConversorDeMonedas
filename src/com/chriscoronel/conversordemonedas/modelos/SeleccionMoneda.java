package com.chriscoronel.conversordemonedas.modelos;

import java.util.Map;

public record SeleccionMoneda(String base_code,
                              Map<String,Double> conversion_rates) {
}
