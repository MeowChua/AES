package com.company;

public class Main {
    public static void main(String[] args) {
        /* -----------------------------------AES
        try {
            AES aes = new AES();
            aes.init();
            String encryptedMessage = aes.encrypt("Ho Minh Canh cute");
            String decryptedMessage = aes.decrypt(encryptedMessage);
            System.err.println("Encrypted Message : " + encryptedMessage);
            System.err.println("Decrypted Message : " + decryptedMessage);
        } catch (Exception ignored) {
            ignored.fillInStackTrace();
        }
         */
        /* -----------------------------------DES
        String text = "123456ABCD132536";
        String key = "AABB09182736CCDD";

        DES cipher = new DES();
        System.out.println("Encryption:\n");
        text = cipher.encrypt(text, key);
        System.out.println(
                "\nCipher Text: " + text.toUpperCase() + "\n");
        System.out.println("Decryption\n");
        text = cipher.decrypt(text, key);
        System.out.println(
                "\nPlain Text: "
                        + text.toUpperCase());
         */
        /* -----------------------------------ThreeDES
        Three_DES Tdes = new Three_DES();
        Tdes.decode(Tdes.encode("Ho Minh Canh"));
         */
    }
}
