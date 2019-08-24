
package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 *
 * clase cuadrilatero que representa una figura de 4 lados
 */
public class Quadrilateral implements Shape{

    @Override
    public int getNumberOfEdges() {
        return 4;
    }
    
}
