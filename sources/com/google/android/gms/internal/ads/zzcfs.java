package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.w;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@SuppressLint({"ViewConstructor"})
final class zzcfs extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcez {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbee zzC;
    private zzbec zzD;
    private zzavn zzE;
    private int zzF;
    private int zzG;
    private zzbcb zzH;
    private final zzbcb zzI;
    private zzbcb zzJ;
    private final zzbcc zzK;
    private int zzL;
    private com.google.android.gms.ads.internal.overlay.zzl zzM;
    private boolean zzN;
    private final com.google.android.gms.ads.internal.util.zzci zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private Map zzT;
    private final WindowManager zzU;
    private final zzawz zzV;
    private final zzcgn zzb;
    private final zzaqs zzc;
    private final zzbco zzd;
    private final zzbzx zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzezn zzj;
    private zzezq zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcfg zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private zzfgw zzp;
    private zzcgo zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcfv zzz;

    public zzcfs(zzcgn zzcgnVar, zzcgo zzcgoVar, String str, boolean z10, boolean z11, zzaqs zzaqsVar, zzbco zzbcoVar, zzbzx zzbzxVar, zzbce zzbceVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzawz zzawzVar, zzezn zzeznVar, zzezq zzezqVar) {
        zzezq zzezqVar2;
        super(zzcgnVar);
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzP = -1;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzb = zzcgnVar;
        this.zzq = zzcgoVar;
        this.zzr = str;
        this.zzu = z10;
        this.zzc = zzaqsVar;
        this.zzd = zzbcoVar;
        this.zze = zzbzxVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzU = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics displayMetricsZzq = com.google.android.gms.ads.internal.util.zzs.zzq(windowManager);
        this.zzh = displayMetricsZzq;
        this.zzi = displayMetricsZzq.density;
        this.zzV = zzawzVar;
        this.zzj = zzeznVar;
        this.zzk = zzezqVar;
        this.zzO = new com.google.android.gms.ads.internal.util.zzci(zzcgnVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            zzbzr.zzh("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjX)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcgnVar, zzbzxVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                zzfmd zzfmdVar = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaH)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaS();
        addJavascriptInterface(new zzcfz(this, new zzcfy(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzba();
        zzbcc zzbccVar = new zzbcc(new zzbce(true, "make_wv", this.zzr));
        this.zzK = zzbccVar;
        zzbccVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue() && (zzezqVar2 = this.zzk) != null && zzezqVar2.zzb != null) {
            zzbccVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbccVar.zza();
        zzbcb zzbcbVarZzf = zzbce.zzf();
        this.zzI = zzbcbVarZzf;
        zzbccVar.zzb("native:view_create", zzbcbVarZzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcgnVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzr();
    }

    private final synchronized void zzaS() {
        zzezn zzeznVar = this.zzj;
        if (zzeznVar != null && zzeznVar.zzan) {
            zzbzr.zze("Disabling hardware acceleration on an overlay.");
            zzaU();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            zzbzr.zze("Enabling hardware acceleration on an AdView.");
            zzaW();
            return;
        }
        zzbzr.zze("Enabling hardware acceleration on an overlay.");
        zzaW();
    }

    private final synchronized void zzaT() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        com.google.android.gms.ads.internal.zzt.zzo().zzq();
    }

    private final synchronized void zzaU() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaV(boolean z10) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z10 ? "0" : "1");
        zzd("onAdVisibilityChanged", map);
    }

    private final synchronized void zzaW() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaX(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrlUnsafe");
            zzbzr.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzaY() {
        zzbbw.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzaZ() {
        Map map = this.zzT;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzcdl) it.next()).release();
            }
        }
        this.zzT = null;
    }

    private final void zzba() {
        zzbcc zzbccVar = this.zzK;
        if (zzbccVar == null) {
            return;
        }
        zzbce zzbceVarZza = zzbccVar.zza();
        zzbbu zzbbuVarZzf = com.google.android.gms.ads.internal.zzt.zzo().zzf();
        if (zzbbuVarZzf != null) {
            zzbbuVarZzf.zzf(zzbceVarZza);
        }
    }

    private final synchronized void zzbb() {
        Boolean boolZzk = com.google.android.gms.ads.internal.zzt.zzo().zzk();
        this.zzw = boolZzk;
        if (boolZzk == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcez
    public final synchronized void destroy() {
        zzba();
        this.zzO.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzm();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzh();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzaZ();
        this.zzt = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjt)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzU();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaX("about:blank");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!zzaz()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzbzr.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzh();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzaZ();
                    zzaT();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcez
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaz()) {
            zzbzr.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcez
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaz()) {
            zzbzr.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcez
    public final synchronized void loadUrl(String str) {
        if (zzaz()) {
            zzbzr.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrl");
            zzbzr.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfg zzcfgVar = this.zzn;
        if (zzcfgVar != null) {
            zzcfgVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaz()) {
            this.zzO.zzc();
        }
        boolean z10 = this.zzA;
        zzcfg zzcfgVar = this.zzn;
        if (zzcfgVar != null && zzcfgVar.zzL()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaR();
            z10 = true;
        }
        zzaV(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcfg zzcfgVar;
        synchronized (this) {
            if (!zzaz()) {
                this.zzO.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcfgVar = this.zzn) != null && zzcfgVar.zzL() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaV(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzP(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzbzr.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (zzaz()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaR = zzaR();
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzL();
        if (zzlVarZzL == null || !zZzaR) {
            return;
        }
        zzlVarZzL.zzn();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[Catch: all -> 0x01e0, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:47:0x008a, B:41:0x007b, B:44:0x0080, B:50:0x0097, B:52:0x009f, B:54:0x00b1, B:57:0x00b6, B:59:0x00d2, B:61:0x00da, B:60:0x00d6, B:64:0x00df, B:66:0x00e7, B:69:0x00f2, B:78:0x0116, B:80:0x011d, B:85:0x0125, B:87:0x0137, B:89:0x0145, B:93:0x0152, B:96:0x0157, B:98:0x01a2, B:99:0x01a6, B:101:0x01ad, B:106:0x01ba, B:108:0x01c0, B:109:0x01c3, B:111:0x01c7, B:112:0x01d0, B:115:0x01db), top: B:121:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final synchronized void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (zzaz()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzu && !this.zzq.zzf()) {
            if (this.zzq.zzh()) {
                super.onMeasure(i10, i11);
                return;
            }
            if (this.zzq.zzj()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdA)).booleanValue()) {
                    super.onMeasure(i10, i11);
                    return;
                }
                zzcfv zzcfvVarZzq = zzq();
                float fZze = zzcfvVarZzq != null ? zzcfvVarZzq.zze() : 0.0f;
                if (fZze == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                float f10 = size2 * fZze;
                int i16 = (int) (size / fZze);
                if (size2 != 0) {
                    i12 = (int) f10;
                    if (size == 0) {
                        i15 = size;
                    } else if (i12 != 0) {
                        i16 = (int) (i12 / fZze);
                        i13 = size2;
                        i14 = i12;
                        i15 = i14;
                    }
                    i13 = size2;
                    i14 = i12;
                } else if (i16 != 0) {
                    i14 = (int) (i16 * fZze);
                    i15 = size;
                    i13 = i16;
                } else {
                    size2 = 0;
                    i12 = (int) f10;
                    if (size == 0) {
                        i15 = size;
                    } else if (i12 != 0) {
                        i16 = (int) (i12 / fZze);
                        i13 = size2;
                        i14 = i12;
                        i15 = i14;
                    }
                    i13 = size2;
                    i14 = i12;
                }
                setMeasuredDimension(Math.min(i14, i15), Math.min(i16, i13));
                return;
            }
            if (this.zzq.zzg()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdG)).booleanValue()) {
                    super.onMeasure(i10, i11);
                    return;
                }
                zzad("/contentHeight", new zzcfq(this));
                zzaO("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f11 = this.zzh.density;
                int size3 = View.MeasureSpec.getSize(i10);
                int i17 = this.zzG;
                setMeasuredDimension(size3, i17 != -1 ? (int) (i17 * f11) : View.MeasureSpec.getSize(i11));
                return;
            }
            if (this.zzq.zzi()) {
                DisplayMetrics displayMetrics = this.zzh;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i10);
            int size4 = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size5 = View.MeasureSpec.getSize(i11);
            int i18 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i19 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzcgo zzcgoVar = this.zzq;
            boolean z10 = zzcgoVar.zzb > i18 || zzcgoVar.zza > i19;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfg)).booleanValue()) {
                zzcgo zzcgoVar2 = this.zzq;
                float f12 = zzcgoVar2.zzb;
                float f13 = this.zzi;
                z10 &= f12 / f13 <= ((float) i18) / f13 && ((float) zzcgoVar2.zza) / f13 <= ((float) i19) / f13;
            }
            if (!z10) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.zzm) {
                    this.zzV.zzc(10002);
                    this.zzm = true;
                }
                zzcgo zzcgoVar3 = this.zzq;
                setMeasuredDimension(zzcgoVar3.zzb, zzcgoVar3.zza);
                return;
            }
            zzcgo zzcgoVar4 = this.zzq;
            float f14 = zzcgoVar4.zzb;
            float f15 = this.zzi;
            zzbzr.zzj("Not enough space to show ad. Needs " + ((int) (f14 / f15)) + "x" + ((int) (zzcgoVar4.zza / f15)) + " dp, but only has " + ((int) (size4 / f15)) + "x" + ((int) (size5 / f15)) + " dp.");
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.zzl) {
                return;
            }
            this.zzV.zzc(10001);
            this.zzl = true;
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcez
    public final void onPause() {
        if (zzaz()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e10) {
            zzbzr.zzh("Could not pause webview.", e10);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcez
    public final void onResume() {
        if (zzaz()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e10) {
            zzbzr.zzh("Could not resume webview.", e10);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzL() || this.zzn.zzJ()) {
            zzaqs zzaqsVar = this.zzc;
            if (zzaqsVar != null) {
                zzaqsVar.zzd(motionEvent);
            }
            zzbco zzbcoVar = this.zzd;
            if (zzbcoVar != null) {
                zzbcoVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbee zzbeeVar = this.zzC;
                if (zzbeeVar != null) {
                    zzbeeVar.zzd(motionEvent);
                }
            }
        }
        if (zzaz()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcez
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfg) {
            this.zzn = (zzcfg) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaz()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            zzbzr.zzh("Could not stop loading webview.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzA(int i10) {
        this.zzL = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzB(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzC(zzcfv zzcfvVar) {
        if (this.zzz != null) {
            zzbzr.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcfvVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzceq
    public final zzezn zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcgj
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final WebViewClient zzH() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcgh
    public final zzaqs zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized zzavn zzJ() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized zzbee zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final /* synthetic */ zzcgm zzN() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcgg
    public final synchronized zzcgo zzO() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcfw
    public final zzezq zzP() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized zzfgw zzQ() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final zzfwm zzR() {
        zzbco zzbcoVar = this.zzd;
        return zzbcoVar == null ? zzfwc.zzh(null) : zzbcoVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized String zzS() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzT(zzezn zzeznVar, zzezq zzezqVar) {
        this.zzj = zzeznVar;
        this.zzk = zzezqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzU() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaT();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfr(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzV() {
        zzaY();
        HashMap map = new HashMap(1);
        map.put("version", this.zze.zza);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzW(int i10) {
        if (i10 == 0) {
            zzbbw.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzaY();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i10));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i10));
        map.put("version", this.zze.zza);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzX() {
        if (this.zzH == null) {
            zzbbw.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbcb zzbcbVarZzf = zzbce.zzf();
            this.zzH = zzbcbVarZzf;
            this.zzK.zzb("native:view_show", zzbcbVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zze.zza);
        zzd("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzZ(boolean z10) {
        this.zzn.zzi(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized boolean zzaA() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized boolean zzaC() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10) {
        this.zzn.zzt(zzcVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzaE(com.google.android.gms.ads.internal.util.zzbr zzbrVar, String str, String str2, int i10) {
        this.zzn.zzu(zzbrVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzaF(boolean z10, int i10, boolean z11) {
        this.zzn.zzv(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzaG(boolean z10, int i10, String str, boolean z11) {
        this.zzn.zzx(z10, i10, str, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzaH(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zzn.zzy(z10, i10, str, str2, z11);
    }

    public final zzcfg zzaJ() {
        return this.zzn;
    }

    public final synchronized Boolean zzaK() {
        return this.zzw;
    }

    public final synchronized void zzaN(String str, ValueCallback valueCallback) {
        if (zzaz()) {
            zzbzr.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final void zzaO(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaP("javascript:".concat(str));
            return;
        }
        if (zzaK() == null) {
            zzbb();
        }
        if (zzaK().booleanValue()) {
            zzaN(str, null);
        } else {
            zzaP("javascript:".concat(str));
        }
    }

    public final synchronized void zzaP(String str) {
        if (zzaz()) {
            zzbzr.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    public final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzv(bool);
    }

    public final boolean zzaR() {
        int i10;
        int iZzv;
        if (!this.zzn.zzK() && !this.zzn.zzL()) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zzh;
        int iZzv2 = zzbzk.zzv(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zzh;
        int iZzv3 = zzbzk.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZza = this.zzb.zza();
        if (activityZza == null || activityZza.getWindow() == null) {
            i10 = iZzv2;
            iZzv = iZzv3;
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] iArrZzM = com.google.android.gms.ads.internal.util.zzs.zzM(activityZza);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int iZzv4 = zzbzk.zzv(this.zzh, iArrZzM[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            iZzv = zzbzk.zzv(this.zzh, iArrZzM[1]);
            i10 = iZzv4;
        }
        int i11 = this.zzQ;
        if (i11 == iZzv2 && this.zzP == iZzv3 && this.zzR == i10 && this.zzS == iZzv) {
            return false;
        }
        boolean z10 = (i11 == iZzv2 && this.zzP == iZzv3) ? false : true;
        this.zzQ = iZzv2;
        this.zzP = iZzv3;
        this.zzR = i10;
        this.zzS = iZzv;
        new zzbqw(this, "").zzi(iZzv2, iZzv3, i10, iZzv, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzaa() {
        this.zzO.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzab(String str, String str2, String str3) {
        String str4;
        if (zzaz()) {
            zzbzr.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzQ);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e10) {
            zzbzr.zzk("Unable to build MRAID_ENV", e10);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzcgf.zza(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzac() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbcb zzbcbVarZzf = zzbce.zzf();
            this.zzJ = zzbcbVarZzf;
            this.zzK.zzb("native:view_load", zzbcbVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzad(String str, zzbij zzbijVar) {
        zzcfg zzcfgVar = this.zzn;
        if (zzcfgVar != null) {
            zzcfgVar.zzz(str, zzbijVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzae() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzag(zzcgo zzcgoVar) {
        this.zzq = zzcgoVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzah(zzavn zzavnVar) {
        this.zzE = zzavnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzai(boolean z10) {
        this.zzx = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzaj() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzak(Context context) {
        this.zzb.setBaseContext(context);
        this.zzO.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzal(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzy(this.zzn.zzK(), z10);
        } else {
            this.zzs = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzam(zzbec zzbecVar) {
        this.zzD = zzbecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzan(boolean z10) {
        boolean z11 = this.zzu;
        this.zzu = z10;
        zzaS();
        if (z10 != z11) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzR)).booleanValue() || !this.zzq.zzi()) {
                new zzbqw(this, "").zzk(true != z10 ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzao(zzbee zzbeeVar) {
        this.zzC = zzbeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzap(zzfgw zzfgwVar) {
        this.zzp = zzfgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzaq(int i10) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzA(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzM = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzas(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i10 = this.zzF + (true != z10 ? -1 : 1);
        this.zzF = i10;
        if (i10 > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzE();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0010, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized void zzat(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        if (!z10) {
            zzlVar = this.zzo;
            if (zzlVar != null) {
                zzlVar.zzB(z10);
                return;
            }
            return;
        }
        setBackgroundColor(0);
        zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzB(z10);
            return;
        }
        return;
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzau(String str, zzbij zzbijVar) {
        zzcfg zzcfgVar = this.zzn;
        if (zzcfgVar != null) {
            zzcfgVar.zzH(str, zzbijVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final void zzav(String str, Predicate predicate) {
        zzcfg zzcfgVar = this.zzn;
        if (zzcfgVar != null) {
            zzcfgVar.zzI(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized boolean zzaw() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized boolean zzax() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final boolean zzay(final boolean z10, final int i10) {
        destroy();
        this.zzV.zzb(new zzawy() { // from class: com.google.android.gms.internal.ads.zzcfp
            @Override // com.google.android.gms.internal.ads.zzawy
            public final void zza(zzayo zzayoVar) {
                boolean z11 = z10;
                int i11 = i10;
                int i12 = zzcfs.zza;
                zzbat zzbatVarZza = zzbau.zza();
                if (zzbatVarZza.zzc() != z11) {
                    zzbatVarZza.zza(z11);
                }
                zzbatVarZza.zzb(i11);
                zzayoVar.zzj((zzbau) zzbatVarZza.zzal());
            }
        });
        this.zzV.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcez
    public final synchronized boolean zzaz() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzb(String str, String str2) {
        zzaO(w.a(str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbj() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbj();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbk() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized String zzbl() {
        zzezq zzezqVar = this.zzk;
        if (zzezqVar == null) {
            return null;
        }
        return zzezqVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized String zzbm() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final void zzc(zzatz zzatzVar) {
        boolean z10;
        synchronized (this) {
            z10 = zzatzVar.zzj;
            this.zzA = z10;
        }
        zzaV(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzbzr.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbA = q2.a.a("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzbzr.zze("Dispatching AFMA event: ".concat(sbA.toString()));
        zzaO(sbA.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized int zzf() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcga, com.google.android.gms.internal.ads.zzcca
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcca
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final zzbcb zzk() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcca
    public final zzbcc zzm() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcgi, com.google.android.gms.internal.ads.zzcca
    public final zzbzx zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final zzcbp zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized zzcdl zzp(String str) {
        Map map = this.zzT;
        if (map == null) {
            return null;
        }
        return (zzcdl) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcca
    public final synchronized zzcfv zzq() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzr() {
        zzcfg zzcfgVar = this.zzn;
        if (zzcfgVar != null) {
            zzcfgVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzs() {
        zzcfg zzcfgVar = this.zzn;
        if (zzcfgVar != null) {
            zzcfgVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcez, com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzt(String str, zzcdl zzcdlVar) {
        if (this.zzT == null) {
            this.zzT = new HashMap();
        }
        this.zzT.put(str, zzcdlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzv(boolean z10, long j10) {
        HashMap map = new HashMap(2);
        map.put("success", true != z10 ? "0" : "1");
        map.put("duration", Long.toString(j10));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzw() {
        zzbec zzbecVar = this.zzD;
        if (zzbecVar != null) {
            final zzdky zzdkyVar = (zzdky) zzbecVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkw
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdkyVar.zzd();
                    } catch (RemoteException e10) {
                        zzbzr.zzl("#007 Could not call remote method.", e10);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzy(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzz(boolean z10) {
        this.zzn.zzC(false);
    }
}
