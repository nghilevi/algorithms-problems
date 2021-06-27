// hash table ways
/*
O(N) T: traverse array once
O(N) S: add value to hash table
*/
function get2NumSum(inputArr, targetSum) {
  var results = [],
    potentials = {};
  for (let num of inputArr) {
    var potentialMatch = targetSum - num;
    if (potentials[num]) {
      return [potentialMatch, num];
    } else {
      potentials[potentialMatch] = true;
    }
  }
}



// sort first then sum
// O(nlogn) T

function get2NumSum(inputArr, targetSum){
	inputArr.sort((a,b) => a-b)
var sum;
	var left = 0, leftVal;
	var right = inputArr.length -1, rightVal;
while(left < right){
		leftVal = inputArr[left]
		rightVal = inputArr[right]
		sum = leftVal + rightVal
		if(sum === targetSum){
			return [leftVal, rightVal]
		}else if(sum < targetSum){
			left++;
		}else if(sum > targetSum){
			right--;
		}
	}
  
  return [];
}