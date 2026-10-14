package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a5 f26848a = new a5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ai1 f26849b = new ai1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sw0 f26850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fj f26851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sr f26852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w01 f26853f;

    public yh1() {
        sw0 sw0Var = new sw0();
        this.f26850c = sw0Var;
        this.f26851d = new fj(sw0Var);
        this.f26852e = new sr();
        this.f26853f = new w01();
    }

    public final vh1 a(Context context, k2 k2Var, wh1 wh1Var, Object obj, zh1 zh1Var) {
        String strA = wh1Var.a();
        String strC = wh1Var.c();
        String strB = wh1Var.b();
        a5 a5Var = this.f26848a;
        Map<String, String> mapD = wh1Var.d();
        Objects.requireNonNull(a5Var);
        HashMap mapA = a5.a(mapD);
        wr wrVarJ = k2Var.j();
        String strF = wrVarJ.f();
        String strD = wrVarJ.d();
        String strA2 = wrVarJ.a();
        if (TextUtils.isEmpty(strA2)) {
            strA2 = "https://mobile.yandexadexchange.net";
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(strA2).buildUpon().appendPath(strA).appendPath("vmap").appendPath(strC).appendQueryParameter("video-category-id", strB);
        Objects.requireNonNull(this.f26853f);
        if (!w01.a(context)) {
            Objects.requireNonNull(this.f26850c);
            sw0.a(builderAppendQueryParameter, "uuid", strF);
            Objects.requireNonNull(this.f26850c);
            sw0.a(builderAppendQueryParameter, "mauid", strD);
        }
        this.f26851d.a(context, builderAppendQueryParameter);
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        new yr(context, k2Var).a(context, builderAppendQueryParameter);
        vh1 vh1Var = new vh1(context, this.f26852e.a(context, builderAppendQueryParameter.build().toString()), new gi1.b(zh1Var), wh1Var, this.f26849b);
        vh1Var.b(obj);
        return vh1Var;
    }
}
