/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpaladin.study.spring.bean;

/**
 *
 * @author cpaladin
 */
public class DefaultServiceLocator {

    private static ClientService clientService = new ClientService();

    private DefaultServiceLocator() {
    }

    public ClientService createClientServiceInstance() {
        return clientService;
    }
}