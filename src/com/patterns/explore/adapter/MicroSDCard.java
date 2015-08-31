package com.patterns.explore.adapter;

/**
 * Created by 310079932 on 30-Aug-15.
 */
public class MicroSDCard extends SDCard {

    private final Dimension microSdCardDimension = new Dimension(2, 8);

    @Override
    public String readContents() {
        return "Dummy contents from MicroSDCard";
    }

    @Override
    public int capacity() {
        return 1024 * 1000 * 2;
    }

    @Override
    public MemoryCardType getType() {
        return MemoryCardType.MicroSDCard;
    }

    @Override
    public Dimension getCardDimension() {
        return microSdCardDimension;
    }
}
