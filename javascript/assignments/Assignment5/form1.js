function validation(){
    let len1=username.value.length;
    let len2=password.value.length;
    if(len1>5 && len2>6)
    document.getElementById("b1").disabled=false;
    else
    document.getElementById("b1").disabled=true;    
  }