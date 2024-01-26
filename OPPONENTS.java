import java.util.Scanner;

public class AryaOpponents {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int consecutiveDays = 0;
        int maxConsecutiveDays = 0;

        for (int i = 0; i < d; i++) {
            String schedule = scanner.next();

            boolean allPresent = true;
            for (int j = 0; j < n; j++) {
                if (schedule.charAt(j) == '0') {
                    allPresent = false;
                    break;
                }
            }

            if (allPresent) {
                consecutiveDays = 0;
            } else {
                consecutiveDays++;
                maxConsecutiveDays = Math.max(maxConsecutiveDays, consecutiveDays);
            }
        }

        System.out.println(maxConsecutiveDays);
    }
}
