package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1572d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<EnumC2129z6, Integer> f15900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SparseArray<EnumC2129z6> f15901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<EnumC1745k1, Integer> f15902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<EnumC1745k1, Ye> f15903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f15904e = 0;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d2$a */
    public class a implements InterfaceC1809mf {
        @Override // com.yandex.metrica.impl.ob.InterfaceC1809mf
        public byte[] a(Xe xe2, C1736jh c1736jh) {
            if (!TextUtils.isEmpty(xe2.f15485b)) {
                try {
                    Fg fgA = Fg.a(Base64.decode(xe2.f15485b, 0));
                    Xf xf = new Xf();
                    String str = fgA.f14000a;
                    xf.f15510b = str == null ? new byte[0] : str.getBytes();
                    xf.f15512d = fgA.f14001b;
                    xf.f15511c = fgA.f14002c;
                    int iOrdinal = fgA.f14003d.ordinal();
                    int i10 = 2;
                    if (iOrdinal == 1) {
                        i10 = 1;
                    } else if (iOrdinal != 2) {
                        i10 = 0;
                    }
                    xf.f15513e = i10;
                    return AbstractC1594e.a(xf);
                } catch (Throwable unused) {
                }
            }
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d2$b */
    public class b implements Ze {
        @Override // com.yandex.metrica.impl.ob.Ze
        public Integer a(Xe xe2) {
            return xe2.f15494k;
        }
    }

    static {
        HashMap map = new HashMap();
        EnumC2129z6 enumC2129z6 = EnumC2129z6.FOREGROUND;
        map.put(enumC2129z6, 0);
        EnumC2129z6 enumC2129z7 = EnumC2129z6.BACKGROUND;
        map.put(enumC2129z7, 1);
        f15900a = Collections.unmodifiableMap(map);
        SparseArray<EnumC2129z6> sparseArray = new SparseArray<>();
        sparseArray.put(0, enumC2129z6);
        sparseArray.put(1, enumC2129z7);
        f15901b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC1745k1 enumC1745k1 = EnumC1745k1.EVENT_TYPE_INIT;
        map2.put(enumC1745k1, 1);
        EnumC1745k1 enumC1745k2 = EnumC1745k1.EVENT_TYPE_REGULAR;
        map2.put(enumC1745k2, 4);
        EnumC1745k1 enumC1745k3 = EnumC1745k1.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC1745k3, 5);
        EnumC1745k1 enumC1745k4 = EnumC1745k1.EVENT_TYPE_ALIVE;
        map2.put(enumC1745k4, 7);
        EnumC1745k1 enumC1745k5 = EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        map2.put(enumC1745k5, 3);
        EnumC1745k1 enumC1745k6 = EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC1745k6, 26);
        EnumC1745k1 enumC1745k7 = EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        map2.put(enumC1745k7, 26);
        EnumC1745k1 enumC1745k8 = EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC1745k8, 26);
        EnumC1745k1 enumC1745k9 = EnumC1745k1.EVENT_TYPE_ANR;
        map2.put(enumC1745k9, 25);
        EnumC1745k1 enumC1745k10 = EnumC1745k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        map2.put(enumC1745k10, 3);
        EnumC1745k1 enumC1745k11 = EnumC1745k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC1745k11, 26);
        EnumC1745k1 enumC1745k12 = EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH;
        map2.put(enumC1745k12, 3);
        EnumC1745k1 enumC1745k13 = EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC1745k13, 26);
        EnumC1745k1 enumC1745k14 = EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF;
        map2.put(enumC1745k14, 26);
        EnumC1745k1 enumC1745k15 = EnumC1745k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC1745k15, 26);
        EnumC1745k1 enumC1745k16 = EnumC1745k1.EVENT_TYPE_EXCEPTION_USER;
        map2.put(enumC1745k16, 6);
        EnumC1745k1 enumC1745k17 = EnumC1745k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC1745k17, 27);
        EnumC1745k1 enumC1745k18 = EnumC1745k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC1745k18, 27);
        EnumC1745k1 enumC1745k19 = EnumC1745k1.EVENT_TYPE_IDENTITY;
        map2.put(enumC1745k19, 8);
        map2.put(EnumC1745k1.EVENT_TYPE_IDENTITY_LIGHT, 28);
        EnumC1745k1 enumC1745k20 = EnumC1745k1.EVENT_TYPE_STATBOX;
        map2.put(enumC1745k20, 11);
        EnumC1745k1 enumC1745k21 = EnumC1745k1.EVENT_TYPE_SET_USER_INFO;
        map2.put(enumC1745k21, 12);
        EnumC1745k1 enumC1745k22 = EnumC1745k1.EVENT_TYPE_REPORT_USER_INFO;
        map2.put(enumC1745k22, 12);
        EnumC1745k1 enumC1745k23 = EnumC1745k1.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC1745k23, 13);
        EnumC1745k1 enumC1745k24 = EnumC1745k1.EVENT_TYPE_START;
        map2.put(enumC1745k24, 2);
        EnumC1745k1 enumC1745k25 = EnumC1745k1.EVENT_TYPE_APP_OPEN;
        map2.put(enumC1745k25, 16);
        EnumC1745k1 enumC1745k26 = EnumC1745k1.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC1745k26, 17);
        EnumC1745k1 enumC1745k27 = EnumC1745k1.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC1745k27, 18);
        EnumC1745k1 enumC1745k28 = EnumC1745k1.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC1745k28, 19);
        EnumC1745k1 enumC1745k29 = EnumC1745k1.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC1745k29, 20);
        EnumC1745k1 enumC1745k30 = EnumC1745k1.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC1745k30, 21);
        EnumC1745k1 enumC1745k31 = EnumC1745k1.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC1745k31, 40);
        EnumC1745k1 enumC1745k32 = EnumC1745k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC1745k32, 35);
        map2.put(EnumC1745k1.EVENT_TYPE_CLEANUP, 29);
        EnumC1745k1 enumC1745k33 = EnumC1745k1.EVENT_TYPE_VIEW_TREE;
        map2.put(enumC1745k33, 30);
        EnumC1745k1 enumC1745k34 = EnumC1745k1.EVENT_TYPE_RAW_VIEW_TREE;
        map2.put(enumC1745k34, 34);
        EnumC1745k1 enumC1745k35 = EnumC1745k1.EVENT_TYPE_STATBOX_EXP;
        map2.put(enumC1745k35, 36);
        EnumC1745k1 enumC1745k36 = EnumC1745k1.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC1745k36, 38);
        f15902c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        Te te2 = new Te();
        We we2 = new We();
        Ue ue2 = new Ue();
        Qe qe2 = new Qe();
        C1784lf c1784lf = new C1784lf();
        C1685hf c1685hf = new C1685hf();
        Ye yeA = Ye.a().a((InterfaceC1809mf) c1685hf).a((Ve) c1685hf).a();
        Ye yeA2 = Ye.a().a(we2).a();
        Ye yeA3 = Ye.a().a(qe2).a();
        Ye yeA4 = Ye.a().a(c1784lf).a();
        Ye yeA5 = Ye.a().a(te2).a();
        Ye yeA6 = Ye.a().a(new C1834nf()).a();
        map3.put(enumC1745k2, yeA2);
        map3.put(enumC1745k3, Ye.a().a(new a()).a());
        map3.put(enumC1745k4, Ye.a().a(te2).a(ue2).a(new Re()).a(new Se()).a());
        map3.put(enumC1745k10, yeA);
        map3.put(enumC1745k12, yeA);
        map3.put(enumC1745k11, yeA);
        map3.put(enumC1745k13, yeA);
        map3.put(enumC1745k14, yeA);
        map3.put(enumC1745k15, yeA);
        map3.put(enumC1745k16, yeA2);
        map3.put(enumC1745k17, yeA3);
        map3.put(enumC1745k18, yeA3);
        map3.put(enumC1745k19, Ye.a().a(we2).a(new C1560cf()).a());
        map3.put(enumC1745k20, yeA2);
        map3.put(enumC1745k21, yeA2);
        map3.put(enumC1745k22, yeA2);
        map3.put(enumC1745k5, yeA2);
        map3.put(enumC1745k6, yeA3);
        map3.put(enumC1745k7, yeA3);
        map3.put(enumC1745k8, yeA3);
        map3.put(enumC1745k9, yeA3);
        map3.put(enumC1745k24, Ye.a().a(new Te()).a(qe2).a());
        map3.put(EnumC1745k1.EVENT_TYPE_CUSTOM_EVENT, Ye.a().a(new b()).a());
        map3.put(enumC1745k25, yeA2);
        map3.put(enumC1745k27, yeA5);
        map3.put(enumC1745k28, yeA5);
        map3.put(enumC1745k29, yeA3);
        map3.put(enumC1745k30, yeA3);
        map3.put(enumC1745k31, yeA3);
        map3.put(enumC1745k32, yeA4);
        map3.put(enumC1745k33, yeA2);
        map3.put(enumC1745k34, yeA2);
        map3.put(enumC1745k1, yeA6);
        map3.put(enumC1745k26, yeA6);
        map3.put(enumC1745k23, yeA2);
        map3.put(enumC1745k35, yeA2);
        map3.put(enumC1745k36, yeA2);
        f15903d = Collections.unmodifiableMap(map3);
    }

    public static int a(M.b.a aVar) {
        int iOrdinal = aVar.ordinal();
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3) {
                    i10 = 4;
                    if (iOrdinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i10;
    }

    public static int a(Wc.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            return 0;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 3 : 2;
        }
        return 1;
    }

    public static int a(EnumC2129z6 enumC2129z6) {
        Integer num = f15900a.get(enumC2129z6);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static Vf.f a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("start_time");
        Long asLong2 = contentValues.getAsLong("server_time_offset");
        Boolean asBoolean = contentValues.getAsBoolean("obtained_before_first_sync");
        Vf.f fVar = new Vf.f();
        if (asLong != null) {
            fVar.f15311b = asLong.longValue();
            fVar.f15312c = C1694i.a(asLong.longValue());
        }
        if (asLong2 != null) {
            fVar.f15313d = asLong2.longValue();
        }
        if (asBoolean != null) {
            fVar.f15314e = asBoolean.booleanValue();
        }
        return fVar;
    }

    private static Wf a(JSONObject jSONObject) {
        try {
            Wf wf = new Wf();
            wf.f15391b = jSONObject.getString("mac");
            wf.f15392c = jSONObject.getInt("signal_strength");
            wf.f15393d = jSONObject.getString("ssid");
            wf.f15394e = jSONObject.optBoolean("is_connected");
            wf.f15395f = jSONObject.optLong("last_visible_offset_seconds", 0L);
            return wf;
        } catch (Throwable unused) {
            Wf wf2 = new Wf();
            wf2.f15391b = jSONObject.optString("mac");
            return wf2;
        }
    }

    public static Ye a(EnumC1745k1 enumC1745k1) {
        Ye ye = enumC1745k1 != null ? f15903d.get(enumC1745k1) : null;
        return ye == null ? Ye.b() : ye;
    }

    public static EnumC2129z6 a(int i10) {
        EnumC2129z6 enumC2129z6 = f15901b.get(i10);
        return enumC2129z6 == null ? EnumC2129z6.FOREGROUND : enumC2129z6;
    }

    public static Wf[] a(JSONArray jSONArray) {
        try {
            Wf[] wfArr = new Wf[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    wfArr[i10] = a(jSONArray.getJSONObject(i10));
                } catch (Throwable unused) {
                    return wfArr;
                }
            }
            return wfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Tf b(JSONObject jSONObject) {
        Tf tf = new Tf();
        int iOptInt = jSONObject.optInt("signal_strength", tf.f15087c);
        if (iOptInt != -1) {
            tf.f15087c = iOptInt;
        }
        tf.f15086b = jSONObject.optInt("cell_id", tf.f15086b);
        tf.f15088d = jSONObject.optInt("lac", tf.f15088d);
        tf.f15089e = jSONObject.optInt("country_code", tf.f15089e);
        tf.f15090f = jSONObject.optInt("operator_id", tf.f15090f);
        tf.f15091g = jSONObject.optString("operator_name", tf.f15091g);
        tf.f15092h = jSONObject.optBoolean("is_connected", tf.f15092h);
        tf.f15093i = jSONObject.optInt("cell_type", 0);
        tf.f15094j = jSONObject.optInt("pci", tf.f15094j);
        tf.f15095k = jSONObject.optLong("last_visible_time_offset", tf.f15095k);
        tf.f15096l = jSONObject.optInt("lte_rsrq", tf.f15096l);
        tf.f15097m = jSONObject.optInt("lte_rssnr", tf.f15097m);
        tf.f15099o = jSONObject.optInt("arfcn", tf.f15099o);
        tf.f15098n = jSONObject.optInt("lte_rssi", tf.f15098n);
        tf.f15100p = jSONObject.optInt("lte_bandwidth", tf.f15100p);
        tf.f15101q = jSONObject.optInt("lte_cqi", tf.f15101q);
        return tf;
    }

    public static Integer b(EnumC1745k1 enumC1745k1) {
        if (enumC1745k1 == null) {
            return null;
        }
        return f15902c.get(enumC1745k1);
    }

    public static Tf[] b(JSONArray jSONArray) {
        try {
            Tf[] tfArr = new Tf[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        tfArr[i10] = b(jSONObjectOptJSONObject);
                    }
                } catch (Throwable unused) {
                    return tfArr;
                }
            }
            return tfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
