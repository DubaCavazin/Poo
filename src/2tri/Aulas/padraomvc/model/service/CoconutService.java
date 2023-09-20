package Aulas.padraomvc.model.service;

import java.util.ArrayList;

import Aulas.padraomvc.model.diagram.Coconut;

public class CoconutService {
    private ArrayList<Coconut> cocos;

    public void insert(Coconut coco) {
        if(coco.getWeight() < 500){
            coco.setGood(false);
            cocos.add(coco);
        }else{
            coco.setGood(true);
            cocos.add(coco);
        }
    }
}
