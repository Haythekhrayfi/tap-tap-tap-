package com.applovin.impl.c;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.ad.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f8835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f8837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f8838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.c.c f8840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.applovin.impl.sdk.a.g f8841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set<k> f8842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set<k> f8843k;

    /* JADX INFO: renamed from: com.applovin.impl.c.a$a, reason: collision with other inner class name */
    public static class C0119a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f8844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f8845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.impl.sdk.ad.b f8846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.applovin.impl.sdk.o f8847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f8848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f8849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f8850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private j f8851h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private n f8852i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private d f8853j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private com.applovin.impl.c.c f8854k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Set<k> f8855l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Set<k> f8856m;

        public C0119a a(long j10) {
            this.f8848e = j10;
            return this;
        }

        public C0119a a(com.applovin.impl.c.c cVar) {
            this.f8854k = cVar;
            return this;
        }

        public C0119a a(d dVar) {
            this.f8853j = dVar;
            return this;
        }

        public C0119a a(j jVar) {
            this.f8851h = jVar;
            return this;
        }

        public C0119a a(n nVar) {
            this.f8852i = nVar;
            return this;
        }

        public C0119a a(com.applovin.impl.sdk.ad.b bVar) {
            this.f8846c = bVar;
            return this;
        }

        public C0119a a(com.applovin.impl.sdk.o oVar) {
            if (oVar == null) {
                throw new IllegalArgumentException("No sdk specified.");
            }
            this.f8847d = oVar;
            return this;
        }

        public C0119a a(String str) {
            this.f8849f = str;
            return this;
        }

        public C0119a a(Set<k> set) {
            this.f8855l = set;
            return this;
        }

        public C0119a a(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No ad object specified.");
            }
            this.f8844a = jSONObject;
            return this;
        }

        public a a() {
            return new a(this);
        }

        public C0119a b(String str) {
            this.f8850g = str;
            return this;
        }

        public C0119a b(Set<k> set) {
            this.f8856m = set;
            return this;
        }

        public C0119a b(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No full ad response specified.");
            }
            this.f8845b = jSONObject;
            return this;
        }
    }

    public enum b {
        COMPANION_AD,
        VIDEO
    }

    public enum c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private a(C0119a c0119a) {
        super(c0119a.f8844a, c0119a.f8845b, c0119a.f8846c, c0119a.f8847d);
        this.f8833a = c0119a.f8849f;
        this.f8835c = c0119a.f8851h;
        this.f8834b = c0119a.f8850g;
        this.f8837e = c0119a.f8852i;
        this.f8838f = c0119a.f8853j;
        this.f8840h = c0119a.f8854k;
        this.f8842j = c0119a.f8855l;
        this.f8843k = c0119a.f8856m;
        this.f8841i = new com.applovin.impl.sdk.a.g(this);
        Uri uriH = h();
        this.f8839g = uriH != null ? uriH.toString() : "";
        this.f8836d = c0119a.f8848e;
    }

    private Set<k> a(b bVar, String[] strArr) {
        d dVar;
        n nVar;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<k>> mapD = null;
        if (bVar == b.VIDEO && (nVar = this.f8837e) != null) {
            mapD = nVar.e();
        } else if (bVar == b.COMPANION_AD && (dVar = this.f8838f) != null) {
            mapD = dVar.d();
        }
        HashSet hashSet = new HashSet();
        if (mapD != null && !mapD.isEmpty()) {
            for (String str : strArr) {
                if (mapD.containsKey(str)) {
                    hashSet.addAll(mapD.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private String be() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private n.a bf() {
        n.a[] aVarArrValues = n.a.values();
        int iIntValue = ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.fk)).intValue();
        return (iIntValue < 0 || iIntValue >= aVarArrValues.length) ? n.a.UNSPECIFIED : aVarArrValues[iIntValue];
    }

    private Set<k> bg() {
        n nVar = this.f8837e;
        return nVar != null ? nVar.d() : Collections.emptySet();
    }

    private Set<k> bh() {
        d dVar = this.f8838f;
        return dVar != null ? dVar.c() : Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean E() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && j() != null;
    }

    public Set<k> a(c cVar, String str) {
        return a(cVar, new String[]{str});
    }

    public Set<k> a(c cVar, String[] strArr) {
        this.sdk.F();
        if (y.a()) {
            this.sdk.F().b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        }
        if (cVar == c.IMPRESSION) {
            return this.f8842j;
        }
        if (cVar == c.VIDEO_CLICK) {
            return bg();
        }
        if (cVar == c.COMPANION_CLICK) {
            return bh();
        }
        if (cVar == c.VIDEO) {
            return a(b.VIDEO, strArr);
        }
        if (cVar == c.COMPANION) {
            return a(b.COMPANION_AD, strArr);
        }
        if (cVar == c.INDUSTRY_ICON_CLICK) {
            return aW().e();
        }
        if (cVar == c.INDUSTRY_ICON_IMPRESSION) {
            return aW().f();
        }
        if (cVar == c.ERROR) {
            return this.f8843k;
        }
        this.sdk.F();
        if (y.a()) {
            this.sdk.F().e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
        }
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.e
    public void a() {
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public n aT() {
        return this.f8837e;
    }

    public o aU() {
        Long lN = com.applovin.impl.sdk.utils.i.n(this.sdk);
        return this.f8837e.a(bf(), lN != null ? lN.longValue() : 0L);
    }

    public d aV() {
        return this.f8838f;
    }

    public g aW() {
        n nVar = this.f8837e;
        if (nVar != null) {
            return nVar.f();
        }
        return null;
    }

    public boolean aX() {
        return aW() != null;
    }

    public boolean aY() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public String aZ() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.ad.e
    public List<com.applovin.impl.sdk.d.a> ay() {
        List<com.applovin.impl.sdk.d.a> listA;
        synchronized (this.adObjectLock) {
            listA = w.a("vimp_urls", this.adObject, getClCode(), null, be(), az(), z(), this.sdk);
        }
        return listA;
    }

    public void b() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public Uri ba() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean bb() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean bc() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public com.applovin.impl.c.c bd() {
        return this.f8840h;
    }

    public boolean c() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public String d() {
        return this.f8839g;
    }

    public boolean e() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || !super.equals(obj)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f8833a;
        if (str == null ? aVar.f8833a != null : !str.equals(aVar.f8833a)) {
            return false;
        }
        String str2 = this.f8834b;
        if (str2 == null ? aVar.f8834b != null : !str2.equals(aVar.f8834b)) {
            return false;
        }
        j jVar = this.f8835c;
        if (jVar == null ? aVar.f8835c != null : !jVar.equals(aVar.f8835c)) {
            return false;
        }
        n nVar = this.f8837e;
        if (nVar == null ? aVar.f8837e != null : !nVar.equals(aVar.f8837e)) {
            return false;
        }
        d dVar = this.f8838f;
        if (dVar == null ? aVar.f8838f != null : !dVar.equals(aVar.f8838f)) {
            return false;
        }
        com.applovin.impl.c.c cVar = this.f8840h;
        if (cVar == null ? aVar.f8840h != null : !cVar.equals(aVar.f8840h)) {
            return false;
        }
        Set<k> set = this.f8842j;
        if (set == null ? aVar.f8842j != null : !set.equals(aVar.f8842j)) {
            return false;
        }
        Set<k> set2 = this.f8843k;
        Set<k> set3 = aVar.f8843k;
        if (set2 != null) {
            return set2.equals(set3);
        }
        return set3 == null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean f() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.sdk.a.g o() {
        return this.f8841i;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f8836d;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri h() {
        o oVarAU = aU();
        if (oVarAU != null) {
            return oVarAU.b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List<o> listA;
        n nVar = this.f8837e;
        return (nVar == null || (listA = nVar.a()) == null || listA.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f8833a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8834b;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        j jVar = this.f8835c;
        int iHashCode4 = (iHashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        n nVar = this.f8837e;
        int iHashCode5 = (iHashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        d dVar = this.f8838f;
        int iHashCode6 = (iHashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        com.applovin.impl.c.c cVar = this.f8840h;
        int iHashCode7 = (iHashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Set<k> set = this.f8842j;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set<k> set2 = this.f8843k;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public long i() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    @Override // com.applovin.impl.sdk.ad.e, com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f8840h != null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri j() {
        n nVar = this.f8837e;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri k() {
        return j();
    }

    public b l() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? b.COMPANION_AD : b.VIDEO;
    }

    public boolean m() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public j n() {
        return this.f8835c;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastAd{title='");
        l1.c.a(sbA, this.f8833a, CoreConstants.SINGLE_QUOTE_CHAR, ", adDescription='");
        l1.c.a(sbA, this.f8834b, CoreConstants.SINGLE_QUOTE_CHAR, ", systemInfo=");
        sbA.append(this.f8835c);
        sbA.append(", videoCreative=");
        sbA.append(this.f8837e);
        sbA.append(", companionAd=");
        sbA.append(this.f8838f);
        sbA.append(", adVerifications=");
        sbA.append(this.f8840h);
        sbA.append(", impressionTrackers=");
        sbA.append(this.f8842j);
        sbA.append(", errorTrackers=");
        sbA.append(this.f8843k);
        sbA.append('}');
        return sbA.toString();
    }
}
