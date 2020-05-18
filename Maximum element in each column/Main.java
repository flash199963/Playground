#include <iostream>

using namespace std;

int main()
{
    int a[10][10],m,n,j,i,max;
    std::cin>>m;
    std::cin>>n;
    for ( i=0;i<m;i++)
        {for( j= 0;j<n;j++)
            std::cin>>a[i][j];
        }
    for (i=0;i<n;i++)
        { 
      j=0;
            max=a[j][i];
        for (j=0;j<m;j++)
           if(a[j][i]>max)
               max=a[j][i];
        cout<<max<<"\n";
        }
   
   return 0;
}