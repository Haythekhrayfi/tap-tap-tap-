package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppLovinAdLoadListener f10654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f10655b;

    public static final class a extends com.applovin.impl.c.e {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.o oVar) {
            super(jSONObject, jSONObject2, bVar, oVar);
        }

        public void a(com.applovin.impl.sdk.utils.aa aaVar) {
            if (aaVar == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f8881a.add(aaVar);
        }
    }

    public static final class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10656a;

        public b(String str, com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
            super(eVar, appLovinAdLoadListener, oVar);
            this.f10656a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a(b(this.f10656a));
        }
    }

    public static final class c extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f10657a;

        public c(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
            super(eVar, appLovinAdLoadListener, oVar);
            this.f10657a = eVar.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.c.f fVar;
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f10657a, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.e(this.f10535g, "No VAST response received.");
                }
                fVar = com.applovin.impl.c.f.NO_WRAPPER_RESPONSE;
            } else if (string.length() < ((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.ff)).intValue()) {
                a(b(string));
                return;
            } else {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.e(this.f10535g, "VAST response is over max length");
                }
                fVar = com.applovin.impl.c.f.XML_PARSING;
            }
            a(fVar);
        }
    }

    public static final class d extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.utils.aa f10658a;

        public d(com.applovin.impl.sdk.utils.aa aaVar, com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
            super(eVar, appLovinAdLoadListener, oVar);
            if (aaVar == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (eVar == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f10658a = aaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Processing VAST Wrapper response...");
            }
            a(this.f10658a);
        }
    }

    public u(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        super("TaskProcessVastResponse", oVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f10654a = appLovinAdLoadListener;
        this.f10655b = (a) eVar;
    }

    public static u a(com.applovin.impl.sdk.utils.aa aaVar, com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        return new d(aaVar, eVar, appLovinAdLoadListener, oVar);
    }

    public static u a(String str, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        return new b(str, new a(jSONObject, jSONObject2, bVar, oVar), appLovinAdLoadListener, oVar);
    }

    public static u a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        return new c(new a(jSONObject, jSONObject2, bVar, oVar), appLovinAdLoadListener, oVar);
    }

    public void a(com.applovin.impl.c.f fVar) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.e(this.f10535g, "Failed to process VAST response due to VAST error code " + fVar);
        }
        com.applovin.impl.c.m.a(this.f10655b, this.f10654a, fVar, -6, this.f10534f);
    }

    public void a(com.applovin.impl.sdk.utils.aa aaVar) {
        com.applovin.impl.c.f fVar;
        com.applovin.impl.sdk.e.d wVar;
        int iA = this.f10655b.a();
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Finished parsing XML at depth " + iA);
        }
        this.f10655b.a(aaVar);
        if (!com.applovin.impl.c.m.a(aaVar)) {
            if (com.applovin.impl.c.m.b(aaVar)) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.b(this.f10535g, "VAST response is inline. Rendering ad...");
                }
                wVar = new w(this.f10655b, this.f10654a, this.f10534f);
                this.f10534f.G().a(wVar);
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.e(this.f10535g, "VAST response is an error");
            }
            fVar = com.applovin.impl.c.f.NO_WRAPPER_RESPONSE;
            a(fVar);
        }
        int iIntValue = ((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fg)).intValue();
        if (iA < iIntValue) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "VAST response is wrapper. Resolving...");
            }
            wVar = new aa(this.f10655b, this.f10654a, this.f10534f);
            this.f10534f.G().a(wVar);
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.e(this.f10535g, "Reached beyond max wrapper depth of " + iIntValue);
        }
        fVar = com.applovin.impl.c.f.WRAPPER_LIMIT_REACHED;
        a(fVar);
    }

    public com.applovin.impl.sdk.utils.aa b(String str) {
        try {
            return com.applovin.impl.sdk.utils.ab.a(str, this.f10534f);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Failed to process VAST response", th);
            }
            a(com.applovin.impl.c.f.XML_PARSING);
            return null;
        }
    }
}
