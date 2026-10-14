package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1744k0 implements Parcelable {
    public static final Parcelable.Creator<C1744k0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f16514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Pair<String, String> f16517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f16519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f16520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f16521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private N0 f16522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private I0 f16523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Bundle f16524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Boolean f16525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f16526p;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.k0$a */
    public class a implements Parcelable.Creator<C1744k0> {
        @Override // android.os.Parcelable.Creator
        public C1744k0 createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle(ResultReceiverC1819n0.class.getClassLoader());
            I0 i0A = bundle.containsKey("CounterReport.Source") ? I0.a(bundle.getInt("CounterReport.Source")) : null;
            C1744k0 c1744k0 = new C1744k0();
            c1744k0.f16515e = bundle.getInt("CounterReport.Type", EnumC1745k1.EVENT_TYPE_UNDEFINED.b());
            c1744k0.f16516f = bundle.getInt("CounterReport.CustomType");
            String string = bundle.getString("CounterReport.Value");
            int i10 = O2.f14603a;
            if (string == null) {
                string = "";
            }
            c1744k0.f16512b = string;
            C1744k0 c1744k0A = C1744k0.a(c1744k0.e(bundle.getString("CounterReport.UserInfo")).c(bundle.getString("CounterReport.Environment")).b(bundle.getString("CounterReport.Event")), (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) ? new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue")) : null);
            c1744k0A.f16518h = bundle.getInt("CounterReport.TRUNCATED");
            return c1744k0A.d(bundle.getString("CounterReport.ProfileID")).a(bundle.getLong("CounterReport.CreationElapsedRealtime")).b(bundle.getLong("CounterReport.CreationTimestamp")).a(N0.a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")))).a(i0A).c(bundle.getBundle("CounterReport.Payload")).a(bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null).a(bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null);
        }

        @Override // android.os.Parcelable.Creator
        public C1744k0[] newArray(int i10) {
            return new C1744k0[i10];
        }
    }

    public C1744k0() {
        this("", 0);
    }

    public C1744k0(String str, int i10) {
        this("", str, i10);
    }

    public C1744k0(String str, String str2, int i10) {
        this(str, str2, i10, new Nm());
    }

    public C1744k0(String str, String str2, int i10, Nm nm) {
        this.f16522l = N0.UNKNOWN;
        this.f16511a = str2;
        this.f16515e = i10;
        this.f16512b = str;
        this.f16520j = nm.c();
        this.f16521k = nm.a();
    }

    public static C1744k0 a() {
        C1744k0 c1744k0 = new C1744k0();
        c1744k0.f16515e = EnumC1745k1.EVENT_TYPE_SEND_REVENUE_EVENT.b();
        return c1744k0;
    }

    public static C1744k0 a(Bundle bundle) {
        if (bundle != null) {
            try {
                C1744k0 c1744k0 = (C1744k0) bundle.getParcelable("CounterReport.Object");
                if (c1744k0 != null) {
                    return c1744k0;
                }
            } catch (Throwable unused) {
                return new C1744k0();
            }
        }
        return new C1744k0();
    }

    public static C1744k0 a(C1744k0 c1744k0) {
        return a(c1744k0, EnumC1745k1.EVENT_TYPE_ALIVE);
    }

    public static C1744k0 a(C1744k0 c1744k0, Pair pair) {
        c1744k0.f16517g = pair;
        return c1744k0;
    }

    public static C1744k0 a(C1744k0 c1744k0, K0 k10) {
        C1744k0 c1744k0A = a(c1744k0, EnumC1745k1.EVENT_TYPE_START);
        String strA = k10.a();
        Sf sf = new Sf();
        if (strA != null) {
            sf.f15005b = strA.getBytes();
        }
        c1744k0A.a(AbstractC1594e.a(sf));
        c1744k0A.f16521k = c1744k0.f16521k;
        c1744k0A.f16520j = c1744k0.f16520j;
        return c1744k0A;
    }

    public static C1744k0 a(C1744k0 c1744k0, C1624f4 c1624f4) {
        Context contextG = c1624f4.g();
        C1696i1 c1696i1C = new C1696i1(contextG, new A0(contextG)).c();
        try {
            c1696i1C.b();
        } catch (Throwable unused) {
        }
        C1744k0 c1744k0D = d(c1744k0);
        c1744k0D.f16515e = EnumC1745k1.EVENT_TYPE_IDENTITY.b();
        c1744k0D.f16512b = c1696i1C.a();
        return c1744k0D;
    }

    private static C1744k0 a(C1744k0 c1744k0, EnumC1745k1 enumC1745k1) {
        C1744k0 c1744k0D = d(c1744k0);
        c1744k0D.f16515e = enumC1745k1.b();
        return c1744k0D;
    }

    public static C1744k0 a(C1744k0 c1744k0, String str) {
        C1744k0 c1744k0D = d(c1744k0);
        c1744k0D.f16515e = EnumC1745k1.EVENT_TYPE_APP_FEATURES.b();
        c1744k0D.f16512b = str;
        return c1744k0D;
    }

    public static C1744k0 a(C1744k0 c1744k0, Collection<C1709ie> collection, H h10, D d10, List<String> list) {
        String string;
        String str;
        C1744k0 c1744k0D = d(c1744k0);
        try {
            JSONArray jSONArray = new JSONArray();
            for (C1709ie c1709ie : collection) {
                jSONArray.put(new JSONObject().put("name", c1709ie.f16345a).put("granted", c1709ie.f16346b));
            }
            JSONObject jSONObject = new JSONObject();
            if (h10 != null) {
                jSONObject.put("background_restricted", h10.f14111b);
                H.a aVar = h10.f14110a;
                Objects.requireNonNull(d10);
                if (aVar != null) {
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        str = "ACTIVE";
                    } else if (iOrdinal == 1) {
                        str = "WORKING_SET";
                    } else if (iOrdinal == 2) {
                        str = "FREQUENT";
                    } else if (iOrdinal == 3) {
                        str = "RARE";
                    } else if (iOrdinal == 4) {
                        str = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        c1744k0D.f16515e = EnumC1745k1.EVENT_TYPE_PERMISSIONS.b();
        c1744k0D.f16512b = string;
        return c1744k0D;
    }

    public static C1744k0 a(String str) {
        C1744k0 c1744k0 = new C1744k0();
        c1744k0.f16515e = EnumC1745k1.EVENT_TYPE_WEBVIEW_SYNC.b();
        c1744k0.f16512b = str;
        c1744k0.f16523m = I0.JS;
        return c1744k0;
    }

    public static C1744k0 b(C1744k0 c1744k0) {
        return a(c1744k0, EnumC1745k1.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static C1744k0 c(C1744k0 c1744k0) {
        return a(c1744k0, EnumC1745k1.EVENT_TYPE_INIT);
    }

    private static C1744k0 d(C1744k0 c1744k0) {
        C1744k0 c1744k1 = new C1744k0();
        c1744k1.f16521k = c1744k0.f16521k;
        c1744k1.f16520j = c1744k0.f16520j;
        c1744k1.f16513c = c1744k0.f16513c;
        c1744k1.f16517g = c1744k0.f16517g;
        c1744k1.f16514d = c1744k0.f16514d;
        c1744k1.f16524n = c1744k0.f16524n;
        c1744k1.f16519i = c1744k0.f16519i;
        return c1744k1;
    }

    public static C1744k0 e(C1744k0 c1744k0) {
        return a(c1744k0, EnumC1745k1.EVENT_TYPE_APP_UPDATE);
    }

    public C1744k0 a(int i10) {
        this.f16515e = i10;
        return this;
    }

    public C1744k0 a(long j10) {
        this.f16520j = j10;
        return this;
    }

    public C1744k0 a(I0 i10) {
        this.f16523m = i10;
        return this;
    }

    public C1744k0 a(N0 n10) {
        this.f16522l = n10;
        return this;
    }

    public C1744k0 a(Boolean bool) {
        this.f16525o = bool;
        return this;
    }

    public C1744k0 a(Integer num) {
        this.f16526p = num;
        return this;
    }

    public C1744k0 a(String str, String str2) {
        if (this.f16517g == null) {
            this.f16517g = new Pair<>(str, str2);
        }
        return this;
    }

    public C1744k0 a(byte[] bArr) {
        this.f16512b = new String(Base64.encode(bArr, 0));
        return this;
    }

    public Bundle b(Bundle bundle) {
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public Pair<String, String> b() {
        return this.f16517g;
    }

    public C1744k0 b(long j10) {
        this.f16521k = j10;
        return this;
    }

    public C1744k0 b(String str) {
        this.f16511a = str;
        return this;
    }

    public C1744k0 c(Bundle bundle) {
        this.f16524n = bundle;
        return this;
    }

    public C1744k0 c(String str) {
        this.f16514d = str;
        return this;
    }

    public Boolean c() {
        return this.f16525o;
    }

    public int d() {
        return this.f16518h;
    }

    public C1744k0 d(String str) {
        this.f16519i = str;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f16520j;
    }

    public C1744k0 e(String str) {
        this.f16513c = str;
        return this;
    }

    public long f() {
        return this.f16521k;
    }

    public C1744k0 f(String str) {
        this.f16512b = str;
        return this;
    }

    public String g() {
        return this.f16511a;
    }

    public String h() {
        return this.f16514d;
    }

    public N0 i() {
        return this.f16522l;
    }

    public Integer j() {
        return this.f16526p;
    }

    public Bundle k() {
        return this.f16524n;
    }

    public String l() {
        return this.f16519i;
    }

    public I0 m() {
        return this.f16523m;
    }

    public int n() {
        return this.f16515e;
    }

    public String o() {
        return this.f16513c;
    }

    public String p() {
        return this.f16512b;
    }

    public byte[] q() {
        return Base64.decode(this.f16512b, 0);
    }

    public String toString() {
        return String.format(Locale.US, "[event: %s, type: %s, value: %s]", this.f16511a, EnumC1745k1.a(this.f16515e).a(), U2.a(this.f16512b, 500));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f16511a);
        bundle.putString("CounterReport.Value", this.f16512b);
        bundle.putInt("CounterReport.Type", this.f16515e);
        bundle.putInt("CounterReport.CustomType", this.f16516f);
        bundle.putInt("CounterReport.TRUNCATED", this.f16518h);
        bundle.putString("CounterReport.ProfileID", this.f16519i);
        bundle.putInt("CounterReport.UniquenessStatus", this.f16522l.f14527a);
        Bundle bundle2 = this.f16524n;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f16514d;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        String str2 = this.f16513c;
        if (str2 != null) {
            bundle.putString("CounterReport.UserInfo", str2);
        }
        Pair<String, String> pair = this.f16517g;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f16520j);
        bundle.putLong("CounterReport.CreationTimestamp", this.f16521k);
        I0 i11 = this.f16523m;
        if (i11 != null) {
            bundle.putInt("CounterReport.Source", i11.f14171a);
        }
        Boolean bool = this.f16525o;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f16526p;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        parcel.writeBundle(bundle);
    }
}
