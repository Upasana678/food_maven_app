package com.foodcompany.general;

public class AreaCalculator {

    public Double calculateAreaOfCircle(Double radius)
    {
        Double area = 3.14 * radius * radius;
        return area;
    }

    public Integer calculateAreaOfSquare(Integer side)
    {
        Integer area = side * side;
        return area;
    }

    public Integer  calculateAreaOfRectangle(Integer length, Integer breadth)
    {
        Integer area = length * breadth;
        return area;
    }
}
