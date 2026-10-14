package com.applovin.impl.sdk.e;

import android.app.Activity;
import com.applovin.impl.sdk.af;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class q extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f10595a;

    public q(com.applovin.impl.sdk.o oVar) {
        super("TaskInitializeSdk", oVar, true);
        this.f10595a = oVar;
    }

    private void a() {
        if (this.f10595a.al().a()) {
            return;
        }
        Activity activityAt = this.f10595a.at();
        if (activityAt != null) {
            this.f10595a.al().a(activityAt);
        } else {
            this.f10595a.G().a(new ac(this.f10595a, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.sdk.e.q.2
                @Override // java.lang.Runnable
                public void run() {
                    q.this.f10595a.al().a(q.this.f10595a.E().a());
                }
            }), r.b.MAIN, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    private void b() {
        Map<String, Object> mapD;
        Map<String, Object> mapC;
        if (this.f10595a.e()) {
            return;
        }
        boolean zD = this.f10595a.H().d();
        String str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (this.f10595a.M() != null) {
            if (zD) {
                str = this.f10595a.L().d().b() + " (use this for test devices)";
            }
            mapD = this.f10595a.M().b();
            mapC = this.f10595a.M().h();
        } else {
            if (zD) {
                str = this.f10595a.K().l().b() + " (use this for test devices)";
            }
            mapD = this.f10595a.K().d();
            mapC = this.f10595a.K().c();
        }
        com.applovin.impl.sdk.utils.p pVar = new com.applovin.impl.sdk.utils.p();
        pVar.a().a("=====AppLovin SDK=====");
        pVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f10595a.a(com.applovin.impl.sdk.c.b.eo)).a("Ad Review Version", com.applovin.impl.sdk.f.a()).a("OM SDK Version", this.f10595a.ad().c());
        pVar.a("===Device Info===").a("OS", com.applovin.impl.sdk.utils.w.f()).a("GAID", str).a("Model", mapD.get("model")).a("Locale", mapD.get("locale")).a("Emulator", mapD.get("sim")).a("Tablet", mapD.get("is_tablet"));
        pVar.a("===App Info===").a("Application ID", mapC.get("package_name")).a("Target SDK", mapC.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(com.applovin.impl.sdk.utils.w.g()));
        pVar.a("===SDK Settings===").a("SDK Key", this.f10595a.ax()).a("Mediation Provider", this.f10595a.u()).a("TG", com.applovin.impl.sdk.utils.v.a(this.f10595a)).a("AEI", this.f10595a.a(com.applovin.impl.sdk.c.b.aw)).a("MEI", this.f10595a.a(com.applovin.impl.sdk.c.b.ax)).a("Test Mode On", Boolean.valueOf(this.f10595a.as().a())).a("Verbose Logging On", Boolean.valueOf(zD));
        pVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(com.applovin.impl.b.a.a(f()));
        com.applovin.impl.b.a.b bVarAa = this.f10595a.aa();
        pVar.a("===MAX Terms Flow===").a("Enabled", Boolean.valueOf(bVarAa.b())).a("Privacy Policy URI", bVarAa.d()).a("Terms of Service URI", bVarAa.e());
        pVar.a();
        com.applovin.impl.sdk.y.f("AppLovinSdk", pVar.toString());
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.y yVar;
        String str;
        StringBuilder sbA;
        String str2 = "succeeded";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar2 = this.f10536h;
            String str3 = this.f10535g;
            StringBuilder sbA2 = defpackage.a.a("Initializing AppLovin SDK v");
            sbA2.append(AppLovinSdk.VERSION);
            sbA2.append("...");
            yVar2.b(str3, sbA2.toString());
        }
        try {
            this.f10595a.J().d();
            this.f10595a.J().c(com.applovin.impl.sdk.d.f.f10467e);
            this.f10595a.J().c(com.applovin.impl.sdk.d.f.f10468f);
            this.f10595a.S().a(f());
            this.f10595a.S().b(f());
            this.f10595a.G().a(new e(this.f10595a), r.b.MAIN);
            if (this.f10595a.M() != null) {
                this.f10595a.M().c();
            } else {
                this.f10595a.K().e();
            }
            this.f10595a.Y().a();
            this.f10595a.ac().a();
            this.f10595a.G().f();
            if (com.applovin.impl.sdk.utils.w.a(f(), this.f10595a)) {
                this.f10595a.j();
            }
            this.f10595a.af().collectAppHubData();
            b();
            if (((Boolean) this.f10595a.a(com.applovin.impl.sdk.c.b.eJ)).booleanValue()) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.q.1
                    @Override // java.lang.Runnable
                    public void run() {
                        af.a(q.this.f10595a);
                    }
                });
            }
            a();
            this.f10595a.a(true);
            this.f10595a.ai().c();
            this.f10595a.x().maybeTrackAppOpenEvent();
            if ((this.f10595a.ap().b() && !this.f10595a.e()) || (((Boolean) this.f10595a.a(com.applovin.impl.sdk.c.a.f10323h)).booleanValue() && com.applovin.impl.sdk.utils.w.a(com.applovin.impl.sdk.o.au(), this.f10595a) && this.f10595a.f())) {
                this.f10595a.ap().a();
            }
            this.f10595a.ad().a();
            if (((Boolean) this.f10595a.a(com.applovin.impl.sdk.c.b.aO)).booleanValue()) {
                this.f10595a.a(((Long) this.f10595a.a(com.applovin.impl.sdk.c.b.aP)).longValue());
            }
            if (com.applovin.impl.sdk.y.a()) {
                yVar = this.f10536h;
                str = this.f10535g;
                sbA = defpackage.a.a("AppLovin SDK ");
                sbA.append(AppLovinSdk.VERSION);
                sbA.append(" initialization ");
                if (!this.f10595a.d()) {
                    str2 = "failed";
                }
                sbA.append(str2);
                sbA.append(" in ");
                sbA.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbA.append("ms");
                yVar.b(str, sbA.toString());
            }
        } catch (Throwable th) {
            try {
                com.applovin.impl.sdk.y.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.f10595a.a(false);
                a(th);
                if (((Boolean) this.f10595a.a(com.applovin.impl.sdk.c.b.af)).booleanValue()) {
                    this.f10595a.m();
                }
                this.f10595a.ad().a();
                if (((Boolean) this.f10595a.a(com.applovin.impl.sdk.c.b.aO)).booleanValue()) {
                    this.f10595a.a(((Long) this.f10595a.a(com.applovin.impl.sdk.c.b.aP)).longValue());
                }
                if (!com.applovin.impl.sdk.y.a()) {
                    return;
                }
                yVar = this.f10536h;
                str = this.f10535g;
                sbA = defpackage.a.a("AppLovin SDK ");
                sbA.append(AppLovinSdk.VERSION);
                sbA.append(" initialization ");
                if (!this.f10595a.d()) {
                }
            } catch (Throwable th2) {
                this.f10595a.ad().a();
                if (((Boolean) this.f10595a.a(com.applovin.impl.sdk.c.b.aO)).booleanValue()) {
                    this.f10595a.a(((Long) this.f10595a.a(com.applovin.impl.sdk.c.b.aP)).longValue());
                }
                if (com.applovin.impl.sdk.y.a()) {
                    com.applovin.impl.sdk.y yVar3 = this.f10536h;
                    String str4 = this.f10535g;
                    StringBuilder sbA3 = defpackage.a.a("AppLovin SDK ");
                    sbA3.append(AppLovinSdk.VERSION);
                    sbA3.append(" initialization ");
                    sbA3.append(this.f10595a.d() ? "succeeded" : "failed");
                    sbA3.append(" in ");
                    sbA3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbA3.append("ms");
                    yVar3.b(str4, sbA3.toString());
                }
                throw th2;
            }
        }
    }
}
