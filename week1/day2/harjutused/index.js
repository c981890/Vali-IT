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
Meil on linnade nimekiri aga ilma sõnata "linn".
Need palun lisada.
*/


var linnad = ["Tallinn", "Tartu", "Valga"]
var uuedLinnad = []

while (linnad.length > 0) {
	var linn = linnad.pop()
	var uusLinn = linn + " linn"
	uuedLinnad.push(uusLinn)
}

console.log(uuedLinnad)

/*
Eralda poiste ja tüdrukute nimed.
*/

var nimed = ["Margarita", "Mara", "Martin", "Kalev"]
var poisteNimed = []
var tydrukuteNimed = []
var lastChar = ''

while (nimed.length > 0) {
	// "a" lõpuga on tüdruku nimi
	// kui on poisi nimi, siis lisa see poisteNimed listi
	// kui on tüdruku nimi, siis lisa see tydrukuteNimed listi
	var nimi = nimed.pop()
	var lastChar = nimi.substr(nimi.length - 1)

	if (lastChar == 'a') { // nimi.endsWith('a') saab ka kasutada
		tydrukuteNimed.push(nimi)
	} else {
		poisteNimed.push(nimi)
	}
}

console.log(tydrukuteNimed)
console.log(poisteNimed)


// ctrl + klikk saab mitu kursorit
// ctrl + enter tekitad uue rea
// console.log("muutuja", muutuja) prindib

/* Funktsioonid */

/*
    Kirjuta algoritm, mis suudab ükskõik mis naise/mehe
    nime eristada.
*/

var eristaja = function(nimi) {
	if (nimi.endsWith('a')) {
		return "tüdruk"
	} else {
		return "poiss"
	}
}

var praeguneNimi = "Peeter"
var kumb = eristaja (praeguneNimi)
console.log(kumb)


/*
Loo funktsioon, mis tagastab vastuse küsimusele, kas tegu on
numbriga?
!isNaN(4)
*/

var kasOnNumber = function(param) {
	return !isNaN(param)
}

console.log(kasOnNumber(4))
console.log(kasOnNumber("mingi sõne"))
console.log(kasOnNumber(23536))
console.log(kasOnNumber(6.876))
console.log(kasOnNumber(null))
console.log(kasOnNumber([1, 4, 5, 6]))


/*
    Kirjuta funktsionn, mis võtab vastu kaks numbrit
    ja tagastab nende summa.
*/

var summa = function(liidetav1, liidetav2) {
	return liidetav1 + liidetav2
}

console.log(summa(4, 5))
console.log(summa(6.555, 2))
console.log(summa(23536, 0))


/*

*/
console.log("---------------------")

var inimesed = {
	"kaarel": 34,
	"Margarita": 10,
	"Suksu": [5, 3, 9], 
	"Krister": {
		vanus: 30,
		sugu: true
	}
}

console.log(inimesed["kaarel"])
console.log(inimesed.kaarel)
console.log(inimesed.Krister.sugu)
console.log(inimesed.Suksu[1])






