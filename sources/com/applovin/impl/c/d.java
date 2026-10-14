package com.applovin.impl.c;

import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f8876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f8877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<k> f8878e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, Set<k>> f8879f = new HashMap();

    private d() {
    }

    public static d a(aa aaVar, d dVar, e eVar, com.applovin.impl.sdk.o oVar) {
        aa aaVarB;
        if (aaVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (dVar == null) {
            try {
                dVar = new d();
            } catch (Throwable th) {
                oVar.F();
                if (y.a()) {
                    oVar.F().b("VastCompanionAd", "Error occurred while initializing", th);
                }
                oVar.ag().a("VastCompanionAd", th);
                return null;
            }
        }
        if (dVar.f8874a == 0 && dVar.f8875b == 0) {
            int i10 = StringUtils.parseInt(aaVar.b().get("width"));
            int i11 = StringUtils.parseInt(aaVar.b().get("height"));
            if (i10 > 0 && i11 > 0) {
                dVar.f8874a = i10;
                dVar.f8875b = i11;
            }
        }
        dVar.f8877d = i.a(aaVar, dVar.f8877d, oVar);
        if (dVar.f8876c == null && (aaVarB = aaVar.b("CompanionClickThrough")) != null) {
            String strC = aaVarB.c();
            if (StringUtils.isValidString(strC)) {
                dVar.f8876c = Uri.parse(strC);
            }
        }
        m.a(aaVar.a("CompanionClickTracking"), dVar.f8878e, eVar, oVar);
        m.a(aaVar, dVar.f8879f, eVar, oVar);
        return dVar;
    }

    public Uri a() {
        return this.f8876c;
    }

    public i b() {
        return this.f8877d;
    }

    public Set<k> c() {
        return this.f8878e;
    }

    public Map<String, Set<k>> d() {
        return this.f8879f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f8874a != dVar.f8874a || this.f8875b != dVar.f8875b) {
            return false;
        }
        Uri uri = this.f8876c;
        if (uri == null ? dVar.f8876c != null : !uri.equals(dVar.f8876c)) {
            return false;
        }
        i iVar = this.f8877d;
        if (iVar == null ? dVar.f8877d != null : !iVar.equals(dVar.f8877d)) {
            return false;
        }
        Set<k> set = this.f8878e;
        if (set == null ? dVar.f8878e != null : !set.equals(dVar.f8878e)) {
            return false;
        }
        Map<String, Set<k>> map = this.f8879f;
        Map<String, Set<k>> map2 = dVar.f8879f;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public int hashCode() {
        int i10 = ((this.f8874a * 31) + this.f8875b) * 31;
        Uri uri = this.f8876c;
        int iHashCode = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
        i iVar = this.f8877d;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        Set<k> set = this.f8878e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<k>> map = this.f8879f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastCompanionAd{width=");
        sbA.append(this.f8874a);
        sbA.append(", height=");
        sbA.append(this.f8875b);
        sbA.append(", destinationUri=");
        sbA.append(this.f8876c);
        sbA.append(", nonVideoResource=");
        sbA.append(this.f8877d);
        sbA.append(", clickTrackers=");
        sbA.append(this.f8878e);
        sbA.append(", eventTrackers=");
        sbA.append(this.f8879f);
        sbA.append('}');
        return sbA.toString();
    }
}
