// Concrete Product Implementation for Professional Variant
package products.professional;

import interfaces.Pants;

public class ProfessionalPants implements Pants {
    @Override
    public void wear() {
        System.out.println("Wearing professional pants.");
    }
}
