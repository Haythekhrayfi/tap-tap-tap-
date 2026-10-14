package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class p4 implements u40 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f23972c = R.string.yandex_ads_internal_instream_ad_position;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23974b;

    public p4(int i10, int i11) {
        this.f23973a = i10;
        this.f23974b = i11;
    }

    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        fd.j0.i(fc1Var, "uiElements");
        TextView textViewB = fc1Var.b();
        if (textViewB != null) {
            String string = textViewB.getContext().getResources().getString(f23972c);
            fd.j0.h(string, "resources.getString(POSITION_TEMPLATE_ID)");
            String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f23973a), Integer.valueOf(this.f23974b)}, 2));
            fd.j0.h(str, "format(format, *args)");
            textViewB.setText(str);
        }
    }
}
