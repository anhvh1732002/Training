package javabasic;

import java.util.Random;

public class JavaTypes {
    private byte byteType;
    private char charType;
    private boolean boolType;
    private short shortType;
    private int intType;
    private long longType;
    private float floatType;
    private double doubleType;

    public JavaTypes(){
        Random random = new Random();
        this.byteType = (byte) random.nextInt(Byte.MAX_VALUE + 1);
        this.charType = (char) (random.nextInt(Character.MAX_VALUE + 1));
        this.boolType = random.nextBoolean();
        this.shortType = (short) random.nextInt(Short.MAX_VALUE + 1);
        this.intType = random.nextInt();
        this.longType = random.nextLong();
        this.floatType = random.nextFloat();
        this.doubleType = random.nextDouble();
    }

    public byte getByteType() {
        return byteType;
    }

    public void setByteType(byte byteType) {
        this.byteType = byteType;
    }

    public char getCharType() {
        return charType;
    }

    public void setCharType(char charType) {
        this.charType = charType;
    }

    public boolean isBoolType() {
        return boolType;
    }

    public void setBoolType(boolean boolType) {
        this.boolType = boolType;
    }

    public short getShortType() {
        return shortType;
    }

    public void setShortType(short shortType) {
        this.shortType = shortType;
    }

    public int getIntType() {
        return intType;
    }

    public void setIntType(int intType) {
        this.intType = intType;
    }

    public long getLongType() {
        return longType;
    }

    public void setLongType(long longType) {
        this.longType = longType;
    }

    public float getFloatType() {
        return floatType;
    }

    public void setFloatType(float floatType) {
        this.floatType = floatType;
    }

    public double getDoubleType() {
        return doubleType;
    }

    public void setDoubleType(double doubleType) {
        this.doubleType = doubleType;
    }

    public static void main(String[] args) {
        JavaTypes javaTypes = new JavaTypes();
        System.out.println("Byte Type: " + javaTypes.getByteType());
        System.out.println("Char Type: " + javaTypes.getCharType());
        System.out.println("Boolean Type: " + javaTypes.isBoolType());
        System.out.println("Short Type: " + javaTypes.getShortType());
        System.out.println("Int Type: " + javaTypes.getIntType());
        System.out.println("Long Type: " + javaTypes.getLongType());
        System.out.println("Float Type: " + javaTypes.getFloatType());
        System.out.println("Double Type: " + javaTypes.getDoubleType());
    }
}
