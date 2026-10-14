package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.activity.j;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzceq;
import com.google.android.gms.internal.ads.zzcfw;
import com.google.android.gms.internal.ads.zzdnl;
import com.google.android.gms.internal.ads.zzezn;
import com.google.android.gms.internal.ads.zzezq;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfos;
import com.google.android.gms.internal.ads.zzfpu;
import com.google.android.gms.internal.ads.zzfwc;
import com.google.android.gms.internal.ads.zzfwm;
import com.google.android.gms.internal.ads.zzgws;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import e0.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class zzs {
    public static final zzfmd zza = new zzf(Looper.getMainLooper());
    private String zzf;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private boolean zzd = true;
    private final Object zze = new Object();
    private boolean zzg = false;
    private boolean zzh = false;
    private final Executor zzi = Executors.newSingleThreadExecutor();

    public static final boolean zzA(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzbzr.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzB() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzC(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzD(Context context) {
        Bundle bundleZzU = zzU(context);
        return TextUtils.isEmpty(zzV(bundleZzU)) && !TextUtils.isEmpty(bundleZzU.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzE(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzF(View view, int i10, MotionEvent motionEvent) {
        String strZza;
        int i11;
        int iHeight;
        int iWidth;
        String str;
        zzezn zzeznVarZzD;
        zzezq zzezqVarZzP;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (childAt instanceof zzdnl) {
                childAt = ((zzdnl) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzg) || (childAt instanceof NativeAdView)) {
                strZza = "NATIVE";
                i11 = 1;
            } else {
                strZza = "UNKNOWN";
                i11 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            long jZzs = zzs(childAt);
            childAt.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof zzcfw) || (zzezqVarZzP = ((zzcfw) childAt).zzP()) == null) {
                str = "none";
            } else {
                str = zzezqVarZzP.zzb;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof zzceq) && (zzeznVarZzD = ((zzceq) childAt).zzD()) != null) {
                strZza = zzezn.zza(zzeznVarZzD.zzb);
                i11 = zzeznVarZzD.zzf;
                str2 = zzeznVarZzD.zzF;
            }
            zzbzr.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str2, str, strZza, Integer.valueOf(i11), childAt.getClass().getName(), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jZzs), Integer.toString(i10, 2)));
        } catch (Exception e10) {
            zzbzr.zzh("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder zzG(Context context) {
        return new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zzq().zza());
    }

    public static final void zzH(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new zzby(context, str, (String) it.next()).zzb();
        }
    }

    public static final void zzI(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbdn.zzb.zze()).booleanValue()) {
                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String zzJ(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb2 = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int i10 = inputStreamReader.read(cArr);
            if (i10 == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, i10);
        }
    }

    public static final int zzK(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            zzbzr.zzj("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final Map zzL(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final int[] zzM(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? zzr() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzN(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrZzr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? zzr() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, iArrZzr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, iArrZzr[1])};
    }

    public static final boolean zzO(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = com.google.android.gms.ads.internal.zzt.zzp().zzd || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzl(view);
        long jZzs = zzs(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbh)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjj)).booleanValue()) {
                    return true;
                }
                if (jZzs >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjl)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzP(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjB)).booleanValue()) {
            zzX(context, intent);
            return;
        }
        try {
            zzX(context, intent);
        } catch (SecurityException e10) {
            zzbzr.zzk("", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzQ(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzm(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            zzbzr.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e10) {
            zzbzr.zzh("No browser is found.", e10);
        }
    }

    public static final int[] zzR(Activity activity) {
        int[] iArrZzM = zzM(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, iArrZzM[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, iArrZzM[1])};
    }

    public static final boolean zzS(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzO(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzT(context));
    }

    private static KeyguardManager zzT(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle zzU(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            zze.zzb("Error getting metadata", e10);
            return null;
        }
    }

    private static String zzV(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static boolean zzW(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void zzX(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static int zza(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return DateTimeConstants.MILLIS_PER_MINUTE;
        }
        zzbzr.zzj("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return DateTimeConstants.MILLIS_PER_MINUTE;
    }

    public static List zzd() {
        zzbbe zzbbeVar = zzbbm.zza;
        List listZzb = com.google.android.gms.ads.internal.client.zzba.zza().zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzfpu.zzc(zzfos.zzc(CoreConstants.COMMA_CHAR)).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static final boolean zzl(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final void zzm(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzn(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzV(zzU(context));
    }

    public static final String zzo() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String zzp() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : j.a(str, " ", str2);
    }

    public static final DisplayMetrics zzq(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int[] zzr() {
        return new int[]{0, 0};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzs(View view) {
        float f10;
        float fMin = Float.MAX_VALUE;
        do {
            boolean z10 = view instanceof View;
            f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            if (!z10) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        if (fMin >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            f10 = fMin;
        }
        return Math.round(f10 * 100.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final WebResourceResponse zzt(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            zzbzr.zzk("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    public static final String zzu() {
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        return resourcesZzd != null ? resourcesZzd.getString(com.google.android.gms.ads.impl.R.string.f11717s7) : "Test Ad";
    }

    public static final zzbr zzv(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                zzbzr.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(iBinder);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzw(Context context, String str) {
        Context contextZza = zzbus.zza(context);
        return Wrappers.packageManager(contextZza).checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean zzx(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzy(String str) {
        if (!zzbzq.zzk()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeI)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeK);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeJ);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzz(Context context) {
        KeyguardManager keyguardManagerZzT;
        return (context == null || (keyguardManagerZzT = zzT(context)) == null || !keyguardManagerZzT.isKeyguardLocked()) ? false : true;
    }

    public final zzfwm zzb(final Uri uri) {
        return zzfwc.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                zzfmd zzfmdVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                return zzs.zzL(uri2);
            }
        }, this.zzi);
    }

    public final String zzc(final Context context, String str) {
        Object objZza;
        synchronized (this.zze) {
            String str2 = this.zzf;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return zzo();
            }
            try {
                zzce zzceVarZza = zzce.zza();
                if (TextUtils.isEmpty(zzceVarZza.zza)) {
                    if (ClientLibraryUtils.isPackageSide()) {
                        objZza = zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcc
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context2 = context;
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                String string = sharedPreferences.getString("user_agent", "");
                                if (!TextUtils.isEmpty(string)) {
                                    zze.zza("User agent is already initialized on Google Play Services.");
                                    return string;
                                }
                                zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                                String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                return defaultUserAgent;
                            }
                        });
                    } else {
                        final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                        objZza = zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                SharedPreferences sharedPreferences;
                                Context context2 = remoteContext;
                                Context context3 = context;
                                boolean z10 = false;
                                if (context2 != null) {
                                    zze.zza("Attempting to read user agent from Google Play Services.");
                                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                } else {
                                    zze.zza("Attempting to read user agent from local cache.");
                                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                    z10 = true;
                                }
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.zza("Reading user agent from WebSettings");
                                    string = WebSettings.getDefaultUserAgent(context3);
                                    if (z10) {
                                        sharedPreferences.edit().putString("user_agent", string).apply();
                                        zze.zza("Persisting user agent.");
                                    }
                                }
                                return string;
                            }
                        });
                    }
                    zzceVarZza.zza = (String) objZza;
                }
                this.zzf = zzceVarZza.zza;
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.zzf)) {
                this.zzf = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(this.zzf)) {
                this.zzf = zzo();
            }
            this.zzf = this.zzf + " (Mobile; " + str;
            try {
                if (Wrappers.packageManager(context).isCallerInstantApp()) {
                    this.zzf = this.zzf + ";aia";
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdUtil.getUserAgent");
            }
            String str3 = this.zzf + ")";
            this.zzf = str3;
            return str3;
        }
    }

    public final void zzf(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int iZza = zza(i10);
        zzbzr.zzi("HTTP timeout: " + iZza + " milliseconds.");
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzg(String str) {
        return zzW(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzac));
    }

    public final boolean zzh(String str) {
        return zzW(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzad));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzi(Context context) {
        if (this.zzh) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbbm.zza(context);
        zzo zzoVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjA)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, zzoVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, zzoVar), intentFilter, 4);
        }
        this.zzh = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzj(Context context) {
        if (this.zzg) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbbm.zza(context);
        zzq zzqVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjA)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this, zzqVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this, zzqVar), intentFilter, 4);
        }
        this.zzg = true;
        return true;
    }

    public final int zzk(Context context, Uri uri) {
        int i10;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i10 = 0;
        } else {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        }
        zzbbe zzbbeVar = zzbbm.zzen;
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar);
        zzbbe zzbbeVar2 = zzbbm.zzeo;
        if (true == bool.equals(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue()) {
            zzbcn zzbcnVar = new zzbcn();
            zzbcnVar.zze(new zzn(this, zzbcnVar, context, uri));
            zzbcnVar.zzb((Activity) context);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar2)).booleanValue()) {
            return 5;
        }
        n.j jVarA = new n.j.a().a();
        jVarA.f33567a.setPackage(zzgws.zza(context));
        jVarA.f33567a.setData(uri);
        Intent intent2 = jVarA.f33567a;
        Object obj = a.f28964a;
        a.C0247a.b(context, intent2, null);
        return 5;
    }
}
