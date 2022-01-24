package com.umtzngn.instagramclone.Fragments
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.umtzngn.instagramclone.R
import com.umtzngn.instagramclone.databinding.FragmentGirisBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class GirisFragment : Fragment(R.layout.fragment_giris) {

    private val binding by viewBinding (FragmentGirisBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}