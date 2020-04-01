package com.androidwave.cleancode.data.network.pojo;

public class Hour {
    private String label;
    private boolean state;

    public Hour(String label, boolean state) {
        this.label = label;
        this.state = state;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
