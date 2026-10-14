package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class og1<V extends View, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<V> f23792a;

    public og1(V v10) {
        this.f23792a = new WeakReference<>(v10);
    }

    public void a() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void a(V v10) {
        v10.setVisibility(8);
        v10.setOnClickListener(null);
        v10.setOnTouchListener(null);
        v10.setSelected(false);
    }

    public void a(qa qaVar, rg1 rg1Var, T t10) {
        View viewB = b();
        if (viewB != null) {
            rg1Var.a(viewB, qaVar);
            rg1Var.a(qaVar, new qg1(viewB));
        }
    }

    public abstract boolean a(V v10, T t10);

    public final V b() {
        return this.f23792a.get();
    }

    public abstract void b(V v10, T t10);
}
