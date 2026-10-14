package com.applovin.impl.c;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b> f8873a;

    private c(List<b> list) {
        this.f8873a = list;
    }

    public static c a(aa aaVar, c cVar, e eVar, com.applovin.impl.sdk.o oVar) {
        try {
            List<b> listA = cVar != null ? cVar.a() : new ArrayList<>();
            Iterator<aa> it = aaVar.a("Verification").iterator();
            while (it.hasNext()) {
                b bVarA = b.a(it.next(), eVar, oVar);
                if (bVarA != null) {
                    listA.add(bVarA);
                }
            }
            return new c(listA);
        } catch (Throwable th) {
            oVar.F();
            if (y.a()) {
                oVar.F().b("VastAdVerifications", "Error occurred while initializing", th);
            }
            oVar.ag().a("VastAdVerifications", th);
            return null;
        }
    }

    public List<b> a() {
        return this.f8873a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f8873a.equals(((c) obj).f8873a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8873a.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastAdVerification{verifications='");
        sbA.append(this.f8873a);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
