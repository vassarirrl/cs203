package superheroes;
import acm.program.*;
import acm.io.*;
import acm.graphics.*;
import java.awt.*;

public class SuperHeroes extends GraphicsProgram {

    public void run() {
    //    GRect firstHero = new GRect(150, 150, 200, 200);
    //    firstHero.setFilled(true);
    //    firstHero.setColor(Color.BLUE);
    //     add(firstHero);
               
        GPolygon jjHair = new GPolygon();
        jjHair.addVertex(568, 150);
        jjHair.addVertex(588, 150);
        jjHair.addVertex(578, 80);
        jjHair.setFilled(true);
        jjHair.setColor(Color.ORANGE);
        add(jjHair);
        
        GPolygon jjBody = new GPolygon();
        jjBody.addVertex(578, 310);
        jjBody.addVertex(538, 450);
        jjBody.addArc(200, 100, 180, 45);
        jjBody.addVertex(658, 450);
        jjBody.addArc(200, 100, 0, 45);
        jjBody.setColor(Color.RED);
        jjBody.setFilled(true);
        add(jjBody);
     
   //     GPolygon jjArm = new GPolygon();
   //     jjArm.addVertex(560, 400);
   //     jjArm.addVertex(500, 380);
   //     jjArm.addVertex(490, 390);
   //    jjArm.addVertex(550, 440);
   //     jjArm.setColor(Color.RED);
   //     jjArm.setFilled(true);
   //     add(jjArm);
       
        GOval jjLeftHand = new GOval(485, 380, 40, 30);
        jjLeftHand.setFilled(true);
        jjLeftHand.setColor(Color.PINK);
        add(jjLeftHand);
        GOval jjRightHand = new GOval(630, 370, 40, 30);
        jjRightHand.setFilled(true);
        jjRightHand.setColor(Color.PINK);
        add(jjRightHand);
        GOval jjLeftFoot = new GOval(550, 440, 25, 45);
        jjLeftFoot.setFilled(true);
        jjLeftFoot.setColor(Color.BLACK);
        add(jjLeftFoot);
        GOval jjRightFoot = new GOval(640, 430, 25, 45);
        jjRightFoot.setFilled(true);
        jjRightFoot.setColor(Color.BLACK);
        add(jjRightFoot);
      
        GOval jjFace = new GOval(455, 150, 240, 200);
        jjFace.setFilled(true);
        jjFace.setColor(Color.PINK);
        add(jjFace);
        
        GOval jjMouth = new GOval(552, 240, 50, 85);
        jjMouth.setFilled(true);
        jjMouth.setColor(Color.RED);
        add(jjMouth);  
        GOval jjMouthCover = new GOval(547, 237, 60, 60);
        jjMouthCover.setFilled(true);
        jjMouthCover.setColor(Color.PINK);
        add(jjMouthCover);

        GOval jjLeftEar = new GOval(426, 254, 40, 40);
        jjLeftEar.setFilled(true);
        jjLeftEar.setColor(Color.PINK);
        add(jjLeftEar);
        GOval jjRightEar = new GOval(682, 254, 40, 40);
        jjRightEar.setFilled(true);
        jjRightEar.setColor(Color.PINK);
        add(jjRightEar); 
        
        GOval jjLeftMask = new GOval(490, 190, 85, 85);
        jjLeftMask.setFilled(true);
        jjLeftMask.setColor(Color.BLACK);
        add(jjLeftMask);
        GOval jjRightMask = new GOval(580, 190, 85, 85);
        jjRightMask.setFilled(true);
        jjRightMask.setColor(Color.BLACK);
        add(jjRightMask); 
        GRect jjMiddleMask = new GRect(510, 200, 130, 70);
        jjMiddleMask.setFilled(true);
        jjMiddleMask.setColor(Color.BLACK);
        add(jjMiddleMask); 
        GOval jjForehead = new GOval(557, 158, 40, 50);
        jjForehead.setFilled(true);
        jjForehead.setColor(Color.PINK);
        add(jjForehead);
        GOval jjNose = new GOval(567, 268, 20, 10);
        jjNose.setFilled(true);
        jjNose.setColor(Color.PINK);
        add(jjNose);
        GOval jjNoseOutline = new GOval(567, 268, 20, 10);
        jjNoseOutline.setColor(Color.GRAY);
        add(jjNoseOutline);
        
        GOval jjLeftEye = new GOval(515, 225, 45, 40);
        jjLeftEye.setFilled(true);
        jjLeftEye.setColor(Color.WHITE);
        add(jjLeftEye);
        GOval jjRightEye = new GOval(595, 225, 45, 40);
        jjRightEye.setFilled(true);
        jjRightEye.setColor(Color.WHITE);
        add(jjRightEye);
        GRect jjMaskBit = new GRect(510, 260, 130, 8);
        jjMaskBit.setFilled(true);
        jjMaskBit.setColor(Color.BLACK);
        add(jjMaskBit); 
        GOval jjLeftIris = new GOval(537, 238, 18, 18);
        jjLeftIris.setFilled(true);
        jjLeftIris.setColor(Color.BLUE);
        add(jjLeftIris);
        GOval jjRightIris = new GOval(600, 238, 18, 18);
        jjRightIris.setFilled(true);
        jjRightIris.setColor(Color.BLUE);
        add(jjRightIris);
        GOval jjLeftPupil = new GOval(541, 245, 8, 8);
        jjLeftPupil.setFilled(true);
        jjLeftPupil.setColor(Color.BLACK);
        add(jjLeftPupil);
        GOval jjRightPupil = new GOval(603, 245, 8, 8);
        jjRightPupil.setFilled(true);
        jjRightPupil.setColor(Color.BLACK);
        add(jjRightPupil);
        GOval jjLeftSpeck = new GOval(550, 241, 1, 1);
        jjLeftSpeck.setFilled(true);
        jjLeftSpeck.setColor(Color.LIGHT_GRAY);
        add(jjLeftSpeck);
        GOval jjRightSpeck = new GOval(612, 241, 1, 1);
        jjRightSpeck.setFilled(true);
        jjRightSpeck.setColor(Color.LIGHT_GRAY);
        add(jjRightSpeck);

        GLabel caption = new GLabel("The Incredibles: Jack-Jack with Violet ", 50, 60);
        caption.setFont(new Font("Serif", Font.ITALIC, 24));
        add(caption);
        
        
       // IODialog dialog = getDialog();
       // String firstName = dialog.readLine ("What is Edna saying? ");
       // String secondName = dialog.readLine ("What is Jack-Jack thinking? ");
       // GLabel firstLabel = new GLabel(firstName,150,450);
       // add(firstLabel);
       // GLabel secondLabel = new GLabel(secondName,400,450);
       // add(secondLabel);
       // dialog.println("I hope you like my drawings!");
    }
    
          //  GArc jjForehead = new GArc(535, 190, 85, 85, 50, 50);
      // jjForehead.setFilled(true);
      //  jjForehead.setColor(Color.BLACK);
      //  add(jjForehead);
    
     //       GPolygon jjLeftEar = new GPolygon();
     //   jjLeftEar.addVertex(460, 268);
     //   jjLeftEar.addVertex(455, 266);
     //   jjLeftEar.addVertex(453, 272);
     //   jjLeftEar.addVertex(460, 278);
     //   jjLeftEar.setFilled(true);
     //   jjLeftEar.setColor(Color.BLUE);
      //  add(jjLeftEar);

    public static void main(String[] args) {
        new SuperHeroes().start(args);

    }
} 

