package question3;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class WindowView {
	private HBox topPane; 
	private Label nameLbl;
	private Label idLbl;
	private Label phoneLbl;
	private Label addressLbl;
	private Label jobTitleLbl;
	private TextField nameField;
	private TextField idField;
	private TextField phoneField;
	private TextField addressField;
	private TextField jobTitleField;
	private Button saveButton;
	private Button loadButton;
	
	private HBox bottomPane;
	private Label nameOutLbl;
	private TextField nameOutField;
	
	private VBox pane; 
	private SaveButtonListener saveButtonListener;
	
	public WindowView(Stage stage) {
		topPane = new HBox(30);
		nameLbl = new Label("Name: ");
		nameLbl.setAlignment(Pos.CENTER_RIGHT);
		nameField = new TextField();
		idLbl = new Label("ID: ");
		idLbl.setAlignment(Pos.CENTER_RIGHT);
		idField = new TextField();
		
		phoneLbl = new Label("Phone Number: ");
		phoneLbl.setAlignment(Pos.CENTER_RIGHT);
		phoneField = new TextField();
		
		addressLbl = new Label("Address: ");
		addressLbl.setAlignment(Pos.CENTER_RIGHT);
		addressField = new TextField();
		
		jobTitleLbl = new Label("Job Title: ");
		jobTitleLbl.setAlignment(Pos.CENTER_RIGHT);
		jobTitleField = new TextField();
		
		saveButton = new Button("Save");
		loadButton = new Button("Load");
		ProjectData data = new ProjectData();
		saveButton.setOnAction(e -> {
			String name = nameField.getText();
			String id = idField.getText();
			String phoneNum = phoneField.getText();
			String address = addressField.getText();
			String jobTitle = jobTitleField.getText();
			SaveButtonEventObject ev = 
					new SaveButtonEventObject(this, name, id, phoneNum,address,jobTitle);
			if (saveButtonListener != null) {
				saveButtonListener.saveButtonClicked(ev);
			data.getSaver().add(ev);
			data.saveArrayDataToBinaryFile(data);
			nameField.clear();
			idField.clear();
			phoneField.clear();
			addressField.clear();
			jobTitleField.clear();
			
			}
		});
		
		
		loadButton.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event)
			{
				
			
				String id = nameOutField.getText();
				SaveButtonEventObject ev = data.searchArray(id, data);
				data.loadBinaryDataToArrays(data);
				nameField.setText(ev.getName());
				idField.setText(ev.getId());
				phoneField.setText(ev.getPhoneNum());
				addressField.setText(ev.getAddress());
				jobTitleField.setText(ev.getJobTitle());
			}
		});
		
		topPane.getChildren().addAll(nameLbl, nameField, idLbl, 
				idField,phoneLbl, phoneField,addressLbl,addressField,jobTitleLbl,jobTitleField, saveButton,loadButton);
		topPane.setAlignment(Pos.BASELINE_LEFT);
	
		
		
		bottomPane = new HBox(30);
		nameOutLbl = new Label("Search Field: ");
		nameOutField = new TextField();
		bottomPane.getChildren().addAll(nameOutLbl,nameOutField);
		bottomPane.setAlignment(Pos.BASELINE_LEFT);
		
		// parent pane
		pane = new VBox(30);
		pane.getChildren().addAll(topPane, bottomPane);
		
		stage.setScene(new Scene(pane, 1500, 200));
		stage.show();
		
	}
	
	public void setSaveButtonListener(SaveButtonListener saveButtonListener){
		this.saveButtonListener = saveButtonListener;
	}
	
	public void loadSaveButtonListener(SaveButtonListener saveButtonListener){
		this.saveButtonListener = saveButtonListener;
	}
	
	public void setNameField(String name){
		nameField.clear();
		nameField.setText(name);
	}
	
	public void setIdField(String id){
		idField.clear();
		idField.setText(id);
	}
	
	public void setPhoneField(String phoneNum){
		phoneField.clear();
		phoneField.setText(phoneNum);
	}
	
	public void setAddressField(String address){
		addressField.clear();
		addressField.setText(address);
	}
	
	public void setJobTitleField(String jobTitle){
		jobTitleField.clear();
		jobTitleField.setText(jobTitle);
	}

	
	
}
