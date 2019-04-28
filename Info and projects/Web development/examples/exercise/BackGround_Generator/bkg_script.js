var css =  document.querySelector("h3");
var color1 = document.querySelector('input[name = "color1"]'); // get element by name using query selector
var color2 = document.querySelector("#test2"); // get element by id
var body = document.getElementById("gradient");

console.log(body);


color1.addEventListener("input",changeGradient);
color2.addEventListener("input",changeGradient);

function changeGradient(){
	body.style.background = "linear-gradient(to right,"+color1.value+","+color2.value+")";

	css.textContent = body.style.background; // best updates the text content in css property.
	//css.innerHTML = body.style.background; // innerHTML works by adding value but is not recommended to use.
	//css.appendChild(document.createTextNode( body.style.background)); // every time there is event it adds new child.
}

function testButton(){
	alert("button is clicked");
}