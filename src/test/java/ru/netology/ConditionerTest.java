package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(26);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        assertEquals(26,conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(26,conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(99);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(11);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10,conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(10,conditioner.getCurrentTemperature());
    }

    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(10);
        conditioner.setCurrentTemperature(11);
        assertEquals(conditioner.getCurrentTemperature(),conditioner.getMaxTemperature());
    }
}