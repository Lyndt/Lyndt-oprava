package com.wanderer;


import gameProject.entity.Player;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable { //JPanel funguje jako screen hry
    final int originalTileSize = 16;
    final int scale = 3;

    public final int getOriginalTileSize = originalTileSize * scale;
    final int maxScreenColum = 16;
    final int maxScreenRow = 12;
    final int screenWidth = getOriginalTileSize * maxScreenColum;
    final int screenHeight = getOriginalTileSize * maxScreenRow;
    // adding FPS
    int FPS = 60;

    Thread gameThread;
    KeyHandler keyHandler = new KeyHandler();
    Player player = new Player(this, keyHandler);

    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;



    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true); //díky tomuto je schopen GamePalnel obdržet vstup
    }
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }


    @Override
//    public void run() {
//
//        double drawInterval = 1000000000/FPS; // 0.01666sec
//        double nextDrawTime = System.nanoTime() + drawInterval; //pro jeden samotný loop je vytyčen čas 0.01666sec
//
//        while (gameThread != null) {
//
//            long currentTime = System.nanoTime(); // 1 000 000 000 nanosec = 1 sec (possible to use System.currentTimeMillis(); but nano is more precise for this
////            System.out.println("current Time :" + currentTime);  //test timing
//
////            System.out.println("The game is running");
//            update();
//
//            repaint();
//
//            try {
//                double remainingTime = nextDrawTime - System.nanoTime();
//                remainingTime = remainingTime/1000000; //musím převést nanosekundy na milisekundy k vůli sleep
//
//                if (remainingTime < 0){
//                    remainingTime = 0;
//                }
//
//                Thread.sleep((long) remainingTime);
//
//                nextDrawTime += drawInterval;
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while (gameThread != null) {

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
                drawCount++;
            }
            if (timer >= 1000000000) {
                System.out.println("FPS: " + drawCount);
//                System.out.println("Game is still running");
                drawCount = 0;
                timer = 0;
            }

//            update();
//            repaint();
        }
    }
    public void update() {
        player.update();

    }
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        Graphics2D graphics2D = (Graphics2D) graphics;
        player.draw(graphics2D);
        graphics2D.dispose();
    }
}
