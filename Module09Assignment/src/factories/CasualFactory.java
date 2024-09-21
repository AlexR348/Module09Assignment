// Concrete Factory
package factories;

import interfaces.Top;
import interfaces.Pants;
import interfaces.Shoes;
import products.casual.CasualTop;
import products.casual.CasualPants;
import products.casual.CasualShoes;

public class CasualFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
