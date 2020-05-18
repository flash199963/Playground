#include<iostream>
using namespace std;
int main()
{
  int i,arr[100],size,count_even=0,count_odd=0;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>size;
  std::cout<<"\nEnter the elements in the array";
  for(i=0;i<size;i++)
  {
    std::cin>>arr[i];
  }
     for(i=0;i<size;i++)
  {
    if(arr[i]%2==0)
    {
      count_even++;
    }
     else 
       count_odd++;
  }
  if(count_even==size)
  {
    std::cout<<"\nThe array is Even";
  }
  else if(count_odd==size)
  {
    std::cout<<"\nThe array is Odd";
  }
  else
    std::cout<<"\nThe array is Mixed";
}

  