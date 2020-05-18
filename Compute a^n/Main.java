#include<iostream>
#include<cmath>
int main()
{
  int a,n,res;
  std::cout<<"Enter the value of a";
  std::cin>>a;
  std::cout<<"\nEnter the value of n";
  std::cin>>n;
  res = pow(a,n);
  std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<res;
}
  
  