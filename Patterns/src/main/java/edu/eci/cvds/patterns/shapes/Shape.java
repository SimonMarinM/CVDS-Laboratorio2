package edu.eci.cvds.patterns.shapes;

/**
 * Interface para patron factory, figura regular.
 **/
public interface Shape {
    /**
     * metodo encargado de verificar el numero de lados de una figura (shape).
     * @return numero de lados de una figura.
     */
    public int getNumberOfEdges();
}