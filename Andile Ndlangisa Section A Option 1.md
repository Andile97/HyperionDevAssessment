#Andile Ndlangisa Review Section A Option 1
class Solution:
-The defination of the class is correct 
    def groupAnagrams(self, strs):
    -Defining a function is correct from line 9 to line 17 there is an indetation error so the code will not be excuted. To fix the indetation error use tab button after declaring your funcion.
    result = {}
    for i in strs:
        x = "".join(sorted())
        -After defining x, insert i inside the function sorted as join(sorted(i))
        if x in result:
            result[x].append(i)
        else:
            result[x] = [i]
    return list(result.values())
ob1 = Solution()
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))


Other lines are correct and efficiency it is just few lines of codes that will results an error.
Documentation the student must be aware on how to complete  python reserved functions and indetation.







 
  