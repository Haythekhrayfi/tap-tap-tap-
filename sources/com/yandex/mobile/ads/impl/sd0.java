package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class sd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2 f25046a;

    public sd0(k2 k2Var) {
        this.f25046a = k2Var;
    }

    public HashMap a(Context context) {
        HashMap map = new HashMap();
        AdRequest adRequestA = this.f25046a.a();
        if (adRequestA != null) {
            Map<String, String> parameters = adRequestA.getParameters();
            if (parameters != null) {
                map.putAll(parameters);
            }
            map.put("age", adRequestA.getAge());
            map.put("context_tags", adRequestA.getContextTags());
            map.put("gender", adRequestA.getGender());
            Boolean boolD = i01.b().d();
            if (boolD != null) {
                map.put("age_restricted_user", boolD);
            }
            nz0 nz0VarA = i01.b().a(context);
            Boolean boolP = nz0VarA != null ? nz0VarA.P() : null;
            if (boolP != null) {
                map.put("user_consent", boolP);
            }
        }
        return map;
    }
}
