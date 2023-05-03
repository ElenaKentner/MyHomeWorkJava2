public class Array {
    private int [] arr = new int[10];
    private int count = 0;

    public void insert(int value){
        arr[count] = value;
        count++;
    }

    public int find(int value){
        for (int i = 0; i < count; i++){
            if (value == arr[i]){
                return i;
            }
        }
    System.out.println("Элемента с таким значением нет");
        return -1;
    }
    public void delete(int pos){
        if(pos >= count){
            System.out.println("Нет элемента по этому индексу");
            return;
        }
        for (int i = pos; i < count; i++){
            arr[i] = arr[i+1];
        }
        count--;
    }
    public void sort(){
        int temp = 0;
        for (int i = 0; i < count; i++){
            for (int j = 0; j < count; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString(){
        String str = " ";
        for (int i = 0; i < count; i++){
            str += arr[i] + " ";
        }
        return str;
    }

}