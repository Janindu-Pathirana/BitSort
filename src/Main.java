public class Main {


    public static boolean[] BitSort(boolean[] values ){
        int tValCount = 0;
        for(boolean b : values){
            if(b){
                tValCount++;
            }
        }

        for(int i = 0; i<values.length;i++){
            if(i<tValCount){
                values[i] = true;
            }else {
                values[i] = false;
            }
        }

        return values;


    }
    public static void main(String[] args) {

        boolean[] val = {true,false,true,false,false,true,false};

        boolean[] newVal = BitSort(val);

        for(boolean b : newVal){
            System.out.println(b);
        }

    }
}
