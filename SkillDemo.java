public class SkillDemo{
    public static double mean(double[] numbers) {
        double mean = 0;
        double sum = 0;
        double size = numbers.length;
        for (int i = 0; i < size; i++) {
            sum = sum + numbers[i];
        }
        mean = sum/size;
        return mean;
    }
}
