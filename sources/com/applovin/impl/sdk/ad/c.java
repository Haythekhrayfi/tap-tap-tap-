package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import android.util.Base64;
import androidx.activity.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10206b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10211d;

        a(String str) {
            this.f10211d = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f10211d;
        }
    }

    public c(String str, o oVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f10206b = str;
        this.f10205a = oVar;
    }

    private String a(com.applovin.impl.sdk.c.b<String> bVar) {
        for (String str : this.f10205a.b(bVar)) {
            if (this.f10206b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }

    public String a() {
        return this.f10206b;
    }

    public a b() {
        if (a(com.applovin.impl.sdk.c.b.bp) != null) {
            return a.REGULAR;
        }
        return a(com.applovin.impl.sdk.c.b.bq) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String c() {
        String strA = a(com.applovin.impl.sdk.c.b.bp);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(com.applovin.impl.sdk.c.b.bq);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public JSONObject d() {
        if (b() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f10206b.substring(c().length()), 0), "UTF-8"));
                this.f10205a.F();
                if (y.a()) {
                    this.f10205a.F().b("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e10) {
                this.f10205a.F();
                if (y.a()) {
                    this.f10205a.F().b("AdToken", "Unable to decode token '" + this.f10206b + "' into JSON", e10);
                }
                this.f10205a.ag().a("AdToken", "decodeFullAdResponseStr", e10);
                return null;
            }
        } catch (UnsupportedEncodingException e11) {
            this.f10205a.F();
            if (y.a()) {
                this.f10205a.F().b("AdToken", k.a(defpackage.a.a("Unable to process ad response from token '"), this.f10206b, "'"), e11);
            }
            this.f10205a.ag().a("AdToken", "decodeFullAdResponse", e11);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        String str = this.f10206b;
        String str2 = ((c) obj).f10206b;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        String str = this.f10206b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbA = androidx.activity.result.c.a("AdToken{id=", StringUtils.prefixToIndex(32, this.f10206b), ", type=");
        sbA.append(b());
        sbA.append('}');
        return sbA.toString();
    }
}
