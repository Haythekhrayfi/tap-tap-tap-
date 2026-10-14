package com.yandex.metrica.impl.ob;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f14437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f14438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<c> f14439c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Um<Intent> f14440d;

    public class a implements Um<Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(Intent intent) {
            Intent intent2 = intent;
            b bVar = M.this.f14438b;
            b.a aVar = bVar == null ? null : bVar.f14443b;
            b bVarA = M.this.a(intent2);
            M.this.f14438b = bVarA;
            if (aVar != bVarA.f14443b) {
                ((C1941rn) M.this.f14437a).execute(new L(this, bVarA));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f14442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f14443b;

        public enum a {
            UNKNOWN(-1),
            NONE(0),
            USB(1),
            WIRELESS(2),
            AC(3);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f14450a;

            a(int i10) {
                this.f14450a = i10;
            }

            public static a a(Integer num) {
                if (num != null) {
                    a[] aVarArrValues = values();
                    for (int i10 = 0; i10 < 5; i10++) {
                        a aVar = aVarArrValues[i10];
                        if (aVar.f14450a == num.intValue()) {
                            return aVar;
                        }
                    }
                }
                return UNKNOWN;
            }

            public int a() {
                return this.f14450a;
            }
        }

        public b(Integer num, a aVar) {
            this.f14442a = num;
            this.f14443b = aVar;
        }
    }

    public interface c {
        void a(b.a aVar);
    }

    public M(InterfaceExecutorC1966sn interfaceExecutorC1966sn, K k10) {
        a aVar = new a();
        this.f14440d = aVar;
        this.f14437a = interfaceExecutorC1966sn;
        this.f14438b = a(k10.c(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b a(Intent intent) {
        b.a aVar = b.a.UNKNOWN;
        Integer numValueOf = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                numValueOf = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            aVar = b.a.NONE;
            if (intExtra3 == 1) {
                aVar = b.a.AC;
            } else if (intExtra3 == 2) {
                aVar = b.a.USB;
            } else if (intExtra3 == 4) {
                aVar = b.a.WIRELESS;
            }
        }
        return new b(numValueOf, aVar);
    }

    public static void a(M m10, b.a aVar) {
        synchronized (m10) {
            Iterator<c> it = m10.f14439c.iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    public Integer a() {
        b bVar = this.f14438b;
        if (bVar == null) {
            return null;
        }
        return bVar.f14442a;
    }

    public synchronized void a(c cVar) {
        this.f14439c.add(cVar);
        ((Yc) cVar).a(b());
    }

    public b.a b() {
        b bVar = this.f14438b;
        return bVar == null ? b.a.UNKNOWN : bVar.f14443b;
    }
}
