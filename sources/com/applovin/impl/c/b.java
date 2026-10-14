package com.applovin.impl.c;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<h> f8870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<k> f8872d;

    private b(String str, List<h> list, String str2, Set<k> set) {
        this.f8869a = str;
        this.f8870b = list;
        this.f8871c = str2;
        this.f8872d = set;
    }

    public static b a(aa aaVar, e eVar, com.applovin.impl.sdk.o oVar) {
        try {
            String str = aaVar.b().get("vendor");
            aa aaVarC = aaVar.c("VerificationParameters");
            String strC = aaVarC != null ? aaVarC.c() : null;
            List<aa> listA = aaVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator<aa> it = listA.iterator();
            while (it.hasNext()) {
                h hVarA = h.a(it.next(), oVar);
                if (hVarA != null) {
                    arrayList.add(hVarA);
                }
            }
            HashMap map = new HashMap();
            m.a(aaVar, map, eVar, oVar);
            return new b(str, arrayList, strC, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            oVar.F();
            if (y.a()) {
                oVar.F().b("VastAdVerification", "Error occurred while initializing", th);
            }
            oVar.ag().a("VastAdVerification", th);
            return null;
        }
    }

    public String a() {
        return this.f8869a;
    }

    public List<h> b() {
        return this.f8870b;
    }

    public String c() {
        return this.f8871c;
    }

    public Set<k> d() {
        return this.f8872d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f8869a;
        if (str == null ? bVar.f8869a != null : !str.equals(bVar.f8869a)) {
            return false;
        }
        List<h> list = this.f8870b;
        if (list == null ? bVar.f8870b != null : !list.equals(bVar.f8870b)) {
            return false;
        }
        String str2 = this.f8871c;
        if (str2 == null ? bVar.f8871c != null : !str2.equals(bVar.f8871c)) {
            return false;
        }
        Set<k> set = this.f8872d;
        Set<k> set2 = bVar.f8872d;
        if (set != null) {
            return set.equals(set2);
        }
        return set2 == null;
    }

    public int hashCode() {
        String str = this.f8869a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<h> list = this.f8870b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f8871c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<k> set = this.f8872d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastAdVerification{vendorId='");
        l1.c.a(sbA, this.f8869a, CoreConstants.SINGLE_QUOTE_CHAR, "javascriptResources='");
        sbA.append(this.f8870b);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append("verificationParameters='");
        l1.c.a(sbA, this.f8871c, CoreConstants.SINGLE_QUOTE_CHAR, "errorEventTrackers='");
        sbA.append(this.f8872d);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
