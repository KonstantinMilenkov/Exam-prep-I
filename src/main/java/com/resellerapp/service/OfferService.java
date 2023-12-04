package com.resellerapp.service;

import com.resellerapp.model.OfferCreateBindingModel;
import com.resellerapp.model.dto.OfferHomeDTO;

public interface OfferService {

    OfferHomeDTO getOffersForHomePage();

    boolean create(OfferCreateBindingModel offerCreateBindingModel);
}
