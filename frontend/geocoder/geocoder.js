var fs = require('fs');
var NodeGeocoder = require('node-geocoder');

var options = {
 provider: 'google',
 httpAdapter: 'https',
 apiKey: 'AIzaSyAlaiXh8F20sHAC1PQ4f9LDCtLBeE--hgY',
 formatter: null 
};

var geocoder = NodeGeocoder(options);

var airportJSON, recJSON;

fs.readFile('airports.json', 'utf8', function(err, data) {  
    if (err) throw err;
    else airportJSON = JSON.parse(data);
});

fs.readFile('rec.json', 'utf8', function(err, data) {  
    if (err) throw err;
    else recJSON = JSON.parse(data);
});

console.log(airportJSON);

geocoder.geocode('', function(err, res) {
    console.log(res);
});