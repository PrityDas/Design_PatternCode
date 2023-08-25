/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QVisitor;

/**
 *
 * @author HP
 */
class Plastic implements ProductCategory{

    @Override
    public String getName() {
       return "Plastic";
    }

    @Override
    public double accept(ProductVisitor visitor) {
        return visitor.visit(this);
    }
    
    
}
