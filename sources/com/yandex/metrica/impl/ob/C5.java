package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class C5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1547c2 f13759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I8 f13760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Wn f13761d;

    public C5(C1624f4 c1624f4) {
        this(c1624f4, c1624f4.w(), P0.i().m(), new Wn());
    }

    public C5(C1624f4 c1624f4, I8 i10, C1547c2 c1547c2, Wn wn) {
        super(c1624f4);
        this.f13760c = i10;
        this.f13759b = c1547c2;
        this.f13761d = wn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        String strA;
        C1624f4 c1624f4A = a();
        if (this.f13760c.n()) {
            return false;
        }
        C1744k0 c1744k0E = c1624f4A.m().Q() ? C1744k0.e(c1744k0) : C1744k0.c(c1744k0);
        JSONObject jSONObject = new JSONObject();
        Wn wn = this.f13761d;
        Context contextG = c1624f4A.g();
        String strB = c1624f4A.e().b();
        Objects.requireNonNull(wn);
        JSONObject jSONObject2 = null;
        try {
            PackageManager packageManager = contextG.getPackageManager();
            strA = U2.a(30) ? Xn.a(packageManager, strB) : packageManager.getInstallerPackageName(strB);
        } catch (Throwable unused) {
            strA = null;
        }
        if (strA == null) {
            strA = "";
        }
        try {
            jSONObject.put("appInstaller", strA);
            Le leA = this.f13759b.a();
            if (leA.f14407c) {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("trackingId", leA.f14405a);
                    if (leA.f14406b.length() > 0) {
                        jSONObject2.put("additionalParams", leA.f14406b);
                    }
                } catch (Throwable unused2) {
                }
            }
            jSONObject.put("preloadInfo", jSONObject2);
        } catch (Throwable unused3) {
        }
        c1624f4A.r().b(c1744k0E.f(jSONObject.toString()));
        this.f13760c.b(true);
        return false;
    }
}
