var contextPath = window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));

function getProducts() {
	$.ajax({
	       url: contextPath + '/product/selection?customerId=' + $('#customerId').val(),
	       type: 'get',
	       dataType: 'json',
	       'contentType': 'application/json',	       
	       success: function (data) {
	    	   constructTable(data);
	       }
	   });
}

function constructTable(data){
	var table = $('#example');
	table.find("tr:gt(0)").remove();
    $.each(data, function(i, item) {
    	createTable(table, item);
    });
}

function createTable(table, d) {
	var row = $('<tr></tr>');		
		row.append($('<td></td>').html($("<input>").attr('type', 'checkbox').val(d.product)
			   .prop('checked', 'false')));
		row.append($('<td></td>').text(d.category));
		row.append($('<td></td>').text(d.product));
		row.append($('<td></td>').text(d.location));   
	 table.append(row);
}

function submit(){
$('#frm-example').on('submit', function(e){
    var form = this;
    var table = $('#example');
    table.$('input[type="checkbox"]').each(function(){
       if(!$.contains(document, this)){
          if(this.checked){ 
             $(form).append(
                $('<input>')
                   .attr('type', 'hidden')
                   .attr('name', this.name)
                   .val(this.value)
             );
          }
       } 
    });
 });
}