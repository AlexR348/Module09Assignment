// Abstract Factory Interface
package factories;

import interfaces.Top;
import interfaces.Pants;
import interfaces.Shoes;

public interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}
