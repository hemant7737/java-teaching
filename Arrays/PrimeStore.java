class PrimeStore{
    public static void main(String[]args){
        int prime[] = new int[10];
        int n = 1;
        int count = 0;
        int k=0;     
        while(k<prime.length){
            count = 0;
            for(int i =1; i<=n; i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                prime[k]= n;
                k++;
            }          
            n++;
        }
        for(int i=0; i<prime.length; i++){
            System.out.println(prime[i]);
        }
    }
}