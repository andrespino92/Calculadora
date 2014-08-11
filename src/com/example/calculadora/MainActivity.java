package com.example.calculadora;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	protected Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	protected Button bmas,bmenos,bpor,bdiv,del,igual,bpunto,btodo;
	protected EditText resul;
	private Boolean ver=false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);
		b4 = (Button) findViewById(R.id.b4);
		b5 = (Button) findViewById(R.id.b5);
		b6 = (Button) findViewById(R.id.b6);
		b7 = (Button) findViewById(R.id.b7);
		b8 = (Button) findViewById(R.id.b8);
		b9 = (Button) findViewById(R.id.b9);
		b0 = (Button) findViewById(R.id.b0);
		bmas = (Button) findViewById(R.id.bmas);
		bmenos = (Button) findViewById(R.id.bmenos);
		bpor = (Button) findViewById(R.id.bpor);
		bdiv = (Button) findViewById(R.id.bdiv);
		del = (Button) findViewById(R.id.bborrar);
		resul = (EditText)findViewById(R.id.resul);
		igual = (Button) findViewById(R.id.igual);
		bpunto = (Button) findViewById(R.id.bpunto);
		btodo = (Button) findViewById(R.id.btodo);
		
		
		b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("1");
				}
				else
				{
					if(ver==true)
					{
						resul.setText("");
						resul.setText(resul.getText()+"1");
						ver=false;
					}	
					else
					{
						resul.setText(resul.getText()+"1");
					}
				}
			}
		});
		
		b2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("2");
				}
				else
				{
					if(ver==true)
					{
						resul.setText("");
						resul.setText(resul.getText()+"2");
						ver=false;
					}	
					else
					{
						resul.setText(resul.getText()+"2");
					}
				}
			}
		});
		
		b3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("3");
				}
				else
				{
					if(ver==true)
					{
						resul.setText("");
						resul.setText(resul.getText()+"3");
						ver=false;
					}	
					else
					{
						resul.setText(resul.getText()+"3");
					}
				}
			}
		});
		
		b4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("4");
				}
				else
				{
					if(ver==true)
					{
						resul.setText("");
						resul.setText(resul.getText()+"4");
						ver=false;
					}	
					else
					{
						resul.setText(resul.getText()+"4");
					}
				}
			}
		});
		
		b5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("5");
				}
				else
				{
					if(ver==true)
					{
						resul.setText("");
						resul.setText(resul.getText()+"5");
						ver=false;
					}	
					else
					{
						resul.setText(resul.getText()+"5");
					}
				}
			}
		});
		
		b6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("6");
				}
				else
				{
					if(ver==true)
					{
						resul.setText("");
						resul.setText(resul.getText()+"6");
						ver=false;
					}	
					else
					{
						resul.setText(resul.getText()+"6");
					}
				}
			}
		});
		
		b7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("7");
				}
				else
				{
					if(ver==true)
					{
						resul.setText("");
						resul.setText(resul.getText()+"7");
						ver=false;
					}	
					else
					{
						resul.setText(resul.getText()+"7");
					}
				}
			}
		});
		
		b8.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("8");
				}
				else
				{
					if(ver==true)
					{
						resul.setText("");
						resul.setText(resul.getText()+"8");
						ver=false;
					}	
					else
					{
						resul.setText(resul.getText()+"8");
					}
				}
			}
		});
		
		b9.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("9");
				}
				else
				{
					if(ver==true)
					{
						resul.setText("");
						resul.setText(resul.getText()+"9");
						ver=false;
					}	
					else
					{
						resul.setText(resul.getText()+"9");
					}
				}
			}
		});
		
		b0.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("0");
				}
				else
				{
					if(ver==true)
					{
						resul.setText("");
						resul.setText(resul.getText()+"0");
						ver=false;
					}	
					else
					{
						resul.setText(resul.getText()+"0");
					}
				}
			}
		});
		
		del.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(!resul.getText().toString().equals(""))
				{
					String cadena = resul.getText().toString();
					resul.setText(cadena.substring(0,cadena.length()-1));
				}
				else
				{
					Toast.makeText(getApplicationContext(),"Campo de Texto Vacio", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		bmas.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					Toast.makeText(getApplicationContext(),"Campo Vacio", Toast.LENGTH_SHORT).show();
				}
				else
				{
					String cadena = resul.getText().toString();
					int tam = cadena.length();
					if(!cadena.substring(tam-1, tam).equals("÷") && !cadena.substring(tam-1, tam).equals("*") && !cadena.substring(tam-1, tam).equals("+") && !cadena.substring(tam-1, tam).equals("-"))
					{
						resul.setText(resul.getText()+"+");
						ver=false;
					}
				}
			}
		});
		
		bmenos.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					Toast.makeText(getApplicationContext(),"Campo Vacio", Toast.LENGTH_SHORT).show();
				}
				else
				{
					String cadena = resul.getText().toString();
					int tam = cadena.length();
					if(!cadena.substring(tam-1, tam).equals("÷") && !cadena.substring(tam-1, tam).equals("*") && !cadena.substring(tam-1, tam).equals("+") && !cadena.substring(tam-1, tam).equals("-"))
					{
						resul.setText(resul.getText()+"-");
						ver=false;
					}
				}
			}
		});
		
		bpor.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					Toast.makeText(getApplicationContext(),"Campo Vacio", Toast.LENGTH_SHORT).show();
				}
				else
				{
					String cadena = resul.getText().toString();
					int tam = cadena.length();
					if(!cadena.substring(tam-1, tam).equals("÷") && !cadena.substring(tam-1, tam).equals("*") && !cadena.substring(tam-1, tam).equals("+") && !cadena.substring(tam-1, tam).equals("-"))
					{
						resul.setText(resul.getText()+"*");
						ver=false;
					}
				}
			}
		});
		
		bdiv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					Toast.makeText(getApplicationContext(),"Campo Vacio", Toast.LENGTH_SHORT).show();
				}
				else
				{
					String cadena = resul.getText().toString();
					int tam = cadena.length();
					if(!cadena.substring(tam-1, tam).equals("÷") && !cadena.substring(tam-1, tam).equals("*") && !cadena.substring(tam-1, tam).equals("+") && !cadena.substring(tam-1, tam).equals("-"))
					{
						resul.setText(resul.getText()+"÷");
						ver=false;
					}
				}
			}
		});
	
		igual.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					Toast.makeText(getApplicationContext(),"Campo Vacio", Toast.LENGTH_SHORT).show();
				}
				else
				{
					String a = resul.getText().toString();
					int b = a.length();
					if(!a.substring(b-1, b).equals("÷") && !a.substring(b-1, b).equals("*") && !a.substring(b-1, b).equals("+") && !a.substring(b-1, b).equals("-"))
					{
						String cadena = resul.getText().toString();
						int tam = cadena.length();
						int cnum=0,csig=0;
						String num="";
						Double resultado=0.0;
						ArrayList<String> numeros = new ArrayList<String>();
						ArrayList<String> signos = new ArrayList<String>();
						for(int i=0;i<tam;i++)
						{
							if(!cadena.substring(i,i+1).equals("÷") && !cadena.substring(i,i+1).equals("*") && !cadena.substring(i,i+1).equals("+") && !cadena.substring(i,i+1).equals("-"))
							{
								num = num+cadena.substring(i,i+1).toString();
							}
							else
							{
								numeros.add(cnum, num);
								cnum++;
								num="";
								
								signos.add(csig, cadena.substring(i,i+1).toString());
								csig++;
							}
						}
						numeros.add(cnum, num);
						resultado = Double.parseDouble(numeros.get(0).toString());
						
						for(int i=1;i<=cnum;i++)
						{
							if(signos.get(i-1).toString().equals("+"))
							{
								resultado = resultado + Double.parseDouble(numeros.get(i).toString());
							}
							if(signos.get(i-1).toString().equals("-"))
							{
								resultado = resultado - Double.parseDouble(numeros.get(i).toString());
							}
							if(signos.get(i-1).toString().equals("*"))
							{
								resultado = resultado * Double.parseDouble(numeros.get(i).toString());
							}
							if(signos.get(i-1).toString().equals("÷"))
							{
								resultado = resultado / Double.parseDouble(numeros.get(i).toString());
							}
						}		
						ver=true;
						resul.setText(resultado+"");
					}
				}
			}
		});
	
		bpunto.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText(".");
				}
				else
				{
					resul.setText(resul.getText()+".");
				}
			}
		});
		
		btodo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_SHORT).show();
				if(resul.getText().toString().equals(""))
				{
					resul.setText("");
				}
				else
				{
					resul.setText("");
					Toast.makeText(getApplicationContext(),"Limpiado", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
