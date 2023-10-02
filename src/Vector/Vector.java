package Vector;

public class Vector {
    private Integer x;
    private Integer y;
    private Integer z;

    public Vector(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return result
     * @apiNote vector length
     */
    public Double lenVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param two second vector
     * @return result
     * @apiNote scalar multiplication
     */
    public Integer scalar(Vector two) {
        return x * two.getX() + y * two.getY() + z * two.getZ();
    }

    /**
     * @apiNote product two vectors
     * @param two second vector
     * @return result
     */
    public Vector multipl(Vector two) {
        return new Vector(
                y * two.getZ() - z * two.getY(),
                z * two.getX() - x * two.getZ(),
                x * two.getY() - y * two.getX());
    }

    /**
     * @apiNote angel between vectors
     * @param two second vector
     * @return result
     */
    public Double cosin(Vector two) {
        return this.scalar(two)/(lenVector()* two.lenVector());
    }
}
