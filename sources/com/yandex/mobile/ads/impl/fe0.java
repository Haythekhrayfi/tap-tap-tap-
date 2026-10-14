package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.mobile.ads.mediation.base.MediatedBidderTokenLoadListener;
import com.yandex.mobile.ads.mediation.base.MediatedBidderTokenLoader;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class fe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final od0<com.yandex.mobile.ads.mediation.base.a> f20665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ee0 f20666b = new ee0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final de0 f20667c;

    public class a implements MediatedBidderTokenLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ce0 f20668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f20669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.yandex.mobile.ads.mediation.base.a f20670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f20671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ve f20672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f20673f;

        public a(ce0 ce0Var, Context context, com.yandex.mobile.ads.mediation.base.a aVar, b bVar, ve veVar, long j10) {
            this.f20668a = ce0Var;
            this.f20669b = context;
            this.f20670c = aVar;
            this.f20671d = bVar;
            this.f20672e = veVar;
            this.f20673f = j10;
        }

        @Override // com.yandex.mobile.ads.mediation.base.MediatedBidderTokenLoadListener
        public final void onBidderTokenFailedToLoad(String str) {
            fe0.a(fe0.this, this.f20669b, this.f20668a, this.f20670c, str, null, this.f20671d);
        }

        @Override // com.yandex.mobile.ads.mediation.base.MediatedBidderTokenLoadListener
        public final void onBidderTokenLoaded(String str) {
            JSONObject jSONObject;
            if (TextUtils.isEmpty(str)) {
                fe0.a(fe0.this, this.f20669b, this.f20668a, this.f20670c, this.f20668a.c() + " provided empty token", null, this.f20671d);
                return;
            }
            if (this.f20672e.a()) {
                fe0.a(fe0.this, this.f20669b, this.f20668a, this.f20670c, this.f20668a.c() + " didn't provide bidder token after timeout", Long.valueOf(SystemClock.elapsedRealtime() - this.f20673f), this.f20671d);
                return;
            }
            ee0 ee0Var = fe0.this.f20666b;
            ce0 ce0Var = this.f20668a;
            Objects.requireNonNull(ee0Var);
            String strC = ce0Var.c();
            Map<String, String> mapD = ce0Var.d();
            Map<String, String> mapG = ce0Var.g();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adapter", strC);
                if (mapD != null) {
                    jSONObject2.put("bidding_info", new JSONObject(mapD));
                }
                jSONObject2.put("network_data", new JSONObject(mapG));
                jSONObject2.put("bidder_token", str);
                jSONObject = jSONObject2;
            } catch (JSONException e10) {
                x60.a(e10, "Can't create mediation network json object", new Object[0]);
                jSONObject = null;
            }
            if (jSONObject == null) {
                fe0.a(fe0.this, this.f20669b, this.f20668a, this.f20670c, "Can't create bidding data json object for network.", null, this.f20671d);
            } else {
                fe0.a(fe0.this, this.f20669b, this.f20668a, this.f20670c, jSONObject, this.f20671d);
            }
        }
    }

    public interface b {
    }

    public fe0(qd0 qd0Var) {
        this.f20665a = new od0<>(qd0Var);
        this.f20667c = new de0(qd0Var);
    }

    public static void a(fe0 fe0Var, Context context, ce0 ce0Var, com.yandex.mobile.ads.mediation.base.a aVar, String str, Long l10, b bVar) {
        fe0Var.f20667c.a(context, ce0Var, aVar, str, l10);
        ((in0.a) bVar).f21750b.countDown();
    }

    public static void a(fe0 fe0Var, Context context, ce0 ce0Var, com.yandex.mobile.ads.mediation.base.a aVar, JSONObject jSONObject, b bVar) {
        fe0Var.f20667c.a(context, ce0Var, aVar);
        in0.a aVar2 = (in0.a) bVar;
        synchronized (in0.this.f21746b) {
            aVar2.f21749a.add(jSONObject);
        }
        aVar2.f21750b.countDown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, ce0 ce0Var, ve veVar, b bVar) {
        String string;
        Long l10;
        de0 de0Var;
        com.yandex.mobile.ads.mediation.base.a aVarA = this.f20665a.a(context, ce0Var, (Class<com.yandex.mobile.ads.mediation.base.a>) com.yandex.mobile.ads.mediation.base.a.class);
        if (!(aVarA instanceof MediatedBidderTokenLoader)) {
            if (aVarA != 0) {
                l10 = null;
                string = "Can't create bidder token loader.";
                de0Var = this.f20667c;
            }
            ((in0.a) bVar).f21750b.countDown();
        }
        try {
            ((MediatedBidderTokenLoader) aVarA).loadBidderToken(context, ce0Var.g(), new a(ce0Var, context, aVarA, bVar, veVar, SystemClock.elapsedRealtime()));
            return;
        } catch (Throwable th) {
            string = th.toString();
            l10 = null;
            de0Var = this.f20667c;
        }
        de0Var.a(context, ce0Var, aVarA, string, l10);
        ((in0.a) bVar).f21750b.countDown();
    }
}
