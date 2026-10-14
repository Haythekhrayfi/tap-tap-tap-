package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1911qh extends AbstractC1886ph<C1736jh> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1786lh f17181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1687hh f17182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17183d;

    public C1911qh() {
        this(new C1786lh());
    }

    public C1911qh(C1786lh c1786lh) {
        this.f17181b = c1786lh;
    }

    private void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public void a(long j10) {
        this.f17183d = j10;
    }

    public void a(Uri.Builder builder, C1736jh c1736jh) {
        a(builder);
        builder.path("report");
        C1687hh c1687hh = this.f17182c;
        if (c1687hh != null) {
            builder.appendQueryParameter("deviceid", O2.a(c1687hh.f16286a, c1736jh.g()));
            builder.appendQueryParameter("uuid", O2.a(this.f17182c.f16287b, c1736jh.x()));
            a(builder, "analytics_sdk_version", this.f17182c.f16288c);
            a(builder, "analytics_sdk_version_name", this.f17182c.f16289d);
            builder.appendQueryParameter("app_version_name", O2.a(this.f17182c.f16292g, c1736jh.f()));
            builder.appendQueryParameter("app_build_number", O2.a(this.f17182c.f16294i, c1736jh.b()));
            builder.appendQueryParameter("os_version", O2.a(this.f17182c.f16295j, c1736jh.p()));
            a(builder, "os_api_level", this.f17182c.f16296k);
            a(builder, "analytics_sdk_build_number", this.f17182c.f16290e);
            a(builder, "analytics_sdk_build_type", this.f17182c.f16291f);
            a(builder, "app_debuggable", this.f17182c.f16293h);
            builder.appendQueryParameter("locale", O2.a(this.f17182c.f16297l, c1736jh.l()));
            builder.appendQueryParameter("is_rooted", O2.a(this.f17182c.f16298m, c1736jh.i()));
            builder.appendQueryParameter("app_framework", O2.a(this.f17182c.f16299n, c1736jh.c()));
            a(builder, "attribution_id", this.f17182c.f16300o);
            C1687hh c1687hh2 = this.f17182c;
            String str = c1687hh2.f16291f;
            String str2 = c1687hh2.f16301p;
            if (str != null && str.contains("source") && !TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter("commit_hash", str2);
            }
        }
        builder.appendQueryParameter("api_key_128", c1736jh.C());
        builder.appendQueryParameter("app_id", c1736jh.q());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("model", c1736jh.n());
        builder.appendQueryParameter("manufacturer", c1736jh.m());
        builder.appendQueryParameter("screen_width", String.valueOf(c1736jh.v()));
        builder.appendQueryParameter("screen_height", String.valueOf(c1736jh.u()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(c1736jh.t()));
        builder.appendQueryParameter("scalefactor", String.valueOf(c1736jh.s()));
        builder.appendQueryParameter("device_type", c1736jh.j());
        a(builder, "clids_set", c1736jh.F());
        builder.appendQueryParameter("app_set_id", c1736jh.d());
        builder.appendQueryParameter("app_set_id_scope", c1736jh.e());
        this.f17181b.a(builder, c1736jh.a());
        builder.appendQueryParameter("request_id", String.valueOf(this.f17183d));
    }

    public void a(C1687hh c1687hh) {
        this.f17182c = c1687hh;
    }
}
