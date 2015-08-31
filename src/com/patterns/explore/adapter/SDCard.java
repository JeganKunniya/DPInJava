package com.patterns.explore.adapter;

/**
 * Created by 310079932 on 30-Aug-15.
 */
public class SDCard implements MemoryCard {

    private final Dimension sdCardDimension = new Dimension(5, 15);

    @Override
    public String readContents() {
        return "Dummy contents from SDCard!!";
    }

    @Override
    public void writeContents(String content) {
        System.out.println("Redirecting the writtent content to console... " + content);
    }

    @Override
    public int capacity() {
        return 1024 * 1000 * 16;
    }

    @Override
    public MemoryCardType getType() {
        return MemoryCardType.SDCard;
    }

    @Override
    public Dimension getCardDimension() {
        return sdCardDimension;
    }
}
