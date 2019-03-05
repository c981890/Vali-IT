console.log("Töötan!")

// 1. ül: Alla laadida APIst tekst. (asynf ja await on javascripti spetsiifilised. Asyncita await ei tööta. Kui vastuseks on status 200, on hea. 404 error fail)

var refreshMessages = async function() {
	//funktsioon läks käima
	console.log("Start läks käima")
	//pärin info APIst. Salvestan stringi muutujasse.
	var APIurl = "http://localhost:8080/chat/general"
	// fetch teeb päringu serverisse (meie defineeritud aadress)
	var request = await fetch(APIurl)
	// funktsioon läks käima
	console.log(request)
	//json() käsk vormindab meile data mugavaks Jsoniks
	var json = await request.json()
	console.log (json);



	//Kuvame Jsoni user sõnumit "Teretulemast!" HTMLis.
	//Converting a string to a native object is called parsing, while converting a native object 
	//to a string so it can be transmitted across the network is called stringification
	//Kui muudame uuesti jsoniks+stringify juurde, kuvabki browseris 
	//testi asemel pikka message linki. "message"."Test" teksti asendasime jsoni käsu.
	// document.querySelector('#jutt' (mis tegelikult => div[id="jutt"]).innerHTML = JSON.stringify(json)
	
	//Kuva serverist saadud info htmlis ehk browseri lehel. 
	//lisad
	// sama saab ka nii (while(json.sonumid.lenght > 0))
	document.querySelector('div[id="jutt"]').innerHTML = ""
	var sonumid = json.messages
	while (sonumid.length > 0) { //kuniks sõnumeid on
		var sonum = sonumid.shift() //pop muutsin shiftiks
		// lisa HTMLi #jutt sisse sonum.message
		document.querySelector('div[id="jutt"]').innerHTML += 
		"</p>"+ sonum.user + ": " + "<br>" + sonum.message + "</p>" //p - eraldi reale
	
	}
	//scrolli kõige alla, jube tüütu.
	window.scrollTo(0,document.body.scrollHeight);
}
//iga sekund history kahekordistub
setInterval(refreshMessages, 1000) //1000 on sekund

document.querySelector('form').onsubmit = function(event) {
	event.preventDefault()
	var username = document.querySelector('#username').value
	var message = document.querySelector('#message').value //message value= tee input tühjaks "" läheb tühjaks.
	console.log(username, message)
//KUNA TEISEST BLOKSIST VÄLJA INFO EI LEVI, PEAN UUESTI api LOOMA
//post päring postitab uue andmetüki serverisse
	var APIurl = "http://localhost:8080/chat/general/new-message"
	fetch(APIurl, {
		method: "POST",
		//username: ja message: on serveri päring minule
		//turvalisuse pärast on standardid, ja kui neid ei meeti, tuleb error:415
		body: JSON.stringify({user: username, message: message}),
		//metainfo
		headers: { 
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		}
	})
}
