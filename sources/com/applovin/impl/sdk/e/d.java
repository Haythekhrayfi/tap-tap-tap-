package com.applovin.impl.sdk.e;

import android.content.Context;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10533c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f10534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.applovin.impl.sdk.y f10536h;

    public d(String str, com.applovin.impl.sdk.o oVar) {
        this(str, oVar, false, null);
    }

    public d(String str, com.applovin.impl.sdk.o oVar, String str2) {
        this(str, oVar, false, str2);
    }

    public d(String str, com.applovin.impl.sdk.o oVar, boolean z10) {
        this(str, oVar, z10, null);
    }

    public d(String str, com.applovin.impl.sdk.o oVar, boolean z10, String str2) {
        this.f10535g = str;
        this.f10534f = oVar;
        this.f10536h = oVar.F();
        this.f10531a = com.applovin.impl.sdk.o.au();
        this.f10533c = z10;
        this.f10532b = str2;
    }

    public void a(String str) {
        this.f10532b = str;
    }

    public void a(Throwable th) {
        Map<String, String> map = CollectionUtils.map("source", this.f10535g);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f10532b));
        this.f10534f.ag().a(com.applovin.impl.sdk.s.a.TASK_EXCEPTION, map);
    }

    public void a(boolean z10) {
        this.f10533c = z10;
    }

    public com.applovin.impl.sdk.o d() {
        return this.f10534f;
    }

    public String e() {
        return this.f10535g;
    }

    public Context f() {
        return this.f10531a;
    }

    public boolean g() {
        return this.f10533c;
    }
}
