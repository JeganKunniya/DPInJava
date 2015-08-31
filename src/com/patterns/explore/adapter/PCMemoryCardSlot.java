package com.patterns.explore.adapter;

/**
 * Created by 310079932 on 30-Aug-15.
 */
public class PCMemoryCardSlot implements MemoryCardModule {

    private static final Dimension slotDimension = new Dimension(5, 20);

    private MemoryCard memoryCard = null;

    @Override
    public boolean loadCard(MemoryCard memoryCard) throws UnsupportedCardException {
        if (memoryCard == null && slotDimension.getWidth() == memoryCard.getCardDimension().getWidth() &&
            slotDimension.getHeight() == memoryCard.getCardDimension().getHeight())
            this.memoryCard = memoryCard;
        else
            throw new UnsupportedCardException("Dimensions doesn't match");

        return (this.memoryCard != null);
    }

    @Override
    public int getCapacity() throws UnsupportedOperationException {
        return this.memoryCard.capacity();
    }

    @Override
    public int readContents() {
        return 0;
    }

    @Override
    public void unload() throws UnsupportedOperationException {
        if (this.memoryCard != null)
            this.memoryCard = null;
    }
}
