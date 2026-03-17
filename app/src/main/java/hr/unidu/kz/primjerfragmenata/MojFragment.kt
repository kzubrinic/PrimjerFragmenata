package hr.unidu.kz.primjerfragmenata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// Parametri koje prima fragment
private const val ARG_IME = "ime"
private const val ARG_PREZIME = "prezime"

/**
 * Za stvaranje nove instance ovog fragmenta koristi se tvornička metoda [MojFragment.newInstance]
 */
class MojFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_IME)
            param2 = it.getString(ARG_PREZIME)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_moj, container, false)
    }

    companion object {
        /**
         * Tvornička metoda koja se koristi za kreiranje nove instance fragmenta.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * ...
         * @return Novi objekt tipa MojFragment.
         */
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MojFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_IME, param1)
                    putString(ARG_PREZIME, param2)
                }
            }
    }
}