package com.example.hellowroldkotlin

import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        //DESAFIO 1
        val tagFinal="desafio"
        fun printAndroid(tag:String,resultado:String){
            Log.d(tagFinal+" "+tag,resultado)
        }
        //3.Imprimir “Mi nombre es: {Nombre del alumno}".
        printAndroid("3. nombre alumno","Kevin von Hausen")

        //4. Declarar 3 variables numéricas con los valores 10, 20 y 30.
        var num1=10
        var num2=20
        var num3=30

        //5. Imprimir la suma de las 3 variables
        var resultado1=num1+num2+num3
        printAndroid("5. resultado suma",resultado1.toString())

        //6. Declarar 1 variable String y otra variable Char
        var japaneseName:String
        var letterA:Char

        //7. Asignarle el valor “Arataka Reigen” a la variable String y “A” a la variable Char .
        japaneseName="Arakata Reigen"
        letterA='A'

        //8. Imprimir la cantidad de caracteres que tiene la variable String y modificar la variable char a otro valor distinto.
        printAndroid("8. cantidad de caracteres","la suma de los caracteres de $japaneseName es "+japaneseName.count().toString())
        letterA='B'

        //9. Declarar una variable de tipo Float de forma explícita.
        var floatNumber:Float

        //10. Asignar un valor a la variable Float.
        floatNumber=5.5f

        //11. Imprimir los valores máximos que pueden almacenar las variables Byte y Short
        var byteMAX:Byte=Byte.MAX_VALUE
        var shortMAX=Short.MAX_VALUE
        printAndroid("11. valor maximo byte", "MAX Byte=$byteMAX")
        printAndroid("11. valor maximo short","MAX Short=$shortMAX")

        //12. Imprimir los valores mínimos que pueden almacenar las variables Int y Long
        var intMIN=Int.MIN_VALUE
        var longMIN=Long.MIN_VALUE
        printAndroid("12. valor minimo int","MIN Int=$intMIN")
        printAndroid("12. valor minimo long","Min Long=$longMIN")

        //13. Declarar una variable Boolean con true o false e imprimir su valor.
        var booleanVar=true
        printAndroid("13. imprimir boolean","valor boolean=$booleanVar")

        //14. Crear una función llamada “imprimiendoParametros” que recibe 2 parámetros String y este imprime el total de caracteres de los dos parámetros.
        fun imprimiendoParametros(string1:String,string2:String){
            var suma=string1.count()+string2.count()
            printAndroid("16. total de caracteres","la suma de los caracteres de $string1 y $string2 es: " +suma.toString())
        }

        //15. Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%)
        fun obtieneIVA():String{
            return "19%"
        }

        //16. Desde la función main llamar a estas dos funciones de forma correcta.
        imprimiendoParametros("naranjo","campana")
        printAndroid("16. iva","valor IVA: ${obtieneIVA()}")






    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}