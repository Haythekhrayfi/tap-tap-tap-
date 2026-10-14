package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.util.Base64;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class H8 extends J8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<String> f14134e;

    public H8(Context context, L0 l10) {
        super(context, "appmetrica_vital.dat", l10);
        this.f14134e = kc.h0.c("device_id", "device_id_hash", "location_id", "lbs_id", "referrer", "referrer_checked", "location_request_id", "last_migration_api_level");
    }

    @Override // com.yandex.metrica.impl.ob.J8
    public Set<String> a() {
        return this.f14134e;
    }

    public final synchronized void a(int i10) {
        JSONObject jSONObjectPut = b().put("last_migration_api_level", i10);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_…GRATION_API_LEVEL, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(long j10) {
        JSONObject jSONObjectPut = b().put("location_request_id", j10);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_…CATION_REQUEST_ID, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(Fg fg) {
        String str;
        JSONObject jSONObjectB = b();
        if (fg != null) {
            byte[] bArrEncode = Base64.encode(fg.a(), 0);
            fd.j0.h(bArrEncode, "Base64.encode(toProto(), 0)");
            str = new String(bArrEncode, ed.c.f29139b);
        } else {
            str = null;
        }
        JSONObject jSONObjectPut = jSONObjectB.put("referrer", str);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_…value?.toEncodedString())");
        a(jSONObjectPut);
    }

    public final synchronized void a(String str) {
        JSONObject jSONObjectPut = b().put("device_id", str);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_DEVICE_ID, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(String str, String str2, String str3, Boolean bool, Long l10, Long l11, Long l12, Integer num) {
        JSONObject jSONObjectPut = new JSONObject().put("device_id", str).put("device_id_hash", str2).put("referrer", str3).put("referrer_checked", bool).put("location_id", l10).put("lbs_id", l11).put("location_request_id", l12).put("last_migration_api_level", num);
        fd.j0.h(jSONObjectPut, "json");
        a(jSONObjectPut);
    }

    public final synchronized void a(boolean z10) {
        JSONObject jSONObjectPut = b().put("referrer_checked", z10);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_REFERRER_CHECKED, value)");
        a(jSONObjectPut);
    }

    public final synchronized void b(String str) {
        JSONObject jSONObjectPut = b().put("device_id_hash", str);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_DEVICE_ID_HASH, value)");
        a(jSONObjectPut);
    }

    public final synchronized String c() {
        return C2120ym.e(b(), "device_id");
    }

    public final synchronized String d() {
        return C2120ym.e(b(), "device_id_hash");
    }

    public final synchronized int e() {
        return b().optInt("last_migration_api_level", -1);
    }

    public final synchronized long f() {
        return b().optLong("location_request_id", -1L);
    }

    public final synchronized Fg g() {
        Fg fgA;
        String strE = C2120ym.e(b(), "referrer");
        if (strE != null) {
            try {
                byte[] bytes = strE.getBytes(ed.c.f29139b);
                fd.j0.h(bytes, "(this as java.lang.String).getBytes(charset)");
                fgA = Fg.a(Base64.decode(bytes, 0));
            } catch (Throwable unused) {
                fgA = null;
            }
        } else {
            fgA = null;
        }
        return fgA;
    }

    public final synchronized boolean h() {
        return b().optBoolean("referrer_checked", false);
    }
}
