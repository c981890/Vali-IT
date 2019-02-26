console.log("Töötan")

// 1. alla laadida API'st tekst

var start = async function () {
	console.log("Start läks käima")
	var APIurl = "http://138.197.191.73:8080/chat/general"
	var request = await fetch(APIurl)
	console.log(request)
	var json = await request.json()

	// kuva serverist saadud info html-is (ehk lehel)
	var sonumid = json.messages
	while (sonumid.length > 0) {
		var sonum = sonumid.pop()

		// lisa htmli #jutt sisse sonum.message
		document.querySelector('#jutt').innerHTML += 
		    sonum.user + ": " + sonum.message

	}


	// document.querySelector('#jutt').innerHTML = JSON.stringify(json)

}

start()