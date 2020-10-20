var Listing1_27;
(function (Listing1_27) {
    function getAverage(b) {
        var a = [];
        for (var _i = 1; _i < arguments.length; _i++) {
            a[_i - 1] = arguments[_i];
        }
        var total = 0;
        var count = 0;
        for (var i = 0; i < a.length; i++) {
            total += a[i];
            count++;
        }
        var average = total / count;
        return b + ' The average is ' + average;
    }
    var result = getAverage("i am vararg concept ", 2, 4, 6, 8, 10); // 'The average is 6'
    console.log(result);
})(Listing1_27 || (Listing1_27 = {}));
