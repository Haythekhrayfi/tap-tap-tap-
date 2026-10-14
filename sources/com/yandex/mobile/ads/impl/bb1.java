package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class bb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gu0 f19159a = new gu0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sw0 f19160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fj f19161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w01 f19162d;

    public bb1() {
        sw0 sw0Var = new sw0();
        this.f19160b = sw0Var;
        this.f19161c = new fj(sw0Var);
        this.f19162d = new w01();
    }

    public final pa1 a(Context context, k2 k2Var, ab1 ab1Var, Object obj, ta1 ta1Var) {
        z4 z4Var = new z4(ab1Var.a());
        eb1 eb1Var = new eb1(z4Var);
        Uri.Builder builderAppendQueryParameter = Uri.parse(z4Var.a().a()).buildUpon().appendQueryParameter("charset", "UTF-8");
        Objects.requireNonNull(this.f19159a);
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("rnd", Integer.toString(new Random().nextInt(89999999) + 10000000));
        wr wrVarJ = k2Var.j();
        sw0 sw0Var = this.f19160b;
        Map<String, String> mapB = ab1Var.b();
        Objects.requireNonNull(sw0Var);
        if (mapB != null) {
            for (Map.Entry<String, String> entry : mapB.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    sw0.a(builderAppendQueryParameter2, key, value);
                }
            }
        }
        sw0 sw0Var2 = this.f19160b;
        String strE = z4Var.e();
        Objects.requireNonNull(sw0Var2);
        sw0.a(builderAppendQueryParameter2, "video-session-id", strE);
        Objects.requireNonNull(this.f19162d);
        if (!w01.a(context)) {
            sw0 sw0Var3 = this.f19160b;
            String strF = wrVarJ.f();
            Objects.requireNonNull(sw0Var3);
            sw0.a(builderAppendQueryParameter2, "uuid", strF);
            sw0 sw0Var4 = this.f19160b;
            String strD = wrVarJ.d();
            Objects.requireNonNull(sw0Var4);
            sw0.a(builderAppendQueryParameter2, "mauid", strD);
        }
        this.f19161c.a(context, builderAppendQueryParameter2);
        new yr(context, k2Var).a(context, builderAppendQueryParameter2);
        pa1 pa1Var = new pa1(context, builderAppendQueryParameter2.build().toString(), new gi1.b(ta1Var), ab1Var, eb1Var);
        pa1Var.b(obj);
        return pa1Var;
    }
}
