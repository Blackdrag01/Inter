/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhomaio;
/**
 *
 * @author Alexandre Varizi Ribeiro
 *         wttp://programandoja.wordpress.com
 *         alexandressva@gmail.com
 */
 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class JPanelWithBackground extends JPanel{
 
   private String pathImage = ""; // variável que vai receber o caminho da imagem
 
   // construtor vazio
   public JPanelWithBackground() {
   }
   // método construtor com parâmetro
   public JPanelWithBackground(String pathImage) {
       this.pathImage = pathImage;
   }
 
   // o método abaixo sobrescreve o método de: javax.swing.JComponent
   @Override
   // "Graphics" é a classe base abstrata para todos os contextos de
   // gráficos que permitem um aplicativo desenhar sobre os componentes.
   public void paintComponent(Graphics g) {
 
       // A classe Graphics2D estende a Graphics para fornecer um controle
       // mais sofisticado sobre a geometria, transformação de coordenadas
       // e gerenciamento de cores e layout de textos e imagens.
       Graphics2D gr = ( Graphics2D )g.create();
 
       try {
 
          // O BufferedImage é uma subclasse Image que representa uma imagem carregada na memória.
          // Ela permite que a imagem seja manipulada.
 
          // A Imagem é carregada através da classe ImageIO
 
          BufferedImage buffer = ImageIO.read( new File(pathImage) );
          gr.drawImage(buffer, null, 0, 0 ); // desenha a imagem
 
       } catch (IOException ex) {
          Logger.getLogger(JPanelWithBackground.class.getName()).log(Level.SEVERE, null, ex);
       }
 
   }
}