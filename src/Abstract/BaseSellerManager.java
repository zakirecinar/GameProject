package Abstract;

import Entities.Customer;
import Entities.Games;

public abstract class BaseSellerManager implements SellerService {
    @Override
    public void sell(Games games, Customer customer) {
        System.out.println(games.getGameName() + " oyunu  " + customer.getFirstName() + " kişisine  "+games.getPrice() +" TL ye satıldı ");
    }
}
