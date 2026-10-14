package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b80<V extends ViewGroup> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bz0<V> f19145a = new bz0<>();

    @Nullable
    public final V a(ViewGroup viewGroup, z70<V> z70Var) {
        Context context = viewGroup.getContext();
        int iC = z70Var.c();
        Class<V> clsD = z70Var.d();
        Objects.requireNonNull(this.f19145a);
        return (V) bz0.a(context, clsD, iC, viewGroup);
    }
}
