const http = require('http');
const server = http.createServer((request,response) => {

	console.log("request received by server");
});
server.listen(3000);