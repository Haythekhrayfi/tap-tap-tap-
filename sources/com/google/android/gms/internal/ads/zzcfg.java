package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import org.joda.time.DateTimeConstants;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public class zzcfg extends WebViewClient implements zzcgm {
    public static final /* synthetic */ int zzb = 0;
    private final zzebl zzB;
    private View.OnAttachStateChangeListener zzC;
    public zzbws zza;
    private final zzcez zzc;
    private final zzawz zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcgk zzi;
    private zzcgl zzj;
    private zzbhc zzk;
    private zzbhe zzl;
    private zzdcu zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private com.google.android.gms.ads.internal.overlay.zzz zzs;
    private zzbqv zzt;
    private com.google.android.gms.ads.internal.zzb zzu;
    private boolean zzw;
    private boolean zzx;
    private int zzy;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private zzbqq zzv = null;
    private final HashSet zzA = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfr)).split(",")));

    public zzcfg(zzcez zzcezVar, zzawz zzawzVar, boolean z10, zzbqv zzbqvVar, zzbqq zzbqqVar, zzebl zzeblVar) {
        this.zzd = zzawzVar;
        this.zzc = zzcezVar;
        this.zzp = z10;
        this.zzt = zzbqvVar;
        this.zzB = zzeblVar;
    }

    private static WebResourceResponse zzN() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaG)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzO(String str, Map map) throws IOException {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                com.google.android.gms.ads.internal.zzt.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().zza, false, httpURLConnection, false, DateTimeConstants.MILLIS_PER_MINUTE);
                zzbzq zzbzqVar = new zzbzq(null);
                zzbzqVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzbzqVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String contentType = httpURLConnection.getContentType();
                    String strTrim = "";
                    String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String contentType2 = httpURLConnection.getContentType();
                    if (!TextUtils.isEmpty(contentType2)) {
                        String[] strArrSplit = contentType2.split(";");
                        if (strArrSplit.length != 1) {
                            for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                                if (strArrSplit[i11].trim().startsWith("charset")) {
                                    String[] strArrSplit2 = strArrSplit[i11].trim().split("=");
                                    if (strArrSplit2.length > 1) {
                                        strTrim = strArrSplit2[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String str2 = strTrim;
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap map2 = new HashMap(headerFields.size());
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                            map2.put(entry2.getKey(), entry2.getValue().get(0));
                        }
                    }
                    WebResourceResponse webResourceResponseZzc = com.google.android.gms.ads.internal.zzt.zzq().zzc(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseZzc;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    TrafficStats.clearThreadStatsTag();
                    return null;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    zzbzr.zzj("Protocol is null");
                    WebResourceResponse webResourceResponseZzN = zzN();
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseZzN;
                }
                if (!protocol.equals("http") && !protocol.equals("https")) {
                    zzbzr.zzj("Unsupported scheme: " + protocol);
                    WebResourceResponse webResourceResponseZzN2 = zzN();
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseZzN2;
                }
                zzbzr.zze("Redirecting to " + headerField);
                httpURLConnection.disconnect();
                url = url2;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbij) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzR(final View view, final zzbws zzbwsVar, final int i10) {
        if (!zzbwsVar.zzi() || i10 <= 0) {
            return;
        }
        zzbwsVar.zzg(view);
        if (zzbwsVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(view, zzbwsVar, i10);
                }
            }, 100L);
        }
    }

    private static final boolean zzS(zzcez zzcezVar) {
        if (zzcezVar.zzD() != null) {
            return zzcezVar.zzD().zzaj;
        }
        return false;
    }

    private static final boolean zzT(boolean z10, zzcez zzcezVar) {
        return (!z10 || zzcezVar.zzO().zzi() || zzcezVar.zzS().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzj(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaz()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzU();
                return;
            }
            this.zzw = true;
            zzcgl zzcglVar = this.zzj;
            if (zzcglVar != null) {
                zzcglVar.zza();
                this.zzj = null;
            }
            zzg();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzay(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzj(uriZza);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = uriZza.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbws zzbwsVar = this.zza;
                        if (zzbwsVar != null) {
                            zzbwsVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdcu zzdcuVar = this.zzm;
                    if (zzdcuVar != null) {
                        zzdcuVar.zzr();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                zzbzr.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzaqs zzaqsVarZzI = this.zzc.zzI();
                    if (zzaqsVarZzI != null && zzaqsVarZzI.zzf(uriZza)) {
                        Context context = this.zzc.getContext();
                        zzcez zzcezVar = this.zzc;
                        uriZza = zzaqsVarZzI.zza(uriZza, context, (View) zzcezVar, zzcezVar.zzi());
                    }
                } catch (zzaqt unused) {
                    zzbzr.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzu;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzt(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null), true);
                } else {
                    this.zzu.zzb(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzA(zzcgk zzcgkVar) {
        this.zzi = zzcgkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzB(int i10, int i11) {
        zzbqq zzbqqVar = this.zzv;
        if (zzbqqVar != null) {
            zzbqqVar.zzd(i10, i11);
        }
    }

    public final void zzC(boolean z10) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzD(boolean z10) {
        synchronized (this.zzf) {
            this.zzr = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzE() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzp = true;
            zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzF(boolean z10) {
        synchronized (this.zzf) {
            this.zzq = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzG(zzcgl zzcglVar) {
        this.zzj = zzcglVar;
    }

    public final void zzH(String str, zzbij zzbijVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbijVar);
        }
    }

    public final void zzI(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbij> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbij zzbijVar : list) {
                if (predicate.apply(zzbijVar)) {
                    arrayList.add(zzbijVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzJ() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzr;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean zzK() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzp;
        }
        return z10;
    }

    public final boolean zzL() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzq;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzM(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhc zzbhcVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbhe zzbheVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, boolean z10, zzbil zzbilVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbqx zzbqxVar, zzbws zzbwsVar, final zzeba zzebaVar, final zzfgr zzfgrVar, zzdqa zzdqaVar, zzfev zzfevVar, zzbjb zzbjbVar, final zzdcu zzdcuVar, zzbja zzbjaVar, zzbiu zzbiuVar) {
        zzbij zzbijVar;
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbwsVar, null) : zzbVar;
        this.zzv = new zzbqq(this.zzc, zzbqxVar);
        this.zza = zzbwsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaO)).booleanValue()) {
            zzz("/adMetadata", new zzbhb(zzbhcVar));
        }
        if (zzbheVar != null) {
            zzz("/appEvent", new zzbhd(zzbheVar));
        }
        zzz("/backButton", zzbii.zzj);
        zzz("/refresh", zzbii.zzk);
        zzz("/canOpenApp", zzbii.zzb);
        zzz("/canOpenURLs", zzbii.zza);
        zzz("/canOpenIntents", zzbii.zzc);
        zzz("/close", zzbii.zzd);
        zzz("/customClose", zzbii.zze);
        zzz("/instrument", zzbii.zzn);
        zzz("/delayPageLoaded", zzbii.zzp);
        zzz("/delayPageClosed", zzbii.zzq);
        zzz("/getLocationInfo", zzbii.zzr);
        zzz("/log", zzbii.zzg);
        zzz("/mraid", new zzbip(zzbVar2, this.zzv, zzbqxVar));
        zzbqv zzbqvVar = this.zzt;
        if (zzbqvVar != null) {
            zzz("/mraidLoaded", zzbqvVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzz("/open", new zzbit(zzbVar2, this.zzv, zzebaVar, zzdqaVar, zzfevVar));
        zzz("/precache", new zzcdm());
        zzz("/touch", zzbii.zzi);
        zzz("/video", zzbii.zzl);
        zzz("/videoMeta", zzbii.zzm);
        if (zzebaVar == null || zzfgrVar == null) {
            zzz("/click", new zzbhk(zzdcuVar));
            zzbijVar = zzbii.zzf;
        } else {
            zzz("/click", new zzbij() { // from class: com.google.android.gms.internal.ads.zzfap
                @Override // com.google.android.gms.internal.ads.zzbij
                public final void zza(Object obj, Map map) {
                    zzdcu zzdcuVar2 = zzdcuVar;
                    zzfgr zzfgrVar2 = zzfgrVar;
                    zzeba zzebaVar2 = zzebaVar;
                    zzcez zzcezVar = (zzcez) obj;
                    zzbii.zzc(map, zzdcuVar2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzbzr.zzj("URL missing from click GMSG.");
                    } else {
                        zzfwc.zzq(zzbii.zza(zzcezVar, str), new zzfaq(zzcezVar, zzfgrVar2, zzebaVar2), zzcae.zza);
                    }
                }
            });
            zzbijVar = new zzbij() { // from class: com.google.android.gms.internal.ads.zzfao
                @Override // com.google.android.gms.internal.ads.zzbij
                public final void zza(Object obj, Map map) {
                    zzfgr zzfgrVar2 = zzfgrVar;
                    zzeba zzebaVar2 = zzebaVar;
                    zzceq zzceqVar = (zzceq) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzbzr.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzceqVar.zzD().zzaj) {
                        zzebaVar2.zzd(new zzebc(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), ((zzcfw) zzceqVar).zzP().zzb, str, 2));
                    } else {
                        zzfgrVar2.zzc(str, null);
                    }
                }
            };
        }
        zzz("/httpTrack", zzbijVar);
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zzc.getContext())) {
            zzz("/logScionEvent", new zzbio(this.zzc.getContext()));
        }
        if (zzbilVar != null) {
            zzz("/setInterstitialProperties", new zzbik(zzbilVar));
        }
        if (zzbjbVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziu)).booleanValue()) {
                zzz("/inspectorNetworkExtras", zzbjbVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziN)).booleanValue() && zzbjaVar != null) {
            zzz("/shareSheet", zzbjaVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziQ)).booleanValue() && zzbiuVar != null) {
            zzz("/inspectorOutOfContextTest", zzbiuVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjR)).booleanValue()) {
            zzz("/bindPlayStoreOverlay", zzbii.zzu);
            zzz("/presentPlayStoreOverlay", zzbii.zzv);
            zzz("/expandPlayStoreOverlay", zzbii.zzw);
            zzz("/collapsePlayStoreOverlay", zzbii.zzx);
            zzz("/closePlayStoreOverlay", zzbii.zzy);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcR)).booleanValue()) {
                zzz("/setPAIDPersonalizationEnabled", zzbii.zzA);
                zzz("/resetPAID", zzbii.zzz);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzoVar;
        this.zzk = zzbhcVar;
        this.zzl = zzbheVar;
        this.zzs = zzzVar;
        this.zzu = zzbVar3;
        this.zzm = zzdcuVar;
        this.zzn = z10;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final WebResourceResponse zzc(String str, Map map) {
        zzawi zzawiVarZzb;
        try {
            String strZzc = zzbxy.zzc(str, this.zzc.getContext(), this.zzz);
            if (!strZzc.equals(str)) {
                return zzO(strZzc, map);
            }
            zzawl zzawlVarZza = zzawl.zza(Uri.parse(str));
            if (zzawlVarZza != null && (zzawiVarZzb = com.google.android.gms.ads.internal.zzt.zzc().zzb(zzawlVarZza)) != null && zzawiVarZzb.zze()) {
                return new WebResourceResponse("", "", zzawiVarZzb.zzc());
            }
            if (zzbzq.zzk() && ((Boolean) zzbdb.zzb.zze()).booleanValue()) {
                return zzO(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdWebViewClient.interceptRequest");
            return zzN();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzu;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzw && this.zzy <= 0) || this.zzx || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue() && this.zzc.zzm() != null) {
                zzbbw.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcgk zzcgkVar = this.zzi;
            boolean z10 = false;
            if (!this.zzx && !this.zzo) {
                z10 = true;
            }
            zzcgkVar.zza(z10);
            this.zzi = null;
        }
        this.zzc.zzac();
    }

    public final void zzh() {
        zzbws zzbwsVar = this.zza;
        if (zzbwsVar != null) {
            zzbwsVar.zze();
            this.zza = null;
        }
        zzQ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzp = false;
            this.zzq = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbqq zzbqqVar = this.zzv;
            if (zzbqqVar != null) {
                zzbqqVar.zza(true);
                this.zzv = null;
            }
        }
    }

    public final void zzi(boolean z10) {
        this.zzz = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzj(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgz)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzo().zzf() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfa
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    String str = strSubstring;
                    int i10 = zzcfg.zzb;
                    com.google.android.gms.ads.internal.zzt.zzo().zzf().zze(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfq)).booleanValue() && this.zzA.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfs)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzfwc.zzq(com.google.android.gms.ads.internal.zzt.zzp().zzb(uri), new zzcfe(this, list, path, uri), zzcae.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        zzP(com.google.android.gms.ads.internal.util.zzs.zzL(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzk() {
        zzawz zzawzVar = this.zzd;
        if (zzawzVar != null) {
            zzawzVar.zzc(10005);
        }
        this.zzx = true;
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzy++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzm() {
        this.zzy--;
        zzg();
    }

    public final /* synthetic */ void zzn() {
        this.zzc.zzaa();
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = this.zzc.zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzz();
        }
    }

    public final /* synthetic */ void zzo(View view, zzbws zzbwsVar, int i10) {
        zzR(view, zzbwsVar, i10 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzp(int i10, int i11, boolean z10) {
        zzbqv zzbqvVar = this.zzt;
        if (zzbqvVar != null) {
            zzbqvVar.zzb(i10, i11);
        }
        zzbqq zzbqqVar = this.zzv;
        if (zzbqqVar != null) {
            zzbqqVar.zzc(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzq() {
        zzbws zzbwsVar = this.zza;
        if (zzbwsVar != null) {
            WebView webViewZzG = this.zzc.zzG();
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            if (e0.g.b(webViewZzG)) {
                zzR(webViewZzG, zzbwsVar, 10);
                return;
            }
            zzQ();
            zzcfd zzcfdVar = new zzcfd(this, zzbwsVar);
            this.zzC = zzcfdVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcfdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzr() {
        zzdcu zzdcuVar = this.zzm;
        if (zzdcuVar != null) {
            zzdcuVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzs() {
        zzdcu zzdcuVar = this.zzm;
        if (zzdcuVar != null) {
            zzdcuVar.zzs();
        }
    }

    public final void zzt(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10) {
        boolean zZzaA = this.zzc.zzaA();
        boolean zZzT = zzT(zZzaA, this.zzc);
        boolean z11 = true;
        if (!zZzT && z10) {
            z11 = false;
        }
        zzw(new AdOverlayInfoParcel(zzcVar, zZzT ? null : this.zzg, zZzaA ? null : this.zzh, this.zzs, this.zzc.zzn(), this.zzc, z11 ? null : this.zzm));
    }

    public final void zzu(com.google.android.gms.ads.internal.util.zzbr zzbrVar, String str, String str2, int i10) {
        zzcez zzcezVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzcezVar, zzcezVar.zzn(), zzbrVar, str, str2, 14, this.zzB));
    }

    public final void zzv(boolean z10, int i10, boolean z11) {
        boolean zZzT = zzT(this.zzc.zzaA(), this.zzc);
        boolean z12 = true;
        if (!zZzT && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzT ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcez zzcezVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, zzcezVar, z10, i10, zzcezVar.zzn(), z12 ? null : this.zzm, zzS(this.zzc) ? this.zzB : null));
    }

    public final void zzw(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbqq zzbqqVar = this.zzv;
        boolean zZze = zzbqqVar != null ? zzbqqVar.zze() : false;
        com.google.android.gms.ads.internal.zzt.zzi();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zZze);
        zzbws zzbwsVar = this.zza;
        if (zzbwsVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbwsVar.zzh(str);
        }
    }

    public final void zzx(boolean z10, int i10, String str, boolean z11) {
        boolean zZzaA = this.zzc.zzaA();
        boolean zZzT = zzT(zZzaA, this.zzc);
        boolean z12 = true;
        if (!zZzT && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzT ? null : this.zzg;
        zzcff zzcffVar = zZzaA ? null : new zzcff(this.zzc, this.zzh);
        zzbhc zzbhcVar = this.zzk;
        zzbhe zzbheVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcez zzcezVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzcffVar, zzbhcVar, zzbheVar, zzzVar, zzcezVar, z10, i10, str, zzcezVar.zzn(), z12 ? null : this.zzm, zzS(this.zzc) ? this.zzB : null));
    }

    public final void zzy(boolean z10, int i10, String str, String str2, boolean z11) {
        boolean zZzaA = this.zzc.zzaA();
        boolean zZzT = zzT(zZzaA, this.zzc);
        boolean z12 = true;
        if (!zZzT && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzT ? null : this.zzg;
        zzcff zzcffVar = zZzaA ? null : new zzcff(this.zzc, this.zzh);
        zzbhc zzbhcVar = this.zzk;
        zzbhe zzbheVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcez zzcezVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzcffVar, zzbhcVar, zzbheVar, zzzVar, zzcezVar, z10, i10, str, str2, zzcezVar.zzn(), z12 ? null : this.zzm, zzS(this.zzc) ? this.zzB : null));
    }

    public final void zzz(String str, zzbij zzbijVar) {
        synchronized (this.zzf) {
            List copyOnWriteArrayList = (List) this.zze.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.zze.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzbijVar);
        }
    }
}
