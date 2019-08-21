# CVDS-Laboratorio2
Laboratorio desarrollado por **Alejandro Bohórquez** y **Simón Marín**
## COMANDOS

*Ejecutar App.java*

       mvn exec:java -Dexec.mainClass="edu.eci.cvds.App" -Dexec.args="Juanor Mejia"
 
*Ejecutar ShapeMain.java*

       mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.shapes.ShapeMain" -Dexec.args="Triangle"
       
       
## PRUEBAS

* Sin parámetros

        Parameter of type RegularShapeType is required.
        
* Parámetro: qwerty

        Parameter 'qwerty' is not a valid RegularShapeType
       
* Parámetro: pentagon

        Successfully created a Pentagon with 5 sides.
        
* Parámetro Hexagon

       Successfully created a Hexagon with 6 sides.
        
