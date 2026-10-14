package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TreeSet<n11> f25361c = new TreeSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f25362d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sn f25363e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f25364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25365b;

        public a(long j10, long j11) {
            this.f25364a = j10;
            this.f25365b = j11;
        }
    }

    public tg(int i10, String str, sn snVar) {
        this.f25359a = i10;
        this.f25360b = str;
        this.f25363e = snVar;
    }

    public final long a(long j10, long j11) {
        pa.a(j10 >= 0);
        pa.a(j11 >= 0);
        n11 n11VarB = b(j10, j11);
        boolean z10 = !n11VarB.f24486d;
        long j12 = RecyclerView.FOREVER_NS;
        if (z10) {
            long j13 = n11VarB.f24485c;
            if (!(j13 == -1)) {
                j12 = j13;
            }
            return -Math.min(j12, j11);
        }
        long j14 = j10 + j11;
        if (j14 >= 0) {
            j12 = j14;
        }
        long jMax = n11VarB.f24484b + n11VarB.f24485c;
        if (jMax < j12) {
            for (n11 n11Var : this.f25361c.tailSet(n11VarB, false)) {
                long j15 = n11Var.f24484b;
                if (j15 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j15 + n11Var.f24485c);
                if (jMax >= j12) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public final n11 a(n11 n11Var, long j10, boolean z10) {
        pa.b(this.f25361c.remove(n11Var));
        File file = n11Var.f24487e;
        Objects.requireNonNull(file);
        if (z10) {
            File parentFile = file.getParentFile();
            Objects.requireNonNull(parentFile);
            long j11 = n11Var.f24484b;
            int i10 = this.f25359a;
            int i11 = n11.f23204j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(".");
            sb2.append(j11);
            sb2.append(".");
            File file2 = new File(parentFile, android.support.v4.media.session.e.a(sb2, j10, ".v3.exo"));
            if (file.renameTo(file2)) {
                file = file2;
            } else {
                p90.d("CachedContent", "Failed to rename " + file + " to " + file2);
            }
        }
        n11 n11VarA = n11Var.a(file, j10);
        this.f25361c.add(n11VarA);
        return n11VarA;
    }

    public final sn a() {
        return this.f25363e;
    }

    public final void a(long j10) {
        for (int i10 = 0; i10 < this.f25362d.size(); i10++) {
            if (this.f25362d.get(i10).f25364a == j10) {
                this.f25362d.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void a(n11 n11Var) {
        this.f25361c.add(n11Var);
    }

    public final boolean a(qg qgVar) {
        if (!this.f25361c.remove(qgVar)) {
            return false;
        }
        File file = qgVar.f24487e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final boolean a(yk ykVar) {
        sn snVar = this.f25363e;
        sn snVarA = snVar.a(ykVar);
        this.f25363e = snVarA;
        return !snVarA.equals(snVar);
    }

    public final n11 b(long j10, long j11) {
        n11 n11VarA = n11.a(this.f25360b, j10);
        n11 n11VarFloor = this.f25361c.floor(n11VarA);
        if (n11VarFloor != null && n11VarFloor.f24484b + n11VarFloor.f24485c > j10) {
            return n11VarFloor;
        }
        n11 n11VarCeiling = this.f25361c.ceiling(n11VarA);
        if (n11VarCeiling != null) {
            long j12 = n11VarCeiling.f24484b - j10;
            j11 = j11 == -1 ? j12 : Math.min(j12, j11);
        }
        return n11.a(this.f25360b, j10, j11);
    }

    public final TreeSet<n11> b() {
        return this.f25361c;
    }

    public final boolean c() {
        return this.f25361c.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    public final boolean c(long j10, long j11) {
        boolean z10;
        for (int i10 = 0; i10 < this.f25362d.size(); i10++) {
            a aVar = this.f25362d.get(i10);
            long j12 = aVar.f25365b;
            if (j12 != -1) {
                if (j11 != -1) {
                    long j13 = aVar.f25364a;
                    if (j13 <= j10 && j10 + j11 <= j13 + j12) {
                        z10 = true;
                    }
                }
                z10 = false;
            } else if (j10 >= aVar.f25364a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return this.f25362d.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    public final boolean d(long j10, long j11) {
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f25362d.size()) {
                this.f25362d.add(new a(j10, j11));
                return true;
            }
            a aVar = this.f25362d.get(i10);
            long j12 = aVar.f25364a;
            if (j12 <= j10) {
                long j13 = aVar.f25365b;
                if (j13 != -1 && j12 + j13 <= j10) {
                    z10 = false;
                }
            } else if (j11 != -1 && j10 + j11 <= j12) {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tg.class != obj.getClass()) {
            return false;
        }
        tg tgVar = (tg) obj;
        return this.f25359a == tgVar.f25359a && this.f25360b.equals(tgVar.f25360b) && this.f25361c.equals(tgVar.f25361c) && this.f25363e.equals(tgVar.f25363e);
    }

    public final int hashCode() {
        return this.f25363e.hashCode() + z11.a(this.f25360b, this.f25359a * 31, 31);
    }
}
