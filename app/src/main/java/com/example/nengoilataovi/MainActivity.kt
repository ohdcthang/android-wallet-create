package com.example.nengoilataovi

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nengoilataovi.ui.theme.NengoilataoviTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NengoilataoviTheme {
                // A surface container using the 'background' color from the theme
                Surface( color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
   Button(onClick = {
       Log.println(Log.INFO, "hehe", "Victoria xao quyet" )

       val mnemonic = "bacon grit piece velvet shallow mail hidden obey visa copy race certain";
       val path = "44'/60'/0'/0/0"
       val core =  AwesomeLibraryModule()

       val hdkey = core.hdkey(mnemonic, path)
       Log.println(Log.INFO, "hdkey", hdkey )

       val privateKey = (hdkey as String).split("  ").toTypedArray()[0]
       Log.println(Log.INFO, "publicKeyString", privateKey )
       val publicKey =  (hdkey as String).split(" ").toTypedArray()[1]
       Log.println(Log.INFO, "publicKey", publicKey )
       val address =  (hdkey as String).split(" ").toTypedArray()[2]
       Log.println(Log.INFO, "address", address )
   }) {
    Text(text = "Create VIC wallet")
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NengoilataoviTheme {
        Greeting("Android")
    }
}