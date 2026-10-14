package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class d80<V extends ViewGroup> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f19777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80<V> f19778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b80<V> f19779d = new b80<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a80<V> f19780e = new a80<>();

    public d80(Context context, ViewGroup viewGroup, ArrayList arrayList) {
        this.f19776a = context;
        this.f19777b = viewGroup;
        this.f19778c = new c80<>(arrayList);
    }

    public final boolean a() {
        ViewGroup viewGroupA;
        z70<V> z70VarA = this.f19778c.a(this.f19776a);
        if (z70VarA == null || (viewGroupA = this.f19779d.a(this.f19777b, z70VarA)) == null) {
            return false;
        }
        this.f19780e.a(this.f19777b, viewGroupA, z70VarA);
        return true;
    }

    public final void b() {
        this.f19780e.a(this.f19777b);
    }
}
