function getData(){
    return new Promise(function(resolve,reject){
        var request = new XMLHttpRequest();
        request.open('GET', 'https://jsonplaceholder.typicode.com/photos', true)
        request.onreadystatechange = function(){
            if(this.readyState == 4 && this.status == 200){
                var response = this.responseText;
                var data = JSON.parse(response);
                resolve(data);
            }
        }
        request.send();
    });
}