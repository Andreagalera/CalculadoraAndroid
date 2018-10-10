package dsa.eetac.upc.edu.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText pant;
    //los dos numeros y el resultado
    public double operan1, operan2, res;
    //id para cada operacion
    int ope;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant=(EditText)findViewById(R.id.caja);



    }


    //Boton 1
    public void bt1 (View v){
        String cap  =pant.getText().toString();
        cap=cap+"1";
        pant.setText(cap);

    }
    //Boton 2
    public void bt2 (View v){
        String cap  =pant.getText().toString();
        cap=cap+"2";
        pant.setText(cap);
    }
    //Boton 3
    public void bt3 (View v){
        String cap  =pant.getText().toString();
        cap=cap+"3";
        pant.setText(cap);
    }
    //Boton 4
    public void bt4 (View v){
        String cap  =pant.getText().toString();
        cap=cap+"4";
        pant.setText(cap);
    }
    //Boton 5
    public void bt5 (View v){
        String cap  =pant.getText().toString();
        cap=cap+"5";
        pant.setText(cap);
    }
    //Boton 6
    public void bt6 (View v){
        String cap  =pant.getText().toString();
        cap=cap+"6";
        pant.setText(cap);
    }
    //Boton 7
    public void bt7 (View v){
        String cap  =pant.getText().toString();
        cap=cap+"7";
        pant.setText(cap);
    }
    //Boton 8
    public void bt8 (View v){
        String cap  =pant.getText().toString();
        cap=cap+"8";
        pant.setText(cap);
    }
    //Boton 9
    public void bt9 (View v){
        String cap  =pant.getText().toString();
        cap=cap+"9";
        pant.setText(cap);
    }
    //Boton 0
    public void bt0 (View v){
        String cap  =pant.getText().toString();
        cap=cap+"0";
        pant.setText(cap);
    }
    //Boton .
    public void btpuntp (View v){
        String cap  =pant.getText().toString();
        cap=cap+".";
        pant.setText(cap);
    }
    //Suma
    public void suma (View v){
        try{
            String auxi=pant.getText().toString();
            operan1=Double.parseDouble(auxi);
        }
        catch(NumberFormatException nfe){ }
        pant.setText("");
        //Operación 1 suma
        ope=1;
    }

    //Resta
    public void resta (View v){
        try{
            String auxi=pant.getText().toString();
            operan1=Double.parseDouble(auxi);
        }
        catch(NumberFormatException nfe){ }
        pant.setText("");
        //Operación 2 resta
        ope=2;
    }

    //Multiplicació
    public void multiplicacion (View v){
        try{
            String auxi=pant.getText().toString();
            operan1=Double.parseDouble(auxi);
        }
        catch(NumberFormatException nfe){ }
        pant.setText("");
        //Operación 3 multiplicacion
        ope=3;
    }

    //División
    public void division (View v){
        try{
            String auxi=pant.getText().toString();
            operan1=Double.parseDouble(auxi);
        }
        catch(NumberFormatException nfe){ }
        pant.setText("");
        //Operación 4 division
        ope=4;
    }

    //Tan
    public void tan (View v){
        try{
            String auxi=pant.getText().toString();
            operan1=Double.parseDouble(auxi);
        }
        catch(NumberFormatException nfe){ }
        pant.setText("Tan("+operan1+")");
        //Operación 5 tan
        ope=5;
    }
    //Cos
    public void cos (View v){
        try{
            String auxi=pant.getText().toString();
            operan1=Double.parseDouble(auxi);
        }
        catch(NumberFormatException nfe){ }

        pant.setText("Cos("+operan1+")");
        //Operación 6 cos
        ope=6;
    }
    //Sin
    public void sin (View v){
        try{
            String auxi=pant.getText().toString();
            operan1=Double.parseDouble(auxi);
        }
        catch(NumberFormatException nfe){ }
        pant.setText("Sin("+operan1+")");
        //Operación 7 sin
        ope=7;
    }

    //Igual
    public void igual(View v){
        try{
            String auxi=pant.getText().toString();
            operan2=Double.parseDouble(auxi);
        }
        catch(NumberFormatException nfe){ }
        pant.setText("");
        //Suma
        if(ope==1){
            res=operan1+operan2;
        }
        //Resta
        else if (ope==2){
            res=operan1-operan2;
        }
        //Multiplicacio
        else if (ope==3) {
            res = operan1 * operan2;
        }
        //Divisio
        else if (ope==4) {
            if(operan2==0){
                pant.setText("Error");
            }
            else{
                res=operan1/operan2;
            }
        }
        //Tan
        else if (ope==5){

               double rad = Math.toRadians(operan1);
                res=(Math.tan(rad));

        }
        //Cos
        else if (ope==6){

            double rad=Math.toDegrees(operan1);
            res=(Math.cos(rad));
        }
        //Sin
        else if (ope==7){
            double rad=Math.toRadians(operan1);
            res=(Math.sin(rad));

        }
        pant.setText(""+res);
        operan1=res;
    }
    //metodo borrar todo
    public void clear (View v){
        pant.setText("");
        operan1=0;
        res=0.0;
    }
    //metodo borrar digito
    public void borrar (View v){
        if (pant.getText().toString().equals("")){
            pant.setText(pant.getText().subSequence(0, pant.getText().length()-1)+"");
        }
    }
    //Boton off
    public void offf (View v){
        finish();
    }
}

