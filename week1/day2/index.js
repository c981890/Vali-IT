console.log("Hommik!")

var sisend = 5
var tulemus
// Kui on vähem kui 7 siis korruta kahega. 
// Kui suurem, siis jaga kahega.
// Kui ongi 7 siis jäta samaks.

if (sisend < 7) {
	var tulemus = sisend * 2
} else if (sisend > 7) {
	var tulemus = sisend / 2
} else if (sisend == 7) {
	var tulemus = sisend
}

console.log("Tulemus on: " + tulemus)

/*
Kui sõned on võrdsed, siis prindi üks,
kui erinevad, siis liida kokku ja prindi.
*/

var str1 = "banaan"
var str2 = "apelsin"
var tulemus

if (str1 == str2) {
	tulemus = 1
} else if (str1 != str2) {
	tulemus = str1 + str2
}

console.log("Tulemus on: " + tulemus)

/*
Mei on linnade nimekiri aga ilma sõnata "linn". Need palun lisada.
*/


var linnad = ["Tallinn", "Tartu", "Valga"]
var uuedLinnad = []

while (linnad.length > 0) {
	var linn = linnad.pop()
	var uusLinn = linn + " linn"
	uuedLinnad.push(uusLinn)
}

console.log(uuedLinnad)









