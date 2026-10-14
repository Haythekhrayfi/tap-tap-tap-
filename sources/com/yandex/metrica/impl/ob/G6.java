package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class G6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f14066a;

    @TargetApi(26)
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D6 f14067a;

        public a(Context context) {
            this.f14067a = new D6(context);
        }

        @Override // com.yandex.metrica.impl.ob.G6.c
        public E6 a() {
            return this.f14067a;
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F6 f14068a;

        public b(Context context) {
            this.f14068a = new F6(context);
        }

        @Override // com.yandex.metrica.impl.ob.G6.c
        public E6 a() {
            return this.f14068a;
        }
    }

    public interface c {
        E6 a();
    }

    public G6(Context context) {
        this(Build.VERSION.SDK_INT >= 26 ? new a(context) : new b(context));
    }

    public G6(c cVar) {
        this.f14066a = cVar;
    }

    public E6 a() {
        return this.f14066a.a();
    }
}
