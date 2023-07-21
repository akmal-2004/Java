package lessons;

public class Tester {
    static String[] TESTS = {
            "555034944/232=2392392",
            "2392392*232=555034944",
            "99999977799981232102220001/9999998889999=9999998889999",
            "9999998889999*9999998889999=99999977799981232102220001",
            "99999999980000000001*999999999=99999999880000000020999999999",
            "132999912399777999321312320001-99999977799981232102220001=132899912421978018089210100000",
            "999999777102220001+1329999123997779993210222=1330000123997557095430223",
            "1330000123997557095430223-999999777102220001=1329999123997779993210222",
            "12/2=6",
            "50000+111=50111",
            "50000-1=49999",
            "4*4=16",
            "1000000-1=999999",
            "11*11=121",
            "7776-7767=9"
    };

    static void tester(){
        int passed = 0;
        int failed = 0;
        for (int i = 0; i < TESTS.length; i++) {
            if (TESTS[i].contains("/")) {
                String aNum = TESTS[i].substring(0, TESTS[i].indexOf('/'));
                String bNum = TESTS[i].substring(TESTS[i].indexOf('/') + 1, TESTS[i].indexOf('='));
                String resNum = TESTS[i].substring(TESTS[i].indexOf('=') + 1);
                BigInt a = new BigInt(aNum);
                BigInt b = new BigInt(bNum);
                a.divide(b);
                if (resNum.equals(a.toStr())) {
                    System.out.println("test [" + i + "] passed!  test: " + TESTS[i]);
                    passed ++;
                }
                else {
                    System.out.println("test [" + i + "] failed!  test: " + TESTS[i] + "   result: " + a.toStr());
                    failed ++;
                }
            }
            if (TESTS[i].contains("*")) {
                String aNum = TESTS[i].substring(0, TESTS[i].indexOf('*'));
                String bNum = TESTS[i].substring(TESTS[i].indexOf('*') + 1, TESTS[i].indexOf('='));
                String resNum = TESTS[i].substring(TESTS[i].indexOf('=') + 1);
                BigInt a = new BigInt(aNum);
                BigInt b = new BigInt(bNum);
                a.multiply(b);
                if (resNum.equals(a.toStr())) {
                    System.out.println("test [" + i + "] passed!  test: " + TESTS[i]);
                    passed ++;
                }
                else {
                    System.out.println("test [" + i + "] failed!  test: " + TESTS[i] + "   result: " + a.toStr());
                    failed ++;
                }
            }
            if (TESTS[i].contains("+")) {
                String aNum = TESTS[i].substring(0, TESTS[i].indexOf('+'));
                String bNum = TESTS[i].substring(TESTS[i].indexOf('+') + 1, TESTS[i].indexOf('='));
                String resNum = TESTS[i].substring(TESTS[i].indexOf('=') + 1);
                BigInt a = new BigInt(aNum);
                BigInt b = new BigInt(bNum);
                a.plus(b);
                if (resNum.equals(a.toStr())) {
                    System.out.println("test [" + i + "] passed!  test: " + TESTS[i]);
                    passed ++;
                }
                else {
                    System.out.println("test [" + i + "] failed!  test: " + TESTS[i] + "   result: " + a.toStr());
                    failed ++;
                }
            }
            if (TESTS[i].contains("-")) {
                String aNum = TESTS[i].substring(0, TESTS[i].indexOf('-'));
                String bNum = TESTS[i].substring(TESTS[i].indexOf('-') + 1, TESTS[i].indexOf('='));
                String resNum = TESTS[i].substring(TESTS[i].indexOf('=') + 1);
                BigInt a = new BigInt(aNum);
                BigInt b = new BigInt(bNum);
                a.minus(b);
                if (resNum.equals(a.toStr())) {
                    System.out.println("test [" + i + "] passed!  test: " + TESTS[i]);
                    passed ++;
                }
                else {
                    System.out.println("test [" + i + "] failed!  test: " + TESTS[i] + "   result: " + a.toStr());
                    failed ++;
                }
            }
        }
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
    }

    public static void main(String[] args) {
        tester();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            String aStr = sc.next();
//            String bStr = sc.next();
//            BigInt a = new BigInt(aStr);
//            BigInt b = new BigInt(bStr);
//            a.divide(b);
//            a.print();
//            System.out.println(Long.parseLong(aStr) / Long.parseLong(bStr));
//        }
    }
}