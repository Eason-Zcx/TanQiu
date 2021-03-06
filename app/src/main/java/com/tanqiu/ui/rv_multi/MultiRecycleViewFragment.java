package com.tanqiu.ui.rv_multi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.tanqiu.BR;
import com.tanqiu.R;
import com.tanqiu.databinding.FragmentMultiRvBinding;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * Create Author：goldze
 * Create Date：2019/01/25
 * Description：RecycleView多布局实现
 */

public class MultiRecycleViewFragment extends BaseFragment<FragmentMultiRvBinding, MultiRecycleViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_multi_rv;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
