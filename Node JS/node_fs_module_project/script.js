const fs = require('fs');

// async call
fs.readFile('./hello.txt',(err,data) => {
	if(err){
		console.log('errrr');
	}

	console.log(data.toString());
});

//sync calls
const file = fs.readFileSync('./hello.txt');
console.log('readFileSync',file.toString());

// write data to file

// creates new file if file not present

// fs.appendFile('./hello.txt','cooll!!!!',err =>{
// 	if(err){
// 		console.log('error appending file');
// 	}
// })

 // Write file
 fs.writeFile('bye.txt','Good Byeee !!!!',err => {
 	if(err){
 		console.log(err);
 	}
 });

 //Delete file
 fs.unlink('./bye.txt',err => {
 	if(err){
 		console.log(err);
 	}

 	console.log('file deleted successfully');
 })