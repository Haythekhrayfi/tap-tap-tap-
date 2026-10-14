package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ch0 extends RecyclerView.g<yg0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j20> f19504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zg0 f19505b;

    /* JADX WARN: Multi-variable type inference failed */
    public ch0(g20 g20Var, List<? extends j20> list) {
        fd.j0.i(g20Var, "imageProvider");
        fd.j0.i(list, "imageValues");
        this.f19504a = list;
        this.f19505b = new zg0(g20Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        return this.f19504a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        yg0 yg0Var = (yg0) c0Var;
        fd.j0.i(yg0Var, "holderImage");
        yg0Var.a(this.f19504a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        fd.j0.i(viewGroup, "parent");
        return this.f19505b.a(viewGroup);
    }
}
