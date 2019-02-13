package extracredit;
import processing.core.PApplet;
import processing.core.PImage;


@SuppressWarnings("serial")
public class BalloonBounce extends PApplet {
		float speedX = 3;
		float speedY = 1;
		boolean keepgoing = true;
		// Keep track of current score
		static int score = 0;
		
		PImage img; 
		PImage balloon;
		
		
		Balloon b = new Balloon(0, 250, speedX, speedY);
	   
	    
	 // Canvas size
	    final int canvasWidth  = 800;
	    final int canvasHeight = 500;

	public void setup() {
        size(canvasWidth, canvasHeight);
        smooth();
        //loading an image 
       // img = loadImage("file:///Users/sonamtailor/Desktop/background.jpg");
       // img.resize(canvasWidth, canvasHeight);
              
	}
	
	public void draw() {
        // Erase the background, if you don't, the previous shape will 
        // still be displayed
        eraseBackground();
        fill(0,255,0);
        		
        
        b.calcCoords();
        b.drawShape();
        b.jump();
        //set text color 
        fill(255,34,100);
   
        // Display player's score
        textSize(40);
        text("Total Points: "+ score, 350, 450);
        textAlign(CENTER);

        
        if (keepgoing == false) {
            // Clear the canvas
            background(204, 204, 204);
            
            // Output the final score
			text("Game Over :( ", 400, 100);
            text("Total Points: "+ score, 400, 250);

            // Let the user click when finished reading score
            textSize(15);
            text("Please click when finished reading the score!", 400,300);
      
            if (this.mousePressed) {  
              // Exit
              System.exit(0);
            }
        }
    }
	public void eraseBackground() {
       background(img);
		
    }
	
	class Balloon{
		// Shape size
        final int shapeWidth  = 50;
        final int shapeHeight = 80;
        
     // Keep track of balloon's x and y position
        float x = 0;
        float y = 400;
        
     // Horizontal Speed
        float xSpeed = 3; 
     // Vertical Speed
        float ySpeed = 2;
        
        Balloon(float x, float y, float xSpeed, float ySpeed){
        		this.x = x;
        		this.y = y;
        		this.xSpeed = xSpeed;
        		this.ySpeed = ySpeed;
        }
        
        public void calcCoords() {      
            // Compute the x position where the shape will be drawn
            this.x += this.xSpeed; 
            if(this.x>=100&& this.x<=175) {
            	if(this.y>=450 && this.y<=670) {
            		this.x=0;
            		this.y=0;
            		this.xSpeed=0;
            		this.ySpeed=0;
            		background(255, 200, 200);
                     
                     // Output the final score
         			text("Game Over :( ", 400, 100);
                    text("Total Points: "+ score, 400, 250);	
            	}
            }
            if(this.x>=300&& this.x<=375) {
            	if(this.y>=0 && this.y<=300) {
            		this.x=0;
            		this.y=0;
            		this.xSpeed=0;
            		this.ySpeed=0;
            		background(255, 200, 200);
                     
                     // Output the final score
         			text("Game Over :( ", 400, 100);
                    text("Total Points: "+ score, 400, 250);	
            	}
            }
            if(this.x>=500&& this.x<=575) {
            	if(this.y>=430 && this.y<=705) {
            		this.x=0;
            		this.y=0;
            		this.xSpeed=0;
            		this.ySpeed=0;
            		background(255, 200, 200);
                     
                     // Output the final score
         			text("Game Over :( ", 400, 100);
                    text("Total Points: "+ score, 400, 250);	
            	}
            }
            if(this.x>=700&& this.x<=775) {
            	if(this.y>=450 && this.y<=670) {
            		this.x=0;
            		this.y=0;
            		this.xSpeed=0;
            		this.ySpeed=0;
            		background(255, 200, 200);
                     
                     // Output the final score
         			text("Game Over :( ", 400, 100);
                    text("Total Points: "+ score, 400, 250);	
            	}
            }
            // If the x position is off the canvas, reverse direction of 
            // movement  
            if (this.x > canvasWidth) {
                System.out.println("<===  Change direction, go left because x = " + this.x);
                this.xSpeed = -1 * this.xSpeed;
            }

            // If the x position is off the canvas, reverse direction of 
            // movement
            if (this.x < 0) {
                System.out.println("     ===> Change direction, go right because x = " + this.x + "\n");
                this.xSpeed = -1 * this.xSpeed;
            } 
            if(x==-3 || x==801) {
            	score++;
            }
        }
	
	
        public void drawShape() {
        		// Select color, then draw the shape at computed x, y location
        		// Add fill color
    			fill(255, 200, 200); 
    			ellipse(this.x, this.y, this.shapeWidth, this.shapeHeight);
    			//change the rectangle fill to brown 
    			fill(51,204,255);
    			rect(100,450,75,220);
    			rect(300,0,75, 300);
    			rect(500,430,75,275);
    			rect(700,0,70,200);
    			
        }
        
        public void jump() {
        		if (mousePressed == true && this.y < 500) {
        				this.y-=2;
        				}
        		else {
        			if (this.y < 500 && this.y >80) {
        				this.y+=2;
        			}
        			else {
        				keepgoing = false;
        			}
        		}
        }     
	}
	public class Ex06_SimpleShapes extends PApplet{
		public void setup() {
			fill(255);
			stroke(0);
			strokeWeight(1);
		
		}
	}	
}