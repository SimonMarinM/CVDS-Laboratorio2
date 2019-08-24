package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 *
 * Clase Hexagono que representa una figura de 6 lados.
 */
public class Hexagon implements Shape{

    @Override
    public int getNumberOfEdges() {
        return 6;
    }
    
}
