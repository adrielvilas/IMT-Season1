
package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

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
    
    final int tileSize = originalTileSize * scale;//48x48 tile
    final int maxScreenCol = 16;//horizontal
    final int maxScreenRow = 12;//vertical
    final int screenWidth = tileSize * maxScreenCol; //768 pixels
    final int screenHeight = tileSize * maxScreenRow; //576 pixels
    
    //FPS
    int FPS = 60;
    
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;//Mantém o jogo rodando até forçar a parada
    
    //set players default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;
    
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
        if(keyH.upPressed == true){
            
            playerY = playerY - playerSpeed;
        }
        else if(keyH.downPressed == true){
            playerY += playerSpeed;
        }
        else if(keyH.leftPressed == true){
            playerX -= playerSpeed;
        }
        else if(keyH.rightPressed == true){
            playerX += playerSpeed;
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
        g2.fillRect(playerX, playerY, tileSize, tileSize);
        g2.dispose();
    }
}
