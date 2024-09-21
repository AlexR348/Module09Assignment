// Concrete Product Implementation for Casual Variant
package products.casual;

import interfaces.Pants;

public class CasualPants implements Pants {
    @Override
    public void wear() {
        System.out.println("Wearing casual pants.");
    }
}
