#include<bits/stdc++.h>
#include<iostream>
using namespace std;
bool chkHarshad(int n)
{
    int s = 0;
	int tmp;
    for (tmp=n; tmp>0; tmp /= 10)
        s += tmp % 10;
    return (n%s == 0);
}
int main()
{
    int hdno;
 std::cin>>hdno; 
     if( chkHarshad(hdno))
        std::cout<<"Harshad Number";
    else
        std::cout<<"Not Harshad Number";
    return 0;
}