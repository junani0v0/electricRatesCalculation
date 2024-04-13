public class Calculation {
    private static Calculation instance;

    //전역 객체변수로 사용하기 위해 static 객체변수로 생성
    private Calculation() {} //생성자를 private로 만들어 접근막음

    private int 기본요금;
    private int 전력량요금;
    private int 기후환경요금;
    private int 전기요금계;
    private int 부가가치세;
    private int 전력기반기금 ;
    private int 청구금액;



    public static Calculation getInstance() {
        //getInstance 메서드를 통해 한번만 생성된 객체를 가져온다.
        if (instance == null) {
            //최초 한번만 new연산자를 통하여 메모리에 할당
            instance = new Calculation();
        }
        return instance;
    }

    public int 기본요금구하기(int quentity) {
        if (quentity <= 200){
            기본요금 = 910;
        } else if (quentity <=400) {
            기본요금 = 1600;
        } else if (quentity > 400) {
            기본요금 = 7300;
        }
        return 기본요금;
    }

    public int 전력량요금구하기(int quentity){
        if (quentity <= 200){
            전력량요금 = quentity*120;
        } else if (quentity <=400) {
            전력량요금 = (int)((quentity - 200) * 214.6) + 24000;
        } else if (quentity > 400) {
            전력량요금 = (int)((quentity -400)* 307.3 + 42920) + 24000;
        }
        return 전력량요금;
    }
    public int 기후환경요금구하기(int quentity) {
        기후환경요금 = quentity*9;
        return 기후환경요금;
    }

    public int 전기요금계구하기() {
        전기요금계 = (int) (기본요금 + 전력량요금 + 기후환경요금);
        return 전기요금계;
    }

    public int 전력기반기금구하기(){
        전력기반기금= ((int)(전기요금계 * 3.7 / 100.0)) / 10 * 10;
        return 전력기반기금;
    }

    public int 부가가치세구하기() {
        부가가치세 = (int)(전기요금계 * 0.01);
        return 부가가치세;
    }

    public int 청구금액구하기() {
        청구금액 = (전기요금계 + 부가가치세 + 전력기반기금) / 10 * 10;
        return 청구금액;
    }
  // code here
}
