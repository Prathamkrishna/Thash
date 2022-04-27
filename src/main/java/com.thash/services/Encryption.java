package services;

public class Encryption {

    private static Encryption encryption = null;

    public Encryption() {
    }

    public String additionEncrypt(String decryptedText){
//        change to addition
        String str = "";
        for (char c : decryptedText.toCharArray()){
            str = str.concat(String.valueOf(((int) c) + 5));
        }
        return str;
    }

    public String multiplyEncrypt(String text){
        String str = "";
        for (char c : text.toCharArray()) {
            str = str.concat(String.valueOf(((int) c)*2));
        }
        return str;
    }

    public static Encryption getInstance(){
        if (encryption == null){
            encryption = new Encryption();
        }
        return encryption;
    }
}
