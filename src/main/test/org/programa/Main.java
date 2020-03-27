package org.programa;

public class Main {
    public static void main(String [] args){
        String [] organos = {"Boca", "Cerebro", "Corazon", "Pulmones", "Higado",  "Intestinos", "Estomago"};

        Humano humano = new Humano(organos);

        Microorganismo[] micro = new Microorganismo[4];

        for(int i = 0; i < micro.length; i++)
            micro[i] = new Microorganismo(256, "Higado");

        viaje(humano, micro);
    }

    public static void viaje(Humano humano, Microorganismo[] micro){
        int flag = 0;
        int [] posicion = new int [micro.length];

        for(int i = 0; i < posicion.length; i++)
            posicion[i] = 0;

        while(flag < 4) {
            flag = 0;

            System.out.println();

            for (int i = 0; i < micro.length; i++) {
                System.out.println("Microorganismo" + i+1 + " esta en "+micro[i].estatus(humano.getOrgano(posicion[i]))+" con "+micro[i].getVida()+" vidas");
                posicion[i] = (int) (Math.random() * 7);

                if(micro[i].getVida() > 0 && micro[i].isDamage(humano.getOrgano(posicion[i])))
                    micro[i].setVida();
                else
                    if(micro[i].getVida() == 0)
                        flag++;
            }

        }
    }
}
