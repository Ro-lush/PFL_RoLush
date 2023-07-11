package DzArrayInt;


public class DzArrayInt {
    static   int count=10;
    static int  number = 20;


    public static void main(String[] args) {

        int[] arrays = new int[count];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i]= (int) (Math.random()*number)+1;
        }
        Maxnumber(arrays);

    }


    public static void Maxnumber(int[] array){
        int countMin = 0;
        int countMax = number;
        for (int i = 0; i < array.length; i++) {
            if(array[i]> countMin & array[i]<count){
                countMin= array[i];
            } else if (array[i]<countMax & array[i]>count) {
                    countMax = array[i];
            }
        }
        if(count-countMin==countMax-count){
            System.out.println("Максимально близкое значение к числу count = "+countMax);
        } else if (count-countMin<countMax-count) {
            System.out.println("Максимально близкое значение к числу count = "+countMin);
        } else  System.out.println("Максимально близкое значение к числу count = "+countMax);

    }

}
