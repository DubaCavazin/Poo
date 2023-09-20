package Aulas.padraomvc.view;

import java.util.Scanner;

import Aulas.padraomvc.controller.CoconutController;
import Aulas.padraomvc.model.diagram.Coconut;
import Aulas.padraomvc.util.MessageUtil;

public class CoconutView {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        CoconutController controller = new CoconutController();
        
        System.out.println(MessageUtil.INSERT_WEIGHT);
        double weight = tc.nextDouble();

        Coconut coco = new Coconut(true, weight);
        controller.insert(coco);
        
    }
}
