/**
 * Created by wwf12 on 2018-02-28.
 */
class PhoneInfo {
    String name;
    String phonNumber;
    String birth;

    public PhoneInfo(String name, String phonNumber, String birth) {
        this.name = name;
        this.phonNumber = phonNumber;
        this.birth = birth;
    }

    public PhoneInfo(String name, String phonNumber) {
        this.name = name;
        this.phonNumber = phonNumber;
        this.birth = null;
    }

    public void showPhoneInfo() {
        System.out.println("name : " + name);
        System.out.println("phone : " + phonNumber);

        if(birth != null) {
            System.out.println("birthday : " + birth);
        }

        System.out.println(" ");
    }
}

class PhoneBookVer01 {
    public static void main(String[] args) {
        PhoneInfo pInfo1 = new PhoneInfo("안상영", "825-6758", "92-06-22");
        PhoneInfo pInfo2 = new PhoneInfo("이문희", "365-8551");
        pInfo1.showPhoneInfo();
        pInfo2.showPhoneInfo();
    }
}