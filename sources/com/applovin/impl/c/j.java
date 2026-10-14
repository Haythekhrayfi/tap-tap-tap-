package com.applovin.impl.c;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8922b;

    private j() {
    }

    public static j a(aa aaVar, j jVar, com.applovin.impl.sdk.o oVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (jVar == null) {
            try {
                jVar = new j();
            } catch (Throwable th) {
                oVar.F();
                if (y.a()) {
                    oVar.F().b("VastSystemInfo", "Error occurred while initializing", th);
                }
                oVar.ag().a("VastSystemInfo", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(jVar.f8921a)) {
            String strC = aaVar.c();
            if (StringUtils.isValidString(strC)) {
                jVar.f8921a = strC;
            }
        }
        if (!StringUtils.isValidString(jVar.f8922b)) {
            String str = aaVar.b().get("version");
            if (StringUtils.isValidString(str)) {
                jVar.f8922b = str;
            }
        }
        return jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f8921a;
        if (str == null ? jVar.f8921a != null : !str.equals(jVar.f8921a)) {
            return false;
        }
        String str2 = this.f8922b;
        String str3 = jVar.f8922b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        String str = this.f8921a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8922b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastSystemInfo{name='");
        l1.c.a(sbA, this.f8921a, CoreConstants.SINGLE_QUOTE_CHAR, ", version='");
        sbA.append(this.f8922b);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
