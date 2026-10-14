package com.applovin.impl.c;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.utils.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f8880c = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8882b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f8883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f8884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f8885f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<aa> f8881a = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f8886g = System.currentTimeMillis();

    public e(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.o oVar) {
        this.f8882b = oVar;
        this.f8883d = jSONObject;
        this.f8884e = jSONObject2;
        this.f8885f = bVar;
    }

    public int a() {
        return this.f8881a.size();
    }

    public List<aa> b() {
        return this.f8881a;
    }

    public JSONObject c() {
        return this.f8883d;
    }

    public JSONObject d() {
        return this.f8884e;
    }

    public com.applovin.impl.sdk.ad.b e() {
        return this.f8885f;
    }

    public long f() {
        return this.f8886g;
    }

    public List<String> g() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f8883d, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f8880c;
    }

    public int h() {
        return w.a(this.f8883d);
    }
}
