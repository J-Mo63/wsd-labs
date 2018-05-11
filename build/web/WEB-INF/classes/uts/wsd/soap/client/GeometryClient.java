/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap.client;

/**
 *
 * @author J-Mo
 */
public class GeometryClient {
    public static void main(String[] args) {
        Geometry_Service locator = new Geometry_Service();
        Geometry geometry = locator.getGeometryPort();
        
        Rectangle rect = geometry.getRectangleGeometry(4.0, 5.0);
        Circle circ = geometry.getCircleGeometry(4);
        
        System.out.println("Circle radius is " + circ.getRadius());
        System.out.println("Circle area is " + circ.getArea());
        System.out.println("Circle diameter is " + circ.getDiameter());
        System.out.println("Circle circumference is " + circ.getCircumference());
        
        System.out.println("Rectangle width is " + rect.getWidth());
        System.out.println("Rectangle height is " + rect.getHeight());
        System.out.println("Rectangle area is " + rect.getArea());
        System.out.println("Rectangle perimeter is " + rect.getPerimeter());
    }
}
