package FrontJavaFX;


import BackEnd.Festival;
import BackEnd.Emplacement;
import java.awt.Dimension;
import java.awt.MenuItem;
import java.io.File;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.collections.FXCollections;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class App extends Application {

	
	/* ACCUEIL */
	ComboBox<String> liste_festival = new ComboBox<String>();
    private Text text1 = new Text("Nom");       
    private Text text2 = new Text("Ville");  
    private TextField textField1 = new TextField();           
    private TextField textField2 = new TextField();  
    private Button bouton_creer = new Button("Creer un nouveau Festival"); 
	private Button bouton_acces = new Button("Accèder à un festival existant"); 
	/* ACCUEIL */
	
	/* PAGE DE CREATION */
	private Label nom =new Label("Nom : ");
	private Label date_debut = new Label("Date de début : ");
	private Label duree =new Label("Durée : ");
	private Label unite_date =new Label("jours");
	private Button bouton_ok = new Button("OK");
	private Button bouton_annuler = new Button("Annuler");
	private TextField text_nom = new TextField("Tran");
	private TextField text_ville = new TextField("Tran");
	private Spinner<Integer> spinner_jour = new Spinner<Integer>();
  	final int initialValue = 0;
	/* PAGE DE CREATION */
	
  	/* GESTION DES VENTES */
  	private Label label_gestion =new Label("Gestion des ventes");
  	/* GESTION DES VENTES */

	 
    /* BARRE DE MENU */
	private ToolBar toolBar = new ToolBar();
	private Button bouton_quadrillage = new Button("Quadrillage"); 
	private Button bouton_programmation = new Button("Programmation"); 
	private Button bouton_recettes = new Button("Gestion recettes"); 
    /* BARRE DE MENU */
    
    
	/* EMPLOI DU TEMPS */
	private Label titre_emploi_du_temps = new Label("Programmation");
	private String[] text_emploi_du_temps = { "Jour 1", "Jour 2", "Jour 3", "Artiste 1", "Artiste 2", "Artiste 3", "text 1", "text 2",
	"text 3" };
	/* EMPLOI DU TEMPS */
	
	
	public static void main(String[] args) {
		Application.launch(App.class, args);
	}
	
	
	public void start(Stage primaryStage) throws Exception {
		
		
	/* ----------------------------------PAGE ACCUEIL ----------------------------------*/
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
		primaryStage.show();
		primaryStage.centerOnScreen();
		primaryStage.setTitle("Accueil");
		primaryStage.setResizable(false);
	    GridPane root = new GridPane(); 
		Scene scene = new Scene(root, 420, 420);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		root.add(bouton_creer, 0, 0);
		root.add(bouton_acces, 0, 1);
		root.setHgap(10); 
        root.setVgap(30); 
		root.setAlignment(Pos.CENTER);		
	/* --------------------------------- PAGE ACCUEIL ---------------------------------*/	
		
		
		
	/* ---------------------------- FENETRE CREATION -----------------------------------*/	
	      bouton_creer.setOnAction (new EventHandler<ActionEvent>() {
	          public void handle (ActionEvent event) {
		         primaryStage.hide();
	        	 Stage newWindow = new Stage();
	        	 
	        	 GridPane grid_creation = new GridPane();
	             newWindow.show();
	             newWindow.centerOnScreen();
	             newWindow.setTitle("Création d'un nouveau festival");
	             newWindow.setResizable(false);
	        	 Scene secondScene = new Scene(grid_creation, 530, 370);
	        	 newWindow.setScene(secondScene);
		      	 newWindow.sizeToScene();
		       
		      	 
		      	 DatePicker datePicker = new DatePicker();
		         datePicker.setValue(LocalDate.of(2020, 6, 1));
		         datePicker.setShowWeekNumbers(true);
		         
		      	 SpinnerValueFactory<Integer> valeur_jour = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, initialValue);
		         spinner_jour.setValueFactory(valeur_jour);
		         grid_creation.setVgap(10); 
		         //grid_creation.setHgap(15); 
	        	 grid_creation.add(nom, 0, 0);
	        	 grid_creation.add(text_nom, 1, 0);
	        	 grid_creation.add(date_debut, 0, 2);
	        	 grid_creation.add(duree, 0, 3);
	        	 grid_creation.add(spinner_jour, 1, 3);
	        	 grid_creation.add(unite_date, 2, 3);
	        	 grid_creation.add(datePicker, 1, 2);
	        	 grid_creation.add(bouton_ok, 2, 4);
	        	 grid_creation.add(bouton_annuler, 3, 4);
	             text_nom.setMinWidth(120);
	             grid_creation.setHgap(10); 
	             grid_creation.setVgap(30); 
	             grid_creation.setPadding(new Insets(50));
	             grid_creation.getChildren().add(text_nom);
	             
	             bouton_ok.setOnAction (new EventHandler<ActionEvent>() {
	   	          public void handle (ActionEvent event) {

	   	          }
	             });
	             
	          }
	       });
	      
/* --------------------------FENETRE CREATION ---------------------------------*/	
	 
	      
/*----------------------- FENETRE ACCES A UN FESTIVAL-------------------------*/ 
	      bouton_acces.setOnAction (new EventHandler<ActionEvent>() {
	          public void handle (ActionEvent event) {
			    primaryStage.hide();
	        	Stage otherStage= new Stage();
	      		otherStage.setWidth(400);
	      		otherStage.setHeight(300);
	      		BorderPane root_emploi_du_temps = new BorderPane();
	      		otherStage.show();
	      		otherStage.centerOnScreen();
	      		otherStage.setTitle("Gestion Festival");
	      		otherStage.setResizable(true);
	      		Scene scene_emploi_du_temps = new Scene(root_emploi_du_temps, 420, 420);
	      		otherStage.setScene(scene_emploi_du_temps);
	      		otherStage.sizeToScene();
	            toolBar.getItems().setAll(bouton_quadrillage, new Separator(), bouton_programmation, new Separator(), bouton_recettes); 
	            root_emploi_du_temps.setTop(toolBar); 
	      		VBox contenu = new VBox();
	      		contenu.setPadding(new Insets(30, 30, 30, 30));
	      		contenu.setSpacing(30);
	      		contenu.setAlignment(Pos.CENTER);
	      		GridPane prog = new GridPane();
	      		
	      		 bouton_recettes.setOnAction(new EventHandler<ActionEvent>() {
	        		 public void handle (ActionEvent even2) {
	     	      		 BorderPane root_recettes = new BorderPane();
	        			 GridPane grid_creation = new GridPane();
	    	             otherStage.setTitle("Gestion Festival");
	    	             otherStage.setResizable(false);
	    		      	 Scene scene_recettes = new Scene(root_recettes, 420, 420);
	    		      	 otherStage.sizeToScene();
	    		      	 otherStage.setScene(scene_recettes);
	    		      	 toolBar.getItems().setAll(bouton_quadrillage, new Separator(), bouton_programmation, new Separator(), bouton_recettes); 
	     	             root_recettes.setTop(toolBar);
	        		 }
	        	 });
	      		 
	      		 
	      		 bouton_quadrillage.setOnAction(new EventHandler<ActionEvent>() {
	        		 public void handle (ActionEvent even2) {
	     	      		 BorderPane root_quadrillage = new BorderPane();
	        			 GridPane grid_creation = new GridPane();
	    	             otherStage.setTitle("Gestion Festival");
	    	             otherStage.setResizable(false);
	    		      	 Scene scene_quedrillage = new Scene(root_quadrillage, 420, 420);
	    		      	 otherStage.sizeToScene();
	    		      	 otherStage.setScene(scene_quedrillage);
	    		      	 toolBar.getItems().setAll(bouton_quadrillage, new Separator(), bouton_programmation, new Separator(), bouton_recettes); 
	     	             root_quadrillage.setTop(toolBar);
	        		 }
	        	 });
	      		 
	      		 
	      		bouton_programmation.setOnAction(new EventHandler<ActionEvent>() {
	        		 public void handle (ActionEvent even2) {
	     	      		otherStage.setWidth(400);
	     	      		otherStage.setHeight(300);
	     	      		BorderPane root_emploi_du_temps = new BorderPane();
	     	      		otherStage.show();
	     	      		otherStage.centerOnScreen();
	        			otherStage.setTitle("Gestion Festival");
	     	      		otherStage.setResizable(true);
	     	      		Scene scene_emploi_du_temps = new Scene(root_emploi_du_temps, 420, 420);
	     	      		otherStage.setScene(scene_emploi_du_temps);
	     	      		otherStage.sizeToScene();
	     	            toolBar.getItems().setAll(bouton_quadrillage, new Separator(), bouton_programmation, new Separator(), bouton_recettes); 
	     	            root_emploi_du_temps.setTop(toolBar); 
	     	      		VBox contenu = new VBox();
	     	      		contenu.setPadding(new Insets(30, 30, 30, 30));
	     	      		contenu.setSpacing(30);
	     	      		contenu.setAlignment(Pos.CENTER);
	     	      		GridPane prog = new GridPane();
	     	      		prog.setGridLinesVisible(true);	
	     	      	
	     	      		int var_i = 0;
	     	      		Label label;
	     	      		
	     	      		for (int y = 0; y < 3; y++) {
	     	      			for (int i = 0; i < 3; i++) {
	     	      				
	     	      				label = createLabel(text_emploi_du_temps[var_i]);
	     	      				label.setFont(new Font(15));
	     	      				
	     	      				GridPane.setHgrow(label, Priority.ALWAYS);
	     	      				GridPane.setVgrow(label, Priority.ALWAYS);
	     	      				
	     	      				GridPane.setHalignment(label, Pos.CENTER.getHpos());
	     	      				GridPane.setValignment(label, Pos.CENTER.getVpos());
	     	      				
	     	      				prog.add(label, i, y);

	     	      				var_i += 1;
	     	      			}
	     	      		}
	     	      		
	     	      		VBox.setVgrow(prog, Priority.ALWAYS);		
	     	      		contenu.getChildren().addAll(titre_emploi_du_temps, prog);
	     	      		root_emploi_du_temps.setCenter(contenu);
	     	        	  
	     	          }
	     	       });
	      		
	        	  
	          }
	       });
	      		

	      
	      		
	      
	      
	 /* FENETRE ACCES A UN FESTIVAL*/ 
	      
	}
	

/* FONCTIONS FENTRE DE LA PROGRAMMATION */	
	Parent contenu_accueil() {
		
		  BorderPane root_creation=new BorderPane();

		  root_creation.setPadding(new Insets(10));
		  
	      GridPane gridPane = new GridPane();    
	      
	      gridPane.setPadding(new Insets(100, 100, 100, 100)); 
	      
	      gridPane.setVgap(5); 
	      gridPane.setHgap(5);       
	      gridPane.add(text1, 0, 0); 
	      gridPane.add(textField1, 1, 0); 
	      gridPane.add(text2, 0, 1);       
	      gridPane.add(textField2, 1, 1); 
	     
	      root_creation.getChildren().add(gridPane);

	      
			return root_creation;
		
	}
	
	private Label createLabel(String string) {
		Label label = new Label(string);
		return label;

	}
/* FONCTIONS FENTRE DE LA PROGRAMMATION */	
	

}
