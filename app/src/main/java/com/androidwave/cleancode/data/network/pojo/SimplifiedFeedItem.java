package com.androidwave.cleancode.data.network.pojo;

public class SimplifiedFeedItem {
    private String countryName;
    private int totalCases;
    private int deaths;
    private int recovered;
    private String flagLink;

    public SimplifiedFeedItem(String countryName, int totalCases, int deaths, int recovered, String flagLink) {
        this.countryName = countryName;
        this.totalCases = totalCases;
        this.deaths = deaths;
        this.recovered = recovered;
        this.flagLink = flagLink;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public String getFlagLink() {
        return flagLink;
    }

    public void setFlagLink(String flagLink) {
        this.flagLink = flagLink;
    }
}
