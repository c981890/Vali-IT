console.log("Hello World!")

document.body.innerHTML += "<p>Tere!</p>"

/* document.querySelector("ul li").innerHTML = "Muudetud" */

document.querySelector("form").onsubmit = function(e) {
	e.preventDefault()
	var nimeInput = document.querySelector("#nimi")
    console.log(nimeInput.value)
    document.querySelector("ul li").innerHTML = "Tere, " + nimeInput.value + "!"
    if (nimeInput.value == "Aiki") {
        document.body.innerHTML += "<p>Tere, " + nimeInput.value + "!</p>"

    } else {
    	document.body.innerHTML += "<p>Kes sa oled üldse, " + nimeInput.value + "?</p>"
    }
    
}





