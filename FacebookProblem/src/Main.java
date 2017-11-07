public class Main {

    public static void main(String[] args) {
        String[] rep= new String[args.length];

    }

    public static int maximumTemperature(int[] temperatures) {
        int maxTemperature = 0;
        // Write the code to solve the problem below
        if (temperatures.length==0) return -1;
        int firstStep=temperatures[0];
        for (int i=1;i<temperatures.length; i++){
            int curr=temperatures[i];
            if (firstStep>curr){
                int increase=temperatures[i-1] - firstStep;
                if (increase>maxTemperature){
                    maxTemperature = increase;
                }
                firstStep = curr;
            }
        }
        int increase = temperatures[temperatures.length-1] - firstStep;
        if (increase>maxTemperature){
            maxTemperature = increase;
        }
        // Return the maximum temperature for the given set of temperatures
        return maxTemperature;

    }
}
