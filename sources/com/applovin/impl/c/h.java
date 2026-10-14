package com.applovin.impl.c;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8912b;

    private h(String str, String str2) {
        this.f8911a = str;
        this.f8912b = str2;
    }

    public static h a(aa aaVar, com.applovin.impl.sdk.o oVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new h(aaVar.b().get("apiFramework"), aaVar.c());
        } catch (Throwable th) {
            oVar.F();
            if (y.a()) {
                oVar.F().b("VastJavaScriptResource", "Error occurred while initializing", th);
            }
            oVar.ag().a("VastJavaScriptResource", th);
            return null;
        }
    }

    public String a() {
        return this.f8911a;
    }

    public String b() {
        return this.f8912b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f8911a;
        if (str == null ? hVar.f8911a != null : !str.equals(hVar.f8911a)) {
            return false;
        }
        String str2 = this.f8912b;
        String str3 = hVar.f8912b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        String str = this.f8911a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8912b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastJavaScriptResource{apiFramework='");
        l1.c.a(sbA, this.f8911a, CoreConstants.SINGLE_QUOTE_CHAR, ", javascriptResourceUrl='");
        sbA.append(this.f8912b);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
