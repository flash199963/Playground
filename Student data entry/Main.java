#include<iostream>
#include<stdio.h>
using namespace std;
struct student
{
        char sname[20];
        int rollno;
        int marks;
};
int main()
{
        struct student st;

        gets(st.sname);   
        cin>>st.rollno;
        cin>>st.marks;

        cout<<"\nStudent Details";
        cout<<"\nName: "<<st.sname;
        cout<<"\nRoll: "<<st.rollno;
        cout<<"\nMarks: "<<st.marks;
        return 0;
}