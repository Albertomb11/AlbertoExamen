package org.alberto;

/**
 * Created by Alberto on 30/03/2017.
 */
public class Lavadora extends Electrodomesticos{

    //Atributos
    private String carga;
    private double velocidadCentrifugado;
    private boolean secadoras;

    /**
     * Constructor por defecto sin parametros.
     */
    public Lavadora() {
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
     * @param carga
     * @param velocidadCentrifugado
     * @param secadoras
     */
    public Lavadora(String marca, String modelo, double percioBase, String consumoEnergetico, double altura, double anchura, double peso, String carga, double velocidadCentrifugado, boolean secadoras) {
        super(marca, modelo, percioBase, consumoEnergetico, altura, anchura, peso);
        this.carga = carga;
        this.velocidadCentrifugado = velocidadCentrifugado;
        this.secadoras = secadoras;
    }

    //Setter and Getter
    public String getCarga() {
        return carga;
    }

    /**
     * Setter que checkea que no se meta una carga diferente a "Superior" o "Frontal".
     * @param carga
     */
    public void setCarga(String carga) {
        if (carga == "Superior"){
            this.carga = carga;
        }else if (carga == "Frontal"){
            this.carga = carga;
        }else{
            System.out.println("El tipo de carga introducida no es valida. Tiene que ser Superior o Frontal");
            this.carga="no valida";
        }

    }

    public double getVelocidadCentrifugado() {
        return velocidadCentrifugado;
    }

    /**
     * Setter que checkea que no se mete una velocidad de centrifugado negativa.
     * @param velocidadCentrifugado
     */
    public void setVelocidadCentrifugado(double velocidadCentrifugado) {
        if (velocidadCentrifugado<0){
            System.out.println("Velocidad de Centrifugado no es valido");
            this.velocidadCentrifugado=0;
        }else{
            this.velocidadCentrifugado = velocidadCentrifugado;
        }
    }

    public boolean isSecadoras() {
        return secadoras;
    }

    public void setSecadoras(boolean secadoras) {
        this.secadoras = secadoras;
    }


    @Override
    /**
     * Metodo que imprime el estado del objeto.
     */
    public String toString() {
        return "Lavadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                ", consumoEnergetico=" + consumoEnergetico +
                ", altura=" + altura + "metros" +
                ", anchura=" + anchura + "metros" +
                ", peso=" + peso + "Kg" +
                "carga='" + carga + '\'' +
                ", velocidadCentrifugado=" + velocidadCentrifugado + "rpm" +
                ", secadoras=" + secadoras +
                '}';
    }
}
