package com.example.lezs.graficadorfiguras;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/**
 * Created by lezs on 29/07/15.
 */
public class Paneview extends View {

    Datos d = new Datos();
    Path wallpath = new Path();
    Paint paint = new Paint();


    public Paneview(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        paint.setStyle(Paint.Style.FILL);

        paint.setColor(Color.CYAN);
        canvas.drawPaint(paint);

        for (int i = 0; i < d.Lista.size(); i++) {


            paint.setStyle(Paint.Style.FILL);
            float vx,vy, rad = 0;

            ////////////////////////// ------------------------------- switch para colores
            switch (d.Lista.get(i).getColor()) {
                case 'z': paint.setColor(Color.BLUE); break;
                case 'r': paint.setColor(Color.RED); break;
                case 'v': paint.setColor(Color.GREEN); break;
                case 'a': paint.setColor(Color.YELLOW); break;
                case 'o': paint.setColor(Color.rgb(255, 99, 9)); break;
                case 'm': paint.setColor(Color.MAGENTA); break;
                case 'c': paint.setColor(Color.rgb(102, 51, 0)); break;
                case 'n': paint.setColor(Color.BLACK); break;
            }

            ///////////////////////// ----------------------------------- switch para formas
            switch (d.Lista.get(i).getTipo()) {

                case 'c':
                    vx = d.Lista.get(i).getValx();
                    vy = d.Lista.get(i).getValy();
                    rad = d.Lista.get(i).getVal1();
                    canvas.drawCircle(vx, vy, rad, paint);
                    break;

                case 'u':
                    float lad = (d.Lista.get(i).getVal1() / 2);
                    rad = lad/2;
                    vx = d.Lista.get(i).getValx() - rad;
                    vy = d.Lista.get(i).getValy() - rad;
                    canvas.drawRect(vx, vy, (vx + lad), (vy + lad), paint);
                    break;

                case 'r':
                    float al = d.Lista.get(i).getVal2();
                    float an = d.Lista.get(i).getVal1();
                    vx = d.Lista.get(i).getValx() - an;
                    vy = d.Lista.get(i).getValy() - al;
                    canvas.drawRect(vx, vy, (vx + an), (vy + al), paint);
                    break;

                case 'l':
                    vx = d.Lista.get(i).getValx();
                    vy = d.Lista.get(i).getValy();
                    float vx2 = d.Lista.get(i).getVal1();
                    float vy2 = d.Lista.get(i).getVal2();
                    paint.setStrokeWidth(4);
                    canvas.drawLine(vx, vy, vx2, vy2, paint);
                    break;

                case 'p':
                    vx = d.Lista.get(i).getValx();
                    vy = d.Lista.get(i).getValy();
                    rad = d.Lista.get(i).getVal2() / 2;
                    int numlad = (int) d.Lista.get(i).getVal3();
                    float ang = (float) ((2*Math.PI)/numlad);

                    llenar(numlad, rad, ang, vx, vy);
                    canvas.drawPath(wallpath, paint);
                    break;
            }
        }
        d.Lista.clear();

    }

    public void llenar(int tam, float rad, float ang, float x, float y){

        float x2[] = new float[tam];
        float y2[] = new float[tam];

        for(int j = 0; j<tam; j++ ){
            x2[j] = (float) ((rad * Math.cos((ang)*j))+x);
            y2[j] = (float) (y-(rad * Math.sin(ang*j)));
        }
        wallpath.reset();
        for(int j = 0; j<tam; j++ ){wallpath.lineTo(x2[j], y2[j]);}
        wallpath.lineTo(x2[0], y2[0]);
    }

}
