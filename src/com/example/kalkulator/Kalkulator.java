package com.example.kalkulator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class Kalkulator extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kalkulator);
		
		Button C = (Button)findViewById(R.id.button5);
		C.setEnabled(false);
		
		
		  Button E = (Button) findViewById(R.id.button6);
		    E.setOnClickListener(new OnClickListener() {

		        @Override
		        public void onClick(View v) {
		            // TODO Auto-generated method stub
		            finish();
		            System.exit(0);
		        }
		    });
		    }
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kalkulator, menu);
		return true;
	}

	
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////
	public void akcja(View view){
    	
		EditText liczbaA  = (EditText)findViewById(R.id.textView2);
    	EditText liczbaB  = (EditText)findViewById(R.id.textView1);
    	EditText wynik_koncowy = (EditText)findViewById(R.id.textView3);
    	Button C = (Button)findViewById(R.id.button5);
    	
    	String c = liczbaA.getText().toString();
    	String d = liczbaB.getText().toString();
    	float a,b;
    	
    	if(c.equals("")) a=0;
    	else a = Float.parseFloat(liczbaA.getText().toString());
    	if(d.equals("")) b=0;
    	else b = Float.parseFloat(liczbaB.getText().toString());
    	
    	
    	/*float a = Float.parseFloat(liczbaA.getText().toString());
    	float b = Float.parseFloat(liczbaB.getText().toString()); */
    	
    	float wynik = 0;
    	
    		

    	switch(view.getId()){
    	
    		case R.id.button1:
    			    			   			
    			wynik = a+b; 
    			wynik_koncowy.setText(String.format("%f", wynik));
    			C.setEnabled(true);
    			break;
	
    			
    		case R.id.button2:
    			
    			wynik = a-b;
    			wynik_koncowy.setText(String.format("%f", wynik));
    			C.setEnabled(true);
    			break;
    			
    		case R.id.button3:
    			
    			wynik = a*b;
    			wynik_koncowy.setText(String.format("%f", wynik));
    			C.setEnabled(true);
    			break;
    			
    		case R.id.button4:
    			
    			if(b==0) {
    				
    				wynik_koncowy.setText("Nie dzielimy przez zero");
    				C.setEnabled(true);
        			break;
    				
    			}
    			else
    			wynik = a/b;
    			wynik_koncowy.setText(String.format("%f", wynik));
    			C.setEnabled(true);
    			break;
    			
    		case R.id.button5:
    			
    			liczbaA.setText(null);
    			liczbaB.setText(null);
    			wynik_koncowy.setText(String.valueOf(0));
    			C.setEnabled(false);
    			break;
    			   			   			
    	
    	}

    	//wynik_koncowy.setText(String.format("%f", wynik));
    }
///////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	
	
}
