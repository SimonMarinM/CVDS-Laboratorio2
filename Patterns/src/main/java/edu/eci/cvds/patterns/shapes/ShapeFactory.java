
package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;
/**
 * Clase fabrica, creadora de objetos de tipo Shape.
**/

public class ShapeFactory {
    /**
     * Método que crea figuras dado un tipo de figura.
     * @param type Tipo de figura que se desea crear (ver enum RegularShapeType).
     * @return Shape: figura de n lados.
     */
    public static Shape create(RegularShapeType type){
       Shape figura;  
        switch(type){
            case Triangle:
                figura = new Triangle();
                break;
            case Quadrilateral:
                figura = new Quadrilateral();
                break;
            case Pentagon:
                figura = new Pentagon();
                break;
            case Hexagon:
                figura = new Hexagon();
                break;
            default:
                figura = null;
        }
        return figura;             
    } 
}
