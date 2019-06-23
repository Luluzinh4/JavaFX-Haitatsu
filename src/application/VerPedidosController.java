package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VerPedidosController {

    @FXML
    private TextField codPedido;

    @FXML
    private TextField clientePedido;

    @FXML
    private TextField produtoPedido;

    @FXML
    private TextField qtdPedido;

    @FXML
    private TextField vlTotalPedido;

    @FXML
    private TextField fpPedido;

    @FXML
    private TextField ultStatusPedido;

    @FXML
    private Button btnVerCancelar;

    @FXML
    private Button btnVerPesquisar;

    @FXML
    private TextField resultConfirm;

    @FXML
    void limparCampo(MouseEvent event) {
    	String resultado = resultConfirm.getText();
    	
    	if(!resultado.isEmpty()) {
    		resultConfirm.clear();
    	}
    }

    @FXML
    void pesquisarPedido(ActionEvent event) {
    	String codigo = codPedido.getText();
    	//Integer valor = Integer.parseInt(codigo);
    	
    	if(codigo.equals("123")) {
    		clientePedido.setText("Luiza Perez");
    		produtoPedido.setText("Corrente de Prata");
    		qtdPedido.setText("25");
    		vlTotalPedido.setText("R$ 560,00");
    		fpPedido.setText("Transfer�ncia");
    		ultStatusPedido.setText("Aguardando Aprova��o");
    	} else {
    		limparTela();
    		codPedido.clear();
    		resultConfirm.setText("C�digo Inv�lido!");
    	}
    }

    @FXML
    void voltarPedidos(ActionEvent event) {
    	Pedidos ped = new Pedidos();
    	fecharTela();
    	ped.start(new Stage());
    }
    
    void fecharTela() {
    	VerPedidos.getStage().close();
    }

    void limparTela() {
    	codPedido.clear();
    	clientePedido.clear();
    	produtoPedido.clear();
    	qtdPedido.clear();
    	vlTotalPedido.clear();
    	fpPedido.clear();
    	ultStatusPedido.clear();
    	//motivoExcPedido.setId("0");
    }
    
}