package com.patterns.explore.adapter;

/**
 * Created by 310079932 on 30-Aug-15.
 */
public class MiniSDCard extends SDCard {
    private final Dimension miniSdCardDimension = new Dimension(4, 12);

    @Override
    public String readContents() {
        return "Dummy contents from MiniSDCard";
    }

    @Override
    public int capacity() {
        return 1024 * 1000 * 4;
    }

    @Override
    public MemoryCardType getType() {
        return MemoryCardType.MiniSDCard;
    }

    @Override
    public Dimension getCardDimension() {
        return miniSdCardDimension;
    }
}
