package com.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.JsonParser;

/**
 * Intermediate value node used for numeric nodes.
 */
public abstract class NumericNode
    extends ValueNode
{
    protected NumericNode() { }

    @Override
    public final boolean isNumber() { return true; }

    // // // Let's re-abstract so sub-classes handle them

    @Override
    public abstract JsonParser.NumberType numberType();

    @Override public abstract Number numberValue();
    @Override public abstract int intValue();
    @Override public abstract long longValue();
    @Override public abstract double doubleValue();
    @Override public abstract BigDecimal decimalValue();
    @Override public abstract BigInteger bigIntegerValue();

    @Override public abstract boolean canConvertToInt();
    @Override public abstract boolean canConvertToLong();
    
    /* 
    /**********************************************************
    /* General type coercions
    /**********************************************************
     */
    
    @Override
    public abstract String asText();

    @Override
    public int asInt() {
        return intValue();
    }
    @Override
    public int asInt(int defaultValue) {
        return intValue();
    }

    @Override
    public long asLong() {
        return longValue();
    }
    @Override
    public long asLong(long defaultValue) {
        return longValue();
    }
    
    @Override
    public double asDouble() {
        return doubleValue();
    }
    @Override
    public double asDouble(double defaultValue) {
        return doubleValue();
    }
}