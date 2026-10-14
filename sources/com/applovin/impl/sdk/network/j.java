package com.applovin.impl.sdk.network;

import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f10950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f10951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f10952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f10953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r.a f10954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f10959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f10960n;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f10965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f10966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map<String, Object> f10967g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r.a f10968h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f10969i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f10970j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f10971k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f10972l;

        public a a(r.a aVar) {
            this.f10968h = aVar;
            return this;
        }

        public a a(String str) {
            this.f10961a = str;
            return this;
        }

        public a a(Map<String, String> map) {
            this.f10965e = map;
            return this;
        }

        public a a(boolean z10) {
            this.f10969i = z10;
            return this;
        }

        public j a() {
            return new j(this);
        }

        public a b(String str) {
            this.f10962b = str;
            return this;
        }

        public a b(Map<String, String> map) {
            this.f10966f = map;
            return this;
        }

        public a b(boolean z10) {
            this.f10970j = z10;
            return this;
        }

        public a c(String str) {
            this.f10963c = str;
            return this;
        }

        public a c(Map<String, Object> map) {
            this.f10967g = map;
            return this;
        }

        public a c(boolean z10) {
            this.f10971k = z10;
            return this;
        }

        public a d(String str) {
            this.f10964d = str;
            return this;
        }

        public a d(boolean z10) {
            this.f10972l = z10;
            return this;
        }
    }

    private j(a aVar) {
        this.f10947a = UUID.randomUUID().toString();
        this.f10948b = aVar.f10962b;
        this.f10949c = aVar.f10963c;
        this.f10950d = aVar.f10964d;
        this.f10951e = aVar.f10965e;
        this.f10952f = aVar.f10966f;
        this.f10953g = aVar.f10967g;
        this.f10954h = aVar.f10968h;
        this.f10955i = aVar.f10969i;
        this.f10956j = aVar.f10970j;
        this.f10957k = aVar.f10971k;
        this.f10958l = aVar.f10972l;
        this.f10959m = aVar.f10961a;
        this.f10960n = 0;
    }

    public j(JSONObject jSONObject, o oVar) throws Exception {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        Map<String, String> mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap<>();
        Map<String, String> mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap<>();
        Map<String, Object> mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap<>();
        this.f10947a = string;
        this.f10948b = string3;
        this.f10959m = string2;
        this.f10949c = string4;
        this.f10950d = string5;
        this.f10951e = mapSynchronizedMap;
        this.f10952f = mapSynchronizedMap2;
        this.f10953g = mapSynchronizedMap3;
        this.f10954h = r.a.a(jSONObject.optInt("encodingType", r.a.DEFAULT.a()));
        this.f10955i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f10956j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f10957k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f10958l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f10960n = i10;
    }

    public static a p() {
        return new a();
    }

    public String a() {
        return this.f10948b;
    }

    public String b() {
        return this.f10949c;
    }

    public String c() {
        return this.f10950d;
    }

    public Map<String, String> d() {
        return this.f10951e;
    }

    public Map<String, String> e() {
        return this.f10952f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f10947a.equals(((j) obj).f10947a);
    }

    public Map<String, Object> f() {
        return this.f10953g;
    }

    public r.a g() {
        return this.f10954h;
    }

    public boolean h() {
        return this.f10955i;
    }

    public int hashCode() {
        return this.f10947a.hashCode();
    }

    public boolean i() {
        return this.f10956j;
    }

    public boolean j() {
        return this.f10958l;
    }

    public String k() {
        return this.f10959m;
    }

    public int l() {
        return this.f10960n;
    }

    public void m() {
        this.f10960n++;
    }

    public void n() {
        Map<String, String> map = CollectionUtils.map(this.f10951e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f10951e = map;
    }

    public JSONObject o() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f10947a);
        jSONObject.put("communicatorRequestId", this.f10959m);
        jSONObject.put("httpMethod", this.f10948b);
        jSONObject.put("targetUrl", this.f10949c);
        jSONObject.put("backupUrl", this.f10950d);
        jSONObject.put("encodingType", this.f10954h);
        jSONObject.put("isEncodingEnabled", this.f10955i);
        jSONObject.put("gzipBodyEncoding", this.f10956j);
        jSONObject.put("isAllowedPreInitEvent", this.f10957k);
        jSONObject.put("attemptNumber", this.f10960n);
        if (this.f10951e != null) {
            jSONObject.put("parameters", new JSONObject(this.f10951e));
        }
        if (this.f10952f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f10952f));
        }
        if (this.f10953g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f10953g));
        }
        return jSONObject;
    }

    public boolean q() {
        return this.f10957k;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PostbackRequest{uniqueId='");
        l1.c.a(sbA, this.f10947a, CoreConstants.SINGLE_QUOTE_CHAR, ", communicatorRequestId='");
        l1.c.a(sbA, this.f10959m, CoreConstants.SINGLE_QUOTE_CHAR, ", httpMethod='");
        l1.c.a(sbA, this.f10948b, CoreConstants.SINGLE_QUOTE_CHAR, ", targetUrl='");
        l1.c.a(sbA, this.f10949c, CoreConstants.SINGLE_QUOTE_CHAR, ", backupUrl='");
        l1.c.a(sbA, this.f10950d, CoreConstants.SINGLE_QUOTE_CHAR, ", attemptNumber=");
        sbA.append(this.f10960n);
        sbA.append(", isEncodingEnabled=");
        sbA.append(this.f10955i);
        sbA.append(", isGzipBodyEncoding=");
        sbA.append(this.f10956j);
        sbA.append(", isAllowedPreInitEvent=");
        sbA.append(this.f10957k);
        sbA.append(", shouldFireInWebView=");
        return s.a(sbA, this.f10958l, '}');
    }
}
