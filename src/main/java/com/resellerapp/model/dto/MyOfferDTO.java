package com.resellerapp.model.dto;

import com.resellerapp.model.entity.Offer;
import com.resellerapp.model.enums.ConditionName;


public class MyOfferDTO extends BoughtOffersDTO{
    private ConditionName condition;

    public MyOfferDTO() {
    }
    public MyOfferDTO(Offer offer) {
        super(offer);
        condition = offer.getCondition().getName();
    }

    public ConditionName getCondition() {
        return condition;
    }

    public void setCondition(ConditionName condition) {
        this.condition = condition;
    }
}
