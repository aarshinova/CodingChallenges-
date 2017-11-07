public class Main {

    public static void main(String[] args) {
        String[] rep= new String[args.length];
        rep.
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

String titi;
String s;
s.length()
        char arrA[] = titi.toCharArray();
        char arrB[] = b.toCharArray();
        String[] answer = new String[]{"Yes"};

        for (int i=1; i<arrA.length-1; i++){
            if (arrA[i]!=arrB[i]){
                int j=b.indexOf(arrA[i]);
                if (i%2==0 && i%j==0) continue;
                if(i%2!=0 && i%j!=0) continue;
                else {
                    answer[0] = "No";
                    return answer;
                }
            }
        }
    }
}
