package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class bz0<T extends View> {
    public static View a(Context context, Class cls, int i10, ViewGroup viewGroup) {
        try {
            return (View) cls.cast(LayoutInflater.from(context).inflate(i10, viewGroup, false));
        } catch (Exception e10) {
            x60.c("Failed to inflate layout", e10);
            return null;
        }
    }
}
