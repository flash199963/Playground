#include<iostream>
using namespace std;
int main()
{
  int size,arr[100],i,sum_even=0,sum_odd=0;
  std::cin>>size;
  for(i=0;i<size;i++)
  {
    std::cin>>arr[i];
    if(arr[i]%2==0)
    {
      sum_even+=arr[i];
    }
    else
      sum_odd+=arr[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<sum_even;
  std::cout<<"\nThe sum of the odd numbers in the array is "<<sum_odd;
}