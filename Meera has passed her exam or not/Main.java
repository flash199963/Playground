#include<iostream>
using namespace std;
int main()
{
        int arr[10], i, num, n, cnt=0, pos;
        std::cin>>n;
        for(i=0; i<n; i++)
        {
                cin>>arr[i];
        }
        std::cin>>num;
        for(i=0; i<n; i++)
        {
                if(arr[i]==num)
                {
                        cnt=1;
                        pos=i+1;
                        break;
                }
        }
        if(cnt==0)
        {
                std::cout<<"She failed";
        }
        else
        {
                cout<<"She passed her exam";
        }
        return 0;
}