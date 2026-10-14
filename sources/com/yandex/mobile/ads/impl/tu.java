package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class tu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f25497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jw0 f25498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.w f25499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final su f25500d = new su();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.k f25501e;

    public tu(k2 k2Var, jw0 jw0Var, com.yandex.mobile.ads.nativeads.w wVar, com.yandex.mobile.ads.nativeads.k kVar) {
        this.f25497a = k2Var;
        this.f25498b = jw0Var;
        this.f25499c = wVar;
        this.f25501e = kVar;
    }

    public final void a(Context context, ju juVar) {
        ImageView imageViewH = this.f25499c.h().h();
        if (imageViewH != null) {
            List<ju.a> listB = juVar.b();
            if (listB.isEmpty()) {
                return;
            }
            try {
                k6 k6Var = new k6(context, this.f25497a);
                Objects.requireNonNull(this.f25500d);
                PopupMenu popupMenuA = su.a(context, imageViewH, listB);
                popupMenuA.setOnMenuItemClickListener(new zr0(k6Var, listB, this.f25498b, this.f25501e));
                popupMenuA.show();
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }
}
