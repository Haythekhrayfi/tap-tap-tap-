package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.metrica.YandexMetricaConfig;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1506ab {

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ab$a */
    public class a implements Vm<Xa, Wa> {
        public a(C1506ab c1506ab) {
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public Wa a(Xa xa2) {
            return xa2.f15479a;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ab$b */
    public class b implements Vm<Xa, Wa> {
        public b(C1506ab c1506ab) {
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public Wa a(Xa xa2) {
            return xa2.f15481c;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ab$c */
    public class c implements InterfaceC1556cb {
        public c(C1506ab c1506ab) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1556cb
        public long a(D9 d10) {
            return d10.c(RecyclerView.FOREVER_NS);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1556cb
        public void a(D9 d10, long j10) {
            d10.e(j10);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ab$d */
    public class d implements Vm<Xa, Wa> {
        public d(C1506ab c1506ab) {
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public Wa a(Xa xa2) {
            return xa2.f15480b;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ab$e */
    public class e implements InterfaceC1556cb {
        public e(C1506ab c1506ab) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1556cb
        public long a(D9 d10) {
            return d10.b(RecyclerView.FOREVER_NS);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1556cb
        public void a(D9 d10, long j10) {
            d10.d(j10);
        }
    }

    public Za<YandexMetricaConfig> a(Context context, InterfaceC1496a1 interfaceC1496a1) {
        Dm dm = new Dm();
        return new Za<>(context, interfaceC1496a1, "activation", new Ta(dm, new C1606eb()), new a(this), new Ua(dm));
    }

    public Za<P3> b(Context context, InterfaceC1496a1 interfaceC1496a1) {
        return new Za<>(context, interfaceC1496a1, "clids_info", new Va(), new d(this), new e(this));
    }

    public Za<Be> c(Context context, InterfaceC1496a1 interfaceC1496a1) {
        return new Za<>(context, interfaceC1496a1, "preload_info", new C1581db(), new b(this), new c(this));
    }
}
