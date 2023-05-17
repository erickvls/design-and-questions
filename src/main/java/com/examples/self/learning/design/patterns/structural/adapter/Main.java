package com.examples.self.learning.design.patterns.structural.adapter;

/**
 * A real world adapter like a power adapter. Different countries sometimes have different electrical sockets.
 * In order to make different electrical sockets work together with a different plugs the use of adapters is necessary.
 */
public class Main {
    public static void main(String[] args) {
        UKElectricalSocket ukElectricalSocket = new UKElectricalSocket();

        GermanPlugConnector germanPlugConnector = () -> System.out.println("Give electricity");

        GermanToUKPlugConnectorAdapter germanToUKPlugConnectorAdapter = new GermanToUKPlugConnectorAdapter(germanPlugConnector);

        ukElectricalSocket.plugIn(germanToUKPlugConnectorAdapter);

    }
}
