package Concreate;

import Abstract.BaseCampaignManager;
import Adapters.SalesServiceAdapters;
import Entities.Customer;
import Entities.Games;

public class CampainingManager extends BaseCampaignManager {
    SalesServiceAdapters salesServiceAdapters;

    public CampainingManager(SalesServiceAdapters salesServiceAdapters) {
        this.salesServiceAdapters = salesServiceAdapters;
    }

    @Override
    public void campaignAdd(Games games, Customer customer) {
        super.campaignAdd(games, customer);
    }

    @Override
    public void campaignUpdate(Games games, Customer customer) {
        games.setPrice((int)this.salesServiceAdapters.discountedPrice(games));
        super.campaignUpdate(games, customer);
    }

    @Override
    public void campaignDelete(Games games, Customer customer) {
        super.campaignDelete(games, customer);
    }

}
