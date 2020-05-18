#include<iostream>
int main()
{
    int n,n1,n4;
    std::cin>>n;
    n1=n%10;
    n4=n/1000%10;
    std::cout<<n1+n4;
}