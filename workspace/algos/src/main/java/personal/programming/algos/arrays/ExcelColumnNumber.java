package personal.programming.algos.arrays;

public class ExcelColumnNumber {
    public static void main(String []args){

    }

    public int titleToNumber(String A) {
        int columnNo = 0;
        for(int i = 0;i<A.length();i++ ){
            columnNo = columnNo*26+(int)(A.charAt(i)-64);
        }

        return columnNo;
    }

}
