#include<iostream>
int main()
{
  int size,i,arr[100],count_f=0,count_m=0;
  std::cin>>size;
  for(i=0;i<size;i++)
  {
    std::cin>>arr[i];
  }
  for(i=0;i<size;i++)
  {
    if(arr[i]%2==0)
      count_f++;
    else
      count_m++;
  }
  std::cout<<count_m;
  std::cout<<"\n"<<count_f;
}
