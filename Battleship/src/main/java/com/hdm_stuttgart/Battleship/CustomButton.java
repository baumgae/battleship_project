package com.hdm_stuttgart.Battleship;

import java.awt.Point;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CustomButton extends Button {
	
	private int type;
	private double width = 30.0;
	private double height = 30.0;

	
	// Map für Cutum
	
	
	public CustomButton(Point p) {
		// TJ: Die x/y-Koordinate würden hier als Parameter Sinn machen. 
		// Das macht dann die Verknüpfung mit der Logik viel einfacher.
		
		// TJ: "type" ist vielleicht ein bisschen einfacher zu verstehen 
		
	
		// TJ: Die while-Schleife braucht ihr hier nicht!
		
		// TJ: Die if-Bedingungen habe ich in unhide() ausgelagert. Das soll ja erst passieren, wenn der Button gedrückt wurde.
		// Deshalb wird immer zuerst Wasser angezeigt

		
		Image imageDecline = new Image(getClass().getResourceAsStream("water.jpg"));
		ImageView imageView = new ImageView(imageDecline);
		imageView.setFitWidth(width);
		imageView.setFitHeight(height);
		this.setGraphic(imageView);
		
	}
	
	public void unhide(int ID){
		
		type = ID;
		
		if (type == 0) {
			// TJ: ich hatte leider nicht eure Bilder zur Hand, deswegen habe ich es ersetzen müssen
			Image imageDecline = new Image(getClass().getResourceAsStream("unicorn.png"));
			// TJ: Wichtig: Hier braucht ihr keinen neuen Button erzeigen. Der CustomButton ist ja schon ein Button auf dem ihr ein Bild setzen wollt.
			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			
		// hier soll dann ein Image geladen werden!
			// Wasserfontäne
		}
		else if (type == 1) {
			Image imageDecline = new Image(getClass().getResourceAsStream("Dolphine.png"));
			
			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			
			// hier soll dann ein Delfin sein
				// Toter Delfin
		}
		else if (type == 2) {
			Image imageDecline = new Image(getClass().getResourceAsStream("Island.png"));
			
			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			
			// hier soll dann eine Insel sein
				// Tschernorbyl Insel + verstrahltes Paarhuferwesen
		}
		else if (type == 3) {
			Image imageDecline = new Image(getClass().getResourceAsStream("LuckyDwarf.png"));
			
			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			
			// hier soll dann eine LuckyDwarf
				// Kaputter LuckyDwarf
		}
		else if(type == 4) {
			Image imageDecline = new Image(getClass().getResourceAsStream("Mine.png"));
			
			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			
			// hier soll dann eine Mine sein
				// Explosion
			
		}
		else {
			// error.log!
		}
	}
}


