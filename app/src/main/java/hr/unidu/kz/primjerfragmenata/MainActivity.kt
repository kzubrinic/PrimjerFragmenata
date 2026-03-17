package hr.unidu.kz.primjerfragmenata

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Stvara s enovi objekt tipa MojFragment i predaju mu se parametri
        val frag = MojFragment.newInstance("Pero", "Perić")
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment02, frag)
            .addToBackStack("tag1")
            .commit()
    }
}