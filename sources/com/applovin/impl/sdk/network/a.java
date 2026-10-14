package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.x;
import com.applovin.impl.sdk.o;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c<JSONObject> f10818b;

    public a(String str, c<JSONObject> cVar, o oVar) {
        super("CommunicatorRequestTask", oVar, str);
        this.f10817a = str;
        this.f10818b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10534f.G().a((com.applovin.impl.sdk.e.d) new x<JSONObject>(this.f10818b, this.f10534f, g()) { // from class: com.applovin.impl.sdk.network.a.1
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, JSONObject jSONObject) {
                this.f10534f.X().a(a.this.f10817a, a.this.f10818b.a(), i10, jSONObject, str, false);
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject, int i10) {
                this.f10534f.X().a(a.this.f10817a, a.this.f10818b.a(), i10, jSONObject, null, true);
            }
        });
    }
}
