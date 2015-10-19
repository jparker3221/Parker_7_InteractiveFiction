

package parker_7_methodsmadness;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Parker_7_MethodsMadness extends Application {
    public static void main(String[] args) {
launch(args);        
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1200, 800);
       GraphicsContext gc = canvas.getGraphicsContext2D();
       drawShapes(gc);
       root.getChildren().add(canvas);
       primaryStage.setScene(new Scene(root));
       primaryStage.show();
    }    

    
    private void drawShapes(GraphicsContext gc) {
        
       
       
       int w = 40;
       int h = 40;
       int l = 10;
       int wa = 5;
       int ha = 20;
       int wm = 20;
       int hm = 10;
       int de = 5;
        for(int x=10;x<1601;x++){
            for(int y=100;y<1601;y++){
            if(x%200==0){
                if(y%100==0){
       drawcaterpillar(gc,x-400,y-80,w,h,l,wa,ha,wm,hm,de);       
       }
            }
       }
            }
            }
            /*
       gc.setFill(Color.MEDIUMSLATEBLUE);
            if(x%2==0){
       drawroundrect(gc,x,y,w,h); w=w+w; 
            }*/
        
        

    
    public void drawantenna(GraphicsContext gc, int x, int y, int l, int wa, int ha){
        gc.fillRoundRect(x, y-14, wa, ha, 50, 50);
    }
    public void drawmouth(GraphicsContext gc, int x, int y, int wm, int hm){
        gc.fillRoundRect(x,y,wm,hm,50,20);
    }
    public void draweyes(GraphicsContext gc, int x, int y, int de){
        gc.setFill(Color.DARKCYAN);
        gc.fillOval(x+14,y+10,de,de);
        gc.fillOval(x+24, y+10, de, de);
    }
    public void drawhead(GraphicsContext gc, int x, int y, int d, int l, int wa, int ha, int wm, int hm, int de){
        gc.fillOval (x,y,d,d);
        gc.setFill(Color.BLACK);
        drawantenna(gc,x+25,y,l,wa,ha);
        drawantenna(gc,x+15,y,l,wa,ha);
        drawmouth(gc,x+11,y+22,wm,hm);
        draweyes(gc,x,y,de);
    }
    public void drawbody(GraphicsContext gc, int x, int y, int w, int h){
        gc.fillRoundRect(x, y, w, h, 33, 33);
    }

    public void drawcaterpillar(GraphicsContext gc, int x, int y, int w, int h, int l, int wa, int ha, int wm, int hm, int de){
        for(int i=0;i<100;i++){
            if(i/6==0){
                l=l+20;
        gc.setFill(Color.GREEN);
        drawbody(gc,x+l,y,w,h);
        gc.setFill(Color.GREENYELLOW);
        drawbody(gc,x+l+10,y,w,h);
        }
        }
        gc.setFill(Color.RED);
        drawhead(gc,x+l+20,y,w,l,wa,ha,wm,hm,de);
        }
        
    }
    

