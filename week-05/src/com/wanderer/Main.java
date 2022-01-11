package com.wanderer;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ukončí program po vykřížkování
        window.setResizable(false); //nebude se měnit velikost canvasu
        window.setTitle("My 2D wanderer game");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack(); //zobrazí přednastavené rozhraní

        window.setLocationRelativeTo(null); //okno bude vycentrováno doprostřed obrazovky
        window.setVisible(true);

        gamePanel.startGameThread(); //loop game


    }
}
