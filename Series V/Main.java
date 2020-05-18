#include<iostream>
int main()
{
    int n,res;
    std::cin>>n;
    for(int i=0;i<n;i++)
    {
        res=11+(i*4);
        res=res*res;
        std::cout<<res<<" ";
    }
}