package com.patterns.explore.adapter;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Assert;

import java.util.List;

/**
 * Created by 310079932 on 30-Aug-15.
 */
public class PCClient extends TestCase {
    private MemoryCardModule myPCMemoryCardModule;

    @Override
    public void setUp() throws Exception {
        myPCMemoryCardModule = new PCMemoryCardSlot();
        List
    }

    public void testSDCardCompatibility() {
        try {
            MemoryCard memoryCard = new SDCard();
            Assert.assertTrue(myPCMemoryCardModule.loadCard(memoryCard));
        } catch (Exception exception) {
            Assert.fail(exception.getMessage());
        }
    }

    public void testMicroSDCardCompatibility() {
        try {
            MemoryCard memoryCard = new MicroSDCard();
            Assert.assertTrue(myPCMemoryCardModule.loadCard(memoryCard));
        } catch (Exception exception) {
            Assert.fail(exception.getMessage());
        }
    }

    public void testMiniSDCardCompatibility() {
        try {
            MemoryCard memoryCard = new MiniSDCard();
            Assert.assertTrue(myPCMemoryCardModule.loadCard(memoryCard));
        } catch (Exception exception) {
            Assert.fail(exception.getMessage());
        }
    }
}
