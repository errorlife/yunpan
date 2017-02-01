/*
// the code of about upload pic
//
// @author: errorlife <steffan.cn>
//
//  - 
//  - 
//  - 
//  - 
*/

$('input[type="submit"]').click(function(){
	console.log("start upload...");
	$('input[type="file"]').ajaxfileupload({
		action: '/uploadController',
		onComplete: function(response) {
		    console.log(JSON.stringify(response));
		  },
		  onStart: function() {
			console.log("start");
		    if(weWantedTo) return false; // cancels upload
		  },
		  onCancel: function() {
		    console.log('no file selected');
		  }
	});
});

