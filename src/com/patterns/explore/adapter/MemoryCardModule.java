package com.patterns.explore.adapter;

/**
 * Contracts that defines the functions of a <code>MemoryCardModule</code>.
 *
 * @Author Jegan Kunniya
 */
public interface MemoryCardModule {

    /**
     * Loads the memory card into the module.
     * @param memoryCard, card to be loaded into the <code>MemoryCardModule</code>.
     * @return <code>true</code> if successfully loaded, <code>false</code> otherwise.
     */
    public boolean loadCard(MemoryCard memoryCard) throws UnsupportedCardException;

    /**
     * Obtains the capacity of the loaded card.
     *
     * @return storage length of the memory card
     * @throws UnsupportedOperationException
     */
    public int getCapacity() throws UnsupportedOperationException;

    /**
     * Read the contents from the loaded card.
     *
     * @return -1, if no content to read,
     *          0, if read the content successfully
     */
    public int readContents();

    /**
     * Ejects the loaded card from the module.
     *
     * @throws UnsupportedOperationException
     */
    public void unload() throws UnsupportedOperationException;
}
