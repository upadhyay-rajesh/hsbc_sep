module Listing1_24 {

    function getAverage(a: number, b: number, c: number): number {
        var total = a + b + c;
        var average = total / 3;
        return  average;
    }

    var result = getAverage(4, 3, 8); // 'The average is 5'
	console.log(result);

} 