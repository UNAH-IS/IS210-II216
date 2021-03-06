package application;

import java.net.URL;
import java.util.ResourceBundle;

import clases.Color;
import clases.Marca;
import clases.Modelo;
import clases.Telefono;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControladoRegistroTelefonos implements Initializable{
	@FXML private ComboBox<Marca> cboMarcas;
	@FXML private ComboBox<Modelo> cboModelos;
	@FXML private ComboBox<Color> cboColores;
	@FXML private TextField txtNumeroTelefono;
	@FXML private TextField txtNombreCliente;
	@FXML private RadioButton rbtTigo;
	@FXML private RadioButton rbtClaro;
	@FXML private TextArea txtaInformacion;

	private ObservableList<Marca> marcas;
	private ObservableList<Modelo> modelos;
	private ObservableList<Color> colores;

	private ObservableList<Telefono> telefonos;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		marcas = FXCollections.observableArrayList();
		modelos = FXCollections.observableArrayList();
		colores = FXCollections.observableArrayList();
		telefonos = FXCollections.observableArrayList();

		marcas.add(new Marca(1,"Samsung"));
		marcas.add(new Marca(2,"iPhone"));
		marcas.add(new Marca(3,"Chino"));

		modelos.add(new Modelo(1,"S7"));
		modelos.add(new Modelo(2,"7S"));
		modelos.add(new Modelo(3,"Z7"));

		colores.add(new Color(1,"Rojo",null));
		colores.add(new Color(2,"Verde",null));
		colores.add(new Color(3,"Azul",null));

		cboMarcas.setItems(marcas);
		cboModelos.setItems(modelos);
		cboColores.setItems(colores);
		//En este punto se sabe que todos los elementos de la GUI estan instanciados
		//cboMarcas.setDisable(true);
	}

	@FXML
	public void agregarRegistro(){
		String operador ="";
		if (rbtTigo.isSelected())
			operador = "Tigo";
		else if (rbtClaro.isSelected())
			operador = "Claro";

		telefonos.add(
				new Telefono(
					cboMarcas.getSelectionModel().getSelectedItem(),
					cboModelos.getSelectionModel().getSelectedItem(),
					txtNumeroTelefono.getText(),
					cboColores.getSelectionModel().getSelectedItem(),
					operador,
					txtNombreCliente.getText()
				)
		);
		mostrarInformacion();
	}

	public void mostrarInformacion(){
		txtaInformacion.setText(null);
		for(int i=0;i<telefonos.size();i++){
			txtaInformacion.appendText(telefonos.get(i).toString()+"\n");
		}
	}

}
