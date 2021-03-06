/*----------------------------------------------------------------------
 *  NOMBRE: Actor.java 
 *  POR: Daniel Ramirez Martinez
 *  EMAIL: danielramirezz123@gmail.com
 *  FECHA: Thu Oct 13 2011
 *  
 *  DESCRIPCION: clase para un elemento dinamico.
 *----------------------------------------------------------------------
 */

import java.awt.Graphics2D;

abstract class Actor extends MapElement {
    public int width;      // ancho del actor en px.
    public int height;     // alto del acto en px.
    public int direction;  // direccion del actor.
    public int speed;      // velocidad del actor.

    /*  propiedades para super.property
     *  player
     *  enemy
     *  dynamic
     *  null
     *  bonus
     */
    

/*=========================  M E T O D O S  =========================*/

    /** Realiza el movimiento del actor */
    /* para frogger, donde el movimiento esta basado en x */
    public void move() {
        if (this.direction == -1) {
            this.x -= speed;
        }
        else {
            this.x += speed;
        }
    }
}
