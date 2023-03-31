public class IntegerSet {
    private boolean[] array = new boolean[101];
    int i;

    public IntegerSet(){
        for(i=0; i < 101; i++){
            array[i] = false;
        }
    }

    public IntegerSet union(IntegerSet is_1){
        IntegerSet is_2 = new IntegerSet();

        for(i=0; i < 101; i++){
            if(array[i] || is_1.array[i]){
                is_2.array[i] = true;
            }
        }
        return is_2; 
    }  

    public IntegerSet intersection(IntegerSet is_1){
        IntegerSet is_3 = new IntegerSet();

        for(i=0; i < 101; i++){
            if(array[i] == true && is_1.array[i] == true){
                is_3.array[i] = true;
            }
        }
        return is_3;
    }

    public void insertElement(int num){
        array[num] = true;
    }

    public void deleteElement(int num){
        array[num] = false;
    }

    public String toSetString(){
        String str = "";

        for(i=0; i < 101; i++){
            if(array[i] == true){
                str += " " + String.valueOf(i); 
            }
        }

        if(str == ""){
            str = "--";
        }

        return str;
    }

    public boolean isEqualTo(IntegerSet is_1){

        for(i=0; i < 101; i++){
            if(array[i] != is_1.array[i]){
                return false;
            }
        }
        return true;
    }
}
