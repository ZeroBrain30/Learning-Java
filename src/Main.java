//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d,};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d,};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];
        for(int i = 0; i < opCodes.length; i++) {
           results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);

        }
        for(double res: results)
            System.out.println(res);

    }
   static double execute(char opCode, double leftVal, double rightVal) {
       double results;
       switch (opCode) {
           case 'a':
               results = leftVal + rightVal;
               break;
           case 's':
               results = leftVal - rightVal;
               break;
           case 'm':
               results = leftVal * rightVal;
               break;
           case 'd':
               results = rightVal != 0 ? leftVal / rightVal : 0.0d;
               break;
           default:
               System.out.println("Invalid opCodes: " + opCode);
               results = 0.0d;
               break;


       }
       return results;
   }
}