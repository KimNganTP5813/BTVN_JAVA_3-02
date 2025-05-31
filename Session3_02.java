import java.util.Scanner;

public class Session3_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudent = 0;
        int  totalScore = 0;
        float maxScore = Float.MIN_VALUE;
        float minScore = Float.MAX_VALUE;

        do {
            System.out.println("*******MENU NHẬP ĐIỂM********");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển  thị thống kê");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    do {
                        System.out.println("Nhập điểm: ");
                        float score  = Float.parseFloat(scanner.nextLine());

                        
                        if (score == -1) {
                            break;
                        } else if (score <0 || score >10) {
                            System.err.println("Điểm không hợp lệ, vui lòng nhập lại: ");
                        } else {
                            //Học lực
                            countStudent ++;
                            totalScore+=score;
                            if (score>maxScore){
                                maxScore=score;
                            }
                            if (score<minScore){
                                minScore=score;
                            }


                            if ( score>0 && score<5) {
                                System.out.println("Học lực: Yếu");
                            } else if ( score>=5 && score<7) {
                                System.out.println("Học lực: Trung bình");
                            } else if ( score>=7 && score<8) {
                                System.out.println("Học lực: Khá");
                            } else if ( score>=8 && score<9) {
                                System.out.println("Học lực: Giỏi");
                            }else if ( score>=9 || score<=10) {
                                System.out.println("Học lực: Xuất sắc");
                            }
                        }
                    } while (true);
                    break;
                case 2:
                    if (countStudent == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("Số học viên đã nhập: " +countStudent);
                        System.out.println("Điểm trung bình: " + totalScore/countStudent);
                        System.out.println("Điểm cao nhất: " +maxScore);
                        System.out.println("Điểm thấp nhất: " +minScore);
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập vào 1-3");
            }

        } while (true);
    }
}
