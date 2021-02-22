var arr: number[] = [1, 2, 3, 4, 5];

var arr2: Array<string> = ["a", "b", "c", "d", "e"];

console.log(arr);

console.log(arr2);
var i=0;
for(;i<arr.length;i++)
{
    console.log(arr[i]);
}

for(let ar of arr2 )
{
    console.log(ar);
} 