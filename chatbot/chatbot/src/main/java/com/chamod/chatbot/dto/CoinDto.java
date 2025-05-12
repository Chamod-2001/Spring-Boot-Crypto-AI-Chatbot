package com.chamod.chatbot.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CoinDto {

    private String id;
    private String name;
    private String symbol;
    private String image;

    private double currentPrice;
    private double marketCap;
    private double marketCapRank;
    private double totalVolume;
    private double high24h;
    private double low24h;
    private double priceChange24h;
    private double priceChangePercentage24h;
    private double marketCapChange24h;
    private double marketCapChangePercentage24h;
    private double circulatingSupply;
    private double totalSupply;

    private long ath;
    private long authChangePercentage;
    private Date athDate;
    private long altChangePercentage;
    private Date altDate;
    private Date lastUpdated;

}
