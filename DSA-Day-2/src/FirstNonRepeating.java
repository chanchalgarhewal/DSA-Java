public class FirstNonRepeating {
    static char FirstNonRepeating(String str) {
            int count[] = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
            for (int i = 0; i < str.length(); i++) {
                if (count[str.charAt(i) - 'a'] == 1) {
                    return str.charAt(i);
                }
            }

            return '-';
        }

        public static void main(String[] args) {
            String str = "aabbcd";

            System.out.println("String: " + str);
            System.out.println("First Non-Repeating: " + FirstNonRepeating(str));
        }
    }

