package com.company;

import Abstract.BaseCampaignManager;
import Abstract.BaseCustomerManager;
import Abstract.BaseSellerManager;
import Adapters.EdevletServiceAdapter;
import Concreate.CampainingManager;
import Concreate.GamerCustomerManager;
import Concreate.SellerCustomerManager;
import Adapters.SalesServiceAdapters;
import Entities.Customer;
import Entities.Gamer;
import Entities.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        BaseCustomerManager baseCustomerManager=new GamerCustomerManager(new EdevletServiceAdapter());
        BaseCampaignManager baseCampaignManager=new CampainingManager(new SalesServiceAdapters());
        BaseSellerManager baseSellerManager=new SellerCustomerManager(new SalesServiceAdapters());
        Gamer gamer=new Gamer("12345698","ab@gmail.com","Ayse","Bal",LocalDate.of(2000,5,8),"12365412365","queen");
        Seller seller=new Seller("12365896","ek@gmail.com","Esra","Kutlu",LocalDate.of(2000,10,30),"12365236545","5");
        Games game1=new Games(2230,"Pubg",30);
        Games game2=new Games(1230,"CS",10);
        baseCustomerManager.add(gamer);
        baseCustomerManager.delete(gamer);
        baseCustomerManager.update(gamer);
        baseSellerManager.sell(game1,gamer);
        baseSellerManager.sell(game2,gamer);
        baseCampaignManager.campaignAdd(game1,seller);
        baseCampaignManager.campaignUpdate(game1,seller);
        baseCampaignManager.campaignDelete(game1,seller);

    }
}
