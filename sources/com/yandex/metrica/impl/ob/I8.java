package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class I8 extends J8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<String> f14188e;

    public I8(Context context, String str, L0 l10) {
        super(context, androidx.activity.j.a("appmetrica_vital_", str, ".dat"), l10);
        this.f14188e = kc.h0.c("first_event_done", "init_event_done", "report_request_id", "global_number", "numbers_of_type", "session_id", "referrer_handled", "open_id", "attribution_id", "last_migration_api_level");
    }

    @Override // com.yandex.metrica.impl.ob.J8
    public Set<String> a() {
        return this.f14188e;
    }

    public final synchronized void a(int i10) {
        JSONObject jSONObjectPut = b().put("global_number", i10);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_GLOBAL_NUMBER, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(long j10) {
        JSONObject jSONObjectPut = b().put("session_id", j10);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_SESSION_ID, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(boolean z10) {
        JSONObject jSONObjectPut = b().put("first_event_done", z10);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(FIRST_EVENT_DONE, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(boolean z10, boolean z11, Integer num, Integer num2, Long l10, Boolean bool, JSONObject jSONObject, Integer num3, Integer num4, Integer num5) {
        JSONObject jSONObjectPut = new JSONObject().put("first_event_done", z10).put("init_event_done", z11).put("report_request_id", num).put("global_number", num2).put("session_id", l10).put("referrer_handled", bool).put("open_id", num3).put("attribution_id", num4).put("numbers_of_type", jSONObject).put("last_migration_api_level", num5);
        fd.j0.h(jSONObjectPut, "json");
        a(jSONObjectPut);
    }

    public final synchronized void b(int i10) {
        JSONObject jSONObjectPut = b().put("last_migration_api_level", i10);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_…GRATION_API_LEVEL, value)");
        a(jSONObjectPut);
    }

    public final synchronized void b(JSONObject jSONObject) {
        JSONObject jSONObjectPut = b().put("numbers_of_type", jSONObject);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_NUMBERS_OF_TYPE, value)");
        a(jSONObjectPut);
    }

    public final synchronized void b(boolean z10) {
        JSONObject jSONObjectPut = b().put("init_event_done", z10);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(INIT_EVENT_DONE, value)");
        a(jSONObjectPut);
    }

    public final synchronized int c() {
        return b().optInt("attribution_id", 1);
    }

    public final synchronized void c(int i10) {
        JSONObject jSONObjectPut = b().put("report_request_id", i10);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_REPORT_REQUEST_ID, value)");
        a(jSONObjectPut);
    }

    public final synchronized void c(boolean z10) {
        JSONObject jSONObjectPut = b().put("referrer_handled", z10);
        fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_REFERRER_HANDLED, value)");
        a(jSONObjectPut);
    }

    public final synchronized int d() {
        return b().optInt("global_number", 0);
    }

    public final synchronized int e() {
        return b().optInt("last_migration_api_level", 0);
    }

    public final synchronized JSONObject f() {
        return b().optJSONObject("numbers_of_type");
    }

    public final synchronized int g() {
        return b().optInt("open_id", 1);
    }

    public final synchronized boolean h() {
        return b().optBoolean("referrer_handled", false);
    }

    public final synchronized int i() {
        return b().optInt("report_request_id", -1);
    }

    public final synchronized long j() {
        return b().optLong("session_id", -1L);
    }

    public final synchronized void k() {
        synchronized (this) {
        }
        int iOptInt = b().optInt("attribution_id", 1) + 1;
        synchronized (this) {
            JSONObject jSONObjectPut = b().put("attribution_id", iOptInt);
            fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_ATTRIBUTION_ID, value)");
            a(jSONObjectPut);
        }
    }

    public final synchronized void l() {
        synchronized (this) {
        }
        int iOptInt = b().optInt("open_id", 1) + 1;
        synchronized (this) {
            JSONObject jSONObjectPut = b().put("open_id", iOptInt);
            fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_OPEN_ID, value)");
            a(jSONObjectPut);
        }
    }

    public final synchronized boolean m() {
        return b().optBoolean("first_event_done", false);
    }

    public final synchronized boolean n() {
        return b().optBoolean("init_event_done", false);
    }
}
