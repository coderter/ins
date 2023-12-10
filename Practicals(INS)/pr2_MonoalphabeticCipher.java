
import java.util.Scanner;
class MonoalphabeticCipher{
    static char p[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    static char ch[] = {'Q','w','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
    
    static String doEncryption(String s){
        char c[] = new char[(s.length())];
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < 26; j++){
                if (p[j] == s.charAt(i)){
                    c[i] = ch[j];
                    break;
                }
            }
        }
        return (new String(c));
    }
    static String doDecryption(String s){
        char p1[] = new char[(s.length())];
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < 26; j++){
                if (ch[j] == s.charAt(i)){
                    p1[i] = p[j];
                    break;
                }
            }
        }
        return (new String(p1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message to encrypt: ");
        String en = doEncryption(sc.nextLine().toLowerCase());
        System.out.println("Encrypted the message: "+en);

        System.out.println("Decrypted the message: "+doDecryption(en));
        sc.close();
    }
}


