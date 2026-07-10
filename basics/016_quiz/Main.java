// `string.toCharArray` is a utility function to convert
// a string to array
public class Main {
    public static void main(String[] args) {
        String nums = "0123456789";
        int sum = 0;

        for (char s : nums.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(s));
        }

        // Print the sum of all digits in the string
        // 0+1+2+3+4+5+6+7+8+9=45
        System.out.println(sum);
    }
}
