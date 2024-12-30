//import java.util.Map;
//import java.util.LinkedHashMap;
//public class nonrepeating {
//      public static char firstNonRepeatingChar(String str) {
//            Map<Character, Integer> charCount = new LinkedHashMap<>();
//            for (char c : str.toCharArray()) {
//                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//            }
//            for (char c : str.toCharArray()) {
//                if (charCount.get(c) == 1) {
//                    return c;
//                }
//            }
//            return '\0';
//        }
//
//        public static void main(String[] args) {
//            String input = "swiss";
//            System.out.println(firstNonRepeatingChar(input));
//        }
//    }
//
//
