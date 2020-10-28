package personal.programming.algos.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class EvaluateExpressionTRue {
    int mod;
    public int cnttrue(String expr) {
        mod = 1003;
        Map<String, Integer> memory = new HashMap<>();
        return numWaysForType(expr, 0, expr.length() - 1, 'T', memory);
    }

    int numWaysForType(String expr,int i, int j, char value, Map<String, Integer> memory)
    {
        if(i > j)
            return 0;
        if( i == j)
            return expr.charAt(i) == value ? 1 : 0;

        String key = "" + i + " " + " " + j + value;
        if(memory.containsKey(key))
            return memory.get(key);

        long ans = 0;
        for(int k = i + 1; k < j; k += 2)
        {
            int leftT = numWaysForType(expr, i, k - 1, 'T', memory);
            int rightT = numWaysForType(expr, k + 1, j, 'T', memory);
            int leftF = numWaysForType(expr, i, k - 1, 'F', memory);
            int rightF = numWaysForType(expr, k + 1, j, 'F', memory);

            switch (expr.charAt(k))
            {
                case '|' : switch (value)
                {
                    case 'T' : ans += (leftF * rightT +  leftT * rightF + leftT * rightT); break;
                    case 'F' : ans += (leftF * rightF); break;
                }
                    break;
                case '&' : switch (value)
                {
                    case 'T' : ans += (leftT * rightT); break;
                    case 'F' : ans += (leftF * rightT + leftT * rightF + leftF * rightF); break;
                }
                    break;
                case '^' : switch (value)
                {
                    case 'T' : ans += (leftF * rightT + leftT * rightF); break;
                    case 'F' : ans += (leftT * rightT + leftF * rightF);break;
                }
                    break;
            }
        }

        memory.put(key, (int)(ans % mod));
        return (int)(ans % mod);
    }
}
