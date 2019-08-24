package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 *
 * Clase pentagono que representa una figura de 5 lados.
 */
public class Pentagon implements Shape{
    @Override
    public int getNumberOfEdges() {
        return 5;
    }
}
