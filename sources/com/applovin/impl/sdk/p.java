package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.classic.joran.action.ConfigurationAction;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2Stream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicReference<com.applovin.impl.sdk.utils.d.a> f11039h = new AtomicReference<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicReference<a> f11040j = new AtomicReference<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f11041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f11042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f11043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f11044d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, Object> f11046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11047g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f11045e = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference<Integer> f11048i = new AtomicReference<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11052b;

        public a(String str, int i10) {
            this.f11051a = str;
            this.f11052b = i10;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11053a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11054b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f11055c = null;
    }

    public p(o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f11041a = oVar;
        this.f11042b = oVar.F();
        this.f11043c = o.au();
        this.f11044d = q();
        this.f11046f = s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer A() {
        AudioManager audioManager = (AudioManager) this.f11043c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        try {
            return Integer.valueOf((int) (audioManager.getStreamVolume(3) * ((Float) this.f11041a.a(com.applovin.impl.sdk.c.b.eB)).floatValue()));
        } catch (Throwable th) {
            this.f11041a.F();
            if (y.a()) {
                this.f11041a.F().b("DataCollector", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    private Boolean B() {
        AudioManager audioManager = (AudioManager) this.f11043c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean C() {
        AudioManager audioManager = (AudioManager) this.f11043c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private double D() {
        return Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d) / 10.0d;
    }

    private boolean E() {
        SensorManager sensorManager = (SensorManager) this.f11043c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private String F() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f11043c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String G() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f11043c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!y.a()) {
                return "";
            }
            this.f11042b.b("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private String H() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f11043c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!y.a()) {
                return "";
            }
            this.f11042b.b("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    private String I() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f11043c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!y.a()) {
                return "";
            }
            this.f11042b.b("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private boolean J() {
        try {
            return K() || L();
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean K() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    private boolean L() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(c(strArr[i10])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    private Map<String, Object> a(Map<String, Object> map, boolean z10) {
        com.applovin.impl.sdk.utils.d.a aVarL;
        PowerManager powerManager;
        Map<String, Object> map2 = CollectionUtils.map(map);
        Point pointA = com.applovin.impl.sdk.utils.h.a(this.f11043c);
        map2.put("dx", Integer.valueOf(pointA.x));
        map2.put("dy", Integer.valueOf(pointA.y));
        if (z10) {
            aVarL = f11039h.get();
            if (aVarL != null) {
                n();
            } else if (com.applovin.impl.sdk.utils.w.b()) {
                aVarL = new com.applovin.impl.sdk.utils.d.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarL = this.f11041a.K().l();
            }
        } else {
            aVarL = this.f11041a.K().l();
        }
        String strB = aVarL.b();
        if (StringUtils.isValidString(strB)) {
            map2.put("idfa", strB);
        }
        map2.put("dnt", Boolean.valueOf(aVarL.a()));
        map2.put("dnt_code", aVarL.c().a());
        a aVar = f11040j.get();
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.f10366ed)).booleanValue() && aVar != null) {
            map2.put("idfv", aVar.f11051a);
            map2.put("idfv_scope", Integer.valueOf(aVar.f11052b));
        }
        Object objA = com.applovin.impl.b.a.b().a(this.f11043c);
        if (objA != null) {
            map2.put(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, objA);
        }
        Object objA2 = com.applovin.impl.b.a.a().a(this.f11043c);
        if (objA2 != null) {
            map2.put(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, objA2);
        }
        Object objA3 = com.applovin.impl.b.a.c().a(this.f11043c);
        if (objA3 != null) {
            map2.put(AppLovinSdkExtraParameterKey.DO_NOT_SELL, objA3);
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()) {
            b bVarV = v();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(bVarV.f11053a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(bVarV.f11054b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", bVarV.f11055c, map2);
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.ex)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f11041a.U().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(J()));
        }
        Object objA4 = z10 ? (Integer) this.f11048i.get() : A();
        if (objA4 != null) {
            map2.put("volume", objA4);
        }
        CollectionUtils.putBooleanIfValid("ma", B(), map2);
        CollectionUtils.putBooleanIfValid("spo", C(), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f11043c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e10) {
            if (y.a()) {
                this.f11042b.b("DataCollector", "Unable to collect screen brightness", e10);
            }
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eD)).booleanValue() && com.applovin.impl.sdk.utils.w.d(this.f11041a)) {
            af.b(this.f11041a);
            String strA = af.a();
            if (StringUtils.isValidString(strA)) {
                map2.put("ua", strA);
            }
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.er)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (y.a()) {
                    this.f11042b.b("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.es)).booleanValue()) {
            ActivityManager activityManager = (ActivityManager) this.f11043c.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                try {
                    activityManager.getMemoryInfo(memoryInfo);
                    map2.put("fm", Long.valueOf(memoryInfo.availMem));
                    map2.put("tm", Long.valueOf(memoryInfo.totalMem));
                    map2.put("lmt", Long.valueOf(memoryInfo.threshold));
                    map2.put("lm", Boolean.valueOf(memoryInfo.lowMemory));
                } catch (Throwable th2) {
                    map2.put("fm", -1);
                    map2.put("tm", -1);
                    map2.put("lmt", -1);
                    if (y.a()) {
                        this.f11042b.b("DataCollector", "Unable to collect memory info.", th2);
                    }
                }
            }
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.et)).booleanValue() && com.applovin.impl.sdk.utils.h.a("android.permission.READ_PHONE_STATE", this.f11043c) && com.applovin.impl.sdk.utils.h.f()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f11043c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eq)).booleanValue()) {
            String strY = y();
            if (!TextUtils.isEmpty(strY)) {
                map2.put("so", strY);
            }
        }
        map2.put("orientation_lock", r());
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eu)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(com.applovin.impl.sdk.utils.w.d()));
        }
        if (com.applovin.impl.sdk.utils.h.d() && (powerManager = (PowerManager) this.f11043c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eE)).booleanValue() && this.f11041a.Y() != null) {
            map2.put("da", Float.valueOf(this.f11041a.Y().c()));
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eF)).booleanValue() && this.f11041a.Y() != null) {
            map2.put("dm", Float.valueOf(this.f11041a.Y().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f11041a.Z().a()));
        map2.put("network", com.applovin.impl.sdk.utils.i.f(this.f11041a));
        String strZ = z();
        if (StringUtils.isValidString(strZ)) {
            map2.put("kb", strZ);
        }
        ArrayService arrayServiceAf = this.f11041a.af();
        if (arrayServiceAf.isAppHubInstalled()) {
            if (arrayServiceAf.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", arrayServiceAf.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", Long.valueOf(arrayServiceAf.getAppHubVersionCode()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceAf.getRandomUserToken()));
            map2.put("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceAf.getAppHubPackageName()));
        }
        return map2;
    }

    public static void a(a aVar) {
        f11040j.set(aVar);
    }

    public static void a(com.applovin.impl.sdk.utils.d.a aVar) {
        f11039h.set(aVar);
    }

    private void a(Map<String, Object> map) {
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.ev)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(w()));
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.ew)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(x()));
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eD)).booleanValue() && com.applovin.impl.sdk.utils.w.d(this.f11041a)) {
            af.b(this.f11041a);
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eC)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (!((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.ey)).booleanValue() || map.containsKey("network_restricted")) {
            return;
        }
        map.put("network_restricted", Boolean.valueOf(u()));
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f11043c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
            for (int i11 = 9; i11 >= 0; i11--) {
                cArr[i10] = (char) (cArr[i10] ^ iArr[i11]);
            }
        }
        return new String(cArr);
    }

    private Map<String, String> p() {
        return com.applovin.impl.sdk.utils.w.a(a(null, true, false));
    }

    private Map<String, Object> q() {
        HashMap map = new HashMap(34);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(com.applovin.impl.sdk.utils.d.a()));
        map.put("locale", Locale.getDefault().toString());
        map.put("model", Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put("platform", f());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(D()));
        map.put("gy", Boolean.valueOf(E()));
        map.put("country_code", F());
        map.put("mcc", G());
        map.put("mnc", H());
        map.put("carrier", I());
        map.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f11043c)));
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f11043c)));
        map.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        DisplayMetrics displayMetrics = this.f11043c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point pointA = com.applovin.impl.sdk.utils.h.a(this.f11043c);
            map.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointA.y, 2.0d) + Math.pow(pointA.x, 2.0d)) / ((double) displayMetrics.xdpi)));
            com.applovin.impl.sdk.utils.h.a aVarA = com.applovin.impl.sdk.utils.h.a(this.f11043c, this.f11041a);
            if (aVarA != null) {
                map.put("tl_cr", Integer.valueOf(aVarA.a()));
                map.put("tr_cr", Integer.valueOf(aVarA.b()));
                map.put("bl_cr", Integer.valueOf(aVarA.c()));
                map.put("br_cr", Integer.valueOf(aVarA.d()));
            }
        }
        map.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        a(map);
        return map;
    }

    private String r() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f11043c);
        if (orientation == 1) {
            return "portrait";
        }
        return orientation == 2 ? "landscape" : "none";
    }

    private Map<String, Object> s() {
        PackageInfo packageInfo;
        HashMap map = new HashMap();
        PackageManager packageManager = this.f11043c.getPackageManager();
        ApplicationInfo applicationInfo = this.f11043c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        String installerPackageName = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f11043c.getPackageName(), 0);
            try {
                installerPackageName = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        map.put("package_name", applicationInfo.packageName);
        map.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (installerPackageName == null) {
            installerPackageName = "";
        }
        map.put("installer_name", installerPackageName);
        map.put("tg", com.applovin.impl.sdk.utils.v.a(this.f11041a));
        map.put(ConfigurationAction.INTERNAL_DEBUG_ATTR, Boolean.valueOf(com.applovin.impl.sdk.utils.w.a(o.au(), this.f11041a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(o.av()));
        map.put("j8", Boolean.valueOf(o.aw()));
        o oVar = this.f11041a;
        com.applovin.impl.sdk.c.d<Long> dVar = com.applovin.impl.sdk.c.d.f10389g;
        Long l10 = (Long) oVar.a(dVar);
        if (l10 != null) {
            map.put("ia_v2", l10);
        } else {
            this.f11041a.a(dVar, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f11041a.ad().c());
        map.put("api_did", this.f11041a.a(com.applovin.impl.sdk.c.b.f10344ad));
        map.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        map.put("epv", Integer.valueOf(com.applovin.impl.sdk.utils.w.g()));
        return map;
    }

    private Map<String, Object> t() {
        HashMap map = new HashMap();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f11043c);
        String str = (String) this.f11041a.b(com.applovin.impl.sdk.c.d.f10406x, null, defaultSharedPreferences);
        if (StringUtils.isValidString(str)) {
            map.put("IABTCF_TCString", str);
        }
        String strA = com.applovin.impl.sdk.c.d.f10407y.a();
        if (defaultSharedPreferences.contains(strA)) {
            String str2 = (String) com.applovin.impl.sdk.c.e.a(strA, "", String.class, defaultSharedPreferences, false);
            Integer num = (Integer) com.applovin.impl.sdk.c.e.a(strA, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences, false);
            Long l10 = (Long) com.applovin.impl.sdk.c.e.a(strA, Long.valueOf(RecyclerView.FOREVER_NS), Long.class, defaultSharedPreferences, false);
            Boolean bool = (Boolean) com.applovin.impl.sdk.c.e.a(strA, Boolean.FALSE, Boolean.class, defaultSharedPreferences, false);
            if (StringUtils.isValidString(str2)) {
                map.put("IABTCF_gdprApplies", str2);
            } else if (num != null && num.intValue() != Integer.MAX_VALUE) {
                map.put("IABTCF_gdprApplies", num);
            } else if (l10 == null || l10.longValue() == RecyclerView.FOREVER_NS) {
                map.put("IABTCF_gdprApplies", bool);
            } else {
                map.put("IABTCF_gdprApplies", l10);
            }
        }
        String str3 = (String) this.f11041a.b(com.applovin.impl.sdk.c.d.f10408z, null, defaultSharedPreferences);
        if (StringUtils.isValidString(str3)) {
            map.put("IABTCF_AddtlConsent", str3);
        }
        return map;
    }

    private boolean u() {
        ConnectivityManager connectivityManager;
        if (com.applovin.impl.sdk.utils.h.f() && (connectivityManager = (ConnectivityManager) this.f11043c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.f11041a.F();
                if (y.a()) {
                    this.f11041a.F().b("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private b v() {
        b bVar = new b();
        Intent intentRegisterReceiver = this.f11043c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            bVar.f11054b = -1;
        } else {
            bVar.f11054b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        bVar.f11053a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        boolean z10 = false;
        if (!com.applovin.impl.sdk.utils.h.b() ? ((intentRegisterReceiver.getIntExtra("plugged", -1) & 1) | 2 | 4 | 8) > 0 : Settings.Global.getInt(this.f11043c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0) {
            z10 = true;
        }
        bVar.f11055c = Boolean.valueOf(z10);
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x01aa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:112:0x01c1, please report this as an issue */
    private long w() {
        long j10;
        int iB;
        int iB2;
        int iB3;
        long j11;
        long j12;
        long j13;
        List listAsList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.f11043c.getContentResolver(), "enabled_accessibility_services")).split(":"));
        long j14 = listAsList.contains("AccessibilityMenuService") ? 256L : 0L;
        if (listAsList.contains("SelectToSpeakService")) {
            j14 |= 512;
        }
        if (listAsList.contains("SoundAmplifierService")) {
            j14 |= 2;
        }
        if (listAsList.contains("SpeechToTextAccessibilityService")) {
            j14 |= 128;
        }
        if (listAsList.contains("SwitchAccessService")) {
            j14 |= 4;
        }
        if ((this.f11043c.getResources().getConfiguration().uiMode & 48) == 32) {
            j14 |= 1024;
        }
        if (a("accessibility_enabled")) {
            j14 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j14 |= 16;
        }
        if (com.applovin.impl.sdk.utils.h.d()) {
            if (a("accessibility_display_inversion_enabled")) {
                j14 |= 32;
            }
            if (a("skip_first_use_hints")) {
                j14 |= 64;
            }
        }
        if (a("lock_screen_allow_remote_input")) {
            j14 |= 2048;
        }
        if (a("enabled_accessibility_audio_description_by_default")) {
            j14 |= 4096;
        }
        if (a("accessibility_shortcut_on_lock_screen")) {
            j14 |= FileAppender.DEFAULT_BUFFER_SIZE;
        }
        if (a("wear_talkback_enabled")) {
            j14 |= Http2Stream.EMIT_BUFFER_SIZE;
        }
        if (a("hush_gesture_used")) {
            j14 |= 32768;
        }
        if (a("high_text_contrast_enabled")) {
            j14 |= 65536;
        }
        if (a("accessibility_display_magnification_enabled")) {
            j14 |= 131072;
        }
        if (a("accessibility_display_magnification_navbar_enabled")) {
            j14 |= 262144;
        }
        if (a("accessibility_captioning_enabled")) {
            j14 |= 524288;
        }
        if (a("accessibility_display_daltonizer_enabled")) {
            j14 |= FileSize.MB_COEFFICIENT;
        }
        if (a("accessibility_autoclick_enabled")) {
            j14 |= 2097152;
        }
        if (a("accessibility_large_pointer_icon")) {
            j14 |= 4194304;
        }
        if (a("reduce_bright_colors_activated")) {
            j14 |= 8388608;
        }
        if (a("reduce_bright_colors_persist_across_reboots")) {
            j14 |= 16777216;
        }
        if (a("tty_mode_enabled")) {
            j14 |= 33554432;
        }
        if (a("rtt_calling_mode")) {
            j14 |= 67108864;
        }
        if (a("accessibility_floating_menu_fade_enabled")) {
            j14 |= 134217728;
        }
        if (a("accessibility_show_window_magnification_prompt")) {
            j14 |= 268435456;
        }
        if (a("accessibility_floating_menu_migration_tooltip_prompt")) {
            j14 |= 536870912;
        }
        int iB4 = b("accessibility_magnification_mode");
        if (iB4 == 0) {
            j10 = FileSize.GB_COEFFICIENT;
        } else if (iB4 == 1) {
            j10 = 2147483648L;
        } else {
            if (iB4 != 2) {
                if (iB4 == 3) {
                    j10 = 8589934592L;
                }
                iB = b("accessibility_button_mode");
                if (iB == 0) {
                    j13 = iB == 1 ? 34359738368L : 17179869184L;
                    iB2 = b("accessibility_floating_menu_size");
                    if (iB2 == 0) {
                        j12 = iB2 == 1 ? 137438953472L : 68719476736L;
                        iB3 = b("accessibility_floating_menu_icon_type");
                        if (iB3 == 0) {
                            j11 = 274877906944L;
                        } else {
                            if (iB3 == 1) {
                                return j14;
                            }
                            j11 = 549755813888L;
                        }
                        return j14 | j11;
                    }
                    j14 |= j12;
                    iB3 = b("accessibility_floating_menu_icon_type");
                    if (iB3 == 0) {
                        j11 = 274877906944L;
                    } else {
                        if (iB3 == 1) {
                            return j14;
                        }
                        j11 = 549755813888L;
                    }
                    return j14 | j11;
                }
                j14 |= j13;
                iB2 = b("accessibility_floating_menu_size");
                if (iB2 == 0) {
                    if (iB2 == 1) {
                    }
                    iB3 = b("accessibility_floating_menu_icon_type");
                    if (iB3 == 0) {
                        j11 = 274877906944L;
                    } else {
                        if (iB3 == 1) {
                            return j14;
                        }
                        j11 = 549755813888L;
                    }
                    return j14 | j11;
                }
                j14 |= j12;
                iB3 = b("accessibility_floating_menu_icon_type");
                if (iB3 == 0) {
                    j11 = 274877906944L;
                } else {
                    if (iB3 == 1) {
                        return j14;
                    }
                    j11 = 549755813888L;
                }
                return j14 | j11;
            }
            j10 = 4294967296L;
        }
        j14 |= j10;
        iB = b("accessibility_button_mode");
        if (iB == 0) {
            if (iB == 1) {
            }
            iB2 = b("accessibility_floating_menu_size");
            if (iB2 == 0) {
                if (iB2 == 1) {
                }
                iB3 = b("accessibility_floating_menu_icon_type");
                if (iB3 == 0) {
                    j11 = 274877906944L;
                } else {
                    if (iB3 == 1) {
                        return j14;
                    }
                    j11 = 549755813888L;
                }
                return j14 | j11;
            }
            j14 |= j12;
            iB3 = b("accessibility_floating_menu_icon_type");
            if (iB3 == 0) {
                j11 = 274877906944L;
            } else {
                if (iB3 == 1) {
                    return j14;
                }
                j11 = 549755813888L;
            }
            return j14 | j11;
        }
        j14 |= j13;
        iB2 = b("accessibility_floating_menu_size");
        if (iB2 == 0) {
            if (iB2 == 1) {
            }
            iB3 = b("accessibility_floating_menu_icon_type");
            if (iB3 == 0) {
                j11 = 274877906944L;
            } else {
                if (iB3 == 1) {
                    return j14;
                }
                j11 = 549755813888L;
            }
            return j14 | j11;
        }
        j14 |= j12;
        iB3 = b("accessibility_floating_menu_icon_type");
        if (iB3 == 0) {
            j11 = 274877906944L;
        } else {
            if (iB3 == 1) {
                return j14;
            }
            j11 = 549755813888L;
        }
        return j14 | j11;
    }

    private float x() {
        try {
            return Settings.System.getFloat(this.f11043c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e10) {
            if (!y.a()) {
                return -1.0f;
            }
            this.f11042b.b("DataCollector", "Error collecting font scale", e10);
            return -1.0f;
        }
    }

    private String y() {
        AudioManager audioManager = (AudioManager) this.f11043c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (com.applovin.impl.sdk.utils.h.e()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb2.append(audioDeviceInfo.getType());
                sb2.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb2.append(3);
                sb2.append(",");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb2.append(7);
                sb2.append(",");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb2.append(8);
            }
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string) && y.a()) {
            this.f11042b.b("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    private String z() {
        if (!com.applovin.impl.sdk.utils.h.f()) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            LocaleList locales = this.f11043c.getResources().getConfiguration().getLocales();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String a() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(p()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.fz)).booleanValue() ? com.applovin.impl.sdk.utils.r.a(strEncodeToString, com.applovin.impl.sdk.utils.w.a(this.f11041a), com.applovin.impl.sdk.utils.r.a.a(((Integer) this.f11041a.a(com.applovin.impl.sdk.c.b.fA)).intValue()), this.f11041a.ax(), this.f11041a) : strEncodeToString;
    }

    public Map<String, Object> a(Map<String, String> map, boolean z10, boolean z11) {
        HashMap map2 = new HashMap(64);
        Map<String, Object> mapA = a(z10);
        Map<String, Object> mapH = h();
        Map<String, Object> mapJ = j();
        Map<String, Object> mapK = k();
        Map<String, String> allData = this.f11041a.t().getAllData();
        if (z11) {
            map2.put("device_info", mapA);
            map2.put("app_info", mapH);
            if (mapJ != null) {
                map2.put("connection_info", mapJ);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (mapK != null) {
                map2.put("location_info", mapK);
            }
            if (!allData.isEmpty()) {
                map2.put("targeting_data", allData);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapH);
            if (mapJ != null) {
                map2.putAll(mapJ);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (mapK != null) {
                map2.putAll(mapK);
            }
            if (!allData.isEmpty()) {
                map2.putAll(allData);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f11041a.u(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f11041a.aC(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f11041a.a(com.applovin.impl.sdk.c.b.eo), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f11041a.p()), map2);
        if (!((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f11041a.ax());
        }
        map2.putAll(i());
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            com.applovin.impl.sdk.d.g gVarJ = this.f11041a.J();
            map2.put("li", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10464b)));
            map2.put("si", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10467e)));
            map2.put("mad", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10465c)));
            map2.put("msad", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10468f)));
            map2.put("pf", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10472j)));
            map2.put("mpf", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10479q)));
            map2.put("gpf", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10473k)));
            map2.put("asoac", Long.valueOf(gVarJ.b(com.applovin.impl.sdk.d.f.f10477o)));
        }
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    public Map<String, Object> a(boolean z10) {
        Map<String, Object> map;
        synchronized (this.f11045e) {
            map = CollectionUtils.map(this.f11044d);
        }
        return a(map, z10);
    }

    public Map<String, Object> b() {
        return CollectionUtils.map(this.f11044d);
    }

    public Map<String, Object> c() {
        return CollectionUtils.map(this.f11046f);
    }

    public Map<String, Object> d() {
        return a(false);
    }

    public void e() {
        synchronized (this.f11045e) {
            a(this.f11044d);
        }
    }

    public String f() {
        return AppLovinSdkUtils.isFireOS(this.f11043c) ? "fireos" : "android";
    }

    public boolean g() {
        return this.f11047g;
    }

    public Map<String, Object> h() {
        Map<String, Object> map = CollectionUtils.map(this.f11046f);
        map.put("first_install", Boolean.valueOf(this.f11041a.aB()));
        map.put("first_install_v2", Boolean.valueOf(!this.f11041a.C()));
        map.put("test_ads", Boolean.valueOf(this.f11047g));
        map.put("muted", Boolean.valueOf(this.f11041a.ay().isMuted()));
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.f10367ee)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f11041a.q(), map);
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eh)).booleanValue()) {
            map.put("compass_random_token", this.f11041a.r());
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.ej)).booleanValue()) {
            map.put("applovin_random_token", this.f11041a.s());
        }
        String name = this.f11041a.az().getName();
        if (StringUtils.isValidString(name)) {
            map.put("user_segment_name", name);
        }
        map.putAll(t());
        return map;
    }

    public Map<String, Object> i() {
        HashMap map = new HashMap();
        map.put("sc", this.f11041a.a(com.applovin.impl.sdk.c.b.aj));
        map.put("sc2", this.f11041a.a(com.applovin.impl.sdk.c.b.ak));
        map.put("sc3", this.f11041a.a(com.applovin.impl.sdk.c.b.al));
        map.put("server_installed_at", this.f11041a.a(com.applovin.impl.sdk.c.b.am));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f11041a.a(com.applovin.impl.sdk.c.d.N), map);
        return map;
    }

    public Map<String, Object> j() {
        com.applovin.impl.sdk.network.b.c cVarA = this.f11041a.I().a();
        if (cVarA == null) {
            return null;
        }
        HashMap map = new HashMap(4);
        map.put("lrm_ts_ms", String.valueOf(cVarA.a()));
        map.put("lrm_url", cVarA.b());
        map.put("lrm_ct_ms", String.valueOf(cVarA.d()));
        map.put("lrm_rs", String.valueOf(cVarA.c()));
        return map;
    }

    public Map<String, Object> k() {
        if (!this.f11041a.ay().isLocationCollectionEnabled() || !((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.eU)).booleanValue()) {
            return null;
        }
        HashMap map = new HashMap();
        x xVarAe = this.f11041a.ae();
        boolean zB = xVarAe.b();
        map.put("loc_services_enabled", Boolean.valueOf(zB));
        if (!zB) {
            return map;
        }
        map.put("loc_auth", Boolean.valueOf(xVarAe.a()));
        if (xVarAe.c()) {
            double d10 = xVarAe.d();
            o oVar = this.f11041a;
            com.applovin.impl.sdk.c.b<Integer> bVar = com.applovin.impl.sdk.c.b.eW;
            map.put("loc_lat", com.applovin.impl.sdk.utils.w.a(d10, ((Integer) oVar.a(bVar)).intValue()));
            map.put("loc_long", com.applovin.impl.sdk.utils.w.a(xVarAe.e(), ((Integer) this.f11041a.a(bVar)).intValue()));
        }
        return map;
    }

    public com.applovin.impl.sdk.utils.d.a l() {
        List<String> testDeviceAdvertisingIds;
        com.applovin.impl.sdk.utils.d.a aVarA = com.applovin.impl.sdk.utils.d.a(this.f11043c);
        if (aVarA == null) {
            return new com.applovin.impl.sdk.utils.d.a();
        }
        if (((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.f10365ec)).booleanValue()) {
            if (aVarA.a() && !((Boolean) this.f11041a.a(com.applovin.impl.sdk.c.b.f10364eb)).booleanValue()) {
                aVarA.a("");
            }
            f11039h.set(aVarA);
        } else {
            aVarA = new com.applovin.impl.sdk.utils.d.a();
        }
        boolean z10 = false;
        if (StringUtils.isValidString(aVarA.b()) && (testDeviceAdvertisingIds = this.f11041a.ay().getTestDeviceAdvertisingIds()) != null && testDeviceAdvertisingIds.contains(aVarA.b())) {
            z10 = true;
        }
        this.f11047g = z10;
        return aVarA;
    }

    public a m() {
        return f11040j.get();
    }

    public void n() {
        this.f11041a.G().a(new com.applovin.impl.sdk.e.i(this.f11041a, new com.applovin.impl.sdk.e.i.a() { // from class: com.applovin.impl.sdk.p.1
            @Override // com.applovin.impl.sdk.e.i.a
            public void a(com.applovin.impl.sdk.utils.d.a aVar) {
                p.f11039h.set(aVar);
            }
        }), com.applovin.impl.sdk.e.r.b.ADVERTISING_INFO_COLLECTION);
        this.f11041a.G().a(new com.applovin.impl.sdk.e.ac(this.f11041a, true, "setDeviceVolume", new Runnable() { // from class: com.applovin.impl.sdk.p.2
            @Override // java.lang.Runnable
            public void run() {
                p.this.f11048i.set(p.this.A());
            }
        }), com.applovin.impl.sdk.e.r.b.CACHING_OTHER);
    }
}
