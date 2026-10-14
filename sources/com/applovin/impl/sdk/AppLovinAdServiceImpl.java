package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f10018b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, c> f10020d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f10019c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10021e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f10022f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<JSONObject> f10023g = new AtomicReference<>();

    public class a implements com.applovin.impl.sdk.ad.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AppLovinAdLoadListener f10046b;

        public a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f10046b = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.f)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f10017a.Q().a(appLovinAdImpl);
                appLovinAd = new com.applovin.impl.sdk.ad.f(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f10017a);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.f10046b;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(appLovinAd);
            } else if (((Boolean) AppLovinAdServiceImpl.this.f10017a.a(com.applovin.impl.sdk.c.b.aA)).booleanValue()) {
                throw new IllegalStateException("Unable to notify listener about ad load");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            failedToReceiveAdV2(new AppLovinError(i10, ""));
        }

        @Override // com.applovin.impl.sdk.ad.i
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            AppLovinAdServiceImpl.this.b(appLovinError, this.f10046b);
            this.f10046b = null;
        }
    }

    public class b implements com.applovin.impl.sdk.ad.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f10048b;

        private b(c cVar) {
            this.f10048b = cVar;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            HashSet hashSet;
            AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
            com.applovin.impl.sdk.ad.d adZone = appLovinAdImpl.getAdZone();
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.f)) {
                AppLovinAdServiceImpl.this.f10017a.Q().a(appLovinAdImpl);
                appLovinAd = new com.applovin.impl.sdk.ad.f(adZone, AppLovinAdServiceImpl.this.f10017a);
            }
            synchronized (this.f10048b.f10049a) {
                hashSet = new HashSet(this.f10048b.f10051c);
                this.f10048b.f10051c.clear();
                this.f10048b.f10050b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            HashSet hashSet;
            synchronized (this.f10048b.f10049a) {
                hashSet = new HashSet(this.f10048b.f10051c);
                this.f10048b.f10051c.clear();
                this.f10048b.f10050b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(i10, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.impl.sdk.ad.i
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            HashSet<AppLovinAdLoadListener> hashSet;
            synchronized (this.f10048b.f10049a) {
                hashSet = new HashSet(this.f10048b.f10051c);
                this.f10048b.f10051c.clear();
                this.f10048b.f10050b = false;
            }
            for (AppLovinAdLoadListener appLovinAdLoadListener : hashSet) {
                if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i) {
                    AppLovinAdServiceImpl.this.b(appLovinError, appLovinAdLoadListener);
                } else {
                    AppLovinAdServiceImpl.this.a(appLovinError.getCode(), appLovinAdLoadListener);
                }
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f10049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f10050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Collection<AppLovinAdLoadListener> f10051c;

        private c() {
            this.f10049a = new Object();
            this.f10051c = new HashSet();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("AdLoadState{, isWaitingForAd=");
            sbA.append(this.f10050b);
            sbA.append(", pendingAdListeners=");
            sbA.append(this.f10051c);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public AppLovinAdServiceImpl(o oVar) {
        this.f10017a = oVar;
        this.f10018b = oVar.F();
        HashMap map = new HashMap(6);
        this.f10020d = map;
        map.put(com.applovin.impl.sdk.ad.d.g(), new c());
        map.put(com.applovin.impl.sdk.ad.d.h(), new c());
        map.put(com.applovin.impl.sdk.ad.d.i(), new c());
        map.put(com.applovin.impl.sdk.ad.d.j(), new c());
        map.put(com.applovin.impl.sdk.ad.d.k(), new c());
        map.put(com.applovin.impl.sdk.ad.d.l(), new c());
    }

    private Uri a(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f10017a.F();
            if (y.a()) {
                this.f10017a.F().d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f10017a.ag().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    private c a(com.applovin.impl.sdk.ad.d dVar) {
        c cVar;
        synchronized (this.f10021e) {
            cVar = this.f10020d.get(dVar);
            if (cVar == null) {
                cVar = new c();
                this.f10020d.put(dVar, cVar);
            }
        }
        return cVar;
    }

    private String a(String str, long j10, int i10, String str2, boolean z10) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i10 < 0 || i10 > 100) {
                i10 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j10)).appendQueryParameter("pv", Integer.toString(i10)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
        } catch (Throwable th) {
            if (y.a()) {
                this.f10018b.b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f10017a.ag().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private String a(String str, long j10, long j11, List<Long> list, boolean z10, int i10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j10)).appendQueryParameter("vs_ms", Long.toString(j11));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i10 != j.f10703a) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(j.a(i10)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i10, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f10019c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdLoadListener appLovinAdLoadListener2 = appLovinAdLoadListener;
                    if (appLovinAdLoadListener2 instanceof com.applovin.impl.sdk.ad.i) {
                        ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener2).failedToReceiveAdV2(new AppLovinError(i10, ""));
                    } else {
                        appLovinAdLoadListener2.failedToReceiveAd(i10);
                    }
                } catch (Throwable th) {
                    y.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                    AppLovinAdServiceImpl.this.f10017a.ag().a("AppLovinAdService", "notifyAdLoadFailedCallback", th);
                }
            }
        });
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar) {
        if (com.applovin.impl.sdk.utils.u.a(uri, appLovinAdView.getContext(), this.f10017a)) {
            com.applovin.impl.sdk.utils.o.c(bVar.g(), eVar, appLovinAdView);
        }
        bVar.o();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Context context, o oVar) {
        if (uri == null || !StringUtils.isValidString(uri.getQuery())) {
            oVar.F();
            if (y.a()) {
                oVar.F().e("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
                return;
            }
            return;
        }
        Uri uriA = a(uri, "primaryUrl");
        List<Uri> listB = b(uri, "primaryTrackingUrl");
        Uri uriA2 = a(uri, "fallbackUrl");
        List<Uri> listB2 = b(uri, "fallbackTrackingUrl");
        if (uriA == null && uriA2 == null) {
            oVar.F();
            if (y.a()) {
                oVar.F().e("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                return;
            }
            return;
        }
        if (!a(uriA, "primary", listB, eVar, appLovinAdView, bVar, context, oVar)) {
            a(uriA2, "backup", listB2, eVar, appLovinAdView, bVar, context, oVar);
        }
        if (bVar != null) {
            bVar.o();
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.adview.b bVar, final com.applovin.impl.adview.activity.b.a aVar) {
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Forwarding click " + uri);
        }
        eVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f10017a.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.CLOSE_AD_ON_FORWARDING_CLICK_SCHEME);
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (aVar != null) {
                this.f10019c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (aVar != null) {
                            y unused = AppLovinAdServiceImpl.this.f10018b;
                            if (y.a()) {
                                AppLovinAdServiceImpl.this.f10018b.b("AppLovinAdService", "Dismissing ad after forwarding click");
                            }
                            aVar.h();
                        }
                    }
                });
            } else {
                if (bVar == null || com.applovin.impl.sdk.utils.w.a(eVar.getSize())) {
                    return;
                }
                if (y.a()) {
                    this.f10018b.b("AppLovinAdService", "Closing ad after forwarding click");
                }
                bVar.l();
            }
        }
    }

    private void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i) {
            ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    private void a(com.applovin.impl.sdk.ad.d dVar, b bVar) {
        AppLovinAdImpl appLovinAdImplA = this.f10017a.Q().a(dVar);
        if (appLovinAdImplA == null) {
            a(new com.applovin.impl.sdk.e.n(dVar, bVar, this.f10017a));
            return;
        }
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplA + " for " + dVar);
        }
        bVar.adReceived(appLovinAdImplA);
    }

    private void a(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        this.f10017a.F();
        if (y.a()) {
            this.f10017a.F().b("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
        }
        c cVarA = a(dVar);
        synchronized (cVarA.f10049a) {
            cVarA.f10051c.add(appLovinAdLoadListener);
            if (!cVarA.f10050b) {
                cVarA.f10050b = true;
                a(dVar, new b(cVarA));
            } else if (y.a()) {
                this.f10018b.b("AppLovinAdService", "Already waiting on an ad load...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.e eVar, Uri uri, com.applovin.impl.adview.activity.b.a aVar, Context context) {
        if (a(uri.getScheme())) {
            a(uri, eVar, (com.applovin.impl.adview.b) null, aVar);
        } else if (com.applovin.impl.sdk.utils.u.a(uri)) {
            a(uri, eVar, (AppLovinAdView) null, (com.applovin.impl.adview.b) null, context, this.f10017a);
        } else {
            com.applovin.impl.sdk.utils.u.a(uri, context, this.f10017a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Uri uri) {
        if (a(uri.getScheme())) {
            a(uri, eVar, bVar, (com.applovin.impl.adview.activity.b.a) null);
        } else if (com.applovin.impl.sdk.utils.u.a(uri)) {
            a(uri, eVar, appLovinAdView, bVar, appLovinAdView.getContext(), this.f10017a);
        } else {
            a(uri, eVar, appLovinAdView, bVar);
        }
    }

    private void a(com.applovin.impl.sdk.d.a aVar) {
        if (StringUtils.isValidString(aVar.a())) {
            this.f10017a.ai().a(com.applovin.impl.sdk.network.j.p().c(aVar.a()).d(StringUtils.isValidString(aVar.b()) ? aVar.b() : null).b(aVar.c()).a(false).d(aVar.d()).a());
        } else if (y.a()) {
            this.f10018b.d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(com.applovin.impl.sdk.e.d dVar) {
        if (!this.f10017a.d()) {
            y.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f10017a.a();
        this.f10017a.G().a(dVar, com.applovin.impl.sdk.e.r.b.MAIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f10019c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    y.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                    AppLovinAdServiceImpl.this.f10017a.ag().a("AppLovinAdService", "notifyAdLoadedCallback", th);
                }
            }
        });
    }

    private boolean a(Uri uri, String str, List<Uri> list, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Context context, o oVar) {
        oVar.F();
        if (y.a()) {
            oVar.F().b("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zA = com.applovin.impl.sdk.utils.u.a(uri, context, oVar);
        oVar.F();
        boolean zA2 = y.a();
        if (zA) {
            if (zA2) {
                oVar.F().b("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator<Uri> it = list.iterator();
            while (it.hasNext()) {
                oVar.ah().dispatchPostbackAsync(it.next().toString(), null);
            }
            if (bVar != null) {
                com.applovin.impl.sdk.utils.o.c(bVar.g(), eVar, appLovinAdView);
            }
        } else if (zA2) {
            oVar.F().e("AppLovinAdService", "URL failed to open");
        }
        return zA;
    }

    private boolean a(String str) {
        String str2 = this.f10017a.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.FORWARDING_CLICK_SCHEME);
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private List<Uri> b(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.f10017a.F();
                if (y.a()) {
                    this.f10017a.F().d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f10017a.ag().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinError appLovinError, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f10019c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdLoadListener appLovinAdLoadListener2 = appLovinAdLoadListener;
                    if (appLovinAdLoadListener2 instanceof com.applovin.impl.sdk.ad.i) {
                        ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener2).failedToReceiveAdV2(appLovinError);
                    } else {
                        appLovinAdLoadListener2.failedToReceiveAd(appLovinError.getCode());
                    }
                } catch (Throwable th) {
                    y.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                    AppLovinAdServiceImpl.this.f10017a.ag().a("AppLovinAdService", "notifyAdLoadFailedCallbackV2", th);
                }
            }
        });
    }

    public void addCustomQueryParams(Map<String, String> map) {
        synchronized (this.f10022f) {
            this.f10022f.putAll(map);
        }
    }

    public AppLovinAd dequeueAd(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl appLovinAdImplB = this.f10017a.Q().b(dVar);
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Dequeued ad: " + appLovinAdImplB + " for zone: " + dVar + "...");
        }
        return appLovinAdImplB;
    }

    public JSONObject getAndResetCustomPostBody() {
        return this.f10023g.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f10022f) {
            map = CollectionUtils.map(this.f10022f);
            this.f10022f.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strA = this.f10017a.M() != null ? this.f10017a.M().a() : this.f10017a.K().a();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return strA;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinError appLovinError;
        com.applovin.impl.sdk.e.d sVar;
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            y.j("AppLovinAdService", "Empty ad token");
            a(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.sdk.ad.c cVar = new com.applovin.impl.sdk.ad.c(strTrim, this.f10017a);
        AppLovinAdLoadListener aVar = ((Boolean) this.f10017a.a(com.applovin.impl.sdk.c.b.az)).booleanValue() ? new a(appLovinAdLoadListener) : appLovinAdLoadListener;
        if (cVar.b() != com.applovin.impl.sdk.ad.c.a.REGULAR) {
            if (cVar.b() == com.applovin.impl.sdk.ad.c.a.AD_RESPONSE_JSON) {
                JSONObject jSONObjectD = cVar.d();
                if (jSONObjectD == null) {
                    StringBuilder sbA = defpackage.a.a("Unable to retrieve ad response JSON from token: ");
                    sbA.append(cVar.a());
                    String string = sbA.toString();
                    AppLovinError appLovinError2 = new AppLovinError(-8, string);
                    y.j("AppLovinAdService", string);
                    a(appLovinError2, appLovinAdLoadListener);
                    return;
                }
                com.applovin.impl.sdk.utils.i.g(jSONObjectD, this.f10017a);
                com.applovin.impl.sdk.utils.i.e(jSONObjectD, this.f10017a);
                com.applovin.impl.sdk.utils.i.d(jSONObjectD, this.f10017a);
                com.applovin.impl.sdk.utils.i.f(jSONObjectD, this.f10017a);
                g.a(this.f10017a);
                if (JsonUtils.getJSONArray(jSONObjectD, "ads", new JSONArray()).length() > 0) {
                    if (y.a()) {
                        this.f10018b.b("AppLovinAdService", "Rendering ad for token: " + cVar);
                    }
                    sVar = new com.applovin.impl.sdk.e.s(jSONObjectD, com.applovin.impl.sdk.utils.w.a(jSONObjectD, this.f10017a), com.applovin.impl.sdk.ad.b.DECODED_AD_TOKEN_JSON, aVar, this.f10017a);
                } else {
                    if (y.a()) {
                        this.f10018b.e("AppLovinAdService", "No ad returned from the server for token: " + cVar);
                    }
                    appLovinError = AppLovinError.NO_FILL;
                }
            } else {
                appLovinError = new AppLovinError(-8, "Invalid token type");
                y.j("AppLovinAdService", "Invalid token type");
            }
            a(appLovinError, appLovinAdLoadListener);
            return;
        }
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Loading next ad for token: " + cVar);
        }
        sVar = new com.applovin.impl.sdk.e.o(cVar, aVar, this.f10017a);
        a(sVar);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(com.applovin.impl.sdk.ad.d.a(str), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
        if (listRemoveTrimmedEmptyStrings == null || listRemoveTrimmedEmptyStrings.isEmpty()) {
            y.j("AppLovinAdService", "No zones were provided");
            a(-7, appLovinAdLoadListener);
            return;
        }
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Loading next ad for zones: " + listRemoveTrimmedEmptyStrings);
        }
        a(new com.applovin.impl.sdk.e.m(listRemoveTrimmedEmptyStrings, appLovinAdLoadListener, this.f10017a));
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.sdk.ad.d.b(str), appLovinAdLoadListener);
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.sdk.d.a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.applovin.impl.sdk.d.a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f10023g.set(jSONObject);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppLovinAdService{adLoadStates=");
        sbA.append(this.f10020d);
        sbA.append('}');
        return sbA.toString();
    }

    public void trackAndLaunchClick(final com.applovin.impl.sdk.ad.e eVar, final AppLovinAdView appLovinAdView, final com.applovin.impl.adview.b bVar, final Uri uri, PointF pointF, boolean z10, boolean z11) {
        if (eVar == null) {
            if (y.a()) {
                this.f10018b.e("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(eVar.a(pointF, z10, z11));
        if (appLovinAdView == null || uri == null) {
            if (y.a()) {
                this.f10018b.e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            }
        } else if (eVar.isDirectDownloadEnabled()) {
            this.f10017a.af().startDirectInstallOrDownloadProcess(eVar, z11, new ArrayService.DirectDownloadListener() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.5
                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onAppDetailsDismissed() {
                    if (bVar != null) {
                        AppLovinAdServiceImpl.this.f10017a.U().resumeForClick();
                        com.applovin.impl.sdk.utils.o.b(bVar.g(), eVar, appLovinAdView);
                    }
                }

                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onAppDetailsDisplayed() {
                    AppLovinAdServiceImpl.this.f10017a.U().pauseForClick();
                    com.applovin.impl.adview.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.o();
                        com.applovin.impl.sdk.utils.o.a(bVar.g(), eVar, appLovinAdView);
                    }
                }

                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onFailure() {
                    y unused = AppLovinAdServiceImpl.this.f10018b;
                    if (y.a()) {
                        AppLovinAdServiceImpl.this.f10018b.b("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
                    }
                    AppLovinAdServiceImpl.this.a(eVar, appLovinAdView, bVar, uri);
                }
            });
        } else {
            a(eVar, appLovinAdView, bVar, uri);
        }
    }

    public void trackAndLaunchVideoClick(final com.applovin.impl.sdk.ad.e eVar, final Uri uri, PointF pointF, boolean z10, final com.applovin.impl.adview.activity.b.a aVar, final Context context) {
        if (eVar == null) {
            if (y.a()) {
                this.f10018b.e("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Tracking VIDEO click on an ad...");
        }
        maybeSubmitPersistentPostbacks(eVar.a(pointF, z10));
        if (eVar.isDirectDownloadEnabled()) {
            this.f10017a.af().startDirectInstallOrDownloadProcess(eVar, z10, new ArrayService.DirectDownloadListener() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.4
                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onAppDetailsDismissed() {
                    AppLovinAdServiceImpl.this.f10017a.U().resumeForClick();
                }

                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onAppDetailsDisplayed() {
                    AppLovinAdServiceImpl.this.f10017a.U().pauseForClick();
                }

                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onFailure() {
                    y unused = AppLovinAdServiceImpl.this.f10018b;
                    if (y.a()) {
                        AppLovinAdServiceImpl.this.f10018b.b("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
                    }
                    AppLovinAdServiceImpl.this.a(eVar, uri, aVar, context);
                }
            });
        } else {
            a(eVar, uri, aVar, context);
        }
    }

    public void trackAppKilled(com.applovin.impl.sdk.ad.e eVar) {
        if (eVar == null) {
            if (y.a()) {
                this.f10018b.e("AppLovinAdService", "Unable to track app killed. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.f10018b.b("AppLovinAdService", "Tracking app killed during ad...");
        }
        List<com.applovin.impl.sdk.d.a> listAx = eVar.ax();
        if (listAx != null && !listAx.isEmpty()) {
            for (com.applovin.impl.sdk.d.a aVar : listAx) {
                a(new com.applovin.impl.sdk.d.a(aVar.a(), aVar.b()));
            }
            return;
        }
        if (y.a()) {
            y yVar = this.f10018b;
            StringBuilder sbA = defpackage.a.a("Unable to track app killed during AD #");
            sbA.append(eVar.getAdIdNumber());
            sbA.append(". Missing app killed tracking URL.");
            yVar.d("AppLovinAdService", sbA.toString());
        }
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.e eVar, long j10, List<Long> list, long j11, boolean z10, int i10) {
        boolean zA = y.a();
        if (eVar == null) {
            if (zA) {
                this.f10018b.e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (zA) {
            this.f10018b.b("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.sdk.d.a> listAw = eVar.aw();
        if (listAw == null || listAw.isEmpty()) {
            if (y.a()) {
                y yVar = this.f10018b;
                StringBuilder sbA = defpackage.a.a("Unable to track ad closed for AD #");
                sbA.append(eVar.getAdIdNumber());
                sbA.append(". Missing ad close tracking URL.");
                sbA.append(eVar.getAdIdNumber());
                yVar.d("AppLovinAdService", sbA.toString());
                return;
            }
            return;
        }
        for (com.applovin.impl.sdk.d.a aVar : listAw) {
            String strA = a(aVar.a(), j10, j11, list, z10, i10);
            String strA2 = a(aVar.b(), j10, j11, list, z10, i10);
            if (StringUtils.isValidString(strA)) {
                a(new com.applovin.impl.sdk.d.a(strA, strA2));
            } else if (y.a()) {
                y yVar2 = this.f10018b;
                StringBuilder sbA2 = defpackage.a.a("Failed to parse url: ");
                sbA2.append(aVar.a());
                yVar2.e("AppLovinAdService", sbA2.toString());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.e eVar) {
        if (eVar == null) {
            if (y.a()) {
                this.f10018b.e("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (y.a()) {
                this.f10018b.b("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.ay());
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.e eVar, long j10, int i10, boolean z10) {
        boolean zA = y.a();
        if (eVar == null) {
            if (zA) {
                this.f10018b.e("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (zA) {
            this.f10018b.b("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.sdk.d.a> listAv = eVar.av();
        if (listAv == null || listAv.isEmpty()) {
            if (y.a()) {
                y yVar = this.f10018b;
                StringBuilder sbA = defpackage.a.a("Unable to submit persistent postback for AD #");
                sbA.append(eVar.getAdIdNumber());
                sbA.append(". Missing video end tracking URL.");
                yVar.d("AppLovinAdService", sbA.toString());
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.sdk.d.a aVar : listAv) {
            if (StringUtils.isValidString(aVar.a())) {
                String strA = a(aVar.a(), j10, i10, string, z10);
                String strA2 = a(aVar.b(), j10, i10, string, z10);
                if (strA != null) {
                    a(new com.applovin.impl.sdk.d.a(strA, strA2));
                } else if (y.a()) {
                    y yVar2 = this.f10018b;
                    StringBuilder sbA2 = defpackage.a.a("Failed to parse url: ");
                    sbA2.append(aVar.a());
                    yVar2.e("AppLovinAdService", sbA2.toString());
                }
            } else if (y.a()) {
                this.f10018b.d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }
}
