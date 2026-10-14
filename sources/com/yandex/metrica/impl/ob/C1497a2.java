package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1497a2 {

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a2$a */
    public class a implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15721a;

        public a(C1497a2 c1497a2, C1634fe c1634fe) {
            this.f15721a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            Objects.requireNonNull(this.f15721a);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a2$b */
    public class b implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15722a;

        public b(C1497a2 c1497a2, C1634fe c1634fe) {
            this.f15722a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            return this.f15722a.a(context) && this.f15722a.c(context);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a2$c */
    public class c implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15723a;

        public c(C1497a2 c1497a2, C1634fe c1634fe) {
            this.f15723a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            return this.f15723a.c(context);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a2$d */
    public class d implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15724a;

        public d(C1497a2 c1497a2, C1634fe c1634fe) {
            this.f15724a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            Objects.requireNonNull(this.f15724a);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a2$e */
    public class e implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15725a;

        public e(C1497a2 c1497a2, C1634fe c1634fe) {
            this.f15725a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            if (!this.f15725a.a(context)) {
                return false;
            }
            Objects.requireNonNull(this.f15725a);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a2$f */
    public class f implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15726a;

        public f(C1497a2 c1497a2, C1634fe c1634fe) {
            this.f15726a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            Objects.requireNonNull(this.f15726a);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a2$g */
    public class g implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15727a;

        public g(C1497a2 c1497a2, C1634fe c1634fe) {
            this.f15727a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            Objects.requireNonNull(this.f15727a);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a2$h */
    public class h implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15728a;

        public h(C1497a2 c1497a2, C1634fe c1634fe) {
            this.f15728a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            return this.f15728a.a(context);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a2$i */
    public class i implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15729a;

        public i(C1497a2 c1497a2, C1634fe c1634fe) {
            this.f15729a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            return this.f15729a.a(context);
        }
    }

    public InterfaceC1659ge a(C1634fe c1634fe) {
        return new i(this, c1634fe);
    }

    public InterfaceC1659ge b(C1634fe c1634fe) {
        return new h(this, c1634fe);
    }

    public InterfaceC1659ge c(C1634fe c1634fe) {
        return new g(this, c1634fe);
    }

    public InterfaceC1659ge d(C1634fe c1634fe) {
        if (U2.a(29)) {
            return new a(this, c1634fe);
        }
        return U2.a(23) ? new b(this, c1634fe) : new c(this, c1634fe);
    }

    public InterfaceC1659ge e(C1634fe c1634fe) {
        if (U2.a(29)) {
            return new d(this, c1634fe);
        }
        return U2.a(23) ? new e(this, c1634fe) : new f(this, c1634fe);
    }
}
