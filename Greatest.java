public class Greatest{
  public static void main(String args[]) {
int arr[]={1,2,3,4,5,6,10,20,5,7,9};

int max=arr[0];

for(int i=1;i<arr.length;i++){
if(max>arr[i]){
max=max;
}
else{
max=arr[i];
}
}
System.out.println("the greatest number in array"  + max);
}}
