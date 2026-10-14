package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.a.f> f9273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f9274b;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.c.a$a, reason: collision with other inner class name */
    public static class C0124a extends com.applovin.impl.sdk.e.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.f f9277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<com.applovin.impl.mediation.a.f> f9278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Activity f9279c;

        /* JADX WARN: Illegal instructions before constructor call */
        private C0124a(com.applovin.impl.mediation.a.f fVar, List<com.applovin.impl.mediation.a.f> list, o oVar, Activity activity) {
            StringBuilder sbA = defpackage.a.a("TaskSequentialInitAdapter:");
            sbA.append(fVar.ab());
            super(sbA.toString(), oVar, true);
            this.f9279c = activity;
            this.f9277a = fVar;
            this.f9278b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.a()) {
                y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Auto-initing ");
                sbA.append(this.f9277a);
                sbA.append("...");
                yVar.b(str, sbA.toString());
            }
            this.f10534f.al().a(this.f9277a, this.f9279c, new Runnable() { // from class: com.applovin.impl.mediation.c.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    y unused = C0124a.this.f10536h;
                    if (y.a()) {
                        y yVar2 = C0124a.this.f10536h;
                        String str2 = C0124a.this.f10535g;
                        StringBuilder sbA2 = defpackage.a.a("Initialization task for adapter '");
                        sbA2.append(C0124a.this.f9277a.ac());
                        sbA2.append("' finished");
                        yVar2.b(str2, sbA2.toString());
                    }
                    int iIndexOf = C0124a.this.f9278b.indexOf(C0124a.this.f9277a);
                    if (iIndexOf < C0124a.this.f9278b.size() - 1) {
                        com.applovin.impl.mediation.a.f fVar = (com.applovin.impl.mediation.a.f) C0124a.this.f9278b.get(iIndexOf + 1);
                        C0124a.this.f10534f.G().a(new C0124a(fVar, C0124a.this.f9278b, C0124a.this.f10534f, C0124a.this.f9279c), r.b.MAIN, fVar.ap());
                    } else {
                        y unused2 = C0124a.this.f10536h;
                        if (y.a()) {
                            C0124a.this.f10536h.b(C0124a.this.f10535g, "Finished initializing adapters");
                        }
                    }
                }
            });
        }
    }

    public a(List<com.applovin.impl.mediation.a.f> list, Activity activity, o oVar) {
        super("TaskAutoInitAdapters", oVar, true);
        this.f9273a = list;
        this.f9274b = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f9273a.size() > 0) {
            if (y.a()) {
                y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Auto-initing ");
                sbA.append(this.f9273a.size());
                sbA.append(" adapters");
                sbA.append(this.f10534f.as().a() ? " in test mode" : "");
                sbA.append("...");
                yVar.b(str, sbA.toString());
            }
            if (TextUtils.isEmpty(this.f10534f.u())) {
                this.f10534f.d(AppLovinMediationProvider.MAX);
            } else if (!this.f10534f.f()) {
                StringBuilder sbA2 = defpackage.a.a("Auto-initing adapters for non-MAX mediation provider: ");
                sbA2.append(this.f10534f.u());
                y.j("AppLovinSdk", sbA2.toString());
            }
            if (this.f9274b == null) {
                y.j("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.a.P)).booleanValue()) {
                com.applovin.impl.mediation.a.f fVar = this.f9273a.get(0);
                this.f10534f.G().a(new C0124a(fVar, this.f9273a, this.f10534f, this.f9274b), r.b.MAIN, fVar.ap());
            } else {
                for (final com.applovin.impl.mediation.a.f fVar2 : this.f9273a) {
                    this.f10534f.G().a(new Runnable() { // from class: com.applovin.impl.mediation.c.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            y unused = a.this.f10536h;
                            if (y.a()) {
                                y yVar2 = a.this.f10536h;
                                String str2 = a.this.f10535g;
                                StringBuilder sbA3 = defpackage.a.a("Auto-initing adapter: ");
                                sbA3.append(fVar2);
                                yVar2.b(str2, sbA3.toString());
                            }
                            a.this.f10534f.al().a(fVar2, a.this.f9274b);
                        }
                    });
                }
            }
        }
    }
}
