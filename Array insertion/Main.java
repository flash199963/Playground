#include <iostream> 
using namespace std; 
  
int* ins(int n, int arr[],int x, int pos) 
{ 
    int i; 
    n++; 
    for (i = n; i >= pos; i--) 
        arr[i] = arr[i - 1]; 
    arr[pos - 1] = x; 
    return arr; 
} 

int main() 
{ 
    int arr[100] = { 0 }; 
    int i, x, pos, n;
    std::cout<<"Enter the number of elements in the array";
    std::cin>>n;
    std::cout<<"\nEnter the elements in the array";
    for (i=0;i<n;i++) 
    {
        std::cin>>arr[i];
    }
    std::cout<<"\nEnter the location where you wish to insert an element";
    std::cin>>pos;
  	if(pos>n)
    {
      std::cout<<"\nInvalid Input";
    }
  else
  {
    std::cout<<"\nEnter the value to insert";
    std::cin>>x;
    ins(n, arr, x, pos);
    std::cout<<"\nArray after insertion is";  
    for (i = 0; i < n + 1; i++) 
        cout<<"\n"<<arr[i];  
    return 0;
  }
} 