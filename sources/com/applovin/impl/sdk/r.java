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
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes.dex */
public class r {
    private static final AtomicReference<com.applovin.impl.sdk.utils.d.a> E = new AtomicReference<>();
    private static final AtomicReference<b> F = new AtomicReference<>();
    private static final AtomicReference<Integer> G = new AtomicReference<>();
    private final int A;
    private final int B;
    private final o C;
    private final Context D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f11063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f11064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f11065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f11066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f11067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f11068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f11069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f11070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double f11071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f11072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f11073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f11074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f11075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g f11076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f11077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private e f11078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f11079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private e f11080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f11081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e f11082t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e f11083u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e f11084v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f11085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f11086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f11087y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f11088z;

    public class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f11092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f11093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f11094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f11095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f11096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Long f11097g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f11098h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f11099i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f11100j;

        private a() {
            PackageManager packageManager = r.this.D.getPackageManager();
            ApplicationInfo applicationInfo = r.this.D.getApplicationInfo();
            File file = new File(applicationInfo.sourceDir);
            PackageInfo packageInfo = packageManager.getPackageInfo(r.this.D.getPackageName(), 0);
            this.f11092b = packageManager.getApplicationLabel(applicationInfo).toString();
            this.f11093c = packageInfo.versionName;
            this.f11099i = packageInfo.versionCode;
            String str = applicationInfo.packageName;
            this.f11094d = str;
            this.f11095e = StringUtils.toShortSHA1Hash(str);
            this.f11098h = file.lastModified();
            this.f11097g = Long.valueOf(packageInfo.firstInstallTime);
            this.f11100j = applicationInfo.targetSdkVersion;
            this.f11096f = packageManager.getInstallerPackageName(str);
        }

        public Long a() {
            o oVar = r.this.C;
            com.applovin.impl.sdk.c.d<Long> dVar = com.applovin.impl.sdk.c.d.f10389g;
            Long l10 = (Long) oVar.a(dVar);
            if (l10 != null) {
                return l10;
            }
            r.this.C.a(dVar, Long.valueOf(this.f11098h));
            return null;
        }

        public String b() {
            return this.f11092b;
        }

        public String c() {
            return this.f11093c;
        }

        public String d() {
            return this.f11094d;
        }

        public String e() {
            return this.f11095e;
        }

        public String f() {
            return this.f11096f;
        }

        public Long g() {
            return this.f11097g;
        }

        public long h() {
            return this.f11098h;
        }

        public int i() {
            return this.f11099i;
        }

        public int j() {
            return this.f11100j;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11102b;

        public b(String str, int i10) {
            this.f11101a = str;
            this.f11102b = i10;
        }

        public String a() {
            return this.f11101a;
        }

        public int b() {
            return this.f11102b;
        }
    }

    public class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f11104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f11105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f11106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f11107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private e f11108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AudioManager f11109g;

        private c() {
            this.f11109g = (AudioManager) r.this.D.getSystemService("audio");
        }

        public int a() {
            e eVar;
            e eVar2 = this.f11106d;
            if (eVar2 == null || eVar2.a()) {
                r rVar = r.this;
                eVar = new e(Integer.valueOf(rVar.C.Z().a()), r.this.f11087y);
                this.f11106d = eVar;
            } else {
                eVar = this.f11106d;
            }
            return ((Integer) eVar.f11117b).intValue();
        }

        public Integer b() {
            e eVar = this.f11104b;
            if (eVar != null && !eVar.a()) {
                return Integer.valueOf(((Integer) this.f11104b.f11117b).intValue());
            }
            if (this.f11109g == null) {
                return null;
            }
            try {
                e eVar2 = new e(Integer.valueOf((int) (this.f11109g.getStreamVolume(3) * ((Float) r.this.C.a(com.applovin.impl.sdk.c.b.eB)).floatValue())), r.this.f11086x);
                this.f11104b = eVar2;
                return Integer.valueOf(((Integer) eVar2.f11117b).intValue());
            } catch (Throwable th) {
                r.this.C.F();
                if (y.a()) {
                    r.this.C.F().b("DataProvider", "Unable to collect device volume", th);
                }
                return null;
            }
        }

        public String c() {
            e eVar;
            e eVar2 = this.f11105c;
            if (eVar2 == null || eVar2.a()) {
                if (this.f11109g == null) {
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                if (com.applovin.impl.sdk.utils.h.e()) {
                    for (AudioDeviceInfo audioDeviceInfo : this.f11109g.getDevices(2)) {
                        sb2.append(audioDeviceInfo.getType());
                        sb2.append(",");
                    }
                } else {
                    if (this.f11109g.isWiredHeadsetOn()) {
                        sb2.append(3);
                        sb2.append(",");
                    }
                    if (this.f11109g.isBluetoothScoOn()) {
                        sb2.append(7);
                        sb2.append(",");
                    }
                    if (this.f11109g.isBluetoothA2dpOn()) {
                        sb2.append(8);
                    }
                }
                if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
                String string = sb2.toString();
                if (TextUtils.isEmpty(string)) {
                    r.this.C.F();
                    if (y.a()) {
                        r.this.C.F().b("DataProvider", "No sound outputs detected");
                    }
                }
                r rVar = r.this;
                eVar = new e(string, rVar.f11088z);
                this.f11105c = eVar;
            } else {
                eVar = this.f11105c;
            }
            return (String) eVar.f11117b;
        }

        public Boolean d() {
            Object obj;
            e eVar = this.f11107e;
            if (eVar == null || eVar.a()) {
                AudioManager audioManager = this.f11109g;
                if (audioManager == null) {
                    return null;
                }
                e eVar2 = new e(Boolean.valueOf(audioManager.isMusicActive()), r.this.f11088z);
                this.f11107e = eVar2;
                obj = eVar2.f11117b;
            } else {
                obj = this.f11107e.f11117b;
            }
            return Boolean.valueOf(((Boolean) obj).booleanValue());
        }

        public Boolean e() {
            Object obj;
            e eVar = this.f11108f;
            if (eVar == null || eVar.a()) {
                AudioManager audioManager = this.f11109g;
                if (audioManager == null) {
                    return null;
                }
                e eVar2 = new e(Boolean.valueOf(audioManager.isSpeakerphoneOn()), r.this.f11088z);
                this.f11108f = eVar2;
                obj = eVar2.f11117b;
            } else {
                obj = this.f11108f.f11117b;
            }
            return Boolean.valueOf(((Boolean) obj).booleanValue());
        }
    }

    public class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f11111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f11112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f11113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Intent f11114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private BatteryManager f11115f;

        private d() {
            this.f11114e = r.this.D.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (com.applovin.impl.sdk.utils.h.d()) {
                this.f11115f = (BatteryManager) r.this.D.getSystemService("batterymanager");
            }
        }

        public Integer a() {
            int intProperty;
            Object obj;
            BatteryManager batteryManager;
            e eVar = this.f11111b;
            if (eVar == null || eVar.a()) {
                if (!com.applovin.impl.sdk.utils.h.d() || (batteryManager = this.f11115f) == null) {
                    Intent intent = this.f11114e;
                    if (intent == null) {
                        return null;
                    }
                    int intExtra = intent.getIntExtra("level", -1);
                    int intExtra2 = this.f11114e.getIntExtra("scale", -1);
                    if (intExtra < 0 || intExtra2 < 0) {
                        return null;
                    }
                    intProperty = (int) ((intExtra / intExtra2) * 100.0f);
                } else {
                    intProperty = batteryManager.getIntProperty(4);
                }
                e eVar2 = new e(Integer.valueOf(intProperty), r.this.f11087y);
                this.f11111b = eVar2;
                obj = eVar2.f11117b;
            } else {
                obj = this.f11111b.f11117b;
            }
            return Integer.valueOf(((Integer) obj).intValue());
        }

        public Integer b() {
            int intExtra;
            Object obj;
            BatteryManager batteryManager;
            e eVar = this.f11112c;
            if (eVar == null || eVar.a()) {
                if (!com.applovin.impl.sdk.utils.h.g() || (batteryManager = this.f11115f) == null) {
                    Intent intent = this.f11114e;
                    if (intent == null || (intExtra = intent.getIntExtra("status", -1)) < 0) {
                        return null;
                    }
                } else {
                    intExtra = batteryManager.getIntProperty(6);
                }
                e eVar2 = new e(Integer.valueOf(intExtra), r.this.f11087y);
                this.f11112c = eVar2;
                obj = eVar2.f11117b;
            } else {
                obj = this.f11112c.f11117b;
            }
            return Integer.valueOf(((Integer) obj).intValue());
        }

        public Boolean c() {
            e eVar = this.f11113d;
            if (eVar == null || eVar.a()) {
                if (com.applovin.impl.sdk.utils.h.b()) {
                    this.f11113d = new e(Boolean.valueOf(Settings.Global.getInt(r.this.D.getContentResolver(), "stay_on_while_plugged_in", -1) > 0), r.this.f11087y);
                } else {
                    Intent intent = this.f11114e;
                    if (intent == null) {
                        return null;
                    }
                    this.f11113d = new e(Boolean.valueOf(((((intent.getIntExtra("plugged", -1) & 1) | 2) | 4) | 8) > 0), r.this.f11087y);
                }
            }
            return Boolean.valueOf(((Boolean) this.f11113d.f11117b).booleanValue());
        }
    }

    public class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f11117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f11118c;

        private e(Object obj, long j10) {
            this.f11117b = obj;
            this.f11118c = b() + j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return !((Boolean) r.this.C.a(com.applovin.impl.sdk.c.b.f10363ea)).booleanValue() || this.f11118c - b() <= 0;
        }

        private long b() {
            return System.currentTimeMillis() / 1000;
        }
    }

    public class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f11120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f11123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f11124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f11125g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private double f11126h;

        private f() {
            DisplayMetrics displayMetrics = r.this.D.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                return;
            }
            this.f11125g = displayMetrics.density;
            this.f11123e = displayMetrics.xdpi;
            this.f11124f = displayMetrics.ydpi;
            this.f11122d = displayMetrics.densityDpi;
            Point pointA = com.applovin.impl.sdk.utils.h.a(r.this.D);
            int i10 = pointA.x;
            this.f11120b = i10;
            this.f11121c = pointA.y;
            this.f11126h = Math.sqrt(Math.pow(this.f11121c, 2.0d) + Math.pow(i10, 2.0d)) / ((double) this.f11123e);
        }

        public int a() {
            return this.f11120b;
        }

        public int b() {
            return this.f11121c;
        }

        public int c() {
            return this.f11122d;
        }

        public float d() {
            return this.f11123e;
        }

        public float e() {
            return this.f11124f;
        }

        public float f() {
            return this.f11125g;
        }

        public double g() {
            return this.f11126h;
        }
    }

    public class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SharedPreferences f11128b;

        private g() {
            this.f11128b = PreferenceManager.getDefaultSharedPreferences(r.this.D);
        }

        public String a() {
            return (String) r.this.C.b(com.applovin.impl.sdk.c.d.f10406x, null, this.f11128b);
        }

        public Object b() {
            String strA = com.applovin.impl.sdk.c.d.f10407y.a();
            if (!this.f11128b.contains(strA)) {
                return null;
            }
            String str = (String) com.applovin.impl.sdk.c.e.a(strA, "", String.class, this.f11128b, false);
            Integer num = (Integer) com.applovin.impl.sdk.c.e.a(strA, Integer.MAX_VALUE, Integer.class, this.f11128b, false);
            Long l10 = (Long) com.applovin.impl.sdk.c.e.a(strA, Long.valueOf(RecyclerView.FOREVER_NS), Long.class, this.f11128b, false);
            Boolean bool = (Boolean) com.applovin.impl.sdk.c.e.a(strA, Boolean.FALSE, Boolean.class, this.f11128b, false);
            if (StringUtils.isValidString(str)) {
                return str;
            }
            if (num == null || num.intValue() == Integer.MAX_VALUE) {
                return (l10 == null || l10.longValue() == RecyclerView.FOREVER_NS) ? bool : l10;
            }
            return num;
        }

        public String c() {
            return (String) r.this.C.b(com.applovin.impl.sdk.c.d.f10408z, null, this.f11128b);
        }
    }

    public class h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f11130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f11131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f11132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f11133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ActivityManager f11134f;

        private h() {
            ActivityManager activityManager = (ActivityManager) r.this.D.getSystemService("activity");
            this.f11134f = activityManager;
            if (activityManager == null) {
                return;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                activityManager.getMemoryInfo(memoryInfo);
                this.f11130b = memoryInfo.totalMem;
            } catch (Throwable th) {
                r.this.C.F();
                if (y.a()) {
                    r.this.C.F().b("DataProvider", "Unable to collect memory info.", th);
                }
            }
        }

        public Long a() {
            e eVar = this.f11131c;
            if (eVar != null && !eVar.a()) {
                return Long.valueOf(((Long) this.f11131c.f11117b).longValue());
            }
            if (this.f11134f == null) {
                return null;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                this.f11134f.getMemoryInfo(memoryInfo);
                e eVar2 = new e(Long.valueOf(memoryInfo.availMem), r.this.f11085w);
                this.f11131c = eVar2;
                return Long.valueOf(((Long) eVar2.f11117b).longValue());
            } catch (Throwable th) {
                r.this.C.F();
                if (y.a()) {
                    r.this.C.F().b("DataProvider", "Unable to collect available memory.", th);
                }
                return null;
            }
        }

        public Long b() {
            e eVar = this.f11132d;
            if (eVar != null && !eVar.a()) {
                return Long.valueOf(((Long) this.f11132d.f11117b).longValue());
            }
            if (this.f11134f == null) {
                return null;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                this.f11134f.getMemoryInfo(memoryInfo);
                e eVar2 = new e(Long.valueOf(memoryInfo.threshold), r.this.f11085w);
                this.f11132d = eVar2;
                return Long.valueOf(((Long) eVar2.f11117b).longValue());
            } catch (Throwable th) {
                r.this.C.F();
                if (y.a()) {
                    r.this.C.F().b("DataProvider", "Unable to collect low memory threshold.", th);
                }
                return null;
            }
        }

        public Boolean c() {
            e eVar = this.f11133e;
            if (eVar != null && !eVar.a()) {
                return Boolean.valueOf(((Boolean) this.f11133e.f11117b).booleanValue());
            }
            if (this.f11134f == null) {
                return null;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                this.f11134f.getMemoryInfo(memoryInfo);
                e eVar2 = new e(Boolean.valueOf(memoryInfo.lowMemory), r.this.f11085w);
                this.f11133e = eVar2;
                return Boolean.valueOf(((Boolean) eVar2.f11117b).booleanValue());
            } catch (Throwable th) {
                r.this.C.F();
                if (y.a()) {
                    r.this.C.F().b("DataProvider", "Unable to collect has low memory.", th);
                }
                return null;
            }
        }

        public long d() {
            return this.f11130b;
        }
    }

    public class i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final PowerManager f11136b;

        private i() {
            this.f11136b = (PowerManager) r.this.D.getSystemService("power");
        }

        public Integer a() {
            if (r.this.f11078p == null || r.this.f11078p.a()) {
                if (this.f11136b == null || !com.applovin.impl.sdk.utils.h.d()) {
                    return null;
                }
                r rVar = r.this;
                rVar.f11078p = new e(Integer.valueOf(this.f11136b.isPowerSaveMode() ? 1 : 0), r.this.f11087y);
            }
            return Integer.valueOf(((Integer) r.this.f11078p.f11117b).intValue());
        }
    }

    public class j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TelephonyManager f11138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f11139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f11140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f11141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f11142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f11143g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private e f11144h;

        private j() {
            TelephonyManager telephonyManager = (TelephonyManager) r.this.D.getSystemService("phone");
            this.f11138b = telephonyManager;
            if (telephonyManager == null) {
                return;
            }
            this.f11140d = telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
            try {
                this.f11141e = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                r.this.C.F();
                if (y.a()) {
                    r.this.C.F().b("DataProvider", "Unable to collect carrier", th);
                }
            }
            try {
                this.f11139c = this.f11138b.getNetworkOperator();
            } catch (Throwable th2) {
                r.this.C.F();
                if (y.a()) {
                    r.this.C.F().b("DataProvider", "Unable to collect get network operator", th2);
                }
            }
            String str = this.f11139c;
            if (str == null) {
                return;
            }
            int iMin = Math.min(3, str.length());
            this.f11142f = this.f11139c.substring(0, iMin);
            this.f11143g = this.f11139c.substring(iMin);
        }

        public Integer a() {
            Object obj;
            e eVar = this.f11144h;
            if (eVar != null && !eVar.a()) {
                obj = this.f11144h.f11117b;
            } else {
                if (!com.applovin.impl.sdk.utils.h.a("android.permission.READ_PHONE_STATE", r.this.D) || this.f11138b == null || !com.applovin.impl.sdk.utils.h.f()) {
                    return null;
                }
                e eVar2 = new e(Integer.valueOf(this.f11138b.getDataNetworkType()), r.this.B);
                this.f11144h = eVar2;
                obj = eVar2.f11117b;
            }
            return Integer.valueOf(((Integer) obj).intValue());
        }

        public String b() {
            return this.f11140d;
        }

        public String c() {
            return this.f11141e;
        }

        public String d() {
            return this.f11142f;
        }

        public String e() {
            return this.f11143g;
        }
    }

    public r(o oVar) {
        this.C = oVar;
        Context contextAu = o.au();
        this.D = contextAu;
        this.f11085w = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.eO)).intValue();
        this.f11086x = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.eP)).intValue();
        this.f11087y = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.eQ)).intValue();
        this.f11088z = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.eR)).intValue();
        this.A = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.eS)).intValue();
        this.B = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.eT)).intValue();
        this.f11063a = new i();
        this.f11064b = new j();
        this.f11065c = new c();
        this.f11066d = new d();
        this.f11067e = new f();
        this.f11068f = new h();
        this.f11069g = AppLovinSdkUtils.isFireOS(contextAu) ? "fireos" : "android";
        int orientation = AppLovinSdkUtils.getOrientation(contextAu);
        this.f11070h = orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
        this.f11071i = Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d) / 10.0d;
        SensorManager sensorManager = (SensorManager) contextAu.getSystemService("sensor");
        this.f11072j = (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
        if (com.applovin.impl.sdk.utils.h.f()) {
            LocaleList locales = contextAu.getResources().getConfiguration().getLocales();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            this.f11073k = sb2.toString();
        }
        try {
            this.f11074l = Environment.getDataDirectory().getTotalSpace();
        } catch (Throwable th) {
            oVar.F();
            if (y.a()) {
                oVar.F().b("DataProvider", "Unable to collect total disk space.", th);
            }
        }
        this.f11076n = new g();
        this.f11075m = new a();
    }

    private boolean G() {
        String str = Build.TAGS;
        return str != null && str.contains(a("lz}$blpz"));
    }

    private boolean H() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(a(strArr[i10])).exists()) {
                return true;
            }
        }
        return false;
    }

    private String a(String str) {
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

    public static void a(b bVar) {
        F.set(bVar);
    }

    public static void a(com.applovin.impl.sdk.utils.d.a aVar) {
        E.set(aVar);
    }

    private boolean b(String str) {
        return c(str) == 1;
    }

    private int c(String str) {
        try {
            return Settings.Secure.getInt(this.D.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public long A() {
        return this.f11074l;
    }

    public a B() {
        return this.f11075m;
    }

    public g C() {
        return this.f11076n;
    }

    public boolean D() {
        return this.f11077o;
    }

    public b a() {
        return F.get();
    }

    public com.applovin.impl.sdk.utils.d.a b() {
        return E.get();
    }

    public Integer c() {
        return G.get();
    }

    public com.applovin.impl.sdk.utils.d.a d() {
        List<String> testDeviceAdvertisingIds;
        com.applovin.impl.sdk.utils.d.a aVarA = com.applovin.impl.sdk.utils.d.a(this.D);
        if (aVarA == null) {
            return new com.applovin.impl.sdk.utils.d.a();
        }
        if (((Boolean) this.C.a(com.applovin.impl.sdk.c.b.f10365ec)).booleanValue()) {
            if (aVarA.a() && !((Boolean) this.C.a(com.applovin.impl.sdk.c.b.f10364eb)).booleanValue()) {
                aVarA.a("");
            }
            E.set(aVarA);
        } else {
            aVarA = new com.applovin.impl.sdk.utils.d.a();
        }
        boolean z10 = false;
        if (StringUtils.isValidString(aVarA.b()) && (testDeviceAdvertisingIds = this.C.ay().getTestDeviceAdvertisingIds()) != null && testDeviceAdvertisingIds.contains(aVarA.b())) {
            z10 = true;
        }
        this.f11077o = z10;
        return aVarA;
    }

    public void e() {
        this.C.G().a(new com.applovin.impl.sdk.e.i(this.C, new com.applovin.impl.sdk.e.i.a() { // from class: com.applovin.impl.sdk.r.1
            @Override // com.applovin.impl.sdk.e.i.a
            public void a(com.applovin.impl.sdk.utils.d.a aVar) {
                r.E.set(aVar);
            }
        }), com.applovin.impl.sdk.e.r.b.ADVERTISING_INFO_COLLECTION);
        this.C.G().a(new com.applovin.impl.sdk.e.ac(this.C, true, "setDeviceVolume", new Runnable() { // from class: com.applovin.impl.sdk.r.2
            @Override // java.lang.Runnable
            public void run() {
                r.G.set(r.this.f11065c.b());
            }
        }), com.applovin.impl.sdk.e.r.b.CACHING_OTHER);
    }

    public String f() {
        e eVar;
        e eVar2 = this.f11083u;
        if (eVar2 == null || eVar2.a()) {
            eVar = new e(com.applovin.impl.sdk.utils.i.f(this.C), this.B);
            this.f11083u = eVar;
        } else {
            eVar = this.f11083u;
        }
        return (String) eVar.f11117b;
    }

    public Long g() {
        e eVar = this.f11079q;
        if (eVar != null && !eVar.a()) {
            return Long.valueOf(((Long) this.f11079q.f11117b).longValue());
        }
        try {
            e eVar2 = new e(Long.valueOf(Environment.getDataDirectory().getFreeSpace()), this.f11088z);
            this.f11079q = eVar2;
            return Long.valueOf(((Long) eVar2.f11117b).longValue());
        } catch (Throwable th) {
            this.C.F();
            if (!y.a()) {
                return null;
            }
            this.C.F().b("DataProvider", "Unable to collect free space.", th);
            return null;
        }
    }

    public Float h() {
        e eVar;
        e eVar2 = this.f11081s;
        if (eVar2 != null && !eVar2.a()) {
            eVar = this.f11081s;
        } else {
            if (this.C.Y() == null) {
                return null;
            }
            eVar = new e(Float.valueOf(this.C.Y().c()), this.f11085w);
            this.f11081s = eVar;
        }
        return Float.valueOf(((Float) eVar.f11117b).floatValue());
    }

    public Float i() {
        e eVar;
        e eVar2 = this.f11082t;
        if (eVar2 != null && !eVar2.a()) {
            eVar = this.f11082t;
        } else {
            if (this.C.Y() == null) {
                return null;
            }
            eVar = new e(Float.valueOf(this.C.Y().b()), this.f11085w);
            this.f11082t = eVar;
        }
        return Float.valueOf(((Float) eVar.f11117b).floatValue());
    }

    public Integer j() {
        e eVar = this.f11084v;
        if (eVar != null && !eVar.a()) {
            return Integer.valueOf(((Integer) this.f11084v.f11117b).intValue());
        }
        try {
            e eVar2 = new e(Integer.valueOf((int) ((Settings.System.getInt(this.D.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)), this.f11086x);
            this.f11084v = eVar2;
            return Integer.valueOf(((Integer) eVar2.f11117b).intValue());
        } catch (Settings.SettingNotFoundException e10) {
            this.C.F();
            if (!y.a()) {
                return null;
            }
            this.C.F().b("DataProvider", "Unable to collect screen brightness", e10);
            return null;
        }
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
    public long k() {
        long j10;
        int iC;
        int iC2;
        int iC3;
        long j11;
        long j12;
        long j13;
        List listAsList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.D.getContentResolver(), "enabled_accessibility_services")).split(":"));
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
        if ((this.D.getResources().getConfiguration().uiMode & 48) == 32) {
            j14 |= 1024;
        }
        if (b("accessibility_enabled")) {
            j14 |= 8;
        }
        if (b("touch_exploration_enabled")) {
            j14 |= 16;
        }
        if (com.applovin.impl.sdk.utils.h.d()) {
            if (b("accessibility_display_inversion_enabled")) {
                j14 |= 32;
            }
            if (b("skip_first_use_hints")) {
                j14 |= 64;
            }
        }
        if (b("lock_screen_allow_remote_input")) {
            j14 |= 2048;
        }
        if (b("enabled_accessibility_audio_description_by_default")) {
            j14 |= 4096;
        }
        if (b("accessibility_shortcut_on_lock_screen")) {
            j14 |= FileAppender.DEFAULT_BUFFER_SIZE;
        }
        if (b("wear_talkback_enabled")) {
            j14 |= Http2Stream.EMIT_BUFFER_SIZE;
        }
        if (b("hush_gesture_used")) {
            j14 |= 32768;
        }
        if (b("high_text_contrast_enabled")) {
            j14 |= 65536;
        }
        if (b("accessibility_display_magnification_enabled")) {
            j14 |= 131072;
        }
        if (b("accessibility_display_magnification_navbar_enabled")) {
            j14 |= 262144;
        }
        if (b("accessibility_captioning_enabled")) {
            j14 |= 524288;
        }
        if (b("accessibility_display_daltonizer_enabled")) {
            j14 |= FileSize.MB_COEFFICIENT;
        }
        if (b("accessibility_autoclick_enabled")) {
            j14 |= 2097152;
        }
        if (b("accessibility_large_pointer_icon")) {
            j14 |= 4194304;
        }
        if (b("reduce_bright_colors_activated")) {
            j14 |= 8388608;
        }
        if (b("reduce_bright_colors_persist_across_reboots")) {
            j14 |= 16777216;
        }
        if (b("tty_mode_enabled")) {
            j14 |= 33554432;
        }
        if (b("rtt_calling_mode")) {
            j14 |= 67108864;
        }
        if (b("accessibility_floating_menu_fade_enabled")) {
            j14 |= 134217728;
        }
        if (b("accessibility_show_window_magnification_prompt")) {
            j14 |= 268435456;
        }
        if (b("accessibility_floating_menu_migration_tooltip_prompt")) {
            j14 |= 536870912;
        }
        int iC4 = c("accessibility_magnification_mode");
        if (iC4 == 0) {
            j10 = FileSize.GB_COEFFICIENT;
        } else if (iC4 == 1) {
            j10 = 2147483648L;
        } else {
            if (iC4 != 2) {
                if (iC4 == 3) {
                    j10 = 8589934592L;
                }
                iC = c("accessibility_button_mode");
                if (iC == 0) {
                    j13 = iC == 1 ? 34359738368L : 17179869184L;
                    iC2 = c("accessibility_floating_menu_size");
                    if (iC2 == 0) {
                        j12 = iC2 == 1 ? 137438953472L : 68719476736L;
                        iC3 = c("accessibility_floating_menu_icon_type");
                        if (iC3 == 0) {
                            j11 = 274877906944L;
                        } else {
                            if (iC3 == 1) {
                                return j14;
                            }
                            j11 = 549755813888L;
                        }
                        return j14 | j11;
                    }
                    j14 |= j12;
                    iC3 = c("accessibility_floating_menu_icon_type");
                    if (iC3 == 0) {
                        j11 = 274877906944L;
                    } else {
                        if (iC3 == 1) {
                            return j14;
                        }
                        j11 = 549755813888L;
                    }
                    return j14 | j11;
                }
                j14 |= j13;
                iC2 = c("accessibility_floating_menu_size");
                if (iC2 == 0) {
                    if (iC2 == 1) {
                    }
                    iC3 = c("accessibility_floating_menu_icon_type");
                    if (iC3 == 0) {
                        j11 = 274877906944L;
                    } else {
                        if (iC3 == 1) {
                            return j14;
                        }
                        j11 = 549755813888L;
                    }
                    return j14 | j11;
                }
                j14 |= j12;
                iC3 = c("accessibility_floating_menu_icon_type");
                if (iC3 == 0) {
                    j11 = 274877906944L;
                } else {
                    if (iC3 == 1) {
                        return j14;
                    }
                    j11 = 549755813888L;
                }
                return j14 | j11;
            }
            j10 = 4294967296L;
        }
        j14 |= j10;
        iC = c("accessibility_button_mode");
        if (iC == 0) {
            if (iC == 1) {
            }
            iC2 = c("accessibility_floating_menu_size");
            if (iC2 == 0) {
                if (iC2 == 1) {
                }
                iC3 = c("accessibility_floating_menu_icon_type");
                if (iC3 == 0) {
                    j11 = 274877906944L;
                } else {
                    if (iC3 == 1) {
                        return j14;
                    }
                    j11 = 549755813888L;
                }
                return j14 | j11;
            }
            j14 |= j12;
            iC3 = c("accessibility_floating_menu_icon_type");
            if (iC3 == 0) {
                j11 = 274877906944L;
            } else {
                if (iC3 == 1) {
                    return j14;
                }
                j11 = 549755813888L;
            }
            return j14 | j11;
        }
        j14 |= j13;
        iC2 = c("accessibility_floating_menu_size");
        if (iC2 == 0) {
            if (iC2 == 1) {
            }
            iC3 = c("accessibility_floating_menu_icon_type");
            if (iC3 == 0) {
                j11 = 274877906944L;
            } else {
                if (iC3 == 1) {
                    return j14;
                }
                j11 = 549755813888L;
            }
            return j14 | j11;
        }
        j14 |= j12;
        iC3 = c("accessibility_floating_menu_icon_type");
        if (iC3 == 0) {
            j11 = 274877906944L;
        } else {
            if (iC3 == 1) {
                return j14;
            }
            j11 = 549755813888L;
        }
        return j14 | j11;
    }

    public float l() {
        try {
            return Settings.System.getFloat(this.D.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e10) {
            this.C.F();
            if (!y.a()) {
                return -1.0f;
            }
            this.C.F().b("DataProvider", "Error collecting font scale", e10);
            return -1.0f;
        }
    }

    public boolean m() {
        e eVar;
        e eVar2 = this.f11080r;
        if (eVar2 == null || eVar2.a()) {
            eVar = new e(Boolean.valueOf(com.applovin.impl.sdk.utils.w.d()), this.f11088z);
            this.f11080r = eVar;
        } else {
            eVar = this.f11080r;
        }
        return ((Boolean) eVar.f11117b).booleanValue();
    }

    public boolean n() {
        ConnectivityManager connectivityManager;
        if (!com.applovin.impl.sdk.utils.h.f() || (connectivityManager = (ConnectivityManager) this.D.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            return connectivityManager.getRestrictBackgroundStatus() == 3;
        } catch (Throwable th) {
            this.C.F();
            if (y.a()) {
                this.C.F().b("DataProvider", "Unable to collect constrained network info.", th);
            }
            return false;
        }
    }

    public boolean o() {
        try {
            return G() || H();
        } catch (Throwable unused) {
            return false;
        }
    }

    public i p() {
        return this.f11063a;
    }

    public j q() {
        return this.f11064b;
    }

    public c r() {
        return this.f11065c;
    }

    public d s() {
        return this.f11066d;
    }

    public f t() {
        return this.f11067e;
    }

    public h u() {
        return this.f11068f;
    }

    public String v() {
        return this.f11069g;
    }

    public String w() {
        return this.f11070h;
    }

    public double x() {
        return this.f11071i;
    }

    public boolean y() {
        return this.f11072j;
    }

    public String z() {
        return this.f11073k;
    }
}
