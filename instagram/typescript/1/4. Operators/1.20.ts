module Listing1_20 {

    // Empty strings are falsey
    var errorMessages = '';

    // result is 'Saved OK'
    var result2 = errorMessages || 'Saved OK';
console.log(result2);

 var result22 = errorMessages && 'Saved OK';
console.log(result22);

    // Filled strings are truthy
   var errorMessages1 = 'Error Detected';

    // result is 'Error Detected'
   var result = errorMessages1 || 'Saved OK1';

	console.log(result);
	
	var result1 = errorMessages1 && 'Saved OK1';
	
	console.log(result1);

    var undefinedLogger;

    // if the logger isn't initialized, substitute it for the result of the right-hand expression
    var logger = undefinedLogger || { log: function (msg: string) { console.log(msg); } };

    // alerts 'Message'
   logger.log('Message');

} 