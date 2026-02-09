public class Array {

    private int[] arr;
    private int count;

    public  Array(int n){
        arr = new int[n];
    }

    public void print(){
        for(int i=0 ;i<count;i++){
            if (arr[i]!=0) {
                System.out.println(arr[i]);
            }
        }
    }

    public void insert(int n){
        if(count == arr.length){
            int [] newarr = new int[count*2];
            for(int i=0;i<count;i++){
                newarr[i]=arr[i];
            }
            arr=newarr;

        }
        arr[count]=n;
        count++;

    }

    public void remove(int n){
        int m=0;
        for(int i=0;i<count;i++){
            if (arr[i]==n){
               m=i;
            }
        }
        for(int i=m;i<count;i++){
            arr[i]=arr[i+1];
        }
        count--;
    }

    public void indexOf(int n){
        for (int i=0;i<count;i++){
            if(arr[i]==n){
                System.out.println(i);
                break;
            }else{
                System.out.println(-1);
                break;
            }
        }
    }

    public void max(){
        int max=arr[0];
        for(int i=1;i<count;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    public void reverse(){
        int i=0,j=count-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

}
