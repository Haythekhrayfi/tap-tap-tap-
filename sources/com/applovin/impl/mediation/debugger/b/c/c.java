package com.applovin.impl.mediation.debugger.b.c;

import android.content.Context;
import com.applovin.impl.sdk.utils.h;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9530c;

    public c(String str, String str2, Context context) {
        this.f9528a = str.replace("android.permission.", "");
        this.f9529b = str2;
        this.f9530c = h.a(str, context);
    }

    public String a() {
        return this.f9528a;
    }

    public String b() {
        return this.f9529b;
    }

    public boolean c() {
        return this.f9530c;
    }
}
