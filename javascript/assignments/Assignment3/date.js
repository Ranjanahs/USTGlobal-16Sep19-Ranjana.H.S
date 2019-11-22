
    console.log('date in words')
    var da=['sunday','monday','tuesday','wednesday','thursday','friday','saturday'];
    var month=['jan','feb','mar','apr','may','june','july','aug','sep','oct','nov','dec'];
    var date=new Date();
    var day=date.getDay();
    var mon=date.getMonth();
    console.log('Day/Month/Year');
    console.log(da[day],month[mon],date.getFullYear());

    
    