package baekjoon.sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PointSort {
    public List<Point> solution(List<Point> point) {
        return point.stream()
                .sorted(Comparator.comparingInt(Point::getX)
                        .thenComparing(Point::getY))
                .collect(Collectors.toList());
    }
}
