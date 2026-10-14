package com.yandex.metrica.impl.ob;

import android.app.Activity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Sl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1790ll f15029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1740jl f15030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1765kl f15031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1691hl f15032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15033e;

    public Sl(InterfaceC1790ll interfaceC1790ll, InterfaceC1740jl interfaceC1740jl, InterfaceC1765kl interfaceC1765kl, InterfaceC1691hl interfaceC1691hl, String str) {
        this.f15029a = interfaceC1790ll;
        this.f15030b = interfaceC1740jl;
        this.f15031c = interfaceC1765kl;
        this.f15032d = interfaceC1691hl;
        this.f15033e = str;
    }

    public JSONObject a(Activity activity, Gl gl, Kl kl, C1541bl c1541bl, long j10) {
        JSONObject jSONObjectA = this.f15029a.a(activity, j10);
        try {
            this.f15031c.a(jSONObjectA, new JSONObject(), this.f15033e);
            this.f15031c.a(jSONObjectA, this.f15030b.a(gl, kl, c1541bl, (jSONObjectA.toString().getBytes().length + (this.f15032d.a(new JSONObject()).toString().getBytes().length - 2)) - 2), this.f15033e);
        } catch (Throwable unused) {
        }
        return jSONObjectA;
    }
}
