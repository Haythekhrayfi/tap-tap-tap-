package com.yandex.metrica.impl.ob;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes.dex */
public class Xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f15486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f15487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f15488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f15489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EnumC1745k1 f15493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f15494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f15495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f15497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f15498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f15499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f15500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EnumC1817mn f15501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final N0 f15502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final M.b.a f15503t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Wc.a f15504u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f15505v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f15506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final I0 f15507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f15508y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Integer f15509z;

    public Xe(ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger("type");
        this.f15493j = asInteger == null ? null : EnumC1745k1.a(asInteger.intValue());
        this.f15494k = contentValues.getAsInteger("custom_type");
        this.f15484a = contentValues.getAsString("name");
        this.f15485b = contentValues.getAsString("value");
        this.f15489f = contentValues.getAsLong("time");
        this.f15486c = contentValues.getAsInteger("number");
        this.f15487d = contentValues.getAsInteger("global_number");
        this.f15488e = contentValues.getAsInteger("number_of_type");
        this.f15491h = contentValues.getAsString("cell_info");
        this.f15490g = contentValues.getAsString("location_info");
        this.f15492i = contentValues.getAsString("wifi_network_info");
        this.f15495l = contentValues.getAsString("error_environment");
        this.f15496m = contentValues.getAsString("user_info");
        this.f15497n = contentValues.getAsInteger("truncated");
        this.f15498o = contentValues.getAsInteger("connection_type");
        this.f15499p = contentValues.getAsString("cellular_connection_type");
        this.f15500q = contentValues.getAsString("profile_id");
        this.f15501r = EnumC1817mn.a(contentValues.getAsInteger("encrypting_mode"));
        this.f15502s = N0.a(contentValues.getAsInteger("first_occurrence_status"));
        this.f15503t = M.b.a.a(contentValues.getAsInteger("battery_charge_type"));
        this.f15504u = Wc.a.a(contentValues.getAsString("collection_mode"));
        this.f15505v = contentValues.getAsInteger("has_omitted_data");
        this.f15506w = contentValues.getAsInteger("call_state");
        Integer asInteger2 = contentValues.getAsInteger("source");
        this.f15507x = asInteger2 != null ? I0.a(asInteger2.intValue()) : null;
        this.f15508y = contentValues.getAsBoolean("attribution_id_changed");
        this.f15509z = contentValues.getAsInteger("open_id");
    }
}
