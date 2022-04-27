package services;

public class Decryption {
    private static Decryption decryption = null;

    private Decryption() {
    }

    public String additionDecrypt(String encrypted){
        String str = "";
        System.out.println(encrypted);
        for (int i = 0; i < encrypted.length(); i++){
            if (-2 > (Character.getNumericValue(encrypted.charAt(i))-5)) {
                int val =  Character.getNumericValue(encrypted.charAt(i))*100 + Character.getNumericValue(encrypted.charAt(i+1))*10 + Character.getNumericValue(encrypted.charAt(i+2));
                System.out.println(val + "tri[le");
                str = str.concat(String.valueOf((char) (val - 5)));
                System.out.println(str);
                i += 2;
            } else{
                int val = Character.getNumericValue(encrypted.charAt(i))*10 + Character.getNumericValue(encrypted.charAt(i+1));
                System.out.println(val + "doub;e");
                str = str.concat(String.valueOf((char) (val -5)));
                i++;
            }
            System.out.println(str);
        }
        return str;
    }

    public String multiplyDecrypt(String encrypted){
        String str = "";
//        lies bw 32 n 126
        for(int i = 0; i < encrypted.length(); i++){
            if(3 <= Character.getNumericValue(encrypted.charAt(i))/2){
                int val = (Character.getNumericValue(encrypted.charAt(i))*10+Character.getNumericValue(encrypted.charAt(i+1)))/2;
                str = str.concat(String.valueOf((char) val));
                i++;
            }
            else if (Character.getNumericValue(encrypted.charAt(i))/2 < 2) {
                int val = (Character.getNumericValue(encrypted.charAt(i)) * 100 + Character.getNumericValue(encrypted.charAt(i + 1)) * 10 + Character.getNumericValue(encrypted.charAt(i + 2)))/2;
                str = str.concat(String.valueOf((char) val));
                i += 2;
            }
        }
        return str;
    }

    public synchronized static Decryption getInstance(){
        if (decryption == null){
            decryption = new Decryption();
        }
        return decryption;
    }
}
