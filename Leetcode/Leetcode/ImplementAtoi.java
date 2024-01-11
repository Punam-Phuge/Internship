
    public class ImplementAtoi {

        public static int atoi(String str) {
            if (str == null || str.length() == 0) {
                return 0;
            }
    
            int result = 0;
            int sign = 1;
            int i = 0;
    
            // Skip leading whitespaces
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }
    
            // Check for the sign
            if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                sign = (str.charAt(i) == '-') ? -1 : 1;
                i++;
            }
    
            // Process digits
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                int digit = str.charAt(i) - '0';
    
                // Check for overflow
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
    
                result = result * 10 + digit;
                i++;
            }
    
            return result * sign;
        }
    
        public static void main(String[] args) {
            String str1 = "123";
            System.out.println(atoi(str1));  // Output: 123
    
            String str2 = "21a";
            System.out.println(atoi(str2));  // Output: -1
        }
    }
    


