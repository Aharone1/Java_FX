package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("bonjour REMS");
			primaryStage.setResizable(true);
			
			Rectangle r = new Rectangle();
			r.setX(100);
			r.setY(100);
			r.setWidth(300);
			r.setHeight(200);
			
			root.getChildren().add(r);
			
			Circle c = new Circle();
			c.setCenterX(100);
			c.setCenterY(100);
			c.setRadius(30);
			c.setFill(Color.RED); 
		
			root.getChildren().add(c);
			
			Circle c2 = new Circle(150,150,40);
			c2.setFill(Color.GREEN); 
		
			root.getChildren().add(c2);
			
			Polygon polygon = new Polygon();  
		    polygon.getPoints().addAll(new Double[]{  
		        150.0, 50.0,  
		        250.0, 250.0,  
		        350.0, 150.0 });  
		    
		    polygon.setFill(Color.BLUE); 

		      
		    root.getChildren().add(polygon);
		    
		    
		    Arc arc = new Arc();  
		    arc.setCenterX(100);  
		    arc.setCenterY(300);  
		    arc.setRadiusX(50);  
		    arc.setRadiusY(80);  
		    arc.setStartAngle(70);  
		    arc.setLength(70);  
		    arc.setType(ArcType.ROUND);  
		    arc.setFill(Color.BROWN);  
  
		    root.getChildren().add(arc);   // on peut remplacer 
		    
		    Line line = new Line(); //instantiating Line class   
	        line.setStartX(0); //setting starting X point of Line  
	        line.setStartY(0); //setting starting Y point of Line   
	        line.setEndX(100); //setting ending X point of Line   
	        line.setEndY(200); //setting ending Y point of Line   
		    line.setStroke(Color.INDIGO);  

		    root.getChildren().add(line);    

			primaryStage.setScene(scene);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
