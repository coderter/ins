import java.util.Scanner;
public class Caesercipher{
    public static void main(String[] args) {
        String msg, encryptedMsg = "";
        int key;
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a message: ");
        msg = sc.nextLine();

        System.out.print("Enter Key: ");
        key = sc.nextInt();
        
        for (int i=0; i<msg.length(); i++){
            ch = msg.charAt(i);
            if (ch>='a' && ch <= 'z'){
                ch = (char)(ch + key);
                if (ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' -1);
                }
                encryptedMsg +=ch;
            }
             if (ch>='A' && ch <= 'Z'){
                ch = (char)(ch + key);
                if (ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' -1);
                }
                encryptedMsg +=ch;
            }
        }
        System.out.println("Encrypted Message: "+encryptedMsg);
    }
}

