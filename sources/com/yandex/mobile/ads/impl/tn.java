package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class tn implements lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f25406b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lm f25407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zu f25408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ab f25409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private xk f25410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private lm f25411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d91 f25412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private jm f25413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ou0 f25414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private lm f25415k;

    public static final class a implements lm.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f25416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final lm.a f25417b;

        public a(Context context) {
            this(context, new ao.a());
        }

        public a(Context context, lm.a aVar) {
            this.f25416a = context.getApplicationContext();
            this.f25417b = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.lm.a
        public final lm a() {
            return new tn(this.f25416a, this.f25417b.a());
        }
    }

    public tn(Context context, lm lmVar) {
        this.f25405a = context.getApplicationContext();
        this.f25407c = (lm) pa.a(lmVar);
    }

    private void a(lm lmVar) {
        for (int i10 = 0; i10 < this.f25406b.size(); i10++) {
            lmVar.a((g81) this.f25406b.get(i10));
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws IOException {
        lm lmVar;
        ab abVar;
        boolean z10 = true;
        pa.b(this.f25415k == null);
        String scheme = pmVar.f24101a.getScheme();
        Uri uri = pmVar.f24101a;
        int i10 = da1.f19803a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !Action.FILE_ATTRIBUTE.equals(scheme2)) {
            z10 = false;
        }
        if (z10) {
            String path = pmVar.f24101a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f25408d == null) {
                    zu zuVar = new zu();
                    this.f25408d = zuVar;
                    a(zuVar);
                }
                lmVar = this.f25408d;
            } else {
                if (this.f25409e == null) {
                    abVar = new ab(this.f25405a);
                    this.f25409e = abVar;
                    a(abVar);
                }
                lmVar = this.f25409e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f25409e == null) {
                abVar = new ab(this.f25405a);
                this.f25409e = abVar;
                a(abVar);
            }
            lmVar = this.f25409e;
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            if (this.f25410f == null) {
                xk xkVar = new xk(this.f25405a);
                this.f25410f = xkVar;
                a(xkVar);
            }
            lmVar = this.f25410f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f25411g == null) {
                try {
                    lm lmVar2 = (lm) Class.forName("com.yandex.mobile.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f25411g = lmVar2;
                    a(lmVar2);
                } catch (ClassNotFoundException unused) {
                    p90.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.f25411g == null) {
                    this.f25411g = this.f25407c;
                }
            }
            lmVar = this.f25411g;
        } else if ("udp".equals(scheme)) {
            if (this.f25412h == null) {
                d91 d91Var = new d91(0);
                this.f25412h = d91Var;
                a(d91Var);
            }
            lmVar = this.f25412h;
        } else if ("data".equals(scheme)) {
            if (this.f25413i == null) {
                jm jmVar = new jm();
                this.f25413i = jmVar;
                a(jmVar);
            }
            lmVar = this.f25413i;
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            if (this.f25414j == null) {
                ou0 ou0Var = new ou0(this.f25405a);
                this.f25414j = ou0Var;
                a(ou0Var);
            }
            lmVar = this.f25414j;
        } else {
            lmVar = this.f25407c;
        }
        this.f25415k = lmVar;
        return this.f25415k.a(pmVar);
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void a(g81 g81Var) {
        Objects.requireNonNull(g81Var);
        this.f25407c.a(g81Var);
        this.f25406b.add(g81Var);
        zu zuVar = this.f25408d;
        if (zuVar != null) {
            zuVar.a(g81Var);
        }
        ab abVar = this.f25409e;
        if (abVar != null) {
            abVar.a(g81Var);
        }
        xk xkVar = this.f25410f;
        if (xkVar != null) {
            xkVar.a(g81Var);
        }
        lm lmVar = this.f25411g;
        if (lmVar != null) {
            lmVar.a(g81Var);
        }
        d91 d91Var = this.f25412h;
        if (d91Var != null) {
            d91Var.a(g81Var);
        }
        jm jmVar = this.f25413i;
        if (jmVar != null) {
            jmVar.a(g81Var);
        }
        ou0 ou0Var = this.f25414j;
        if (ou0Var != null) {
            ou0Var.a(g81Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Map<String, List<String>> b() {
        lm lmVar = this.f25415k;
        return lmVar == null ? Collections.emptyMap() : lmVar.b();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void close() throws IOException {
        lm lmVar = this.f25415k;
        if (lmVar != null) {
            try {
                lmVar.close();
            } finally {
                this.f25415k = null;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        lm lmVar = this.f25415k;
        if (lmVar == null) {
            return null;
        }
        return lmVar.d();
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        lm lmVar = this.f25415k;
        Objects.requireNonNull(lmVar);
        return lmVar.read(bArr, i10, i11);
    }
}
