package personal.programming.algos.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class SmallestMultipleZeroAndOne {

    class CNode{
        int num;
        CNode parent;
        boolean isOne;
        CNode(int num, CNode parent, boolean isOne){
            this.num = num;
            this.parent = parent;
            this.isOne = isOne;
        }
    }

    public String multiple(int A) {
        if(A==1){
            return "1";
        }
        Queue<CNode> queue = new ArrayDeque<>();
        queue.add(new CNode(1,null, Boolean.TRUE));
        boolean []checked = new boolean[A];

        CNode result = null;

        while(!queue.isEmpty()){
            CNode temp = queue.poll();
            if(temp.num==0){
                result = temp;
                break;
            }
            int zeroMod = (temp.num*10)%A;
            int oneMod = (temp.num*10 + 1)%A;

            if(!checked[zeroMod]){
                queue.add(new CNode(zeroMod, temp,false));
                checked[zeroMod] = true;
            }
            if(!checked[oneMod]){
                queue.add(new CNode(oneMod, temp, true));
                checked[oneMod] = true;
            }
        }

        String resultStr= "";
        while (result!=null){
            String digit = result.isOne?"1":"0";
            resultStr += digit;
            result = result.parent;
        }

        return new StringBuilder(resultStr).reverse().toString();
    }


}
