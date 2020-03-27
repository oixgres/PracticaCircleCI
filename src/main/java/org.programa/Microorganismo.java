package org.programa;

public class Microorganismo {
    private int vida;
    private String damage;

    public Microorganismo (int vida, String damage){
        this.vida = vida;
        this.damage = damage;
    }

    public int getVida() {
        return vida;
    }

    public void setVida() {
        vida = vida>>1;
    }

    public boolean isDamage(String organ){
        if(organ.equals(damage))
            return true;
        else
            return false;
    }

    public String estatus(String organo){
        if(vida > 0)
            return "Esta en "+organo;
        else
            return "Esta muerto";
    }

    public boolean isAlive(){
        if(vida>0)
            return true;
        else
            return false;
    }
}
