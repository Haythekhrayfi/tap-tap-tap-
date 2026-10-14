package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class yr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d8 f26989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wr f26990b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i90 f26994f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k01 f26991c = new k01();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w01 f26992d = new w01();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ep f26993e = new ep();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e8 f26995g = new e8();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zr f26996h = new zr();

    public yr(Context context, k2 k2Var) {
        this.f26989a = k2Var.e();
        this.f26990b = k2Var.j();
        this.f26994f = i90.a(context);
    }

    private static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final void a(Context context, Uri.Builder builder) {
        String strValueOf;
        Location locationA;
        a(builder, "app_id", context.getPackageName());
        String str = null;
        boolean z10 = false;
        try {
            strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e10) {
            x60.a(e10, e10.getMessage(), new Object[0]);
            strValueOf = null;
        }
        a(builder, "app_version_code", strValueOf);
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e11) {
            x60.a(e11, e11.getMessage(), new Object[0]);
        }
        a(builder, "app_version_name", str);
        a(builder, "sdk_version", this.f26991c.a());
        a(builder, "sdk_version_name", this.f26991c.b());
        a(builder, this.f26996h.b(), this.f26993e.a(context));
        a(builder, "locale", this.f26993e.b(context));
        String strC = this.f26996h.c();
        Objects.requireNonNull(this.f26993e);
        a(builder, strC, ep.a());
        String strD = this.f26996h.d();
        Objects.requireNonNull(this.f26993e);
        a(builder, strD, Build.MODEL);
        String strE = this.f26996h.e();
        Objects.requireNonNull(this.f26993e);
        a(builder, strE, "android");
        String strF = this.f26996h.f();
        Objects.requireNonNull(this.f26993e);
        a(builder, strF, Build.VERSION.RELEASE);
        Objects.requireNonNull(this.f26992d);
        if (w01.b(context) && (locationA = this.f26994f.a()) != null) {
            a(builder, "location_timestamp", String.valueOf(locationA.getTime()));
            a(builder, "lat", String.valueOf(locationA.getLatitude()));
            a(builder, "lon", String.valueOf(locationA.getLongitude()));
            a(builder, "precision", String.valueOf(Math.round(locationA.getAccuracy())));
        }
        Objects.requireNonNull(this.f26992d);
        if (w01.b(context)) {
            a(builder, this.f26996h.a(), this.f26990b.b());
            f8 f8VarA = this.f26989a.a();
            if (f8VarA != null) {
                boolean zB = f8VarA.b();
                String strA = f8VarA.a();
                Objects.requireNonNull(this.f26995g);
                boolean z11 = (TextUtils.isEmpty(strA) || "00000000-0000-0000-0000-000000000000".equals(strA)) ? false : true;
                if (!zB && z11) {
                    a(builder, "google_aid", strA);
                }
            }
            f8 f8VarB = this.f26989a.b();
            if (f8VarB != null) {
                boolean zB2 = f8VarB.b();
                String strA2 = f8VarB.a();
                Objects.requireNonNull(this.f26995g);
                if (!TextUtils.isEmpty(strA2) && !"00000000-0000-0000-0000-000000000000".equals(strA2)) {
                    z10 = true;
                }
                if (zB2 || !z10) {
                    return;
                }
                a(builder, "huawei_oaid", strA2);
            }
        }
    }
}
