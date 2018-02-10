var cadastrosModulo = angular.module('cadastrosModulo', []);
	
	cadastrosModulo.controller("cadastrosController", function ($scope, $http){
		
		urlCadastro = 'http://localhost:8080/DesenvolvedorJRMV/rest/cadastros';
		
		$scope.listarCadastros = function() {
			
			$http.get(urlCadastro).success(function(cadastros) {
				$scope.cadastros = cadastros;
				
			}).error(function (erro) {
				alert(erro);
				
			});
			
		}
		
		$scope.selecionaCadastro = function(cadastroSelecionado) {
			$scope.cadastro = cadastroSelecionado;
		}

		$scope.limparCampos = function() {
			$scope.cadastro = null;
		}
		
		$scope.salvar = function() {
			//alert($scope.professor.codigo);
			
			if ($scope.cadastro.id == undefined) {
				//alert("POST - Código vazio = novo registro");
				//console.log("POST - Código vazio = novo registro");
				$http.post(urlCadastro, $scope.cadastro).success(function(cadastro) {
					//$scope.professores.push($scope.professor); //push = salva e altera dados BD.
					$scope.limparCampos();
					$scope.listarCadastros();
				}).error(function (erro) {
					alert(erro);
					
				});
				
			}
			
			else {
				//alert("PUT - Código !vazio = alterar registro");
				//console.log("PUT - Código !vazio = alterar registro");
				
				$http.put(urlCadastro, $scope.cadastro).success(function(cadastro) {
					$scope.listarCadastros();
					$scope.limparCampos();
				}).error(function (erro) {
					alert(erro);
					
				});
			}
	
		}
		
		$scope.excluir = function() {
			if ($scope.cadastro.id == undefined) {
				alert("Favor selecionar um registro");
				console.log("Favor selecionar um registro");
				
			}
			else {
				//alert("DELETE - Código !vazio = excluir registro");
				//console.log("DELETE - Código !vazio = excluir registro");
				
				$http.delete(urlCadastro + '/' + $scope.cadastro.id).success(function() {
					$scope.listarCadastros();
					$scope.limparCampos();
				}).error(function(erro) {
					alert(erro);
				});
				
			}
			
		}
		
		//executar
		$scope.listarCadastros();

	});