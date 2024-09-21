// Concrete Factory
package factories;

import interfaces.Top;
import interfaces.Pants;
import interfaces.Shoes;
import products.professional.ProfessionalTop;
import products.professional.ProfessionalPants;
import products.professional.ProfessionalShoes;

public class ProfessionalFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
