static int findCeil(int[] arr, int n, int x) {
    int low = 0, high = n - 1;
    int ans = -1;

    while (low <= high) {
        int mid = (low + high) / 2;

        if (arr[mid] >= x) {
            ans = arr[mid]; // possible ceil
            high = mid - 1; // try to find a smaller one on the left
        } else {
            low = mid + 1; // arr[mid] < x, go right
        }
    }
    return ans;
}


// ex-
//   arr = [1, 2, 4, 6, 10], x = 5
//   mid=2 → arr[2]=4 (<5) → move right

//   mid=3 → arr[3]=6 (≥5)  store ans=6, move left

//   loop ends → ceil = 6 
