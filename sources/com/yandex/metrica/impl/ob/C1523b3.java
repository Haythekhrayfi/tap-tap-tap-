package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1523b3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C1523b3 f15795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f15796m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WifiManager f15798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1634fe f15799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1783le f15800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Mm f15801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Tm<Context, Intent, Void> f15802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Qi f15803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1659ge f15804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC1659ge f15805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1548c3 f15806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1573d3 f15807k;

    private C1523b3(Context context, WifiManager wifiManager, C1783le c1783le) {
        this(context, wifiManager, c1783le, new C1634fe(c1783le.a()));
    }

    public C1523b3(Context context, WifiManager wifiManager, C1783le c1783le, Mm mm, C1634fe c1634fe, C1497a2 c1497a2, C1548c3 c1548c3, C1573d3 c1573d3) {
        this.f15797a = context;
        this.f15798b = wifiManager;
        this.f15800d = c1783le;
        this.f15799c = c1634fe;
        this.f15804h = c1497a2.d(c1634fe);
        this.f15805i = c1497a2.e(c1634fe);
        this.f15801e = mm;
        this.f15806j = c1548c3;
        this.f15807k = c1573d3;
    }

    private C1523b3(Context context, WifiManager wifiManager, C1783le c1783le, C1634fe c1634fe) {
        this(context, wifiManager, c1783le, new Mm(), c1634fe, new C1497a2(), new C1548c3(), P0.i().j().d());
    }

    public static C1523b3 a(Context context) {
        if (f15795l == null) {
            synchronized (f15796m) {
                if (f15795l == null) {
                    Context applicationContext = context.getApplicationContext();
                    f15795l = new C1523b3(applicationContext, (WifiManager) applicationContext.getApplicationContext().getSystemService("wifi"), new C1783le());
                }
            }
        }
        return f15795l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:108:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00a1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0030  */
    /* JADX WARN: Code duplicated, block: B:29:0x0037  */
    /* JADX WARN: Code duplicated, block: B:30:0x0039  */
    /* JADX WARN: Code duplicated, block: B:36:0x0047  */
    /* JADX WARN: Code duplicated, block: B:39:0x004b  */
    /* JADX WARN: Code duplicated, block: B:51:0x007d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0080  */
    /* JADX WARN: Code duplicated, block: B:54:0x0082  */
    /* JADX WARN: Code duplicated, block: B:57:0x008a  */
    /* JADX WARN: Code duplicated, block: B:58:0x008c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0092  */
    /* JADX WARN: Code duplicated, block: B:63:0x009d  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    public List<Z2> c() {
        Qi qi;
        boolean z10;
        boolean z11;
        List<ScanResult> scanResults;
        Qi qi2;
        boolean z12;
        boolean z13;
        WifiInfo connectionInfo;
        String bssid;
        ArrayList arrayList;
        int size;
        String strReplace;
        boolean zEquals;
        String strReplace2;
        boolean z14;
        WifiManager wifiManager;
        WifiManager wifiManager2;
        synchronized (this) {
            synchronized (this) {
                qi = this.f15803g;
                z10 = qi != null;
            }
            if (z11 || !this.f15804h.a(this.f15797a) || (wifiManager2 = this.f15798b) == null) {
                scanResults = null;
            } else {
                try {
                    scanResults = wifiManager2.getScanResults();
                } catch (Throwable unused) {
                    scanResults = null;
                }
            }
            synchronized (this) {
                synchronized (this) {
                    qi2 = this.f15803g;
                    if (qi2 != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z13 || !this.f15799c.c(this.f15797a) || (wifiManager = this.f15798b) == null) {
                    connectionInfo = null;
                } else {
                    try {
                        connectionInfo = wifiManager.getConnectionInfo();
                        if (connectionInfo != null && ("00:00:00:00:00:00".equals(connectionInfo.getBSSID()) || "02:00:00:00:00:00".equals(connectionInfo.getBSSID()) || connectionInfo.getIpAddress() == 0)) {
                            connectionInfo = null;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (connectionInfo == null) {
                    bssid = null;
                } else {
                    bssid = connectionInfo.getBSSID();
                }
                if (scanResults == null) {
                    size = 0;
                } else {
                    size = scanResults.size();
                }
                arrayList = new ArrayList(size + (connectionInfo == null ? 0 : 1));
                if (!U2.b(scanResults)) {
                    for (ScanResult scanResult : scanResults) {
                        if (scanResult == null && !"02:00:00:00:00:00".equals(scanResult.BSSID)) {
                            try {
                                String str = scanResult.BSSID;
                                if (str != null) {
                                    zEquals = str.equals(bssid);
                                    try {
                                        strReplace2 = str.toUpperCase(Locale.US).replace(":", "");
                                    } catch (NoSuchFieldError unused3) {
                                        strReplace2 = null;
                                    }
                                    z14 = zEquals;
                                } else {
                                    z14 = false;
                                    strReplace2 = null;
                                }
                            } catch (NoSuchFieldError unused4) {
                                zEquals = false;
                            }
                            arrayList.add(new Z2(strReplace2, scanResult.SSID, z14, scanResult.level, Long.valueOf(this.f15801e.a(scanResult.timestamp, TimeUnit.MICROSECONDS))));
                        }
                    }
                } else if (connectionInfo != null) {
                    if (bssid == null) {
                        strReplace = null;
                    } else {
                        strReplace = bssid.toUpperCase(Locale.US).replace(":", "");
                    }
                    String ssid = connectionInfo.getSSID();
                    arrayList.add(new Z2(strReplace, ssid != null ? ssid.replace("\"", "") : null, true, connectionInfo.getRssi(), 0L));
                }
                return Collections.unmodifiableList(arrayList);
            }
            if (z12 || !qi2.f().f17353r) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                connectionInfo = null;
            } else {
                connectionInfo = null;
            }
            if (connectionInfo == null) {
                bssid = null;
            } else {
                bssid = connectionInfo.getBSSID();
            }
            if (scanResults == null) {
                size = 0;
            } else {
                size = scanResults.size();
            }
            arrayList = new ArrayList(size + (connectionInfo == null ? 0 : 1));
            if (!U2.b(scanResults)) {
                while (r0.hasNext()) {
                    if (scanResult == null) {
                    }
                }
            } else if (connectionInfo != null) {
                if (bssid == null) {
                    strReplace = null;
                } else {
                    strReplace = bssid.toUpperCase(Locale.US).replace(":", "");
                }
                String ssid2 = connectionInfo.getSSID();
                arrayList.add(new Z2(strReplace, ssid2 != null ? ssid2.replace("\"", "") : null, true, connectionInfo.getRssi(), 0L));
            }
            return Collections.unmodifiableList(arrayList);
        }
        z11 = z10 && qi.f().f17352q;
        if (z11) {
            scanResults = null;
        } else {
            scanResults = null;
        }
        synchronized (this) {
            synchronized (this) {
                qi2 = this.f15803g;
                if (qi2 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (z13) {
                    connectionInfo = null;
                } else {
                    connectionInfo = null;
                }
                if (connectionInfo == null) {
                    bssid = null;
                } else {
                    bssid = connectionInfo.getBSSID();
                }
                if (scanResults == null) {
                    size = 0;
                } else {
                    size = scanResults.size();
                }
                arrayList = new ArrayList(size + (connectionInfo == null ? 0 : 1));
                if (!U2.b(scanResults)) {
                    while (r0.hasNext()) {
                        if (scanResult == null) {
                        }
                    }
                } else if (connectionInfo != null) {
                    if (bssid == null) {
                        strReplace = null;
                    } else {
                        strReplace = bssid.toUpperCase(Locale.US).replace(":", "");
                    }
                    String ssid3 = connectionInfo.getSSID();
                    arrayList.add(new Z2(strReplace, ssid3 != null ? ssid3.replace("\"", "") : null, true, connectionInfo.getRssi(), 0L));
                }
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public C1548c3 a() {
        return this.f15806j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(Qi qi) {
        this.f15803g = qi;
        this.f15800d.a(qi);
        this.f15799c.a(this.f15800d.a());
        if (qi.d() != null) {
            C1548c3 c1548c3 = this.f15806j;
            C1887pi c1887piD = qi.d();
            c1548c3.f14731a.a(c1887piD.f17140b, c1548c3.a(c1887piD));
        }
    }

    public void a(boolean z10) {
        this.f15800d.a(z10);
        this.f15799c.a(this.f15800d.a());
    }

    @SuppressLint({"MissingPermission"})
    public synchronized boolean a(CountDownLatch countDownLatch, AbstractC1570d0<List<Z2>> abstractC1570d0) {
        Boolean boolValueOf;
        if (!this.f15805i.a(this.f15797a)) {
            return false;
        }
        if (this.f15802f == null) {
            this.f15802f = new C1498a3(this, abstractC1570d0, countDownLatch);
        }
        this.f15807k.a(this.f15802f);
        WifiManager wifiManager = this.f15798b;
        if (wifiManager != null) {
            try {
                boolValueOf = Boolean.valueOf(wifiManager.startScan());
            } catch (Throwable unused) {
                boolValueOf = null;
            }
        } else {
            boolValueOf = null;
        }
        return Boolean.TRUE.equals(boolValueOf);
    }

    public synchronized List<Z2> b() {
        Boolean boolValueOf;
        boolean zBooleanValue;
        if (this.f15799c.c(this.f15797a)) {
            WifiManager wifiManager = this.f15798b;
            Boolean bool = Boolean.FALSE;
            if (wifiManager != null) {
                try {
                    boolValueOf = Boolean.valueOf(wifiManager.isWifiEnabled());
                } catch (Throwable unused) {
                    boolValueOf = null;
                }
            } else {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                bool = boolValueOf;
            }
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            return c();
        }
        return Collections.emptyList();
    }
}
