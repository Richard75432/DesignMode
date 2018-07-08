package com.hhp.mediator;

import java.util.Random;

/**
 * Created by Hu on 2017/8/25.
 */
public class Sale extends AbstractColleague{

    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void sellIBMComputer(int number) {
       super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑"+number+"台");
    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑销售情况为："+saleStatus);
        return saleStatus;
    }

    public void offSale() {
        super.mediator.execute("sale.offsell");
    }

}
