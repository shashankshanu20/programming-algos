package personal.programming.algos.stacksqueues;

import java.util.ArrayList;
import java.util.Stack;

public class SimplifyDirectoryPath {

    public static void main(String []args){
        System.out.println(simplifyPath("/a/./b/../../c/"));
        System.out.println(simplifyPath("/./.././ykt/xhp/nka/eyo/blr/emm/xxm/fuv/bjg/./qbd/./../pir/dhu/./../../wrm/grm/ach/jsy/dic/ggz/smq/mhl/./../yte/hou/ucd/vnn/fpf/cnb/ouf/hqq/upz/akr/./pzo/../llb/./tud/olc/zns/fiv/./eeu/fex/rhi/pnm/../../kke/./eng/bow/uvz/jmz/hwb/./././ids/dwj/aqu/erf/./koz/.."));
    }

    public static String simplifyPath(String A) {
        String simplifiedPath = "";
        ArrayList<Integer> slashStack = new ArrayList<>();

        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i)=='/'){
                slashStack.add(i);
            }
        }
        Stack<String> directoryStack = new Stack<>();
        for(int i = 1; i<=slashStack.size();i++){
            String temp = i==slashStack.size()&&slashStack.get(i-1)<A.length()?A.substring(slashStack.get(i-1)):A.substring(slashStack.get(i-1), slashStack.get(i));
            if(!temp.equals("/")&&!temp.equals("/.")){
                if(temp.equals("/..")){
                    if(!directoryStack.empty()){
                        directoryStack.pop();
                    }
                }else{
                    directoryStack.push(temp);
                }
            }
        }
        for(String str:directoryStack){
            simplifiedPath+=str;
        }

        return simplifiedPath.length()==0?"/":simplifiedPath;
    }
}
