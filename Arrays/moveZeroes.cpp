#include <iostream>
#include <algorithm> // For std::swap

void moveZeroes(int n, int a[]);

int main() {
    int arr[] = {0, 1, 0, 3, 12};
    int n = sizeof(arr) / sizeof(arr[0]);

    moveZeroes(n, arr);

    for (int i = 0; i < n; i++) {
        std::cout << arr[i] << " ";
    }

    return 0;
}

void moveZeroes(int n, int a[]) {
    int j = -1;
    
    // Find the first occurrence of zero
    for (int i = 0; i < n; i++) {
        if (a[i] == 0) {
            j = i;
            break;
        }
    }
    if (j == -1) return; // If no zero is found, return

    // Move non-zero elements forward and zeroes to the end
    for (int i = j + 1; i < n; i++) {
        if (a[i] != 0) {
            std::swap(a[i], a[j]);
            j++;
        }
    }
}
