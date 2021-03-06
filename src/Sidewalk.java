/*----------------------------------------------------------------------
 *  NOMBRE: Sidewalk.java 
 *  POR: Daniel Ramirez Martinez
 *  EMAIL: danielramirezz123@gmail.com
 *  FECHA: Wed Oct 19 2011
 *  
 *  DESCRIPCION: clase para la banqueta
 *----------------------------------------------------------------------
 */

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;


public class Sidewalk extends Section implements ImageObserver {
    private static Image img = 
        new ImageIcon("img/Grass.png").getImage();

    public Sidewalk(int y, int x, int side) {
        this.x = x * side;
        this.y = y * side;
        this.side = side;
        this.property = new String("ghost");
    }



    /*  --M E T O D O S--  */
    public void draw(Graphics2D g2d) {
        g2d.drawImage(Sidewalk.img, this.x, this.y, this);
    }
}