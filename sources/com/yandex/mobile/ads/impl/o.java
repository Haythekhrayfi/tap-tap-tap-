package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f23648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdResponse f23649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jw0 f23650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pk0 f23651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.k f23652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.w f23653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fw0.a f23654g;

    public o(k2 k2Var, AdResponse adResponse, gi giVar, pk0 pk0Var, com.yandex.mobile.ads.nativeads.w wVar, com.yandex.mobile.ads.nativeads.k kVar, fw0.a aVar) {
        this.f23648a = k2Var;
        this.f23649b = adResponse;
        this.f23650c = giVar;
        this.f23651d = pk0Var;
        this.f23653f = wVar;
        this.f23652e = kVar;
        this.f23654g = aVar;
    }

    public final n a(Context context, m mVar) {
        n kuVar;
        String strA = mVar.a();
        ok0 ok0VarA = this.f23651d.a(this.f23650c);
        Objects.requireNonNull(strA);
        switch (strA) {
            case "social_action":
                return new d31(new h11(context, this.f23649b, this.f23648a, this.f23654g), new l31(this.f23648a, new zh0(context, this.f23649b, this.f23648a), this.f23652e, this.f23653f, this.f23651d));
            case "adtune":
                return new l7(new s7(this.f23652e, ok0VarA), new k6(context, this.f23648a), this.f23650c);
            case "feedback":
                kuVar = new ku(new tu(this.f23648a, this.f23650c, this.f23653f, this.f23652e));
                break;
            case "close":
                return new mi(this.f23650c, this.f23652e);
            case "deeplink":
                kuVar = new en(new gn(this.f23650c, ok0VarA, this.f23652e));
                break;
            default:
                return null;
        }
        return kuVar;
    }
}
