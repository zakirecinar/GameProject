package Adapters;

import Abstract.SellerDiscountService;
import Entities.Games;

public class SalesServiceAdapters implements SellerDiscountService {
    @Override
    public double discountedPrice(Games games) {
        return games.getPrice() - (games.getPrice() * games.getDiscount()) / 100;
    }
}
