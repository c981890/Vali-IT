
// Info saatmine veebilehelt serverisse.
var url = "http://localhost:8080/list"
document.querySelector("#kasutajainfo").onsubmit = async function(e) {
    console.log("onsubmit toimib")
    e.preventDefault() // siis ei refreshi automaatselt
    var nimi = document.querySelector("#nimi").value
    var vanus = document.querySelector("#vanus").value
    await fetch(url, {
        method: "POST",
        body: JSON.stringify({nimi, vanus}),
        headers: {
            'Accept': 'application/json',
        	'Content-Type': 'application/json'
        	}

    })
    refreshMessages()
}


// Info küsimine serverist.
// var refreshMessages =
var refreshMessages = async function() {
    	console.log("refreshMessages läks käima")
        var url = "http://localhost:8080/tulemus"
       	var request = await fetch(url)
  		var kasutajad = await request.json();
  		var isikuteHTML = ""
  		for (var isik of kasutajad) {
  		    var nimi = isik.nimi
  		    var vanus = isik.vanus
  		    isikuteHTML += "Nimi: " + nimi + " vanus: " + vanus + "<br>"
  		}
  		document.querySelector("#tulemused").innerHTML = isikuteHTML

}