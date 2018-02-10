	var telefoneModulo = angular.module('telefoneModulo', []);
	
	telefoneModulo.controller("telefoneController", function ($scope, $http){
		
		urlCadastro = 'http://localhost:8080/DesenvolvedorJRMV/rest/cadastros';
		urlTelefone = 'http://localhost:8080/DesenvolvedorJRMV/rest/telefones';
		
		$scope.listarTelefones = function() {
			
			$http.get(urlTelefones).success(function(telefones) {
				$scope.telefones = telefones;
				
			}).error(function (erro) {
				alert(erro);
				
			});
			
		}
		
		$scope.listarCadastros = function() {
			
			$http.get(urlCadastro).success(function(cadastros) {
				$scope.telefones = telefones;
				
			}).error(function (erro) {
				alert(erro);
				
			});
			
		}
		
		$scope.selecionaTelefone = function(telefoneSelecionado) {
			$scope.telefone = telefoneSelecionado;
		}

		$scope.limparCampos = function() {
			$scope.telefone = null;
		}
		
		$scope.salvar = function() {
			alert($scope.telefone.id);
			
			if ($scope.telefone.id == undefined) {
				alert("POST - Código vazio = novo registro");
				console.log("POST - Código vazio = novo registro");
				$http.post(urlTelefones, $scope.telefone).success(function(telefone) {
					$scope.telefones.push($scope.telefone); //push = salva e altera dados BD.
					$scope.limparCampos();
				}).error(function (erro) {
					alert(erro);
					
				});
				
			}
			
			else {
				alert("PUT - Código !vazio = alterar registro");
				console.log("PUT - Código !vazio = alterar registro");
				
				$http.put(urlTelefones, $scope.telefone).success(function(telefone) {
					$scope.listarTelefones();
					$scope.limparCampos();
				}).error(function (erro) {
					alert(erro);
					
				});
			}
	
		}
		
		$scope.excluirTelefone = function() {
			if ($scope.telefone.id == undefined) {
				alert("Favor selecionar um registro");
				console.log("Favor selecionar um registro");
				
			}
			else {
				alert("DELETE - Código !vazio = excluir registro");
				console.log("DELETE - Código !vazio = excluir registro");
				
				$http.delete(urlTelefones + '/' + $scope.telefone.id).success(function() {
					$scope.listarTelefones();
					$scope.limparCampos();
				}).error(function(erro) {
					alert(erro);
				});
				
			}
			
		}
		
		//executar
		$scope.listarCursos();
		$scope.listarTelefones();

	});