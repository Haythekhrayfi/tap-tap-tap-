package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class vk<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<?> f25996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lk0 f25997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f25998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h2 f25999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wk f26000e = new wk();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private lw f26001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r0 f26002g;

    public class a implements r0 {
        private a() {
        }

        public /* synthetic */ a(vk vkVar, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.r0
        public final void a() {
            if (vk.this.f26001f != null) {
                vk.this.f26001f.resume();
            }
        }

        @Override // com.yandex.mobile.ads.impl.r0
        public final void b() {
            if (vk.this.f26001f != null) {
                vk.this.f26001f.pause();
            }
        }
    }

    public vk(AdResponse<?> adResponse, q0 q0Var, h2 h2Var, lk0 lk0Var) {
        this.f25996a = adResponse;
        this.f25997b = lk0Var;
        this.f25998c = q0Var;
        this.f25999d = h2Var;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        a aVar = new a(this, 0);
        this.f26002g = aVar;
        this.f25998c.a(aVar);
        wk wkVar = this.f26000e;
        AdResponse<?> adResponse = this.f25996a;
        h2 h2Var = this.f25999d;
        lk0 lk0Var = this.f25997b;
        Objects.requireNonNull(wkVar);
        lw lwVarA = wk.a(adResponse, h2Var, lk0Var);
        this.f26001f = lwVarA;
        lwVarA.start();
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
        r0 r0Var = this.f26002g;
        if (r0Var != null) {
            this.f25998c.b(r0Var);
        }
        lw lwVar = this.f26001f;
        if (lwVar != null) {
            lwVar.invalidate();
        }
    }
}
