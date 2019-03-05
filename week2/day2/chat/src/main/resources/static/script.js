console.log("Töötan")

// 1. alla laadida API'st tekst

var refreshMessages = async function () {
	console.log("refreshMessages läks käima")
	var APIurl = "http://localhost:8080/chat/general/"
	var request = await fetch(APIurl)
	console.log(request)
	var json = await request.json()

	// kuva serverist saadud info html-is (ehk lehel)
	document.querySelector('#jutt').innerHTML = ""
	var sonumid = json.messages
	while (sonumid.length > 0) {
		var sonum = sonumid.shift()

		// lisa htmli #jutt sisse sonum.message
		document.querySelector('div[id = "jutt"]').innerHTML +=  // '#jutt' == 'div[id = jutt]'
		    "<p>" + sonum.user + ": " + sonum.message + sonum.url +"<p>"
		}
        // window.scrollTo(0, document.body.scrollHeight);
	}

	// document.querySelector('#jutt').innerHTML = JSON.stringify(json)	

setInterval(refreshMessages, 1000)

document.querySelector('form').onsubmit = function(event) {
	event.preventDefault()
	var username = document.querySelector('#username').value
	var message = document.querySelector('#message').value
	var url = document.querySelector('#profiiliPildiURL').value
	document.querySelector('#message').value = "" // tee input tühjaks
	console.log(username, message)
    
    var APIurl = "http://localhost:8080/chat/general/new-message"
	fetch(APIurl, {
		method: "POST",
		body: JSON.stringify({user: username, message: message, url: url}),
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		}
	})
}


