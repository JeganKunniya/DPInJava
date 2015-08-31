package com.patterns.explore.adapter;

/**
 * Contract definition for the various types of memory card.
 *
 * @Author Jegan Kunniya
 */
public interface MemoryCard {
    /**
     * Read all contents from memory card.
     *
     * @return complete memory content as <code>string</code>.
     */
    public String readContents();

    /**
     * Writes the given content into the <code>MemoryCard</code>.
     */
    public void writeContents(String content);

    /**
     * Indicates if the card has space for more content.
     *
     * @return <code>true</code> if card has space, <code>false</code> otherwise.
     */
    public int capacity();

    /**
     * Obtains the type of <code>MemoryCard</code>.
     *
     * @return <code>MemoryCardType</code>.
     */
    public MemoryCardType getType();

    /**
     * Obtains the dimension of the card.
     * @return <code>Dimension</code>.
     */
    public Dimension getCardDimension();
}
