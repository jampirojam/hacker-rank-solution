#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int array;
    cin >> array;
    int arr[array];
    for (int i = 0; i < array; i++)
        cin >> arr[i];
    for (int i = array - 1; i >= 0; i--)
        cout << arr[i] << " ";
    return 0; 
}
