package com.applovin.impl.a.a.b.a.a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.utils.g;
import com.applovin.impl.sdk.utils.w;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.a.a.a.a f8282a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f8283o;

    public a(com.applovin.impl.a.a.a.a aVar, Context context) {
        super(c.b.DETAIL);
        this.f8282a = aVar;
        this.f8283o = context;
        this.f9717d = q();
        this.f9718e = r();
    }

    private SpannedString q() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f8282a.a());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f8282a.b());
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString r() {
        StringBuilder sbA = defpackage.a.a("Displayed ");
        sbA.append(w.a(this.f8282a.d(), true));
        return new SpannedString(sbA.toString());
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int a() {
        return c() ? R.drawable.applovin_ic_disclosure_arrow : super.g();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int b() {
        return g.a(R.color.applovin_sdk_disclosureButtonColor, this.f8283o);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean c() {
        return true;
    }
}
