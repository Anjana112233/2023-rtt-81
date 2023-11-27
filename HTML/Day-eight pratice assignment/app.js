function sumArray(numbers) {
    let sum = 0;
  
    for (let i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
  
    return sum;
  }
  
  const myNumbers = [1, 2, 3, 4, 5];
  const total = sumArray(myNumbers);
  console.log(total);
  