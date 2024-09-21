// Concrete Factory
package factories;

import interfaces.Top;
import interfaces.Pants;
import interfaces.Shoes;
import products.party.PartyTop;
import products.party.PartyPants;
import products.party.PartyShoes;

public class PartyFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
