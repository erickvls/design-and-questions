package com.examples.self.learning.design.patterns.structural.adapter;

public class GermanToUKPlugConnectorAdapter implements UKPlugConnector{

    private GermanPlugConnector germanPlugConnector;

    public GermanToUKPlugConnectorAdapter(GermanPlugConnector germanPlugConnector){
        this.germanPlugConnector = germanPlugConnector;
    }
    @Override
    public void provideElectricity() {
        germanPlugConnector.giveElectricity();
    }
}
