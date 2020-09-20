package personal.programming.algos.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Stringoholics {
    public static void main(String []args){
//        ArrayList<String> arr = new ArrayList<>(Arrays.asList("baaaaaaabbaaababbababbabbabaaabaaaabaa", "bbaabbaabaabbb", "aaabaaabaababbabbbbbbabbbbbaaaaaaaaaaaababbababababaaaaabbabaabaabbbbbaaababbbbbbabbabbbbaab", "abbbaabbababbbbababbbaababaaabaaabbbbaabbabaaaabababaaaaaaaabaaaabbbabbbaaa", "aabaabbaaaaaaaaaaaaabbababbabbabbbbbbabbabbbbbbabbaaaaaab", "baabbbbabababbaaabbbbaaaaaaababaabbabaaaababbabbaabbabbbaabbabbaaaabbbbbaabbaababaabbb", "bbaabbbabaabbbaaaabbbaabbabaabbbabaaababbaaaabbababaaaababaaababaababbbbbabbbababbbbb", "bbababaaaaababababbabaaabbbababaabbaabaaba", "bbbaabaaaaaabaabbaabaaaaababaaabaababbabaabbab", "babaabababbbbabaabaaababbabbbaaaabbbbbabbbaabbbbbbbbabbaaabbabbbaaab", "aabbabbaaabbaaabbabbbaaaabaab", "abababbbbbaabaabbabbbabbaba", "abaaababababaabbabaabbbbbaababaaaaabbaabbaaabbbbbabababbbaabbabbbbaaaaabbabaabb", "bbbabbbababaaabbaaaaaabbabbaabbbabbbababbbbbaabaababbbabaaaabbbbab", "aaabbaa", "abbabaaabbbbabbaaaabbbbbbabaabaaaaaaaaaabbbbaaaaaab", "bbbabaabbabaababbabaaaaaaabaaaabbbbabbbaba", "aba", "ababbabbabaabbaaabbbaaabbbbbaa", "bbaaaabbaaa", "bbbbbbaabababaabaabbbabbaaabaaabbbabaabaaaaaaabbaaabaa", "bababbaabbbaabbaaaaaabbbbbabaabbaabbabababbaaaaaababababbaabaaababaaaababababbababaaaba", "baaaaabbbbbbababbbbaaaabbabbbbbbabbaaabbbbbbabbbaaaaaabbabbaaabababbaabbbabbbabbabbbbbab", "bbababbaaaaabaabbbababbbbaaab", "aabaaab", "abbbab", "aaabbbaaabbbabaababaabbbabbbbaabaaabbaababaa", "aaabbabbabbbaaaaabaababaaaabbaabababba", "b", "babbabbbbbbbabbbbbabbbbaaaaabbbaaaaabbaabbabababaaaaabaabaaaabbabbaaaaabba", "babaaaaaab", "abbabbbababaaaaabababbaabaaaaaba", "aaaabbbbabbaabaaaabbabbaabaaaabaababaaabbbbb", "bbbabbaaababbababbabaabaaa", "aabbbaabbbaabbaaabbaabbbbbbbbbabbbabababaababaaabaabbbbaaababbbbbaabbaabbabaaaabab", "babbbbabbbaaaaabbaabbaaaaaababbbababaaabaababbaaaabbaabaaabbbaabbbaababbbbaaaaaaaaaaabaabbbbb", "abbbbabaaabaaaabaabaabaabbbbaabbbaaaabbaaaaaaabbaababbabbbababa", "baababaabaaababbaaaaaabbabaaabbbbb", "baababaaa", "bbabbababaaabaaabbbbabbaabbabbaabbaabba", "aabbaabababbbaaaababbbaaaaabbbabbaaaabababbbbbbbaabbbbbbbaaabbaabaabaaaabbbbababbbaaaabbabab", "abbaaaaabaaaabbbbaabaababbaabbbbbabbbabaabaaabbabbbabaaabbbaaabbababbabbbaaabbabbbbabbbbaabba", "aaababbbaabaabaaabbbbbaaababaaaababbbaaabaabbaabbbabaababaabaaab", "baaababbbaababbabaabbbbbbaababaaababbbaabaaabbaabababaaabaabbabbbbabaaba", "babaabbabaabaaaaaabbbbabbbbabbaababbbaaaaaaaa", "abaaa", "babaaaababbbbababbbbb", "abbaaaaaabbbabbaabbbbaaabbbaaabababaabaabbbbabbaababbaba", "aababaaabaaaabbaaaabababbbabbbabbbabbabaabbaaaabbbabaaabaaabbaabbaababbaaabbbb", "aaababbbbbbabbaabbaabbbabababaabbbaba", "bbaabbabbbabbaaaaaababbbaaaaaabbbababb", "baaababaababbaaa", "babbaaababbabbbbbbbbabbbbabbabababaabaaaa", "ababababababaabbbabbbbaabaabaababbbabbbbaabbaaababbaabaa", "abbbabaaaabaaaaabbaaababaaaaaabbbbaaaaabbbbbbbbbbbbbababaabaaababbaaaabbbaaabbbaaabaaa", "aaaabbababbabbbaabaabbabbabaabbabababbbbaaaabbabbbaaaabaaaabbbbbbababbaabaabbaaabaaa", "aabaaaabbbbaabbbbbbbbabaabbbabbabaabaababaaabbbbbaaaababb", "abbbbbabaaababbabbababbabaaabbabababaaabbaabaaabbaabbabaababaaaaaabababaaabaababbaa", "abbabbbbabaaababbabaaaaaaabbbbababababbabbababaabbabbabbbab", "bbbbabbab", "babbbbabbbabababbbbababaababbbbabaaababbabaaaaabbbbaaababbbbaabbabbbaaaabbabbabba", "babaaabbbbbbababaabbaaababbbabbabaabbaaabbbaaabbababb", "abbbaabaaaaaabaaaaabaabbbaabbab", "bbaabbabaabaaaaaaababbbabaaaabbbabbbbb", "baabaabaaabababbbbbbbbabbaabbabaabbabaababbbabbbaababbbbbbaabbabbbbaabaabbababa", "bbbbbaaababbbbaababbbbbaabbbaaaabbbabbbababababaaabbbbabababbabbbabababaaaaaab", "abaaabaabbaabbbaabbbaaaaaabababbabbaababbba", "abaabbbbbbaaababbbabaaaabaaabaabbaaaababbabbbaaabaaaaaaaaaaaabbabbabbabaaabbabaabaaaaaaabaabbabbbaa", "abababaaaaaaaaaabab", "abbabbbbbbbbbaabbbbabaaaaaababbabbaaabbbbbaabbbaaaabaabbaaaabababbb", "baaabaaabbbbbb", "aaabaabbabaaabbbaababaaabbbbbaabaaabbbabba", "bbbbabaaaabaaabbbabaababaabbbbbababbbabbaaaabbbababaabbabbaaabbbbaaaaabbabbbbbaabbabaaaa", "aabbbbaabaabbbabbbaabababbbbbbabbbabaabaabbbbbaabaaabbbaaabbbbaaaabbaabaaaabaabbbbbaaaabababab", "abbbaaaaababbbaaabbabaaaabbabaabbbbbbbabaaa", "babbbbbbbb" ));
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "babaaaabbaba", "baaaaababaabbaaaaabbbbbbbaabbaaaababbabaababaabaaabbbaaaaa", "abaabb", "aababbbbabbaaaabbaaaaaaaababbbabbbbaabbaabaabbaabaababbbababaababaabbababaaabaaaab", "babaaaaababbbbbabbbbabbaaabaaaababbabbaabbbabbaaaabbbabaaaabaaaababb", "bbbbbbaaaaaabbbbbbababaabaabbbbbaaabbabbaabbbbaaaaaababbabaaabbabbabbbabbaabbabbbbaabbbaaaaabbabaaab", "aabaaabaabbbbababbabbabaaaababbababbbabbbbaabbaaaaababbbbbababbbbaaababababab", "aaaababbbaabbbabaabb", "ababaaaabbabbbbaaabbababbbabbbabaaa", "aaabaabbbabaa", "baababbababbbbbabbabaabbabbbbbaaaabaaaababaa", "babaa", "abbabababbbbbbbbbbbaaaaaababbababaaabbbaaaabbbababbabaabbaabbbbaabbbaabbababababaabaaabbaaabbba", "ababbaabbaaabbbabaabababbbabaaabbbaababaaa", "abbaaaababbbbaaabaaaabaaaaabaababbabbaababbbabbbbbbbbbabbaabaaabbaaababbbaa", "bbabababaabbabbabbbabbaababbabaaabbbababab", "abbbaaabaab", "bbaaabbaaabbaabbabababa", "aabaabaaaaaaabaabbbaaababbbbbbababbaabababbaaaaabbabbbabbbaababbaabababbbbbbbbbaabaab", "babbaaabbabbaabaaabbb", "bbabaabba", "baabaaaaabbaaaaaabbbbaaaabababa", "babbaababaaba", "baabaabaabbababbaabbabbbbbabaaaabbbbbabbabbbbbabbbabaabbbbabbbbaaabbbbabababaaaababbaaabbabb", "abbbbaaaabaabbabbaababaabbababbbaaabbabbbbbaaabbabbaabbb", "bababaaaaabababbabbaabababbbaabbaabaabaabbabbbababbaaabababbababbbb", "abaaabbbabbbaabba", "bbbbaaaabbbababaabbbababaaaababbaaaaaabbbabbaababababbba", "bababaabaaaabbaabbababbaabbaabaabbaaaaaaaababbaaaaaabbaaabaabaaababbababbbbaabbabbabaabab", "aabbbabaaabababaabbbbaabbabaaabbbaaabbabbbbabaabbbbaabbbaaaaabbbabbbbb", "aabbbbbbabaabbbabbaababbababaabaaababbbbabbbaababaaaabbaaabaaabaaaabbbabababbab", "abaaaaababbabaabbbaaaaabbaaaabaaaaaaaababbaabbbaabbabbbabbaaaaaab", "bbbaabbabbbbbbaaaabbabbbbbbbaaabaababbaaaabbbaababbaaabbbbbbbbabbabababbaaabaabaaabaaaabbbbbabaabaaa", "bbaaabaaabaaabaabaaabbaabaabbabaabaabbababaaaaabaabbbbaba", "abaababaaabbabaabaabbbaaabbaabababbabaaabbbbabbbbbaaaaa", "abba", "abbbababbaaabbaaabbbabaabbababaaabbbbaaaaababbabbaabbabbbaaabaabbaaaaabaaaabbbaabbbabbbbbbbabb", "bbabbaaabaaaabbaaaabbbaaaababbbaabaaaaab", "abbaabaabbaaaaaaaabbaabbabbababaaaaaaabbabaabaabbbabbaabbaababbaabbaba", "bbbbaababbaaaaaaaaabbbabbbabaabababaababaababa", "baaabaabbbbbbaabbabbbabaaaaababaabaababbbaaaaaaaabbbbbabbabaaaaaaaabababaabaababaaabbaaaaaaaaabaa", "aababbbabbaaaaababbabaababbbbbbbbaaabbaaaaabbaabbbba", "ababababaaaaaabbbabbaaababaabb", "bababbaababaabbbabbaab", "baababababbaaaaabbbbbbbbbaabababb", "bbbbb", "aabaabbbaabababbababaaaaabbbbaababaabbabbbbbbaabbaaabbababbbabbabbbaabbbab", "bbaabbbbaabbaaaaaabbbaabababbbaabaaabbbbbabaababbbaababbbaaabaaabaaaababbbbaabbaababb", "aaababbaaaaabaabababbabaabbbbabbaba" ));
        System.out.println(solve(arr));
    }


    public static int solve(ArrayList<String> A) {
        ArrayList<Integer> minCount = new ArrayList<>();
        for(int i=0;i< A.size(); i++){
            if(A.get(i).length()<=1){
                minCount.add(1);
            }else{
                if(!A.get(i).contains("a")){
                    minCount.add(1);
                }else if(!A.get(i).contains("b")){
                    minCount.add(1);
                }else{
                    int count = 1;
                    String str = A.get(i);
                    int j = 0;
                    while(Boolean.TRUE){
                        str = str.substring(count%A.get(i).length(),A.get(i).length())+str.substring(0,count%A.get(i).length());
                        if(str.equals(A.get(i))){
                            minCount.add(count);
                            break;
                        }
                        count =( count+1);
                    }
                }
            }
        }

        return (int)lcm(minCount);
    }

    public static int lcm(ArrayList<Integer> array)
    {
        int lcm_of_array_elements = 1;
        int divisor = 2;

        while (true) {
            int counter = 0;
            boolean divisible = false;

            for (int i = 0; i < array.size(); i++) {


                if (array.get(i) == 0) {
                    return 0;
                }
                else if (array.get(i) < 0) {
                    array.set(i,array.get(i) * (-1));
                }
                if (array.get(i) == 1) {
                    counter++;
                }

                if (array.get(i) % divisor == 0) {
                    divisible = true;


                    array.set(i,(array.get(i) / divisor));
                }
            }

            if (divisible) {
                lcm_of_array_elements = (lcm_of_array_elements * divisor)*1000000007;
            }
            else {
                divisor = (divisor+1);
            }

            if (counter == array.size()) {
                return lcm_of_array_elements;
            }
        }
    }

}
