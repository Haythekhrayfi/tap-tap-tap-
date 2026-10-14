package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<o> f8931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f8932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f8934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<k> f8935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f8936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Set<k>> f8937g;

    public enum a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH,
        DYNAMIC
    }

    private n() {
        this.f8931a = Collections.emptyList();
        this.f8932b = Collections.emptyList();
        this.f8935e = new HashSet();
        this.f8937g = new HashMap();
    }

    private n(e eVar) {
        this.f8931a = Collections.emptyList();
        this.f8932b = Collections.emptyList();
        this.f8935e = new HashSet();
        this.f8937g = new HashMap();
        this.f8932b = eVar.g();
    }

    private static int a(String str, com.applovin.impl.sdk.o oVar) {
        try {
            List<String> listExplode = CollectionUtils.explode(str, ":");
            if (listExplode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(listExplode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(listExplode.get(1))) + ((long) StringUtils.parseInt(listExplode.get(2))));
            }
        } catch (Throwable unused) {
            oVar.F();
            if (y.a()) {
                oVar.F().e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    public static n a(aa aaVar, n nVar, e eVar, com.applovin.impl.sdk.o oVar) {
        aa aaVarB;
        g gVarA;
        List<aa> listA;
        aa aaVarB2;
        List<o> listA2;
        aa aaVarB3;
        int iA;
        if (aaVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (nVar == null) {
            try {
                nVar = new n(eVar);
            } catch (Throwable th) {
                oVar.F();
                if (y.a()) {
                    oVar.F().b("VastVideoCreative", "Error occurred while initializing", th);
                }
                oVar.ag().a("VastVideoCreative", th);
                return null;
            }
        }
        if (nVar.f8933c == 0 && (aaVarB3 = aaVar.b("Duration")) != null && (iA = a(aaVarB3.c(), oVar)) > 0) {
            nVar.f8933c = iA;
        }
        aa aaVarB4 = aaVar.b("MediaFiles");
        if (aaVarB4 != null && (listA2 = a(aaVarB4, oVar)) != null && listA2.size() > 0) {
            List<o> list = nVar.f8931a;
            if (list != null) {
                listA2.addAll(list);
            }
            nVar.f8931a = listA2;
        }
        aa aaVarB5 = aaVar.b("VideoClicks");
        if (aaVarB5 != null) {
            if (nVar.f8934d == null && (aaVarB2 = aaVarB5.b("ClickThrough")) != null) {
                String strC = aaVarB2.c();
                if (StringUtils.isValidString(strC)) {
                    nVar.f8934d = Uri.parse(strC);
                }
            }
            m.a(aaVarB5.a("ClickTracking"), nVar.f8935e, eVar, oVar);
        }
        aa aaVarB6 = aaVar.b("Icons");
        if (aaVarB6 != null && (gVarA = g.a((aaVarB = aaVarB6.b("Icon")), oVar)) != null) {
            aa aaVarB7 = aaVarB.b("IconClicks");
            if (aaVarB7 != null && (listA = aaVarB7.a("IconClickTracking")) != null) {
                m.a(listA, gVarA.f8905a, eVar, oVar);
            }
            List<aa> listA3 = aaVarB.a("IconViewTracking");
            if (listA3 != null) {
                m.a(listA3, gVarA.f8906b, eVar, oVar);
            }
            nVar.f8936f = gVarA;
        }
        m.a(aaVar, nVar.f8937g, eVar, oVar);
        return nVar;
    }

    private static List<o> a(aa aaVar, com.applovin.impl.sdk.o oVar) {
        List<aa> listA = aaVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(listA.size());
        List<String> listExplode = CollectionUtils.explode((String) oVar.a(com.applovin.impl.sdk.c.b.fi));
        List<String> listExplode2 = CollectionUtils.explode((String) oVar.a(com.applovin.impl.sdk.c.b.fh));
        Iterator<aa> it = listA.iterator();
        while (it.hasNext()) {
            o oVarA = o.a(it.next(), oVar);
            if (oVarA != null) {
                try {
                    String strC = oVarA.c();
                    if (!StringUtils.isValidString(strC) || listExplode.contains(strC)) {
                        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.fj)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(oVarA.b().toString());
                            if (!StringUtils.isValidString(fileExtensionFromUrl) || listExplode2.contains(fileExtensionFromUrl)) {
                            }
                        }
                        oVar.F();
                        if (y.a()) {
                            oVar.F().d("VastVideoCreative", "Video file not supported: " + oVarA);
                        }
                    }
                    arrayList.add(oVarA);
                } catch (Throwable th) {
                    oVar.F();
                    if (y.a()) {
                        oVar.F().b("VastVideoCreative", "Failed to validate video file: " + oVarA, th);
                    }
                }
            }
        }
        return arrayList;
    }

    public o a(a aVar, long j10) {
        List<o> list = this.f8931a;
        o oVar = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f8932b) {
            for (o oVar2 : this.f8931a) {
                String strC = oVar2.c();
                if (StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(oVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List<o> list2 = arrayList;
        if (zIsEmpty) {
            list2 = this.f8931a;
        }
        Collections.sort(list2, new Comparator<o>() { // from class: com.applovin.impl.c.n.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(o oVar3, o oVar4) {
                return Long.compare(oVar3.d(), oVar4.d());
            }
        });
        if (aVar != a.DYNAMIC) {
            return aVar == a.LOW ? list2.get(0) : list2.get(aVar == a.MEDIUM ? list2.size() / 2 : list2.size() - 1);
        }
        for (o oVar3 : list2) {
            if (oVar3.d() > j10) {
                break;
            }
            oVar = oVar3;
        }
        return oVar != null ? oVar : list2.get(0);
    }

    public List<o> a() {
        return this.f8931a;
    }

    public int b() {
        return this.f8933c;
    }

    public Uri c() {
        return this.f8934d;
    }

    public Set<k> d() {
        return this.f8935e;
    }

    public Map<String, Set<k>> e() {
        return this.f8937g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f8933c != nVar.f8933c) {
            return false;
        }
        List<o> list = this.f8931a;
        if (list == null ? nVar.f8931a != null : !list.equals(nVar.f8931a)) {
            return false;
        }
        Uri uri = this.f8934d;
        if (uri == null ? nVar.f8934d != null : !uri.equals(nVar.f8934d)) {
            return false;
        }
        Set<k> set = this.f8935e;
        if (set == null ? nVar.f8935e != null : !set.equals(nVar.f8935e)) {
            return false;
        }
        Map<String, Set<k>> map = this.f8937g;
        Map<String, Set<k>> map2 = nVar.f8937g;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public g f() {
        return this.f8936f;
    }

    public int hashCode() {
        List<o> list = this.f8931a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f8933c) * 31;
        Uri uri = this.f8934d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<k> set = this.f8935e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<k>> map = this.f8937g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastVideoCreative{videoFiles=");
        sbA.append(this.f8931a);
        sbA.append(", durationSeconds=");
        sbA.append(this.f8933c);
        sbA.append(", destinationUri=");
        sbA.append(this.f8934d);
        sbA.append(", clickTrackers=");
        sbA.append(this.f8935e);
        sbA.append(", eventTrackers=");
        sbA.append(this.f8937g);
        sbA.append(", industryIcon=");
        sbA.append(this.f8936f);
        sbA.append('}');
        return sbA.toString();
    }
}
