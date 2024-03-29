package app.doggy.mvpsample.ui.count

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import app.doggy.mvpsample.R
import app.doggy.mvpsample.databinding.FragmentCountBinding
import app.doggy.mvpsample.domain.model.Count
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
internal class CountFragment : Fragment(R.layout.fragment_count), CountContract.View {

  @Inject
  override lateinit var presenter: CountContract.Presenter

  private var _binding: FragmentCountBinding? = null
  private val binding: FragmentCountBinding get() = _binding!!

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    _binding = FragmentCountBinding.bind(view)

    presenter.onViewCreated()

    binding.incrementButton.setOnClickListener {
      presenter.onIncrementButtonClick()
    }
    binding.decrementButton.setOnClickListener {
      presenter.onDecrementButtonClick()
    }
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }

  override fun showCount(count: Count) {
    binding.countText.text = count.value.toString()
  }

  override fun showError(errorMessageRes: Int) {
    Snackbar.make(binding.root, requireContext().getText(errorMessageRes), Snackbar.LENGTH_SHORT).show()
  }
}
