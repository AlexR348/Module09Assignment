// Concrete Product Implementation for Casual Variant
package products.casual;

import interfaces.Top;

public class CasualTop implements Top {
    @Override
    public void wear() {
        System.out.println("Wearing a casual top.");
    }
}
