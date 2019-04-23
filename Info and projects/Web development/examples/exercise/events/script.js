var button = document.getElementById("enter");
var input = document.getElementById("userinput");
var ul = document.querySelector("ul");
var listItems = document.getElementsByTagName("li");

function userInput(){
	return input.value;
}

function createListElement(){
	 var li = document.createElement("li");	  
	  li.appendChild(document.createTextNode(userInput()));
	  li.appendChild(createDeleteButton());
	  ul.appendChild(li);
}

function createDeleteButton(){
	var button = document.createElement("button");
	button.innerHTML = "Delete"

	button.addEventListener("click",deleteElement);

	return button;
}

function  checkInput() {

 if(input.value.length != 0){
 	return true;
 }
 	return false;
}

function addItemOnClick() {

	 if(checkInput())
		 {
			createListElement(); 
	   	 }
}


function addItemOnEnter(event){

	if(checkInput() && event.keyCode === 13 ){

		createListElement();

	}
}


function deleteElement(event){


	var parent = event.target.parentElement.parentElement;
	parent.removeChild(event.target.parentElement);
}

function done(event){


	var clkdElement = event.target;

		clkdElement.classList.toggle("done");

		// if(clkdElement.getAttribute("class") === "null")
		// {
		// 		clkdElement.setAttribute("class","done");
		// }
		// else{
		// 	clkdElement.setAttribute("class",null);	
}


button.addEventListener("click",addItemOnClick);
	

//add element on press of enter

input.addEventListener("keypress",addItemOnEnter);

for(i  = 0; i < listItems.length;i++) {

	listItems[i].addEventListener("click",done);

	// add event listener on click of button

	var delChildBtn = listItems[i].children[0];

	delChildBtn.addEventListener("click",deleteElement);



}





