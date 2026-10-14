package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class vj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj1 f25991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f25992b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private uw0<List<ac1>> f25993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25994d;

    public class a implements uw0<List<ac1>> {
        private a() {
        }

        public /* synthetic */ a(vj1 vj1Var, int i10) {
            this();
        }

        private void a() {
            if (vj1.this.f25994d != 0 || vj1.this.f25993c == null) {
                return;
            }
            vj1.this.f25993c.a(vj1.this.f25992b);
        }

        @Override // com.yandex.mobile.ads.impl.uw0
        public final void a(lc1 lc1Var) {
            vj1.b(vj1.this);
            a();
        }

        @Override // com.yandex.mobile.ads.impl.uw0
        public final void a(List<ac1> list) {
            vj1.b(vj1.this);
            vj1.this.f25992b.addAll(list);
            a();
        }
    }

    public vj1(Context context, qa1 qa1Var) {
        this.f25991a = new rj1(context, qa1Var);
    }

    public static /* synthetic */ void b(vj1 vj1Var) {
        vj1Var.f25994d--;
    }

    public final void a(Context context, List<ac1> list, uw0<List<ac1>> uw0Var) {
        if (list.isEmpty()) {
            uw0Var.a(this.f25992b);
            return;
        }
        this.f25993c = uw0Var;
        for (ac1 ac1Var : list) {
            this.f25994d++;
            this.f25991a.a(context, ac1Var, new a(this, 0));
        }
    }
}
