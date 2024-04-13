import java.util.Scanner;

public class Stage {
  private int quantity;

  public void start() {
    Scanner sc = new Scanner(System.in);
		System.out.println("사용량을 입력하세요.");
    quantity = sc.nextInt();

    // code here
    // Calculation 클래스의 인스턴스 생성
    Calculation calculation = Calculation.getInstance();

    // Calculation 클래스의 메서드 호출하여 전기 요금 계산
    int 기본요금 = calculation.기본요금구하기(quantity);
    int 전력량요금 = calculation.전력량요금구하기(quantity);
    int 기후환경요금 = calculation.기후환경요금구하기(quantity);
    int 전기요금계 = calculation.전기요금계구하기();
    int 부가가치세 = calculation.부가가치세구하기();
    int 전력기반기금 = calculation.전력기반기금구하기();
    int 청구금액 = calculation.청구금액구하기();



    System.out.println("기본요금 : " + 기본요금 + "원");
    System.out.println("전력량요금 : " + 전력량요금 + "원");
    System.out.println("기후환경요금 : " + 기후환경요금 + "원");
    System.out.println("전기요금계 : " + 전기요금계 + "원" );
    System.out.println("부가가치세 : " + 부가가치세 + "원" );
    System.out.println("전력기반기금 : " + 전력기반기금 + "원" + " (10원미만절사)");
    System.out.println("청구금액 : " + 청구금액 + "원"  + " (10원미만절사)" );

  }
}
