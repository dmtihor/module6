package com.dmtihor.homework2;

import java.util.ArrayList;

/**
 * Created by Adm on 12/22/2015.
 */
public class FlowersBouguet {
    public static void main(String[] args) {
        try {
            ArrayList<Flower> flowers = new ArrayList();
            if (flowers.size() % 2 == 0) {
                throw new NotGoodBouguet();
            }

        } catch (IllegalStateException ilse) {
            System.out.println("IllegalStateException");
        } catch (NotGoodBouguet ngb) {
            System.out.println("Bouquet for funerals !!!");
        }
    }
}
