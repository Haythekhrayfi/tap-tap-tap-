package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: loaded from: classes.dex */
class aa extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c.e f10502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinAdLoadListener f10503b;

    public aa(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        super("TaskResolveVastWrapper", oVar);
        this.f10503b = appLovinAdLoadListener;
        this.f10502a = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.e(this.f10535g, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 != -1009) {
            com.applovin.impl.c.m.a(this.f10502a, this.f10503b, i10 == -1001 ? com.applovin.impl.c.f.TIMED_OUT : com.applovin.impl.c.f.GENERAL_WRAPPER_ERROR, i10, this.f10534f);
            return;
        }
        AppLovinAdLoadListener appLovinAdLoadListener = this.f10503b;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = com.applovin.impl.c.m.a(this.f10502a);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.y.a()) {
                com.applovin.impl.sdk.y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Resolving VAST ad with depth ");
                sbA.append(this.f10502a.a());
                sbA.append(" at ");
                sbA.append(strA);
                yVar.b(str, sbA.toString());
            }
            try {
                this.f10534f.G().a((d) new x<com.applovin.impl.sdk.utils.aa>(com.applovin.impl.sdk.network.c.a(this.f10534f).a(strA).b("GET").a(com.applovin.impl.sdk.utils.aa.f11172a).a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fl)).intValue()).b(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fm)).intValue()).d(false).a(), this.f10534f) { // from class: com.applovin.impl.sdk.e.aa.1
                    @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
                    public void a(int i10, String str2, com.applovin.impl.sdk.utils.aa aaVar) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f10536h.e(this.f10535g, "Unable to resolve VAST wrapper. Server returned " + i10);
                        }
                        aa.this.a(i10);
                    }

                    @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
                    public void a(com.applovin.impl.sdk.utils.aa aaVar, int i10) {
                        this.f10534f.G().a((d) u.a(aaVar, aa.this.f10502a, aa.this.f10503b, aa.this.f10534f));
                    }
                });
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.b(this.f10535g, "Unable to resolve VAST wrapper", th);
                }
            }
        } else if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.e(this.f10535g, "Resolving VAST failed. Could not find resolution URL");
        }
        a(-1);
    }
}
