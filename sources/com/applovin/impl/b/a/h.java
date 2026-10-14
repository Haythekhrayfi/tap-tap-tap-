package com.applovin.impl.b.a;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends d {
    public h(JSONObject jSONObject, o oVar) {
        super(jSONObject, oVar);
    }

    public String e() {
        return a("main_screen_title");
    }

    public String f() {
        return a("applovin_learn_more_screen_title");
    }

    public String g() {
        return StringUtils.join("\n\n", this.f8684a.aa().f());
    }

    public String h() {
        return StringUtils.join("\n\n", this.f8684a.aa().g());
    }
}
