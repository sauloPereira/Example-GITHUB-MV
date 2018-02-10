/**
 * 
 */


$('.delete-pessoa').on('click', function (){
		/*<![CDATA[*/
	    var path = /*[[@{/}]]*/'deleteCadastro';
	    /*]]>*/
		
		var id=$(this).attr('id');
		
		bootbox.confirm({
			message: "Esta certo do cancelamento? Isto não poderá ser desfeito.",
			buttons: {
				cancel: {
					label:'<i class="fa fa-times"></i> Cancel'
				},
				confirm: {
					label:'<i class="fa fa-check"></i> Confirm'
				}
			},
			callback: function(confirmed) {
				if(confirmed) {
					$.post(path, {'id':id}, function(res) {
						location.reload();
					});
				}
			}
		});
	});
	
	
	
//	$('.checkboxBook').click(function () {
//        var id = $(this).attr('id');
//        if(this.checked){
//            bookIdList.push(id);
//        }
//        else {
//            bookIdList.splice(bookIdList.indexOf(id), 1);
//        }
//    })
	
	$('#deleteSelected').click(function() {
		var idList= $('.checkboxBook');
		var bookIdList=[];
		for (var i = 0; i < idList.length; i++) {
			if(idList[i].checked==true) {
				bookIdList.push(idList[i]['id'])
			}
		}
		
		console.log(pessoaIdList);
		
		/*<![CDATA[*/
	    var path = /*[[@{/}]]*/'removeList';
	    /*]]>*/
	    
	    bootbox.confirm({
			message: "Esta certo do cancelamento? Isto não poderá ser desfeito.",
			buttons: {
				cancel: {
					label:'<i class="fa fa-times"></i> Cancel'
				},
				confirm: {
					label:'<i class="fa fa-check"></i> Confirm'
				}
			},
			callback: function(confirmed) {
				if(confirmed) {
					$.ajax({
						type: 'POST',
						url: path,
						data: JSON.stringify(pessoaIdList),
						contentType: "application/json",
						success: function(res) {
							console.log(res); 
							location.reload()
							},
						error: function(res){
							console.log(res); 
							location.reload();
							}
					});
				}
			}
		});
	});
	
	$("#selectAllPessoas").click(function() {
		if($(this).prop("checked")==true) {
			$(".checkboxBook").prop("checked",true);
		} else if ($(this).prop("checked")==false) {
			$(".checkboxBook").prop("checked",false);
		}
	});





/*
$(document).ready(function() {
	
	
	<![CDATA[
	var path = [[@{/}]]'remove';
	]]>
	
	
	var id=$(this).attr('id');
	
	bootbox.confirm({
		message: "Esta certo do cancelamento? Isto não poderá ser desfeito.",
		buttons: {
			cancel: {
				label:'<i class="fa fa-times"></i> Cancel'
			},
			confirm: {
				label: '<i class="fa fa-check"></i> Confirm'
			}
		},
		callback: function(confirmed) {
			if (confirmed) {
				$.post(path, {'id' :id}, function(res) {
					location.reload();
				});
			}
		}
			
	});

	
});
*/