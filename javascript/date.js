var todayDate=new Date();
console.log('todays date',todayDate);
console.log('day',todayDate.getDay());
console.log('year',todayDate.getFullYear());
console.log('month',todayDate.getMonth());
console.log('date',todayDate.getDate());

var constMilli=new Date(0);
console.log('date',constMilli);
var constString=new Date('Nov 10');
console.log('Date String Constructor',constString);
var constYear=new Date('2017,10');
console.log('Date Year Constructor',constYear);

