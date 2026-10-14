package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class va1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ei1 f25925a = vm0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jb1 f25926b;

    public va1(Context context) {
        this.f25926b = new jb1(context);
    }

    public final sa1 a(wm0 wm0Var) {
        String strA = this.f25925a.a(wm0Var);
        if (!TextUtils.isEmpty(strA)) {
            try {
                na1 na1VarA = this.f25926b.a(strA);
                if (na1VarA != null) {
                    Map<String, String> map = wm0Var.f26321c;
                    if (!(map != null ? qy.a(map, 32) : false)) {
                        strA = null;
                    }
                    return new sa1(na1VarA, strA);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
