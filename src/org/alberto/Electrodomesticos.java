package org.alberto;

/**
 * Created by Alberto on 30/03/2017.
 */
public class Electrodomesticos {

    //Atributos
    private final int LIMITE_PESO_1 = 20;
    private final int LIMITE_PESO_2 = 50;
    private final int LIMITE_PESO_3 = 80;
    private final int PRECIO_PESO_1 = 10;
    private final int PRECIO_PESO_2 = 50;
    private final int PRECIO_PESO_3 = 80;
    private final int PRECIO_PESO_4 = 100;

    protected String marca;
    protected String modelo;
    protected double precioBase;
    protected String consumoEnergetico;
    protected double altura;
    protected double anchura;
    protected double peso;

    /**
     * Constructor por defecto sin parametros.
     */
    public Electrodomesticos() {
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
     */
    public Electrodomesticos(String marca, String modelo, double percioBase, String consumoEnergetico, double altura, double anchura, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = percioBase;
        this.consumoEnergetico = consumoEnergetico;
        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
    }

    //Setter and Getter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * Setter que checkea que no se meta un precio base negativo.
     * @param precioBase
     */
    public void setPrecioBase(double precioBase) {
        if (precioBase<0){
            System.out.println("Has introducido un precio negativo");
            this.precioBase=0;
        }else{
            this.precioBase = precioBase;
        }

    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }


    /**
     * Setter que checkea que no se meta un consumo energetico diferente a A,B,C,D,E,F.
     * @param consumoEnergetico
     */
    public void setConsumoEnergetico(String consumoEnergetico) {
        if (consumoEnergetico == "A"){
            this.consumoEnergetico = consumoEnergetico;
        }else if (consumoEnergetico == "B"){
            this.consumoEnergetico = consumoEnergetico;
        }else if (consumoEnergetico == "C"){
            this.consumoEnergetico = consumoEnergetico;
        }else if (consumoEnergetico == "D"){
            this.consumoEnergetico = consumoEnergetico;
        }else if (consumoEnergetico == "E"){
            this.consumoEnergetico = consumoEnergetico;
        }else if (consumoEnergetico == "F"){
            this.consumoEnergetico = consumoEnergetico;
        }else{
            System.out.println("El tipo de Consumo Energetico no es valido. Pruebe con caracteres entre A y F(En mayusculas");
            this.consumoEnergetico="No valido";
        }

    }

    public double getAltura() {
        return altura;
    }

    /**
     * Setter que checkea que no se meta una altura negativa.
     * @param altura
     */
    public void setAltura(double altura) {
        if (altura<0){
            System.out.println("Has introducido una altura negativa");
            this.altura=0;
        }else{
            this.altura = altura;
        }
    }

    public double getAnchura() {
        return anchura;
    }

    /**
     * Setter que checkea que no se meta una anchura negativa.
     * @param anchura
     */
    public void setAnchura(double anchura) {
        if (anchura<0){
            System.out.println("Has introducido una anchura negativa");
            this.anchura=0;
        }else{
            this.anchura = anchura;
        }

    }

    public double getPeso() {
        return peso;
    }

    /**
     * Setter que checkea que no se meta un peso negativo.
     * @param peso
     */
    public void setPeso(double peso) {
        if (peso<0){
            System.out.println("Has introducido un peso negativo");
            this.peso=0;
        }else{
            this.peso = peso;
        }
    }


    /**
     * Metodo que calcula el precioBruto y el precio Transporte y los suma para calcular el pvp.
     * @return
     */
    public double calcularPrecios(){
        double precioTransporte = 0, precioBruto = 0;
        double pvp = 0;
        double precioL = 0, precioT = 0;

        if (consumoEnergetico == "A"){
            precioL = 100;
        }else if (consumoEnergetico == "B"){
            precioL = 80;
        }else if (consumoEnergetico == "C"){
            precioL = 60;
        }else if (consumoEnergetico == "D"){
            precioL = 50;
        }else if (consumoEnergetico == "E"){
            precioL = 30;
        }else if (consumoEnergetico == "F"){
            precioL = 10;
        }

        precioBruto = precioBase + precioL;

        //Con esto calculamos el precioTransporte
        if (peso < LIMITE_PESO_1){
            precioT = PRECIO_PESO_1;
        }else if (peso < LIMITE_PESO_2 && peso > LIMITE_PESO_1){
            precioT = PRECIO_PESO_2;
        }else if (peso < LIMITE_PESO_3 && peso > LIMITE_PESO_2){
            precioT = PRECIO_PESO_3;
        }else if (peso > LIMITE_PESO_3){
            precioT = PRECIO_PESO_4;
        }
        precioTransporte = precioT;

        pvp = precioBruto + precioTransporte;

        return pvp;
    }

    /**
     * Metodo que calcula un conjunto de lavadoras.
     * @param conjuntoLavadoras
     * @return
     */
    public double ingresoTotalLavadoras(double...conjuntoLavadoras){
        double ingresoLavadora = 0;

        for (double num :conjuntoLavadoras) {
            ingresoLavadora = num*calcularPrecios();
        }

        return ingresoLavadora;
    }

    /**
     * Metodo que calcula un conjunto de frigorificos
     * @param conjuntoFrigorificos
     * @return
     */
    public double ingresoTotalFrigorifico(double...conjuntoFrigorificos){
        double ingresoFrigorifico = 0;

        for (double num :conjuntoFrigorificos) {
            ingresoFrigorifico = num*calcularPrecios();
        }

        return ingresoFrigorifico;
    }


    @Override
    /**
     *Metodo que imprime el estado del objeto.
     */
    public String toString() {
        return "Electrodomesticos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                ", consumoEnergetico=" + getConsumoEnergetico() +
                ", altura=" + altura + "metros" +
                ", anchura=" + anchura + "metros" +
                ", peso=" + peso + "Kg" +
                '}';
    }
}
