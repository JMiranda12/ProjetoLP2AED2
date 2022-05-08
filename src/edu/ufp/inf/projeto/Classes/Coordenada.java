package edu.ufp.inf.projeto.Classes;

public class Coordenada {

    private long latitude;
    private long longitude;

    public Coordenada(long longitude, long latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }
    public Coordenada(){

    }


    /**
     * Distancia entre latitudes
     *
     * @param p coordenada
     * @return distancia
     */
    public double distLA(Coordenada p){
        return this.latitude - p.longitude;
    }

    /**
     *Distancia entre longitudes
     *
     * @param p coordenada
     * @return distancia
     */
    public double distLO(Coordenada p){
        return this.longitude - p.longitude;
    }

    /**
     * Distancia entre 2 coordenadas
     *
     * @param x coordenada
     * @param y coordenada
     * @return distancia
     */
    public double dist(Coordenada x, Coordenada y){
        return Math.abs(Math.sqrt((y.latitude-x.latitude)*(y.latitude-x.latitude))+((y.longitude-x.longitude)*(y.longitude-x.longitude)));
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    /**
     * verificar se fica entre latitude
     *
     * @param leftpt ponto à esquerda
     * @param rightpt ponto à direita
     * @return boolean (true/false)
     */
    public boolean latitudeBetweenPoints(Coordenada leftpt, Coordenada rightpt){ // ver se o ponto está entre os dois pontos
        return this.latitude > leftpt.latitude && this.latitude < rightpt.latitude;
    }

    /** verificar se fica entre longitude
     *
     * @param upperpt ponto a cima
     * @param lowerpt ponto a baixo
     * @return boolean
     */
    public boolean longitudeBetweenPoints(Coordenada upperpt, Coordenada lowerpt){
        return this.longitude < upperpt.longitude && this.longitude > lowerpt.longitude;
    }

    @Override
    public String toString(){
        return this.longitude + "/" + this.latitude;
    }
}
