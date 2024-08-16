package quiz.gpccompany;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Stream;

public class ForkJoinSolution {

    public List<Long> calculate(List<Integer> list){
        long startTime = System.currentTimeMillis();
        ValueSumCounter counter = new ValueSumCounter(list);
        ForkJoinPool forkJoinPool = new ForkJoinPool(10);
        List<Long> result =  forkJoinPool.invoke(counter);
        long endTime = System.currentTimeMillis();
        System.out.println("Start time in ms " + startTime);
        System.out.println("End time in ms " + endTime );
        System.out.println("Duration in ms " + (endTime - startTime));
        return result;
    }
}
    class ValueSumCounter extends RecursiveTask<List<Long>> {

        private List<Long> result;
        private List<Integer> list;

        public ValueSumCounter(List<Integer> list) {
            this.list = list;
            result = new ArrayList<>();
        }

        //    @SneakyThrows
        @Override
        protected List<Long> compute() {
            if(list.size() <= 7) {
//            Thread.sleep(1);
                System.out.printf("Task %s execute in thread %s%n", this, Thread.currentThread().getName());
                for(int i = 0; i < list.size(); i ++) {
                    Integer temp = list.get(i);
                    Long currentSum = 0L;
                    for (int j = 1; j <= temp / 2; j++) {
                        if (temp % j == 0) {
                            currentSum = currentSum + j;
                        }
                    }
                    currentSum = currentSum + temp;
                    result.add(currentSum);
                }
                return result;
            }
            ValueSumCounter firstHalfArrayValueSumCounter = new ValueSumCounter(list.subList(0, list.size()/2));
            ValueSumCounter secondHalfArrayValueSumCounter = new ValueSumCounter(list.subList(list.size()/2, list.size()));
            firstHalfArrayValueSumCounter.fork();
            secondHalfArrayValueSumCounter.fork();
            return Stream.concat(firstHalfArrayValueSumCounter.join().stream(),
                    secondHalfArrayValueSumCounter.join().stream())
                    .toList();
        }
    }


