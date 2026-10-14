package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Wl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f15410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f15411g;

    public enum a {
        LIST("LIST"),
        LABEL("LABEL"),
        BUTTON("BUTTON"),
        CONTAINER("CONTAINER"),
        TOOLBAR("TOOLBAR"),
        INPUT("INPUT"),
        IMAGE("IMAGE"),
        WEBVIEW("WEBVIEW"),
        OTHER("OTHER");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15422a;

        a(String str) {
            this.f15422a = str;
        }
    }

    public enum b {
        TEXT_TOO_LONG("TEXT_TOO_LONG"),
        REGEXP_NOT_MATCHED("REGEXP_NOT_MATCHED"),
        IRRELEVANT_CLASS("IRRELEVANT_CLASS"),
        BAD_REGEXP_MATCHED("BAD_REGEXP_MATCHED"),
        EQUALS("EQUALS"),
        CONTAINS("CONTAINS");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15430a;

        b(String str) {
            this.f15430a = str;
        }
    }

    public enum c {
        VIEW_CONTAINER("VIEW_CONTAINER"),
        VIEW("VIEW");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15434a;

        c(String str) {
            this.f15434a = str;
        }
    }

    public Wl(String str, String str2, b bVar, int i10, boolean z10, c cVar, a aVar) {
        this.f15405a = str;
        this.f15406b = str2;
        this.f15407c = bVar;
        this.f15408d = i10;
        this.f15409e = z10;
        this.f15410f = cVar;
        this.f15411g = aVar;
    }

    public b a(C1541bl c1541bl) {
        return this.f15407c;
    }

    public JSONArray a(Kl kl) {
        return null;
    }

    public JSONObject a(Kl kl, b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f15410f.f15434a);
            if (bVar == null) {
                jSONObject.put("cnt", a(kl));
            }
            if (kl.f14363e) {
                JSONObject jSONObjectPut = new JSONObject().put("ct", this.f15411g.f15422a).put("cn", this.f15405a).put("rid", this.f15406b).put("d", this.f15408d).put("lc", this.f15409e).put("if", bVar != null);
                if (bVar != null) {
                    jSONObjectPut.put("fr", bVar.f15430a);
                }
                jSONObject.put(IntegerTokenConverter.CONVERTER_KEY, jSONObjectPut);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public boolean a() {
        return false;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("UiElement{mClassName='");
        l1.c.a(sbA, this.f15405a, CoreConstants.SINGLE_QUOTE_CHAR, ", mId='");
        l1.c.a(sbA, this.f15406b, CoreConstants.SINGLE_QUOTE_CHAR, ", mParseFilterReason=");
        sbA.append(this.f15407c);
        sbA.append(", mDepth=");
        sbA.append(this.f15408d);
        sbA.append(", mListItem=");
        sbA.append(this.f15409e);
        sbA.append(", mViewType=");
        sbA.append(this.f15410f);
        sbA.append(", mClassType=");
        sbA.append(this.f15411g);
        sbA.append('}');
        return sbA.toString();
    }
}
