
// Info saatmine veebilehelt serverisse.
var url = "http://localhost:8080/list"
document.querySelector("#kasutajainfo").onsubmit = function(e) {
    console.log("onsubmit toimib")
    e.preventDefault() // siis ei refreshi automaatselt
    var nimi = document.querySelector("#nimi").value
    var vanus = document.querySelector("#vanus").value
    fetch(url, {
        method: "POST",
        body: JSON.stringify({nimi, vanus}),
        headers: {
            'Accept': 'application/json',
        	'Content-Type': 'application/json'
        	}
    })
}


// Info küsimine serverist.
// var refreshMessages =
async function myFunction() {
    	console.log("refreshMessages läks käima")
        var url = "http://localhost:8080/tulemus"
       	var request = await fetch(url)
  		var kasutajad = await request.json();

        while (kasutajad.length > 0) { // kuniks sõnumeid on
        		var kasutaja = kasutajad.shift()
        		// lisa HTMLi #jutt sisse sonum.message
        		document.getElementById("tulemused").innerHTML += kasutaja
        }
}