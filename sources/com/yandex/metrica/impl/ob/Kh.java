package com.yandex.metrica.impl.ob;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lh f14356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.metrica.e f14357b;

    public Kh() {
        this(new Lh(), Oh.a());
    }

    public Kh(Lh lh, com.yandex.metrica.e eVar) {
        this.f14356a = lh;
        this.f14357b = eVar;
    }

    public void a(C1785lg.e.a aVar) {
        String string;
        com.yandex.metrica.e eVar = this.f14357b;
        Objects.requireNonNull(this.f14356a);
        try {
            string = new JSONObject().put(FacebookMediationAdapter.KEY_ID, aVar.f16842a).toString();
        } catch (Throwable th) {
            string = th.toString();
        }
        eVar.b("provided_request_schedule", string);
    }

    public void a(C1785lg.e.b bVar) {
        this.f14357b.b("provided_request_result", this.f14356a.a(bVar));
    }

    public void b(C1785lg.e.a aVar) {
        String string;
        com.yandex.metrica.e eVar = this.f14357b;
        Objects.requireNonNull(this.f14356a);
        try {
            string = new JSONObject().put(FacebookMediationAdapter.KEY_ID, aVar.f16842a).toString();
        } catch (Throwable th) {
            string = th.toString();
        }
        eVar.b("provided_request_send", string);
    }
}
