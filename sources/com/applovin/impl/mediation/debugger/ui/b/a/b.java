package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.ui.d.c;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.b.a.C0113a f9632a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f9633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f9634p;

    public b(com.applovin.impl.b.a.C0113a c0113a, boolean z10, Context context) {
        super(c.b.RIGHT_DETAIL);
        this.f9632a = c0113a;
        this.f9633o = context;
        this.f9717d = new SpannedString(c0113a.a());
        this.f9634p = z10;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean c() {
        return false;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public SpannedString d() {
        return new SpannedString(this.f9632a.b(this.f9633o));
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean j_() {
        Boolean boolA = this.f9632a.a(this.f9633o);
        if (boolA != null) {
            return boolA.equals(Boolean.valueOf(this.f9634p));
        }
        return false;
    }
}
