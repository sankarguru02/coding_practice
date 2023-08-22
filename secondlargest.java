class Secondlargest{

    void find(){
        int []arr = new int[]{3,432,21,4500,2,1};
        int first = arr[0];
        int second = arr[0];
        Vector <Integer> v = new Vector<Integer>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second = first;
                first =arr[i];
                
            }
            else if(arr[i]>second){
                second =arr[i];
             }
            }
            System.out.println(first+" "+second);

            for(int i=0;i<arr.length;i++){

                if(arr[i]!=first && arr[i]!=second){
                    v.add(arr[i]);
                }
            }
            System.out.println(v);
        }
