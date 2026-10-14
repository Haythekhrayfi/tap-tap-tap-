package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: classes3.dex */
public final class oo implements mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23863a;

    public oo(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f23863a = context;
    }

    @Override // com.yandex.mobile.ads.impl.mn
    public final qa<?> a() {
        CharSequence text = this.f23863a.getResources().getText(R.string.yandex_ads_internal_instream_sponsored_yandex);
        fd.j0.h(text, "context.resources.getTex…nstream_sponsored_yandex)");
        return new qa<>("sponsored", "string", text, null, false, true);
    }
}
