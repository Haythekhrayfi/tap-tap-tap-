package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m51 extends bn implements h51 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h51 f22914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22915d;

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a() {
        h51 h51Var = this.f22914c;
        Objects.requireNonNull(h51Var);
        return h51Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a(long j10) {
        h51 h51Var = this.f22914c;
        Objects.requireNonNull(h51Var);
        return h51Var.a(j10 - this.f22915d);
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final long a(int i10) {
        h51 h51Var = this.f22914c;
        Objects.requireNonNull(h51Var);
        return h51Var.a(i10) + this.f22915d;
    }

    public final void a(long j10, h51 h51Var, long j11) {
        this.f19295b = j10;
        this.f22914c = h51Var;
        if (j11 != RecyclerView.FOREVER_NS) {
            j10 = j11;
        }
        this.f22915d = j10;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final List<am> b(long j10) {
        h51 h51Var = this.f22914c;
        Objects.requireNonNull(h51Var);
        return h51Var.b(j10 - this.f22915d);
    }

    @Override // com.yandex.mobile.ads.impl.tf
    public final void b() {
        super.b();
        this.f22914c = null;
    }
}
