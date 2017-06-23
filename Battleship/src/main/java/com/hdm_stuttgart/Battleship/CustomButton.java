package com.hdm_stuttgart.Battleship;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * CustomButton
 * <p>
 * The CustomButton is a Button for creating the GameArea which contains a grid
 * made of these buttons.
 * 
 * <p>
 * 
 * With the constructor {@link #CustomButton} creates a single CustomButton with
 * an image for water, which hasn't been shot by now. He receives a Point as
 * parameter for knowing where to set one. He holds actually two images for one
 * not shot and one shot button.
 * 
 * The method {@link #unhide(int)} the button with which the Item bellow will be
 * revealed. So this method receives a parameter for the ID of the item bellow,
 * and reveals the image for it.
 * 
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 0.1
 */

public class CustomButton extends Button {

	private int type;
	private double width = 30.0;
	private double height = 30.0;
	private Point position;

	private static final Logger logger = LogManager.getLogger(CustomButton.class);

	/*
	 * Constructor CustomButton for creating a Button with two images.
	 */
	public CustomButton(Point p, int ID) {
		position = p;
		type = ID;

		Image imageDecline = new Image(getClass().getResourceAsStream("water.jpg"));
		ImageView imageView = new ImageView(imageDecline);
		imageView.setFitWidth(width);
		imageView.setFitHeight(height);
		this.setGraphic(imageView);

	}

	/*
	 * Method unhide(int ID) for revealing the item bellow.
	 */
	public void unhide() {

		// shotOnCoordinate übergibt hier ID
		// Also diese Methode so schreiben, dass sie einen int Wert zurückgibt.
		// Beispielsweise
		// int ID = GameArea.shotOncoordiante();
		// ID = type;
		GameManager.getInstance().shootOnCoordinate(1, position);

		if (type == 0) {

			Image imageDecline = new Image(getClass().getResourceAsStream("ShotWater.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);

		} else if (type == 1) {
			Image imageDecline = new Image(getClass().getResourceAsStream("Dolphine.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);

		} else if (type == 2) {
			Image imageDecline = new Image(getClass().getResourceAsStream("Island.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);

		} else if (type == 3) {
			Image imageDecline = new Image(getClass().getResourceAsStream("LuckyDwarf.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);

		} else if (type == 4) {
			Image imageDecline = new Image(getClass().getResourceAsStream("Mine.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);

		}
		// TJ: else if für Schiff
		else if (type == 5) {

			Image imageDecline = new Image(getClass().getResourceAsStream("OneFieldBoat.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);

		} else {
			logger.error("No image has been found!");
		}
	}
}
