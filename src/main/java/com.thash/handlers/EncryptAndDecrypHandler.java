package handlers;

import enums.DecryptEnums;
import enums.EncryptEnums;

public interface EncryptAndDecrypHandler {
    String textToBeEncrypted(String decrypted, EncryptEnums encryptEnums);

    String textToBeDecrypted(String encrypted, DecryptEnums decryptEnums);
}
