package com.resellerapp.service;

import com.resellerapp.model.binding.OfferCreateBindingModel;
import com.resellerapp.model.dto.OfferHomeDTO;

import java.util.UUID;

public interface OfferService {

    OfferHomeDTO getOffersForHomePage();

    boolean create(OfferCreateBindingModel offerCreateBindingModel);

    void buy(UUID id);
}
