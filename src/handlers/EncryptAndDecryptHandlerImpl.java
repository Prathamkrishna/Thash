package handlers;

import enums.DecryptEnums;
import enums.EncryptEnums;
import services.Decryption;
import services.Encryption;

public class EncryptAndDecryptHandlerImpl implements EncryptAndDecrypHandler {

    private final Encryption encryption = Encryption.getInstance();
    private final Decryption decryption = Decryption.getInstance();

    @Override
    public String textToBeEncrypted(String decrypted, EncryptEnums encryptEnums) {
        if (encryptEnums.equals(EncryptEnums.TYPE_M)){
            return encryption.multiplyEncrypt(decrypted);
        } else if (encryptEnums.equals(EncryptEnums.TYPE_A)){
            return encryption.additionEncrypt(decrypted);
        }
        return null;
    }

    @Override
    public String textToBeDecrypted(String encrypted, DecryptEnums decryptEnums) {
        if (decryptEnums.equals(DecryptEnums.TYPE_M)){
            return decryption.multiplyDecrypt(encrypted);
        } else if (decryptEnums.equals(DecryptEnums.TYPE_A)) {
            return decryption.additionDecrypt(encrypted);
        }
        return null;
    }
}
