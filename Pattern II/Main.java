#include<iostream>
#include<iomanip>

void fun(int n)
{

    int i,j,t,x=1,L;
    for (i=1;i<=n;i++)       //for rows............
    {
        L=i-1;
        for(j=1;j<=i;j++)    //for each row :) ...................
        {
            if(i%2==1)
              {
               std::cout<<x+j-1;
                if(j==i)
                    t=x+j-1; 
              }
            else if (i%2==0)
                {
                   std::cout<<x+L;
                   if(j==1)
                    t=x+L; 
                    L--;




                 }
             if(j<i)
                std::cout<<"*";
        }


            x=1+t;    //the next row first no. 




        std::cout<<"\n";
    }

}



int main()
{

    int n;
    std::cin>>n;
    fun(n);
    return 0;
}