// Concrete Product Implementation for Professional Variant
package products.professional;

import interfaces.Shoes;

public class ProfessionalShoes implements Shoes {
    @Override
    public void wear() {
        System.out.println("Wearing professional shoes.");
    }
}
