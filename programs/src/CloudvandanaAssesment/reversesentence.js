// Take a sentence as an input and reverse every word in that sentence. 
// a. Example - This is a sunny day > shiT si a ynnus yad.
const str = prompt("Enter sentence : ");
const words = str.split(' ');

const reverseword=words.map(word=>{
   return word.split('').reverse().join(''); 
});
const reversedsentence = reverseword.join(' ');
console.log(reversedsentence);