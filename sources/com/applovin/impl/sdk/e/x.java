package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import androidx.appcompat.widget.r0;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class x<T> extends d implements com.applovin.impl.sdk.network.b.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.c<T> f10665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.b.d<T> f10666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r.b f10667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.c.b<String> f10668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.applovin.impl.sdk.network.b.a f10669e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.applovin.impl.sdk.c.b<String> f10670i;

    public x(com.applovin.impl.sdk.network.c<T> cVar, com.applovin.impl.sdk.o oVar) {
        this(cVar, oVar, false);
    }

    public x(com.applovin.impl.sdk.network.c<T> cVar, final com.applovin.impl.sdk.o oVar, boolean z10) {
        super("TaskRepeatRequest", oVar, z10);
        this.f10667c = r.b.BACKGROUND;
        this.f10668d = null;
        this.f10670i = null;
        if (cVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(cVar.a());
        this.f10665a = cVar;
        this.f10669e = new com.applovin.impl.sdk.network.b.a();
        this.f10666b = new com.applovin.impl.sdk.network.b.d<T>() { // from class: com.applovin.impl.sdk.e.x.1
            @Override // com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, T t10) {
                x xVar;
                com.applovin.impl.sdk.c.b bVar;
                long millis;
                boolean z11 = false;
                boolean z12 = i10 < 200 || i10 >= 500;
                boolean z13 = i10 == 429;
                if (((i10 != -1009) || x.this.f10665a.n()) && (z12 || z13 || x.this.f10665a.m())) {
                    String strF = x.this.f10665a.f();
                    if (x.this.f10665a.h() > 0) {
                        com.applovin.impl.sdk.y yVar = x.this.f10536h;
                        if (com.applovin.impl.sdk.y.a()) {
                            x xVar2 = x.this;
                            com.applovin.impl.sdk.y yVar2 = xVar2.f10536h;
                            String str2 = xVar2.f10535g;
                            StringBuilder sbA = r0.a("Unable to send request due to server failure (code ", i10, "). ");
                            sbA.append(x.this.f10665a.h());
                            sbA.append(" attempts left, retrying in ");
                            sbA.append(TimeUnit.MILLISECONDS.toSeconds(x.this.f10665a.k()));
                            sbA.append(" seconds...");
                            yVar2.d(str2, sbA.toString());
                        }
                        int iH = x.this.f10665a.h() - 1;
                        x.this.f10665a.a(iH);
                        if (iH == 0) {
                            x xVar3 = x.this;
                            xVar3.c(xVar3.f10668d);
                            if (StringUtils.isValidString(strF) && strF.length() >= 4) {
                                com.applovin.impl.sdk.y yVar3 = x.this.f10536h;
                                if (com.applovin.impl.sdk.y.a()) {
                                    x xVar4 = x.this;
                                    xVar4.f10536h.c(xVar4.f10535g, "Switching to backup endpoint " + strF);
                                }
                                x.this.f10665a.a(strF);
                                z11 = true;
                            }
                        }
                        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.dK)).booleanValue() && z11) {
                            millis = 0;
                        } else {
                            millis = x.this.f10665a.l() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, x.this.f10665a.i())) : x.this.f10665a.k();
                        }
                        r rVarG = oVar.G();
                        x xVar5 = x.this;
                        rVarG.a(xVar5, xVar5.f10667c, millis);
                        return;
                    }
                    if (strF == null || !strF.equals(x.this.f10665a.a())) {
                        xVar = x.this;
                        bVar = xVar.f10668d;
                    } else {
                        xVar = x.this;
                        bVar = xVar.f10670i;
                    }
                    xVar.c(bVar);
                }
                x.this.a(i10, str, t10);
            }

            @Override // com.applovin.impl.sdk.network.b.d
            public void a(T t10, int i10) {
                x.this.f10665a.a(0);
                x.this.a(t10, i10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <ST> void c(com.applovin.impl.sdk.c.b<ST> bVar) {
        if (bVar != null) {
            d().H().a((com.applovin.impl.sdk.c.b<?>) bVar, (Object) bVar.b());
        }
    }

    public abstract void a(int i10, String str, T t10);

    public void a(com.applovin.impl.sdk.c.b<String> bVar) {
        this.f10668d = bVar;
    }

    public void a(r.b bVar) {
        this.f10667c = bVar;
    }

    public abstract void a(T t10, int i10);

    public void b(com.applovin.impl.sdk.c.b<String> bVar) {
        this.f10670i = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        com.applovin.impl.sdk.network.b bVarI = d().I();
        if (!d().c() && !d().d()) {
            com.applovin.impl.sdk.y.j("AppLovinSdk", "AppLovin SDK is disabled");
            i10 = -22;
        } else if (StringUtils.isValidString(this.f10665a.a()) && this.f10665a.a().length() >= 4) {
            if (TextUtils.isEmpty(this.f10665a.b())) {
                this.f10665a.b(this.f10665a.e() != null ? "POST" : "GET");
            }
            bVarI.a(this.f10665a, this.f10669e, this.f10666b);
            return;
        } else {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.e(this.f10535g, "Task has an invalid or null request endpoint.");
            }
            i10 = AppLovinErrorCodes.INVALID_URL;
        }
        a(i10, null, null);
    }
}
