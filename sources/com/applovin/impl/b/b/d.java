package com.applovin.impl.b.b;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b.EnumC0118b f8775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.e f8776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b.c f8780f;

    public d(b.EnumC0118b enumC0118b, int i10, b.e eVar) {
        this.f8775a = enumC0118b;
        this.f8777c = i10;
        this.f8776b = eVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(o.au());
        StringBuilder sbA = defpackage.a.a("IABTCF_PublisherRestrictions");
        sbA.append(enumC0118b.f8750l);
        String str = (String) e.a(sbA.toString(), (Object) null, String.class, defaultSharedPreferences);
        String str2 = (String) e.a(com.applovin.impl.sdk.c.d.C.a(), (Object) null, String.class, defaultSharedPreferences);
        String str3 = (String) e.a(com.applovin.impl.sdk.c.d.D.a(), (Object) null, String.class, defaultSharedPreferences);
        a(str);
        b(str2);
        c(str3);
    }

    public void a(String str) {
        b.c cVarA;
        if (str == null || this.f8777c > str.length()) {
            cVarA = b.c.UNDEFINED;
        } else {
            String strValueOf = String.valueOf(str.charAt(this.f8777c - 1));
            if (!StringUtils.isNumeric(strValueOf)) {
                return;
            } else {
                cVarA = b.c.a(Integer.parseInt(strValueOf));
            }
        }
        this.f8780f = cVarA;
    }

    public boolean a() {
        return this.f8778d;
    }

    public boolean a(boolean z10, boolean z11) {
        b.e eVar = this.f8776b;
        if (eVar == b.e.f8761a) {
            return true;
        }
        if (eVar.f8766e.contains(this.f8780f)) {
            return false;
        }
        b.e eVar2 = this.f8776b;
        boolean z12 = eVar2 == b.e.f8762b || eVar2 == b.e.f8764d;
        if (z10 && z12 && this.f8778d) {
            return true;
        }
        return z11 && (eVar2 == b.e.f8763c || eVar2 == b.e.f8764d) && this.f8779e;
    }

    public void b(String str) {
        this.f8778d = b.a(str, this.f8775a.f8750l - 1);
    }

    public boolean b() {
        return this.f8779e;
    }

    public b.EnumC0118b c() {
        return this.f8775a;
    }

    public void c(String str) {
        this.f8779e = b.a(str, this.f8775a.f8750l - 1);
    }

    public b.e d() {
        return this.f8776b;
    }
}
