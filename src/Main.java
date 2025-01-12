import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        scanner.nextLine();

        int line = 0;
        String reports = "";
        while (line < rows){
            String report = scanner.nextLine().replace(" ", "");

            if (report.isEmpty()){
                break;
            }

            reports += report;
            line++;
        }

        int safeReports = safeReports(reports, columns);
        System.out.println(safeReports);
    }
    public static int safeReports(String reports, int column){
        int result = 0;
        int length = reports.length();
        for (int i = 0;i < length;i += column){

            boolean isSafe = true;
            int direction = 0;
            String currentLine = reports.substring(i, i + column);
            for(int j = 0;j < column - 1;j++){
                int firstNumber = Integer.parseInt("" + currentLine.charAt(j));
                int secondNumber = Integer.parseInt("" + currentLine.charAt(j + 1));

                int difference = firstNumber - secondNumber;

                if (Math.abs(difference) > 3){
                    isSafe = false;
                    break;
                }

                if (difference > 0){
                    direction++;
                } else if (difference < 0) {
                    direction--;
                }else {
                    if (direction >= 0){
                        direction++;
                    }else {
                        direction--;
                    }
                }
            }
            if (isSafe && currentLine.length() - 1 == Math.abs(direction)){
                result++;
            }
        }
        return result;
    }
}
