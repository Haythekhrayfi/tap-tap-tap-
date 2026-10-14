package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class c81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f19413a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f19414b = v.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f19415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f19416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lj0 f19417e;

    public interface a {
        void a();

        void b();
    }

    public class b implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f19418a;

        public b(Context context) {
            this.f19418a = new WeakReference<>(context);
        }

        @Override // com.yandex.mobile.ads.impl.e0
        public final void a(Activity activity) {
            Context context = this.f19418a.get();
            if (context == null || !context.equals(activity) || c81.this.f19415c == null) {
                return;
            }
            c81.this.f19415c.b();
        }

        @Override // com.yandex.mobile.ads.impl.e0
        public final void b(Activity activity) {
            Context context = this.f19418a.get();
            if (context == null || !context.equals(activity) || c81.this.f19415c == null) {
                return;
            }
            c81.this.f19415c.a();
        }
    }

    public final void a(Context context) {
        this.f19415c = null;
        e0 e0Var = this.f19416d;
        if (e0Var != null) {
            this.f19414b.a(context, e0Var);
        }
        lj0 lj0Var = this.f19417e;
        if (lj0Var != null) {
            lj0Var.a();
        }
    }

    public final void a(View view, a aVar) {
        this.f19415c = aVar;
        Context context = view.getContext();
        e0 e0Var = this.f19416d;
        if (e0Var != null) {
            this.f19414b.a(context, e0Var);
        }
        lj0 lj0Var = this.f19417e;
        if (lj0Var != null) {
            lj0Var.a();
        }
        x xVar = this.f19413a;
        Context context2 = view.getContext();
        Objects.requireNonNull(xVar);
        int i10 = 0;
        while (true) {
            if (context2 instanceof ContextWrapper) {
                int i11 = i10 + 1;
                if (i10 < 10) {
                    if (context2 instanceof Activity) {
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                    i10 = i11;
                }
            }
            context2 = null;
            break;
        }
        if (context2 != null) {
            this.f19416d = new b(context2);
            this.f19417e = new lj0(view, this.f19415c);
            this.f19414b.b(context2, this.f19416d);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f19417e);
        }
    }
}
