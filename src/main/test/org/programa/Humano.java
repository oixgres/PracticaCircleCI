package org.programa;

public class Humano {
    private String [] orgBas;

    public Humano(String [] orgBas){
        this.orgBas = orgBas;
    }

    public String[] getOrgBas() {
        return orgBas;
    }

    public void setOrgBas(String[] orgBas) {
        this.orgBas = orgBas;
    }

    public String getOrgano(int i){
        return orgBas[i];
    }
}
