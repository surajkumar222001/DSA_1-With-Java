var plusOne = function(digits) {
    let integer = digits.reduce((accum, digit) => (accum * 10) + digit, 0);
       integer++;
   const res = Array.from(String(integer), Number);
   return res
};