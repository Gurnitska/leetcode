package quiz.gpccompany;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForkJoinSolutionTest {
    @Test
    public void test1(){
        List<Integer> list = List.of(200,500, 400, 454, 658, 23568, 1245, 23658, 1258, 4875,2365,789, 5696, 1646,466, 12, 7484,
                1674, 796456, 124, 788, 1245, 23658, 1258, 4875,2365,789, 5696, 1646,466, 12, 7484,
                1674, 796456, 124, 788, 1245, 23658, 1258, 4875,2365,789, 5696, 1646,466, 12, 7484,
                1674, 796456, 124, 788, 1245, 23658, 1258, 4875,2365,789, 5696, 1646,466, 12, 7484,
                1674, 796456, 124, 788, 1245, 23658, 1258, 4875,2365,789, 5696, 1646,466, 12, 7484,
                1674, 796456, 124, 788, 1245, 23658, 1258, 4875,2365,789, 5696, 1646,466, 12, 7484,
                1674, 796456, 124, 788, 1245, 23658, 1258, 4875,2365,789, 5696, 1646,466, 12, 7484,
                1674, 796456, 124, 788, 1245, 23658, 1258, 4875,2365,789, 5696, 1646,466, 12, 7484);
        ForkJoinSolution forkJoinSolution = new ForkJoinSolution();
        List<Long> result = forkJoinSolution.calculate(list).stream().sorted().toList();

        List<Long> expected = Stream.of(465L, 1092L, 961L, 684L, 1152L, 61008L, 2016L, 47328L, 2052L, 8736L, 3168L,
                1056L, 11430L, 2472L, 702L, 28L, 13104L, 3840L, 1545300L, 224L, 1386L, 2016L, 47328L, 2052L, 8736L, 3168L,
                1056L, 11430L, 2472L, 702L, 28L, 13104L, 3840L, 1545300L, 224L, 1386L, 2016L, 47328L, 2052L, 8736L, 3168L,
                1056L, 11430L, 2472L, 702L, 28L, 13104L, 3840L, 1545300L, 224L, 1386L, 2016L, 47328L, 2052L, 8736L, 3168L,
                1056L, 11430L, 2472L, 702L, 28L, 13104L, 3840L, 1545300L, 224L, 1386L, 2016L, 47328L, 2052L, 8736L, 3168L,
                1056L, 11430L, 2472L, 702L, 28L, 13104L, 3840L, 1545300L, 224L, 1386L, 2016L, 47328L, 2052L, 8736L, 3168L,
                1056L, 11430L, 2472L, 702L, 28L, 13104L, 3840L, 1545300L, 224L, 1386L, 2016L, 47328L, 2052L, 8736L, 3168L,
                1056L, 11430L, 2472L, 702L, 28L, 13104L, 3840L, 1545300L, 224L, 1386L, 2016L, 47328L, 2052L, 8736L, 3168L,
                1056L, 11430L, 2472L, 702L, 28L, 13104L).sorted().toList();


        assertEquals(expected, result);
    }

}