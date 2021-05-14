package Concreate;

import Abstract.BaseSellerManager;
import Adapters.SalesServiceAdapters;
import Entities.Customer;
import Entities.Games;

public class SellerCustomerManager extends BaseSellerManager {
    SalesServiceAdapters salesServiceAdapters;

    public SellerCustomerManager(SalesServiceAdapters salesServiceAdapters) {
        this.salesServiceAdapters = salesServiceAdapters;
    }

    @Override
    public void sell(Games games, Customer customer) {
        games.setPrice((int)this.salesServiceAdapters.discountedPrice(games));
        super.sell(games, customer);
    }
}
