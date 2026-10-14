package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f27169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f27170c = new a(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f27171d = v.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e51 f27172e = e51.a();

    public static class a implements e0, rx0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<Activity> f27173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z f27175c;

        public a(z zVar) {
            this.f27175c = zVar;
        }

        @Override // com.yandex.mobile.ads.impl.e0
        public final void a(Activity activity) {
            x60.b("onPause, activity = " + activity, new Object[0]);
            if (this.f27173a == null) {
                this.f27173a = new WeakReference<>(activity);
            }
        }

        @Override // com.yandex.mobile.ads.impl.rx0
        public final void a(Activity activity, Bundle bundle) {
            String string;
            x60.b("onCreated, activity = " + activity, new Object[0]);
            if (bundle == null || (string = bundle.getString("yandex_mobile_ads_activity_id")) == null || !string.equals(this.f27174b)) {
                return;
            }
            this.f27175c.d();
        }

        @Override // com.yandex.mobile.ads.impl.e0
        public final void b(Activity activity) {
            x60.b("onResume, activity = " + activity, new Object[0]);
            WeakReference<Activity> weakReference = this.f27173a;
            if (weakReference == null || !activity.equals(weakReference.get())) {
                return;
            }
            this.f27175c.d();
        }

        @Override // com.yandex.mobile.ads.impl.rx0
        public final void b(Activity activity, Bundle bundle) {
            WeakReference<Activity> weakReference;
            x60.b("onSaveInstanceState, activity = " + activity, new Object[0]);
            if (bundle == null || (weakReference = this.f27173a) == null || !activity.equals(weakReference.get())) {
                return;
            }
            String string = UUID.randomUUID().toString();
            this.f27174b = string;
            bundle.putString("yandex_mobile_ads_activity_id", string);
        }
    }

    public z(Context context, k2 k2Var, b0 b0Var, FalseClick falseClick) {
        this.f27168a = context.getApplicationContext();
        this.f27169b = new d0(context, k2Var, b0Var, falseClick);
    }

    public final void a() {
        this.f27171d.b(this.f27168a, (e0) this.f27170c);
        this.f27171d.b(this.f27168a, (rx0) this.f27170c);
    }

    public final void a(fw0.a aVar) {
        this.f27169b.a(aVar);
    }

    public final void b() {
        this.f27169b.a(3);
    }

    public final void c() {
        this.f27169b.b(3);
    }

    public final void d() {
        this.f27169b.a(1);
        this.f27171d.a(this.f27168a, (e0) this.f27170c);
        this.f27171d.a(this.f27168a, (rx0) this.f27170c);
        this.f27172e.a(s70.f24996c, this);
    }

    public final void e() {
        this.f27172e.b(s70.f24996c, this);
        this.f27171d.b(this.f27168a, (e0) this.f27170c);
        this.f27171d.b(this.f27168a, (rx0) this.f27170c);
        this.f27169b.b(1);
    }

    public final void f() {
        this.f27169b.a(2);
    }

    public final void g() {
        this.f27169b.b(2);
    }
}
