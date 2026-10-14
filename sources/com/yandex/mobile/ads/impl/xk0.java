package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class xk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zx0 f26534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lw f26535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f26536c;

    public class a implements ct0 {
        private a() {
        }

        public /* synthetic */ a(xk0 xk0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.ct0
        public final void a() {
            if (xk0.this.f26536c != null) {
                xk0.this.f26536c.setVisibility(8);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ct0
        public final void a(long j10, long j11) {
            if (xk0.this.f26536c != null) {
                xk0.this.f26534a.a(xk0.this.f26536c, j10, j11);
            }
        }
    }

    public xk0(AdResponse<?> adResponse, z61 z61Var, lk0 lk0Var) {
        this.f26535b = ay0.a(adResponse, new a(this, 0), lk0Var);
        this.f26534a = new zx0(z61Var);
    }

    public final void a() {
        this.f26536c = null;
        lw lwVar = this.f26535b;
        if (lwVar != null) {
            lwVar.invalidate();
        }
    }

    public final void a(View view) {
        this.f26536c = view;
        lw lwVar = this.f26535b;
        if (lwVar != null) {
            lwVar.start();
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void b() {
        lw lwVar = this.f26535b;
        if (lwVar != null) {
            lwVar.pause();
        }
    }

    public final void c() {
        lw lwVar = this.f26535b;
        if (lwVar != null) {
            lwVar.resume();
        }
    }
}
