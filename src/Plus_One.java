public class Plus_One {
    class Solution {
        public int[] plusOne(int[] digits) {
            if (digits[digits.length - 1] < 9) {
                digits[digits.length - 1]++;
                return digits;
            }
            boolean perenos = true;
            for (int i = digits.length - 2; i >= 0; i--) {
                if (perenos) {

                } else return digits;
            }
            return digits;

        }
    }
}
