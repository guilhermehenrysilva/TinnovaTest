package com.veiculo.veiculoapi.enums;

public enum VeiculoMarcasEnum {
    ALFA_ROMEO("Alfa Romeo"),
    ASTON_MARTIN("Aston Martin"),
    AUDI("Audi"),
    BMW("Bmw"),
    CHEVROLET("Chevrolet"),
    CITROEN("Citroen"),
    FIAT("Fiat"),
    FORD("Ford"),
    HONDA("Honda"),
    JEEP("Jeep"),
    KIA("Kia"),
    RENAULT("Renault"),
    SUZUKI("Suzuki"),
    VOLKSWAGEN("Volkswagen"),
    OUTRO("Outro");

    private String marca;

    VeiculoMarcasEnum(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
