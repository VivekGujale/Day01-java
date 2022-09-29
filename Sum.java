//find the sum of command-line arguments and count the invalid integers entered.

public class Sum {
    public static void main(String args[]) {
        int n,count = 0, sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                n = Integer.parseInt(args[i]);
                sum = sum + n;
            } catch (NumberFormatException e) {
                System.out.println("Invlid Integer:" + args[i]);
                count++;
            }
        }
        System.out.println("Sum of only valid integers is= " + sum);

        System.out.println("Invalid integers are: " + count);
    }
}

