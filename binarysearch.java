public class binarysearch {

    public static void main(String[]args) {

int a[]={1,2,3,4,5,6,7,8,9};

int key = 5;
int low = 0;
int high = 8;

while (low<=high) {
    int mid = (low + high)/2;
if (a[mid]==key){

    System.out.println("element found at index" +mid);
    break;

}

else if (a[mid]<key) {
    low = mid + 1;
}  
    

else {
    high = mid-1;

}
}
    





    }
}