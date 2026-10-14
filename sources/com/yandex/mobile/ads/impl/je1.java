package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class je1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uj1 f22029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ie1 f22030c = new ie1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f22031d = new ArrayList();

    public class a implements uw0<List<ac1>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final uw0<List<ac1>> f22032a;

        public a(uw0<List<ac1>> uw0Var) {
            this.f22032a = uw0Var;
        }

        private void a() {
            if (!je1.this.f22031d.isEmpty()) {
                this.f22032a.a(je1.this.f22031d);
            } else {
                this.f22032a.a(lc1.a(new pr()));
            }
        }

        @Override // com.yandex.mobile.ads.impl.uw0
        public final void a(lc1 lc1Var) {
            a();
        }

        @Override // com.yandex.mobile.ads.impl.uw0
        public final void a(List<ac1> list) {
            Objects.requireNonNull(je1.this.f22030c);
            he1 he1VarA = ie1.a(list);
            je1.this.f22031d.addAll(he1VarA.a());
            List<ac1> listB = he1VarA.b();
            if (listB.isEmpty()) {
                a();
            } else {
                je1.this.f22029b.a(je1.this.f22028a, listB, this);
            }
        }
    }

    public je1(Context context, qa1 qa1Var) {
        this.f22028a = context.getApplicationContext();
        this.f22029b = new uj1(context, qa1Var);
    }

    public final void a(List<ac1> list, uw0<List<ac1>> uw0Var) {
        Objects.requireNonNull(this.f22030c);
        he1 he1VarA = ie1.a(list);
        this.f22031d.addAll(he1VarA.a());
        this.f22029b.a(this.f22028a, he1VarA.b(), new a(uw0Var));
    }
}
