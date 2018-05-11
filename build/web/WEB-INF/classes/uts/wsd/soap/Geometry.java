/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import uts.wsd.Circle;
import uts.wsd.Rectangle;

/**
 *
 * @author J-Mo
 */
@WebService(serviceName = "Geometry")
public class Geometry {

    @WebMethod
    public Rectangle getRectangleGeometry(double width, double height) {
        return new Rectangle(width, height);
    }
    
    @WebMethod
    public Circle getCircleGeometry(double radius) {
        return new Circle(radius);
    }
}
