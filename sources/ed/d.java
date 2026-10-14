package ed;

import fd.j0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements dd.g<bd.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f29142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.p<CharSequence, Integer, jc.h<Integer, Integer>> f29145d;

    public static final class a implements Iterator<bd.c>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29146c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f29147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f29148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public bd.c f29149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f29150g;

        public a() {
            int iE = bd.e.e(d.this.f29143b, 0, d.this.f29142a.length());
            this.f29147d = iE;
            this.f29148e = iE;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0023  */
        /* JADX WARN: Code duplicated, block: B:12:0x0033  */
        /* JADX WARN: Code duplicated, block: B:14:0x0047  */
        /* JADX WARN: Code duplicated, block: B:16:0x005b  */
        /* JADX WARN: Code duplicated, block: B:18:0x0078  */
        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public final void a() {
            jc.h<Integer, Integer> hVarInvoke;
            bd.c cVar;
            int i10 = this.f29148e;
            if (i10 < 0) {
                this.f29146c = 0;
                this.f29149f = null;
                return;
            }
            d dVar = d.this;
            int i11 = dVar.f29144c;
            if (i11 > 0) {
                int i12 = this.f29150g + 1;
                this.f29150g = i12;
                if (i12 < i11) {
                    if (i10 > dVar.f29142a.length()) {
                        cVar = new bd.c(this.f29147d, u.z(d.this.f29142a));
                    } else {
                        d dVar2 = d.this;
                        hVarInvoke = dVar2.f29145d.invoke(dVar2.f29142a, Integer.valueOf(this.f29148e));
                        if (hVarInvoke == null) {
                            cVar = new bd.c(this.f29147d, u.z(d.this.f29142a));
                        } else {
                            int iIntValue = hVarInvoke.f31811c.intValue();
                            int iIntValue2 = hVarInvoke.f31812d.intValue();
                            this.f29149f = bd.e.h(this.f29147d, iIntValue);
                            int i13 = iIntValue + iIntValue2;
                            this.f29147d = i13;
                            this.f29148e = i13 + (iIntValue2 == 0 ? 1 : 0);
                        }
                    }
                    this.f29149f = cVar;
                    this.f29148e = -1;
                } else {
                    cVar = new bd.c(this.f29147d, u.z(d.this.f29142a));
                    this.f29149f = cVar;
                    this.f29148e = -1;
                }
            } else {
                if (i10 > dVar.f29142a.length()) {
                    cVar = new bd.c(this.f29147d, u.z(d.this.f29142a));
                } else {
                    d dVar3 = d.this;
                    hVarInvoke = dVar3.f29145d.invoke(dVar3.f29142a, Integer.valueOf(this.f29148e));
                    if (hVarInvoke == null) {
                        cVar = new bd.c(this.f29147d, u.z(d.this.f29142a));
                    } else {
                        int iIntValue3 = hVarInvoke.f31811c.intValue();
                        int iIntValue4 = hVarInvoke.f31812d.intValue();
                        this.f29149f = bd.e.h(this.f29147d, iIntValue3);
                        int i14 = iIntValue3 + iIntValue4;
                        this.f29147d = i14;
                        this.f29148e = i14 + (iIntValue4 == 0 ? 1 : 0);
                    }
                }
                this.f29149f = cVar;
                this.f29148e = -1;
            }
            this.f29146c = 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f29146c == -1) {
                a();
            }
            return this.f29146c == 1;
        }

        @Override // java.util.Iterator
        public bd.c next() {
            if (this.f29146c == -1) {
                a();
            }
            if (this.f29146c == 0) {
                throw new NoSuchElementException();
            }
            bd.c cVar = this.f29149f;
            j0.g(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f29149f = null;
            this.f29146c = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(CharSequence charSequence, int i10, int i11, uc.p<? super CharSequence, ? super Integer, jc.h<Integer, Integer>> pVar) {
        j0.i(charSequence, "input");
        j0.i(pVar, "getNextMatch");
        this.f29142a = charSequence;
        this.f29143b = i10;
        this.f29144c = i11;
        this.f29145d = pVar;
    }

    @Override // dd.g
    public Iterator<bd.c> iterator() {
        return new a();
    }
}
