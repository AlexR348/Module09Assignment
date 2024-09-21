// Concrete Product Implementation for Professional Variant
package products.professional;

import interfaces.Top;

public class ProfessionalTop implements Top {
    @Override
    public void wear() {
        System.out.println("Wearing a professional top.");
    }
}
