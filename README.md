# LeetCode Solutions Repository

This folder contains various LeetCode problem solutions implemented in Java. Each file corresponds to a specific problem, named according to the problem title and ID.

## 🚀 How to Use These Solutions

To test or run any of the solutions in this repository, follow these steps:

### 1. Create a Java File
Create a new file named `Solution.java` in your local environment.

### 2. Copy the Code
Open the desired problem file (e.g., `TwoSum_1.java`) and copy the logic into your `Solution.java` file. 

> [!NOTE]
> Make sure the class name in your code matches the filename (`Solution`).

### 3. Add a Main Method
Since most of these files contain only the solution logic, you will need to add a `main` method to pass sample values and print the results.

---

## 📝 Example Walkthrough

If you want to run the **Two Sum** solution:

1. **Create `Solution.java`**
2. **Paste and modify the code as follows:**

```java
public class Solution {
    // Paste the method logic here
    public int[] twoSum(int[] nums, int target) {
        int[] arr1 = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr1[0] = i;
                    arr1[1] = j;
                }
            }
        }
        return arr1;
    }

    // Add the main method to pass values
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = sol.twoSum(nums, target);
        
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
```

3. **Compile and Run:**
   ```bash
   javac Solution.java
   java Solution
   ```

---
*Happy Coding!* 🎯
