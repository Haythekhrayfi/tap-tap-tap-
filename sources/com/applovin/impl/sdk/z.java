package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f11432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, a> f11433b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f11434c = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f11436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f11437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f11438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f11439e;

        public a(String str, String str2, String str3) {
            this.f11435a = str;
            this.f11436b = str2;
            this.f11437c = str3;
        }

        public String a() {
            return this.f11435a;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.f11436b;
        }

        public String c() {
            return this.f11437c;
        }

        public String d() {
            return this.f11438d;
        }

        public String e() {
            return this.f11439e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = aVar.c();
            if (strC != null ? !strC.equals(strC2) : strC2 != null) {
                return false;
            }
            String strD = d();
            String strD2 = aVar.d();
            if (strD != null ? !strD.equals(strD2) : strD2 != null) {
                return false;
            }
            String strE = e();
            String strE2 = aVar.e();
            return strE != null ? strE.equals(strE2) : strE2 == null;
        }

        public int hashCode() {
            String strA = a();
            int iHashCode = strA == null ? 43 : strA.hashCode();
            String strB = b();
            int iHashCode2 = ((iHashCode + 59) * 59) + (strB == null ? 43 : strB.hashCode());
            String strC = c();
            int iHashCode3 = (iHashCode2 * 59) + (strC == null ? 43 : strC.hashCode());
            String strD = d();
            int iHashCode4 = (iHashCode3 * 59) + (strD == null ? 43 : strD.hashCode());
            String strE = e();
            return (iHashCode4 * 59) + (strE != null ? strE.hashCode() : 43);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("MediationWaterfallWinnerTracker.WinningAd(bCode=");
            sbA.append(a());
            sbA.append(", adapterName=");
            sbA.append(b());
            sbA.append(", networkName=");
            sbA.append(c());
            sbA.append(", secondWinnerAdapterName=");
            sbA.append(d());
            sbA.append(", secondWinnerNetworkName=");
            sbA.append(e());
            sbA.append(")");
            return sbA.toString();
        }
    }

    public z(o oVar) {
        this.f11432a = oVar.F();
    }

    public a a(String str) {
        a aVar;
        synchronized (this.f11434c) {
            aVar = this.f11433b.get(str);
        }
        return aVar;
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        a(aVar, null);
    }

    public void a(com.applovin.impl.mediation.a.a aVar, com.applovin.impl.mediation.a.a aVar2) {
        synchronized (this.f11434c) {
            if (y.a()) {
                this.f11432a.b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + aVar);
            }
            a aVar3 = new a(aVar.a(), aVar.ac(), aVar.getNetworkName());
            if (aVar2 != null) {
                aVar3.f11438d = aVar2.ac();
                aVar3.f11439e = aVar2.getNetworkName();
            }
            this.f11433b.put(aVar.getAdUnitId(), aVar3);
        }
    }

    public void b(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f11434c) {
            String adUnitId = aVar.getAdUnitId();
            a aVar2 = this.f11433b.get(adUnitId);
            if (aVar2 == null) {
                if (y.a()) {
                    this.f11432a.b("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                }
                return;
            }
            if (aVar.a().equals(aVar2.a())) {
                if (y.a()) {
                    this.f11432a.b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar2);
                }
                this.f11433b.remove(adUnitId);
            } else if (y.a()) {
                this.f11432a.b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + aVar + " , since it could have already been updated with a new ad: " + aVar2);
            }
        }
    }
}
