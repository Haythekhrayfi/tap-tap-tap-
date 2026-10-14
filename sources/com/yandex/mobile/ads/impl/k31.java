package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k31 implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d81 f22239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zh0 f22240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<f31> f22241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.k f22242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pk0 f22243e;

    public k31(d81 d81Var, zh0 zh0Var, List<f31> list, com.yandex.mobile.ads.nativeads.k kVar, pk0 pk0Var) {
        this.f22239a = d81Var;
        this.f22240b = zh0Var;
        this.f22241c = list;
        this.f22242d = kVar;
        this.f22243e = pk0Var;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f22241c.size()) {
            return true;
        }
        f31 f31Var = this.f22241c.get(itemId);
        m80 m80VarA = f31Var.a();
        ok0 ok0VarA = this.f22243e.a(this.f22240b.a(f31Var.b(), "social_action"));
        this.f22242d.a(m80VarA);
        this.f22239a.a(m80VarA.d());
        String strE = m80VarA.e();
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        ok0VarA.a(strE);
        return true;
    }
}
