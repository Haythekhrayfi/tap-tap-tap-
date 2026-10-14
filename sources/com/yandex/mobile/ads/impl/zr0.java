package com.yandex.mobile.ads.impl;

import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zr0 implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jw0 f27401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k6 f27402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ju.a> f27403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.k f27404d;

    public zr0(k6 k6Var, List<ju.a> list, jw0 jw0Var, com.yandex.mobile.ads.nativeads.k kVar) {
        this.f27403c = list;
        this.f27402b = k6Var;
        this.f27401a = jw0Var;
        this.f27404d = kVar;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f27403c.size()) {
            return true;
        }
        this.f27402b.a(this.f27403c.get(itemId).b());
        ((gi) this.f27401a).a(fw0.b.C);
        this.f27404d.a();
        return true;
    }
}
