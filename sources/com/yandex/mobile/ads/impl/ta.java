package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.b0 f25294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sa f25295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<qa<?>> f25296c;

    public ta(com.yandex.mobile.ads.nativeads.b0 b0Var, g20 g20Var, ad0 ad0Var, lk0 lk0Var, zj0 zj0Var, lm0 lm0Var) {
        fd.j0.i(b0Var, "nativeAdViewProvider");
        fd.j0.i(g20Var, "imageProvider");
        fd.j0.i(ad0Var, "mediaViewAdapterCreator");
        fd.j0.i(lk0Var, "nativeMediaContent");
        fd.j0.i(zj0Var, "nativeForcePauseObserver");
        fd.j0.i(lm0Var, "nativeVisualBlock");
        sa saVar = new sa(g20Var, ad0Var, lk0Var, zj0Var);
        List<qa<?>> listB = lm0Var.b();
        fd.j0.h(listB, "nativeVisualBlock.assets");
        this(b0Var, saVar, listB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ta(com.yandex.mobile.ads.nativeads.b0 b0Var, sa saVar, List<? extends qa<?>> list) {
        fd.j0.i(b0Var, "nativeAdViewProvider");
        fd.j0.i(saVar, "assetAdapterCreator");
        fd.j0.i(list, "assets");
        this.f25294a = b0Var;
        this.f25295b = saVar;
        this.f25296c = list;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        sa saVar = this.f25295b;
        TextView textViewE = this.f25294a.e();
        Objects.requireNonNull(saVar);
        map.put("close_button", sa.a(textViewE));
        map.put("feedback", this.f25295b.a(this.f25294a.h()));
        map.put("media", this.f25295b.a(this.f25294a.j(), this.f25294a.k()));
        sa saVar2 = this.f25295b;
        View viewN = this.f25294a.n();
        Objects.requireNonNull(saVar2);
        map.put("rating", sa.b(viewN));
        for (qa<?> qaVar : this.f25296c) {
            View viewA = this.f25294a.a(qaVar.b());
            if (viewA != null && !map.containsKey(qaVar.b())) {
                sa saVar3 = this.f25295b;
                String strC = qaVar.c();
                fd.j0.h(strC, "asset.type");
                ra<?> raVarA = saVar3.a(viewA, strC);
                if (raVarA == null) {
                    Objects.requireNonNull(this.f25295b);
                    raVarA = sa.a(viewA);
                }
                String strB = qaVar.b();
                fd.j0.h(strB, "asset.name");
                map.put(strB, raVarA);
            }
        }
        LinkedHashMap linkedHashMapB = this.f25294a.b();
        fd.j0.h(linkedHashMapB, "nativeAdViewProvider.assetViews");
        for (Map.Entry entry : linkedHashMapB.entrySet()) {
            String str = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null && !map.containsKey(str)) {
                fd.j0.h(str, "assetName");
                Objects.requireNonNull(this.f25295b);
                map.put(str, sa.a(view));
            }
        }
        return map;
    }
}
