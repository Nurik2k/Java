package model;

import java.util.ArrayList;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vector sum(Vector v) {
        return new Vector(x + v.getX(), y + v.getY(), z + v.getZ());
    }

    public Vector subtract(Vector v) {
        return new Vector(x - v.getX(), y - v.getY(), z - v.getZ());
    }

    public Vector multiply(Vector vector) {
        return new Vector(y * vector.getZ() - z * vector.getY(), z * vector.getX() - x * vector.getZ(), x * vector.getY() - y * vector.getX());
    }

    public Vector divide(Vector v) {
        return new Vector(x / v.getX(), y / v.getY(), z / v.getZ());
    }

    public ArrayList<Vector> getRandomVectors(int n) {
        ArrayList<Vector> vectors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vectors.add(new Vector((int)Math.random() * 100, (int)Math.random() * 100, (int)Math.random() * 100));
        }
        return vectors;
    }

    public double getSqrt(Vector v) {
        return Math.sqrt(v.getX() * v.getX() + v.getY() * v.getY() + v.getZ() * v.getZ());
    }

    public double getDistance(Vector v) {
        return Math.sqrt(Math.pow(v.getX() - x, 2) + Math.pow(v.getY() - y, 2) + Math.pow(v.getZ() - z, 2));
    }
    public int getAngle(Vector vector) {
        return (int) Math.toDegrees(Math.atan2(vector.getY(), vector.getX()));
    }

    public double getScalarProduct(Vector vector) {
        return x * vector.getX() + y * vector.getY() + z * vector.getZ();
    }

    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
