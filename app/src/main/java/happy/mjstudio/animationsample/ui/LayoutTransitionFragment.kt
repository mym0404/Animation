package happy.mjstudio.animationsample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import happy.mjstudio.animationsample.R
import happy.mjstudio.animationsample.widget.onDebounceClick
import kotlinx.android.synthetic.main.fragment_layout_transition.*

class LayoutTransitionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_layout_transition, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        button_visible onDebounceClick {
            imageViewAppear.isVisible = true
            imageViewAppear2.postDelayed({
                imageViewAppear2.isVisible = true
            },500L)

        }
        button_gone onDebounceClick {
            imageViewAppear.isVisible = false
            imageViewAppear2.postDelayed({
                imageViewAppear2.isVisible = false
            },500L)
        }

        imageViewAppear onDebounceClick {
            Toast.makeText(requireContext(),"hi",Toast.LENGTH_SHORT).show()
        }
    }
}
