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

