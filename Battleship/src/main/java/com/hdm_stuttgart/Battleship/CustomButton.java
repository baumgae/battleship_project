package com.hdm_stuttgart.Battleship;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CustomButton extends Button {
	
	
	
	public CustomButton(int ID, boolean hidden) {
	
		
	while (hidden == false)	{
		if (ID == 0) {
			
			Image imageDecline = new Image(getClass().getResourceAsStream("/Desktop/Images_Battleship/Water.png"));
			Button button5 = new Button();
			button5.setGraphic(new ImageView(imageDecline));
			
		// hier soll dann ein Image geladen werden!
			// Wasserfontäne
		}
		else if (ID == 1) {
			Image imageDecline = new Image(getClass().getResourceAsStream("/Desktop/Images_Battleship/Dolphine.png"));
			Button button5 = new Button();
			button5.setGraphic(new ImageView(imageDecline));
			
			// hier soll dann ein Delfin sein
				// Toter Delfin
		}
		else if (ID == 2) {
			Image imageDecline = new Image(getClass().getResourceAsStream("/Desktop/Images_Battleship/Island.png"));
			Button button5 = new Button();
			button5.setGraphic(new ImageView(imageDecline));
			
			// hier soll dann eine Insel sein
				// Tschernorbyl Insel + verstrahltes Paarhuferwesen
		}
		else if (ID == 3) {
			Image imageDecline = new Image(getClass().getResourceAsStream("/Desktop/Images_Battleship/LuckyDwarf.png"));
			Button button5 = new Button();
			button5.setGraphic(new ImageView(imageDecline));
			
			// hier soll dann eine LuckyDwarf
				// Kaputter LuckyDwarf
		}
		else if(ID == 4) {
			Image imageDecline = new Image(getClass().getResourceAsStream("/Desktop/Images_Battleship/Mine.png"));
			Button button5 = new Button();
			button5.setGraphic(new ImageView(imageDecline));
			
			// hier soll dann eine Mine sein
				// Explosion
			
		}
		else {
			// error.log!
		}
	}
	}
}


