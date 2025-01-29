package utils;

public class Vector {
    public float x;
    public float y;

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

    public Vector sub(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

    public Vector mul(float scalar) {
        return new Vector(this.x * scalar, this.y * scalar);
    }

    public Vector div(float scalar) {
        return new Vector(this.x / scalar, this.y / scalar);
    }

    public float dot(Vector other) {
        return this.x * other.x + this.y * other.y;
    }

    public float magnitude() {
        return (float) Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Vector normalize() {
        return this.div(this.magnitude());
    }

    public float distance(Vector other) {
        return this.sub(other).magnitude();
    }

    public Vector project(Vector other) {
        return other.mul(this.dot(other) / other.dot(other));
    }

    public Vector reflect(Vector normal) {
        return this.sub(normal.mul(2 * this.dot(normal)));
    }

    public Vector rotate(float angle) {
        float cos = (float) Math.cos(angle);
        float sin = (float) Math.sin(angle);
        return new Vector(this.x * cos - this.y * sin, this.x * sin + this.y * cos);
    }

    public float angle() {
        return (float) Math.atan2(this.y, this.x);
    }

    public Vector copy() {
        return new Vector(this.x, this.y);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
