package com.patterns.explore.adapter;

/**
 * Created by 310079932 on 30-Aug-15.
 */
public class PCMemoryCardAdapter implements MemoryCardModule {

    private final Dimension sdCardSlotDimension = new Dimension(5, 15);
    private final Dimension miniSdCardSlotDimension = new Dimension(4, 12);
    private final Dimension microSdCardSlotDimension = new Dimension(2, 8);

    private MemoryCard memoryCard = null;

    @Override
    public boolean loadCard(MemoryCard memoryCard) throws UnsupportedCardException {
        boolean isCardLoaded = false;

        switch (memoryCard.getType()) {
            case SDCard:
                isCardLoaded = loadIntoSDCardSlot(memoryCard);
                break;
            case MicroSDCard:
                isCardLoaded = loadIntoMicroSDCardSlot(memoryCard);
                break;
            case MiniSDCard:
                isCardLoaded = loadIntoMiniSDCardSlot(memoryCard);
                break;
            default:
                throw new UnsupportedCardException();
        }

        return isCardLoaded;
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

    private boolean loadIntoSDCardSlot(MemoryCard sdCard) {
        if (sdCard.getCardDimension().getWidth() == sdCardSlotDimension.getWidth() &&
            sdCard.getCardDimension().getHeight() == sdCardSlotDimension.getHeight())
            this.memoryCard = sdCard;

        return this.memoryCard != null;
    }

    private boolean loadIntoMicroSDCardSlot(MemoryCard microSDCard) {
        if (microSDCard.getCardDimension().getWidth() == microSdCardSlotDimension.getWidth() &&
            microSDCard.getCardDimension().getHeight() == microSdCardSlotDimension.getHeight())
            this.memoryCard = microSDCard;

        return this.memoryCard != null;
    }

    private boolean loadIntoMiniSDCardSlot(MemoryCard miniSDCard) {
        if (miniSDCard.getCardDimension().getWidth() == miniSdCardSlotDimension.getWidth() &&
            miniSDCard.getCardDimension().getHeight() == miniSdCardSlotDimension.getHeight())
            this.memoryCard = miniSDCard;

        return this.memoryCard != null;
    }

}
