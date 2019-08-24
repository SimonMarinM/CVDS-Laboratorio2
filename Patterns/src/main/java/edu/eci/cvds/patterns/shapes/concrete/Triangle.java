package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
* Clase triangulo que representa una figura de 3 lados
*/
public class Triangle implements Shape {
    @Override
    public int getNumberOfEdges() {
        return 3;
    }
}
