#include<iostream>
#include<iomanip>

void fun(int n)
{
    int i,j;
    for(i=1;i<=8;i++)
    {
        if(i<5)
         {

            for(j=1;j<=i;j++)
               std::cout<<n;
            n++;
         }
        else
          {

            n--;
            for(j=8-i+1;j>=1;j--)
               std::cout<<n;

          }
    std::cout<<"\n"  ;
    }
}
int main()
{
    int n;
    std::cin>>n;
    fun(n);
    return 0;
}
