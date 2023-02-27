


import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}

	private double width;
	private double height;
		   
	@Override
	public void start(Stage stage) throws IOException {
		//student Task #1:
		FXMainPane root = new FXMainPane();
		stage.setScene(new Scene(root,width,height));
		//set stage title
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();

	}

	
}
