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
 * With the constructor {@link #CustomButton(Point p, int ID)} creates a single
 * CustomButton with an image for water, which hasn't been shot by now. He
 * receives a Point as parameter for knowing where to set one as well as the ID
 * for the item below. He holds actually two images for one not shot and one
 * shot button. <br>
 * The method {@link #unhide()} the button with which the Item bellow will be
 * revealed. So this method reveals the image below depending on the ID.
 * 
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class CustomButton extends Button {

	private int type;
	private double width = 30.0;
	private double height = 30.0;
	private Point position;

	private static final Logger logger = LogManager.getLogger(CustomButton.class);

	/**
	 * Constructor for creating a Button and therefore a coordinate on the
	 * GameArea
	 * 
	 * @param p
	 * @param ID
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

	/**
	 * Method for revealing the image below through set ID
	 */
	public void unhide() {

		int type = this.type;

		if (type == 0) {

			Image imageDecline = new Image(getClass().getResourceAsStream("ShotWater.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			GameManager.getInstance().setScore(0);

		} else if (type == 1) {
			Image imageDecline = new Image(getClass().getResourceAsStream("Dolphine.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			GameManager.getInstance().setScore(-50);

		} else if (type == 2) {
			Image imageDecline = new Image(getClass().getResourceAsStream("Island.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			GameManager.getInstance().setScore(-100);

		} else if (type == 3) {
			Image imageDecline = new Image(getClass().getResourceAsStream("LuckyDwarf.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			GameManager.getInstance().setScore(200);

		} else if (type == 4) {
			Image imageDecline = new Image(getClass().getResourceAsStream("Mine.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			GameManager.getInstance().setScore(Integer.MIN_VALUE);

		} else if (type == 5) {

			Image imageDecline = new Image(getClass().getResourceAsStream("OneFieldBoat.png"));

			ImageView imageView = new ImageView(imageDecline);
			imageView.setFitWidth(width);
			imageView.setFitHeight(height);
			this.setGraphic(imageView);
			GameManager.getInstance().setScore(128);

		} else {
			logger.error("No image has been found!");
		}
	}
}
