package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: classes3.dex */
public final class n31 implements a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o31 f23211a;

    public n31(o31 o31Var) {
        this.f23211a = o31Var;
    }

    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        TextView textViewN = fc1Var.n();
        if (textViewN != null) {
            textViewN.setText(R.string.yandex_ads_internal_instream_sponsored_social);
            textViewN.setVisibility(0);
            textViewN.setOnClickListener(new m31(this.f23211a));
        }
        ImageView imageViewM = fc1Var.m();
        if (imageViewM != null) {
            Context context = imageViewM.getContext();
            int i10 = R.drawable.yandex_instream_internal_advertiser_social;
            Object obj = e0.a.f28964a;
            imageViewM.setImageDrawable(e0.a.c.b(context, i10));
            imageViewM.setVisibility(0);
            imageViewM.setOnClickListener(new m31(this.f23211a));
        }
    }
}
