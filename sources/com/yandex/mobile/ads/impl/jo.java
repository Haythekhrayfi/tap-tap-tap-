package com.yandex.mobile.ads.impl;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class jo {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n51<String> f22094h = new n51() { // from class: com.yandex.mobile.ads.impl.lo1
        @Override // com.yandex.mobile.ads.impl.n51
        public final Object get() {
            return jo.a();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Random f22095i = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v61.d f22096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v61.b f22097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f22098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n51<String> f22099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private br0 f22100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v61 f22101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f22102g;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f22105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private nc0.b f22106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f22107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f22108f;

        public a(String str, int i10, nc0.b bVar) {
            this.f22103a = str;
            this.f22104b = i10;
            this.f22105c = bVar == null ? -1L : bVar.f22015d;
            if (bVar == null || !bVar.a()) {
                return;
            }
            this.f22106d = bVar;
        }

        public final boolean a(int i10, nc0.b bVar) {
            if (bVar == null) {
                return i10 == this.f22104b;
            }
            nc0.b bVar2 = this.f22106d;
            if (bVar2 == null) {
                return !bVar.a() && bVar.f22015d == this.f22105c;
            }
            return bVar.f22015d == bVar2.f22015d && bVar.f22013b == bVar2.f22013b && bVar.f22014c == bVar2.f22014c;
        }

        public final boolean a(v61 v61Var, v61 v61Var2) {
            int i10 = this.f22104b;
            if (i10 < v61Var.b()) {
                v61Var.a(i10, jo.this.f22096a, 0L);
                int i11 = jo.this.f22096a.f25875o;
                while (true) {
                    if (i11 > jo.this.f22096a.f25876p) {
                        i10 = -1;
                        break;
                    }
                    int iA = v61Var2.a(v61Var.a(i11));
                    if (iA != -1) {
                        i10 = v61Var2.a(iA, jo.this.f22097b, false).f25848c;
                        break;
                    }
                    i11++;
                }
            } else if (i10 >= v61Var2.b()) {
                i10 = -1;
                break;
            }
            this.f22104b = i10;
            if (i10 == -1) {
                return false;
            }
            nc0.b bVar = this.f22106d;
            return bVar == null || v61Var2.a(bVar.f22012a) != -1;
        }

        public final boolean a(x8.a aVar) {
            long j10 = this.f22105c;
            if (j10 == -1) {
                return false;
            }
            nc0.b bVar = aVar.f26436d;
            if (bVar == null) {
                return this.f22104b != aVar.f26435c;
            }
            if (bVar.f22015d > j10) {
                return true;
            }
            if (this.f22106d == null) {
                return false;
            }
            int iA = aVar.f26434b.a(bVar.f22012a);
            int iA2 = aVar.f26434b.a(this.f22106d.f22012a);
            nc0.b bVar2 = aVar.f26436d;
            if (bVar2.f22015d < this.f22106d.f22015d || iA < iA2) {
                return false;
            }
            if (iA > iA2) {
                return true;
            }
            boolean zA = bVar2.a();
            nc0.b bVar3 = aVar.f26436d;
            if (!zA) {
                int i10 = bVar3.f22016e;
                return i10 == -1 || i10 > this.f22106d.f22013b;
            }
            int i11 = bVar3.f22013b;
            int i12 = bVar3.f22014c;
            nc0.b bVar4 = this.f22106d;
            int i13 = bVar4.f22013b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f22014c);
        }

        public final void b(int i10, nc0.b bVar) {
            if (this.f22105c == -1 && i10 == this.f22104b && bVar != null) {
                this.f22105c = bVar.f22015d;
            }
        }
    }

    public jo() {
        this(f22094h);
    }

    public jo(n51<String> n51Var) {
        this.f22099d = n51Var;
        this.f22096a = new v61.d();
        this.f22097b = new v61.b();
        this.f22098c = new HashMap<>();
        this.f22101f = v61.f25844a;
    }

    private a a(int i10, nc0.b bVar) {
        a aVar = null;
        long j10 = RecyclerView.FOREVER_NS;
        for (a aVar2 : this.f22098c.values()) {
            aVar2.b(i10, bVar);
            if (aVar2.a(i10, bVar)) {
                long j11 = aVar2.f22105c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10) {
                    int i11 = da1.f19803a;
                    if (aVar.f22106d != null && aVar2.f22106d != null) {
                        aVar = aVar2;
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f22099d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f22098c.put(str, aVar3);
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a() {
        byte[] bArr = new byte[12];
        f22095i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private void b(x8.a aVar) {
        if (aVar.f26434b.c()) {
            this.f22102g = null;
            return;
        }
        a aVar2 = this.f22098c.get(this.f22102g);
        this.f22102g = a(aVar.f26435c, aVar.f26436d).f22103a;
        c(aVar);
        nc0.b bVar = aVar.f26436d;
        if (bVar == null || !bVar.a()) {
            return;
        }
        if (aVar2 != null && aVar2.f22105c == aVar.f26436d.f22015d && aVar2.f22106d != null && aVar2.f22106d.f22013b == aVar.f26436d.f22013b && aVar2.f22106d.f22014c == aVar.f26436d.f22014c) {
            return;
        }
        nc0.b bVar2 = aVar.f26436d;
        a(aVar.f26435c, new nc0.b(bVar2.f22012a, bVar2.f22015d));
        Objects.requireNonNull(this.f22100e);
    }

    public final synchronized String a(v61 v61Var, nc0.b bVar) {
        return a(v61Var.a(bVar.f22012a, this.f22097b).f25848c, bVar).f22103a;
    }

    public final void a(br0 br0Var) {
        this.f22100e = br0Var;
    }

    public final synchronized void a(x8.a aVar) {
        br0 br0Var;
        this.f22102g = null;
        Iterator<a> it = this.f22098c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f22107e && (br0Var = this.f22100e) != null) {
                ((fc0) br0Var).b(aVar, next.f22103a);
            }
        }
    }

    public final synchronized void a(x8.a aVar, int i10) {
        Objects.requireNonNull(this.f22100e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f22098c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.a(aVar)) {
                it.remove();
                if (next.f22107e) {
                    boolean zEquals = next.f22103a.equals(this.f22102g);
                    if (z10 && zEquals) {
                        boolean unused = next.f22108f;
                    }
                    if (zEquals) {
                        this.f22102g = null;
                    }
                    ((fc0) this.f22100e).b(aVar, next.f22103a);
                }
            }
        }
        b(aVar);
    }

    public final synchronized String b() {
        return this.f22102g;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    public final synchronized void c(x8.a aVar) {
        boolean z10;
        Objects.requireNonNull(this.f22100e);
        if (aVar.f26434b.c()) {
            return;
        }
        a aVar2 = this.f22098c.get(this.f22102g);
        if (aVar.f26436d != null && aVar2 != null) {
            if (aVar2.f22105c == -1) {
                if (aVar2.f22104b != aVar.f26435c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (aVar.f26436d.f22015d < aVar2.f22105c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
        }
        a aVarA = a(aVar.f26435c, aVar.f26436d);
        if (this.f22102g == null) {
            this.f22102g = aVarA.f22103a;
        }
        nc0.b bVar = aVar.f26436d;
        if (bVar != null && bVar.a()) {
            nc0.b bVar2 = aVar.f26436d;
            Object obj = bVar2.f22012a;
            a aVarA2 = a(aVar.f26435c, new nc0.b(bVar2.f22013b, bVar2.f22015d, obj));
            if (!aVarA2.f22107e) {
                aVarA2.f22107e = true;
                aVar.f26434b.a(aVar.f26436d.f22012a, this.f22097b);
                Math.max(0L, da1.b(this.f22097b.f25850e) + da1.b(this.f22097b.b(aVar.f26436d.f22013b)));
                Objects.requireNonNull(this.f22100e);
            }
        }
        if (!aVarA.f22107e) {
            aVarA.f22107e = true;
            Objects.requireNonNull(this.f22100e);
        }
        if (aVarA.f22103a.equals(this.f22102g) && !aVarA.f22108f) {
            aVarA.f22108f = true;
            ((fc0) this.f22100e).a(aVar, aVarA.f22103a);
        }
    }

    public final synchronized void d(x8.a aVar) {
        Objects.requireNonNull(this.f22100e);
        v61 v61Var = this.f22101f;
        this.f22101f = aVar.f26434b;
        Iterator<a> it = this.f22098c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.a(v61Var, this.f22101f) || next.a(aVar)) {
                it.remove();
                if (next.f22107e) {
                    if (next.f22103a.equals(this.f22102g)) {
                        this.f22102g = null;
                    }
                    ((fc0) this.f22100e).b(aVar, next.f22103a);
                }
            }
        }
        b(aVar);
    }
}
