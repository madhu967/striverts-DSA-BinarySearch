static int findFloor(int[] arr, int n, int x) {
    int low = 0, high = n - 1;
    int ans = -1;

    while (low <= high) {
        int mid = (low + high) / 2;

        // maybe an answer
        if (arr[mid] <= x) {
            ans = arr[mid]; // store this element
            low = mid + 1; // but try to find a bigger one (closer to x)
        } else {
            high = mid - 1; // too big, go left
        }
    }
    return ans;
}


// ex-
//   arr = [1, 2, 4, 6, 10], x = 5
//   mid=2 → arr[2]=4 (≤5)  store ans=4, move right

//   mid=3 → arr[3]=6 (>5)  move left

//   loop ends → floor = 4 
