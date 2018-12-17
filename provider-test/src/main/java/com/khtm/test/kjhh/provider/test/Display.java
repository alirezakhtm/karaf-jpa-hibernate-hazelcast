package com.khtm.test.kjhh.provider.test;

public class Display {

    private ClientService clientService;

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    public void init() {
        clientService.addUser("foo", "foo last name");
    }
}
