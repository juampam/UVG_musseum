package Musseum;
import java.util.Arraylist;
public class Controller{
/*
	Dino dinosaur = new Dino()
	Plant plant = new Plant()
	Mammal prehmamm = new Mammal()
*/
	ArrayList<Dino> dinosaurs = new ArrayList;
	ArrayList<Plant> plants = new ArrayList;
	ArrayList<Mammal> mammals = new ArrayList;
	
	public void createSpecimen(selector){
	/*	int selector;
		System.out.Println("New Specimen\nPlease select a type");
		System.out.Println("\n1. Dinosaur\n2. Plant\n3. Mammal");
	*/
		switch(selector){
			case 1:
				dinosaurs.add(new Dinosaur("T-rex","Jurassic","Carnivoorus","Peru");
			break;
			case 2:
				plants.add(new Plant("T-rex","Jurassic","Carnivoorus","Peru");
			break;
			case 3:
				mammals.add(new Mammal("T-rex","Jurassic","Carnivoorus","Peru");
			break;
		}
	}
}
