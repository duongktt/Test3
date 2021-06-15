import java.util.InputMismatchException;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) throws MonthCheckingException {
            System.out.println("Nhập vào số nguyên dương: ");
            try {
                int m = (new Scanner(System.in)).nextInt();
                intMonth check = new intMonth();
                check.CheckMonth(m);
                if (m<1 || 12<m) throw new ArithmeticException("Không phải tháng");
            }catch(InputMismatchException ex1){
                throw new MonthCheckingException("Tháng phải nhập số vào");
            }
        }
    }
    class MonthCheckingException extends Exception {
        public MonthCheckingException(String message) {
            super(message);
        }
        @Override
        public  String getMessage(){
            return "Lỗi nhập vào 1 tháng: " + super.getMessage();
        }
    }

    class intMonth {
        static void CheckMonth(int m) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                System.out.println("Tháng " + m + " có 31 ngày.");
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                System.out.println("Tháng " + m + " có 30 ngày.");
            } else if (m == 2) {
                System.out.println("Tháng " + m + " có 28 hoặc 29 ngày.");
            }
        }
    }
