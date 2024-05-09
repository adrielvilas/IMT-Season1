/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entity.Player;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import tile.TileManager;

/**
 *
 * @author keyex
 */
public class GamePanel extends JPanel implements Runnable {
    //Configurações de tela
    final int originalTileSize = 16;//16x16 tile
    //16 pixels, da para aumentar
    //em certas telas, 16 é bem pouco
    final int scale = 3;
    
    public final int tileSize = originalTileSize * scale;//48x48 tile
    public final int maxScreenCol = 16;//horizontal
    public final int maxScreenRow = 12;//vertical
    public final int screenWidth = tileSize * maxScreenCol; //768 pixels
    public final int screenHeight = tileSize * maxScreenRow; //576 pixels
    
    //FPS
    int FPS = 60;
    
    TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;//Mantém o jogo rodando até forçar a parada
    Player player = new Player(this, keyH);
    
    
    
    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }
    
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        
        double drawInterval = 1000000000/FPS; 
        double nextDrawTime = System.nanoTime() + drawInterval;
        
       //criar um gameLoop
       while(gameThread != null){
           //System.out.println("The game loop is running!");
           
           
           
           //1. Atualizar as informações como uma posição de personagem
           update();
           
           //2. Desenhar a tela com os updates de informção 
           repaint();
           
           
           
           try{
               double remainingTime = nextDrawTime - System.nanoTime();
               remainingTime = remainingTime/1000000;
               
               if(remainingTime < 0){
                   remainingTime = 0;
               }
               
               Thread.sleep((long) remainingTime);
               
               nextDrawTime += drawInterval;
               
           } catch (InterruptedException e){
               e.printStackTrace();
           }
       }
        
        
    }
    public void update(){
        player.update();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        tileM.draw(g2);
        
        player.draw(g2);
        
        g2.dispose();
    }
}
