package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.base.AdResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xd<T> extends r71<k2, AdResponse<T>> {
    public final d5 A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f26493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Context f26494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final k2 f26495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final i3 f26496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final bn0<T> f26497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final b11 f26498z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(Context context, b11 b11Var, k2 k2Var, String str, String str2, bn0 bn0Var, ke.a aVar, ce ceVar) {
        super(context, 1, str, aVar, k2Var, ceVar);
        Objects.requireNonNull(k2Var.j());
        this.A = new d5();
        x60.e("Loading data ... url: %s, query: %s", str, str2);
        a(context, k2Var.i());
        this.f26493u = str2;
        this.f26495w = k2Var;
        this.f26494v = context.getApplicationContext();
        this.f26497y = bn0Var;
        this.f26498z = b11Var;
        this.f26496x = new i3();
    }

    public xd(Context context, k2 k2Var, String str, String str2, bn0 bn0Var, ke.a aVar, ce ceVar) {
        this(context, b11.a(context), k2Var, str, str2, bn0Var, aVar, ceVar);
    }

    private void a(Context context, int i10) {
        a(this.A.a(context, i10));
    }

    @Override // com.yandex.mobile.ads.impl.r71
    public final gx0<AdResponse<T>> a(wm0 wm0Var, int i10) {
        if (b(wm0Var, i10)) {
            Map<String, String> map = wm0Var.f26321c;
            l6 l6VarA = l6.a(map.get(t00.b(4)));
            if (l6VarA == this.f26495w.b()) {
                fi1 fi1VarA = this.f26497y.a(this.f26494v, this.f26495w);
                String str = map.get(t00.b(34));
                x60.e("Loading data ... saving header: %s=%s", t00.b(34), str);
                this.f26498z.a(str);
                AdResponse<T> adResponseA = fi1VarA.a(wm0Var, map, l6VarA);
                if (!(204 == i10)) {
                    return gx0.a(adResponseA, u00.a(wm0Var));
                }
            }
        }
        int i11 = p2.f23954c;
        return gx0.a(p2.a.a(wm0Var));
    }

    @Override // com.yandex.mobile.ads.impl.r71, com.yandex.mobile.ads.impl.mw0
    public final bi1 b(bi1 bi1Var) {
        x60.a(bi1Var, bi1Var.toString(), new Object[0]);
        wm0 wm0Var = bi1Var.f19272a;
        int i10 = p2.f23954c;
        return super.b((bi1) p2.a.a(wm0Var));
    }

    public boolean b(wm0 wm0Var, int i10) {
        if (200 == i10) {
            byte[] bArr = wm0Var.f26320b;
            if (bArr != null && bArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final byte[] b() throws fc {
        if (1 == g()) {
            try {
                String str = this.f26493u;
                if (str != null) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                x60.b("Unsupported Encoding while trying to get the bytes of %s using %s", this.f26493u, "UTF-8");
            }
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final Map<String, String> f() {
        HashMap map = new HashMap();
        String strA = this.f26498z.a();
        if (strA != null) {
            x60.e("Loading data ... sessionData: %s", strA);
            map.put(t00.b(34), strA);
        }
        map.put(t00.b(35), this.f26496x.b(this.f26494v));
        map.put(t00.b(36), this.f26496x.a(this.f26494v));
        map.putAll(this.f26495w.j().c());
        v00.a(this.f26494v, map);
        return map;
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final String m() {
        StringBuilder sb2 = new StringBuilder();
        if (g() == 0) {
            sb2.append(this.f26493u);
        }
        List<fu0> listE = this.f26495w.j().e();
        if (sb2.length() != 0 && listE.size() > 0) {
            sb2.append("&");
        }
        for (int i10 = 0; i10 < listE.size(); i10++) {
            if (i10 != 0) {
                sb2.append("&");
            }
            Objects.requireNonNull(listE.get(i10));
            sb2.append(String.format("%s=%s", null, null));
        }
        return Uri.parse(super.m()).buildUpon().encodedQuery(sb2.toString()).build().toString();
    }
}
