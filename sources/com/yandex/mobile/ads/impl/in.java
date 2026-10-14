package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: classes3.dex */
public final class in implements a8 {
    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        TextView textViewN = fc1Var.n();
        if (textViewN != null) {
            textViewN.setText(R.string.yandex_ads_internal_instream_sponsored_yandex);
            textViewN.setVisibility(0);
        }
        ImageView imageViewM = fc1Var.m();
        if (imageViewM != null) {
            Context context = imageViewM.getContext();
            int i10 = R.drawable.yandex_instream_internal_advertiser;
            Object obj = e0.a.f28964a;
            imageViewM.setImageDrawable(e0.a.c.b(context, i10));
            imageViewM.setVisibility(0);
        }
    }
}
