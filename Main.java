import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class Main extends Application { 
    boolean player = true;
    int[][] occupied = new int[3][3];
        // true = red
          // false = green
    
  
    public static int is_won(int arr[][]){
    //check horozontal 
      for (int i = 0; i < 3; i++){
        if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] && arr[i][0] != 0){
          return(arr[i][0]);
        }  
      }
  
      //check verticle
      for (int i = 0; i < 3; i++){
        if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i] && arr[1][i] != 0){
          return(arr[0][i]);
        }  
      }
  
      //check diagonal 
      if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[2][2] != 0){
        return(arr[0][0]); 
      }
      if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[1][1] != 0){
        return(arr[1][1]); 
      }
      return(0); 
    }
    public void display(){
      for (int z = 0; z < 3; z++){
        for (int j = 0; j < 3; j++){
          System.out.print(Integer.toString(occupied[z][j]) + " ");
        }
        System.out.println(" ");
      }
    }
    // launch the application
    public void start(Stage s){
        // set title for the stage
        s.setTitle("tik tak toe");
        Group r = new Group();
        Scene sc = new Scene(r, 200, 250);

        // create all the  button
//---------------------------------------------      
        Button topl = new Button();
        topl.setPrefSize(50,50);
        topl.setLayoutX(10);
        topl.setLayoutY(10);
        r.getChildren().add(topl);
//-------------------------------------------      
        //setting up 
        topl.setOnAction(new EventHandler() {
          public void handle(Event actionEvent) {
            System.out.println("clicked"); 
            if(occupied[0][0]==0){
              if(player){
                topl.setStyle("-fx-background-color: #ff0000");
                player = false;
                occupied[0][0] = 1;
              }
              else{
                topl.setStyle("-fx-background-color: #008000");
                player = true; 
                occupied[0][0] = 2;
              }
              if (is_won(occupied) != 0){
                //display();
                Text game_won = new Text();
                game_won.setText("player " + String.valueOf(is_won(occupied)) + " won");
                game_won.setX(50); 
                game_won.setY(230);
                r.getChildren().add(game_won);
                //break;
              }
            } 
          }
        });


//-----------------------------------------      
        Button topm = new Button();
        topm.setPrefSize(50,50);
        topm.setLayoutX(70);
        topm.setLayoutY(10);
        r.getChildren().add(topm);
// -----------------------------------------
      //setting up
        topm.setOnAction(new EventHandler() {
          public void handle(Event actionEvent) {
            System.out.println("clicked"); 
            if(occupied[0][1]==0){
              if(player){
                topm.setStyle("-fx-background-color: #ff0000");
                player = false;
                occupied[0][1] = 1;
              }
              else{
                topm.setStyle("-fx-background-color: #008000");
                player = true; 
                occupied[0][1] = 2;
              }
              if (is_won(occupied) != 0){                 
                //display();

                Text game_won = new Text();
                game_won.setText("player " + String.valueOf(is_won(occupied)) + " won");
                game_won.setX(50); 
                game_won.setY(230);
                r.getChildren().add(game_won);
                //break;
             }
            } 
          }
        });

      

//-----------------------------------------      
        //top right 
        Button topr = new Button();
        topr.setPrefSize(50,50);
        topr.setLayoutX(130);
        topr.setLayoutY(10);
        r.getChildren().add(topr);
//----------------------------------------
      //setting up
        topr.setOnAction(new EventHandler() {
          public void handle(Event actionEvent) {
            System.out.println("clicked"); 
            if(occupied[0][2]==0){
              if(player){
                topr.setStyle("-fx-background-color: #ff0000");
                player = false;
                occupied[0][2] = 1;
              }
              else{
                topr.setStyle("-fx-background-color: #008000");
                player = true; 
                occupied[0][2] = 2;
              }
              if (is_won(occupied) != 0){
                //display();
                Text game_won = new Text();
                game_won.setText("player " + String.valueOf(is_won(occupied)) + " won");
                game_won.setX(50); 
                game_won.setY(230);
                r.getChildren().add(game_won);
                //break;
             }
            } 
          }
        });    


      
//----------------------------------------
        Button midl = new Button();
        midl.setPrefSize(50,50);
        midl.setLayoutX(10);
        midl.setLayoutY(70);
        r.getChildren().add(midl);
//-----------------------------------------
      //setting up 
        midl.setOnAction(new EventHandler() {
          public void handle(Event actionEvent) {
            System.out.println("clicked"); 
            if(occupied[1][0]==0){
              if(player){
                midl.setStyle("-fx-background-color: #ff0000");
                player = false;
                occupied[1][0] = 1;
              }
              else{
                midl.setStyle("-fx-background-color: #008000");
                player = true; 
                occupied[1][0] = 2;
              }
              if (is_won(occupied) != 0){
                //display();
                Text game_won = new Text();
                game_won.setText("player " + String.valueOf(is_won(occupied)) + " won");
                game_won.setX(50); 
                game_won.setY(230);
                r.getChildren().add(game_won);
                //break;
             }
            } 
          }
        });    

      

//----------------------------------------      
        Button midm = new Button();
        midm.setPrefSize(50,50);
        midm.setLayoutX(70);
        midm.setLayoutY(70);
        r.getChildren().add(midm);
//---------------------------------------
//setting up
        midm.setOnAction(new EventHandler() {
          public void handle(Event actionEvent) {
            System.out.println("clicked"); 
            if(occupied[1][1]==0){
              if(player){
                midm.setStyle("-fx-background-color: #ff0000");
                player = false;
                occupied[1][1] = 1;
              }
              else{
                midm.setStyle("-fx-background-color: #008000");
                player = true; 
                occupied[1][1] = 2;
              }
              if (is_won(occupied) != 0){
                //display();
                Text game_won = new Text();
                game_won.setText("player " + String.valueOf(is_won(occupied)) + " won");
                game_won.setX(50); 
                game_won.setY(230);
                r.getChildren().add(game_won);
                //break;
             }
            } 
          }
        }); 


      
//---------------------------------------
        Button midr = new Button();
        midr.setPrefSize(50,50);
        midr.setLayoutX(130);
        midr.setLayoutY(70);
        r.getChildren().add(midr);
        s.setScene(sc);
//---------------------------------------------  
//setting up
      midr.setOnAction(new EventHandler() {
          public void handle(Event actionEvent) {
            System.out.println("clicked"); 
            if(occupied[1][2]==0){
              if(player){
                midr.setStyle("-fx-background-color: #ff0000");
                player = false;
                occupied[1][2] = 1;
              }
              else{
                midr.setStyle("-fx-background-color: #008000");
                player = true; 
                occupied[1][2] = 2;
              }
              if (is_won(occupied) != 0){
                //display();
                Text game_won = new Text();
                game_won.setText("player " + String.valueOf(is_won(occupied)) + " won");
                game_won.setX(50); 
                game_won.setY(230);
                r.getChildren().add(game_won);
                //break;
             }
            } 
          }
        });  


//--------------------------------------------      
        Button botl = new Button();
        botl.setPrefSize(50,50);
        botl.setLayoutX(10);
        botl.setLayoutY(130);
        r.getChildren().add(botl);
//-------------------------------------------
//setting up

        botl.setOnAction(new EventHandler() {
          public void handle(Event actionEvent) {
            System.out.println("clicked"); 
            if(occupied[2][0]==0){
              if(player){
                botl.setStyle("-fx-background-color: #ff0000");
                player = false;
                occupied[2][0] = 1;
              }
              else{
                botl.setStyle("-fx-background-color: #008000");
                player = true; 
                occupied[2][0] = 2;
              }
              if (is_won(occupied) != 0){
                //display();
                Text game_won = new Text();
                game_won.setText("player " + String.valueOf(is_won(occupied)) + " won");
                game_won.setX(50); 
                game_won.setY(230);
                r.getChildren().add(game_won);
                //break;
             }
            } 
          }
        });  

      
//--------------------------------------------      
        Button botm = new Button();
        botm.setPrefSize(50,50);
        botm.setLayoutX(70);
        botm.setLayoutY(130);
        r.getChildren().add(botm);
//-------------------------------------------------
//setting up
        botm.setOnAction(new EventHandler() {
          public void handle(Event actionEvent) {
            System.out.println("clicked"); 
            if(occupied[2][1]==0){
              if(player){
                botm.setStyle("-fx-background-color: #ff0000");
                player = false;
                occupied[2][1] = 1;
              }
              else{
                botm.setStyle("-fx-background-color: #008000");
                player = true; 
                occupied[2][1] = 2;
              }
              if (is_won(occupied) != 0){
                //display();
                Text game_won = new Text();
                game_won.setText("player " + String.valueOf(is_won(occupied)) + " won");
                game_won.setX(50); 
                game_won.setY(230);
                r.getChildren().add(game_won);
                //break;
             }
            } 
          }
        });  

      
      
//------------------------------------------------
        Button botr = new Button();
        botr.setPrefSize(50,50);
        botr.setLayoutX(130);
        botr.setLayoutY(130);
        r.getChildren().add(botr);
//-------------------------------------------------
//setting it up
        botr.setOnAction(new EventHandler() {
          public void handle(Event actionEvent) {
            System.out.println("clicked"); 
            if(occupied[2][2]==0){
              if(player){
                botr.setStyle("-fx-background-color: #ff0000");
                player = false;
                occupied[2][2] = 1;
              }
              else{
                botr.setStyle("-fx-background-color: #008000");
                player = true; 
                occupied[2][2] = 2;
              }
              if (is_won(occupied) != 0){
                //display();
                Text game_won = new Text();
                game_won.setText("player " + String.valueOf(is_won(occupied)) + " won");
                game_won.setX(50); 
                game_won.setY(230);
                r.getChildren().add(game_won);
                //break;
             }
            } 
          }
        });  
      
        s.setScene(sc);
        s.show();
        //true == 1 == red
        //false == 2 == green    
    }
    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }

} 
