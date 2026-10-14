package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.PopupMenu;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f22611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zh0 f22612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g20 f22613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.k f22614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pk0 f22615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q31 f22616f = new q31();

    public l31(k2 k2Var, zh0 zh0Var, com.yandex.mobile.ads.nativeads.k kVar, com.yandex.mobile.ads.nativeads.w wVar, pk0 pk0Var) {
        this.f22611a = k2Var;
        this.f22612b = zh0Var;
        this.f22614d = kVar;
        this.f22615e = pk0Var;
        this.f22613c = wVar.d();
    }

    public final void a(View view, c31 c31Var) {
        List<f31> listB = c31Var.b();
        if (listB.isEmpty()) {
            return;
        }
        PopupMenu popupMenuA = this.f22616f.a(view, this.f22613c, listB);
        popupMenuA.setOnMenuItemClickListener(new k31(new d81(new k6(view.getContext(), this.f22611a)), this.f22612b, listB, this.f22614d, this.f22615e));
        popupMenuA.show();
    }
}
