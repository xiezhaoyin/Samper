package com.xzydonate.basesdk.adapter.recyclerAdapter.trans;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.xzydonate.basesdk.adapter.recyclerAdapter.BaseQuickAdapter.TRANS_0_VIEW;
import static com.xzydonate.basesdk.adapter.recyclerAdapter.BaseQuickAdapter.TRANS_1_VIEW;
import static com.xzydonate.basesdk.adapter.recyclerAdapter.BaseQuickAdapter.TRANS_2_VIEW;


/**
 * Created by boby on 2017/1/19.
 */
@IntDef({TRANS_0_VIEW, TRANS_1_VIEW, TRANS_2_VIEW})
@Retention(RetentionPolicy.RUNTIME)
public @interface LayoutTrans {
}