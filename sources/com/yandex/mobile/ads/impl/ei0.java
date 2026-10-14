package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes3.dex */
public final class ei0 implements ci0 {
    @Override // com.yandex.mobile.ads.impl.ci0
    public final ProgressBar a(View view) {
        return (ProgressBar) view.findViewWithTag("close_progress_view");
    }

    @Override // com.yandex.mobile.ads.impl.ci0
    public final View b(View view) {
        return view.findViewWithTag("close");
    }
}
