package com.yandex.metrica.impl.ob;

import android.net.Uri;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1786lh implements InterfaceC1836nh<C1657gc> {
    private void a(Uri.Builder builder, String str, String str2, C1507ac c1507ac) {
        String str3 = "";
        if (c1507ac == null) {
            builder.appendQueryParameter(str, "");
        } else {
            builder.appendQueryParameter(str, O2.b(c1507ac.f15739b));
            Boolean bool = c1507ac.f15740c;
            if (bool != null) {
                str3 = bool.booleanValue() ? "1" : "0";
            }
        }
        builder.appendQueryParameter(str2, str3);
    }

    public void a(Uri.Builder builder, C1657gc c1657gc) {
        a(builder, "adv_id", "limit_ad_tracking", c1657gc.a().f15827a);
        a(builder, "oaid", "limit_oaid_tracking", c1657gc.b().f15827a);
        a(builder, "yandex_adv_id", "limit_yandex_adv_id_tracking", c1657gc.c().f15827a);
    }
}
