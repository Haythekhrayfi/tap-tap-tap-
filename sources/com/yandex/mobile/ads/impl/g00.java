package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class g00 extends y51 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f00 f20924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m00 f20925f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g00(String str, f00 f00Var, m00 m00Var) {
        super(str, true);
        this.f20924e = f00Var;
        this.f20925f = m00Var;
    }

    @Override // com.yandex.mobile.ads.impl.y51
    public final long e() {
        try {
            this.f20924e.e().a(this.f20925f);
            return -1L;
        } catch (IOException e10) {
            qq0 qq0Var = qq0.f24559a;
            StringBuilder sbA = v60.a("Http2Connection.Listener failure for ");
            sbA.append(this.f20924e.c());
            String string = sbA.toString();
            Objects.requireNonNull(qq0Var);
            qq0.a(4, string, e10);
            try {
                this.f20925f.a(as.f19047c, e10);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
