package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c80<V extends ViewGroup> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<z70<V>> f19412a;

    public c80(List<z70<V>> list) {
        this.f19412a = list;
    }

    public final z70<V> a(Context context) {
        for (z70<V> z70Var : this.f19412a) {
            if (z70Var.b().a(context)) {
                return z70Var;
            }
        }
        return null;
    }
}
