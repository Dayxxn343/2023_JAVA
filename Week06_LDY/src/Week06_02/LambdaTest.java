package Week06_02;

public class LambdaTest {
	
	public static final ArrayProcessing maxer = array -> {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        double max = array[0];
        for (double num : array) {
            max = Math.max(max, num);
        }
        return max;
    };
	
	public static final ArrayProcessing miner = array -> {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        double min = array[0];
        for (double num : array) {
            min = Math.min(min, num);
        }
        return min;
    };
	
	public static final ArrayProcessing sumer = array -> {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] numbers = { 10, 21, 5, 3 };

        double maxResult = maxer.apply(numbers);
        double minResult = miner.apply(numbers);
        double averageResult = sumer.apply(numbers);

        System.out.println("Max: " + maxResult);
        System.out.println("Min: " + minResult);
        System.out.println("Average: " + averageResult);

	}

}
