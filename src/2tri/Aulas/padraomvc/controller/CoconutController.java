package Aulas.padraomvc.controller;
import Aulas.padraomvc.model.diagram.Coconut;
import Aulas.padraomvc.model.service.CoconutService;

public class CoconutController {
    private CoconutService service;

    public CoconutController() {
        service = new CoconutService();
    }

    public void insert(Coconut coco) {
        service.insert(coco);
    }
}
