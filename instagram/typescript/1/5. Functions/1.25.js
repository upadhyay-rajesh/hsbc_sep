var Listing1_25;
(function (Listing1_25) {
    function getAverage(a, b, c) {
        var total = a;
        var count = 1;
        total += b;
        count++;
        console.log(c);
        if (typeof c !== 'undefined') {
            total += c;
            count++;
            console.log("inside if  " + total + "  " + count);
        }
        console.log(total + "  " + count);
        var average = total / count;
        return 'The average is ' + average;
    }
    var result = getAverage(4, 6, 6); // 'The average is 5'
    console.log(result);
})(Listing1_25 || (Listing1_25 = {}));
