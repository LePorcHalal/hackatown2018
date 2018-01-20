package com.example.hugo.hackatown;

/**
 * Created by Vincent on 1/20/2018.
 */

public class Event {
    private Enum typeSport;
    private String description;
    private int heureDepart;
    private int heureFin;
    private String nomActivité;
    private double positionX;
    private double positionY;

    public Event(Enum typeSport,String description,int heureDepart,int heureFin,String nomActivité,double positionX,double positionY){
        this.description = description;
        this.typeSport = typeSport;
        this.heureDepart = heureDepart;
        this.heureFin = heureFin;
        this.nomActivité = nomActivité;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public enum Sport {
        HOCKEY,SOCCER,BASKETBALL,VOLLEYBALL,ULTIMATEFRISBEE,FOOTBALL,BADNIMTON,TENIS
    }

    public double getPositionX() {
        return positionX;
    }
    
}
