package com.xwsd.android.myframework.modules;

import com.xwsd.android.myframework.base.BasePresenter;
import com.xwsd.android.myframework.base.BaseView;

/**
 * Created by qiang.lin on 2018/2/28.
 */

public interface MainFragmentContract {
    interface View extends BaseView {

    }
    interface Presenter extends BasePresenter<View> {

    }
}
