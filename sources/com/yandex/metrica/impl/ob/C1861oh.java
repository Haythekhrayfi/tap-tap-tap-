package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1861oh extends AbstractC1886ph<Pd> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1786lh f17020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f17021c;

    public C1861oh() {
        this(new C1786lh());
    }

    public C1861oh(C1786lh c1786lh) {
        this.f17020b = c1786lh;
    }

    public void a(long j10) {
        this.f17021c = j10;
    }

    public void a(Uri.Builder builder, Pd pd2) {
        a(builder);
        builder.appendPath("location");
        builder.appendQueryParameter("deviceid", pd2.g());
        builder.appendQueryParameter("device_type", pd2.j());
        builder.appendQueryParameter("uuid", pd2.x());
        builder.appendQueryParameter("analytics_sdk_version_name", "5.0.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45001354");
        builder.appendQueryParameter("analytics_sdk_build_type", pd2.k());
        String strK = pd2.k();
        if (strK != null && strK.contains("source") && !TextUtils.isEmpty("f6c3700f69aeb2f115563bfb01aee99b5faed63c")) {
            builder.appendQueryParameter("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
        }
        builder.appendQueryParameter("app_version_name", pd2.f());
        builder.appendQueryParameter("app_build_number", pd2.b());
        builder.appendQueryParameter("os_version", pd2.p());
        builder.appendQueryParameter("os_api_level", String.valueOf(pd2.o()));
        builder.appendQueryParameter("is_rooted", pd2.i());
        builder.appendQueryParameter("app_framework", pd2.c());
        builder.appendQueryParameter("app_id", pd2.q());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("request_id", String.valueOf(this.f17021c));
        builder.appendQueryParameter("app_set_id", pd2.d());
        builder.appendQueryParameter("app_set_id_scope", pd2.e());
        this.f17020b.a(builder, pd2.a());
    }
}
