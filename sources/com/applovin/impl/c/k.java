package com.applovin.impl.c;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f8926d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8927e = -1;

    private k() {
    }

    private static int a(String str, e eVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (eVar != null) {
            return eVar.h();
        }
        return 95;
    }

    public static k a(aa aaVar, e eVar, com.applovin.impl.sdk.o oVar) {
        List<String> listExplode;
        int size;
        TimeUnit timeUnit;
        long seconds;
        if (aaVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strC = aaVar.c();
            if (!StringUtils.isValidString(strC)) {
                oVar.F();
                if (!y.a()) {
                    return null;
                }
                oVar.F().e("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            }
            k kVar = new k();
            kVar.f8925c = strC;
            kVar.f8923a = aaVar.b().get(FacebookMediationAdapter.KEY_ID);
            kVar.f8924b = aaVar.b().get("event");
            kVar.f8927e = a(kVar.a(), eVar);
            String str = aaVar.b().get("offset");
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    kVar.f8927e = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                } else if (strTrim.contains(":") && (size = (listExplode = CollectionUtils.explode(strTrim, ":")).size()) > 0) {
                    long j10 = 0;
                    int i10 = size - 1;
                    for (int i11 = i10; i11 >= 0; i11--) {
                        String str2 = listExplode.get(i11);
                        if (StringUtils.isNumeric(str2)) {
                            int i12 = Integer.parseInt(str2);
                            if (i11 == i10) {
                                seconds = i12;
                            } else {
                                if (i11 == size - 2) {
                                    timeUnit = TimeUnit.MINUTES;
                                } else if (i11 == size - 3) {
                                    timeUnit = TimeUnit.HOURS;
                                }
                                seconds = timeUnit.toSeconds(i12);
                            }
                            j10 += seconds;
                        }
                    }
                    kVar.f8926d = j10;
                    kVar.f8927e = -1;
                }
            }
            return kVar;
        } catch (Throwable th) {
            oVar.F();
            if (y.a()) {
                oVar.F().b("VastTracker", "Error occurred while initializing", th);
            }
            oVar.ag().a("VastTracker", th);
            return null;
        }
    }

    public String a() {
        return this.f8924b;
    }

    public boolean a(long j10, int i10) {
        long j11 = this.f8926d;
        boolean z10 = j11 >= 0;
        boolean z11 = j10 >= j11;
        int i11 = this.f8927e;
        boolean z12 = i11 >= 0;
        boolean z13 = i10 >= i11;
        if (z10 && z11) {
            return true;
        }
        return z12 && z13;
    }

    public String b() {
        return this.f8925c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f8926d != kVar.f8926d || this.f8927e != kVar.f8927e) {
            return false;
        }
        String str = this.f8923a;
        if (str == null ? kVar.f8923a != null : !str.equals(kVar.f8923a)) {
            return false;
        }
        String str2 = this.f8924b;
        if (str2 == null ? kVar.f8924b == null : str2.equals(kVar.f8924b)) {
            return this.f8925c.equals(kVar.f8925c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8923a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8924b;
        int iA = l1.e.a(this.f8925c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        long j10 = this.f8926d;
        return ((iA + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f8927e;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastTracker{identifier='");
        l1.c.a(sbA, this.f8923a, CoreConstants.SINGLE_QUOTE_CHAR, ", event='");
        l1.c.a(sbA, this.f8924b, CoreConstants.SINGLE_QUOTE_CHAR, ", uriString='");
        l1.c.a(sbA, this.f8925c, CoreConstants.SINGLE_QUOTE_CHAR, ", offsetSeconds=");
        sbA.append(this.f8926d);
        sbA.append(", offsetPercent=");
        return h0.f.a(sbA, this.f8927e, '}');
    }
}
