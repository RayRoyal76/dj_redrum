package com.rayvonscott.djredrum.Models;


import java.util.List;


public class Music {

    private Long id;
    private List<Data> snippet;
    private List<Data> items;

    public List<Data> getItems() {
        return items;
    }

    public void setItems(List<Data> items) {
        this.items = items;
    }


}
