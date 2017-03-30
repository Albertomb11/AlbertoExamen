package org.alberto;

/**
 * Created by Alberto on 30/03/2017.
 */
public class Frigorifico extends Electrodomesticos{

    //Atributos
    private double capacidadTotal;
    private double getCapacidadCongelador;

    /**
     * Constructor por defecto sin parametros.
     */
    public Frigorifico() {
        super();
    }

    /**
     * Constructor designado con todos los parametros
     * @param marca
     * @param modelo
     * @param percioBase
     * @param consumoEnergetico
     * @param altura
     * @param anchura
     * @param peso
     * @param capacidadTotal
     * @param getCapacidadCongelador
     */
    public Frigorifico(String marca, String modelo, double percioBase, String consumoEnergetico, double altura, double anchura, double peso, double capacidadTotal, double getCapacidadCongelador) {
        super(marca, modelo, percioBase, consumoEnergetico, altura, anchura, peso);
        this.capacidadTotal = capacidadTotal;
        this.getCapacidadCongelador = getCapacidadCongelador;
    }

    //Setter and Getter
    public double getCapacidadTotal() {
        return capacidadTotal;
    }

    /**
     * Setter que checkea que no se meta una capacidad total negativa.
     * @param capacidadTotal
     */
    public void setCapacidadTotal(double capacidadTotal) {
        if (capacidadTotal<0){
            System.out.println("Has introducido una Capacidad Total negativa");
            this.capacidadTotal=0;
        }else{
            this.capacidadTotal = capacidadTotal;
        }
    }

    public double getGetCapacidadCongelador() {
        return getCapacidadCongelador;
    }

    /**
     * Setter que checkea que no se meta una capacidad de congelador negativa.
     * @param getCapacidadCongelador
     */
    public void setGetCapacidadCongelador(double getCapacidadCongelador) {
        if (getCapacidadCongelador<0){
            System.out.println("Has introducido una Capacidad del Congelador negativa");
            this.getCapacidadCongelador=0;
        }else{
            this.getCapacidadCongelador = getCapacidadCongelador;
        }
    }


    @Override
    /**
     * Metodo que imprime el estado del objeto.
     */
    public String toString() {
        return "Frigorifico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                ", consumoEnergetico=" + consumoEnergetico +
                ", altura=" + altura + "metros" +
                ", anchura=" + anchura + "metros" +
                ", peso=" + peso + "Kg" +
                "capacidadTotal=" + capacidadTotal + "litros" +
                ", CapacidadCongelador=" + getCapacidadCongelador + "litros" +
                '}';
    }
}
