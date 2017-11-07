$(document).ready(function() {
    $.ajax({xhrFields: {withCredentials: false},
        url: "json.txt",
        headers: { 'Access-Control-Allow-Origin': '*' }
    }).then(function(rawData) {
       const data=JSON.parse(rawData).data;

       $('.form-content').append(data.name);
       for (var i=0;i<data.fields.length;i++){
         $('.form-title').append(data.fields[i]);
         $('#title').val(data.fields[i]);
       }
    });
});

// 20171006115811
// https://web.testmatter.info/dm/rest/public/forms/909090
