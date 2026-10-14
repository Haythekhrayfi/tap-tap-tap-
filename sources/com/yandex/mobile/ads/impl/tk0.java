package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class tk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f25380b = a90.a().b();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AdResponse<String> f25381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final mx0 f25382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final vk0 f25383d;

        public a(Context context, AdResponse<String> adResponse, mx0 mx0Var) {
            this.f25381b = adResponse;
            this.f25382c = mx0Var;
            this.f25383d = new vk0(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            cj0 cj0VarA = this.f25383d.a(this.f25381b);
            if (cj0VarA != null) {
                this.f25382c.a(cj0VarA);
            } else {
                this.f25382c.a();
            }
        }
    }

    public tk0(Context context) {
        this.f25379a = context.getApplicationContext();
    }

    public final void a(AdResponse<String> adResponse, mx0 mx0Var) {
        this.f25380b.execute(new a(this.f25379a, adResponse, mx0Var));
    }
}
