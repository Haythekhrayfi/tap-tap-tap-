package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2597b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<View> f2598c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f2599a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f2600b;

        public void a(int i10) {
            if (i10 < 64) {
                this.f2599a &= ~(1 << i10);
                return;
            }
            a aVar = this.f2600b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public int b(int i10) {
            long j10;
            a aVar = this.f2600b;
            if (aVar == null) {
                if (i10 >= 64) {
                    j10 = this.f2599a;
                }
                return Long.bitCount(j10);
            }
            if (i10 >= 64) {
                return Long.bitCount(this.f2599a) + aVar.b(i10 - 64);
            }
            j10 = this.f2599a & ((1 << i10) - 1);
            return Long.bitCount(j10);
        }

        public final void c() {
            if (this.f2600b == null) {
                this.f2600b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f2599a & (1 << i10)) != 0;
            }
            c();
            return this.f2600b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f2600b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f2599a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f2599a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f2600b != null) {
                c();
                this.f2600b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f2600b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f2599a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f2599a = j12;
            long j13 = j10 - 1;
            this.f2599a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f2600b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2600b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f2599a = 0L;
            a aVar = this.f2600b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 < 64) {
                this.f2599a |= 1 << i10;
            } else {
                c();
                this.f2600b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f2600b == null) {
                return Long.toBinaryString(this.f2599a);
            }
            return this.f2600b.toString() + "xx" + Long.toBinaryString(this.f2599a);
        }
    }

    public interface b {
    }

    public e(b bVar) {
        this.f2596a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int iB = i10 < 0 ? ((RecyclerView.e) this.f2596a).b() : f(i10);
        this.f2597b.e(iB, z10);
        if (z10) {
            i(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) this.f2596a;
        RecyclerView.this.addView(view, iB);
        RecyclerView.this.dispatchChildAttached(view);
    }

    public void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iB = i10 < 0 ? ((RecyclerView.e) this.f2596a).b() : f(i10);
        this.f2597b.e(iB, z10);
        if (z10) {
            i(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) this.f2596a;
        Objects.requireNonNull(eVar);
        RecyclerView.c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(d.a(RecyclerView.this, sb2));
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        RecyclerView.this.attachViewToParent(view, iB, layoutParams);
    }

    public void c(int i10) {
        RecyclerView.c0 childViewHolderInt;
        int iF = f(i10);
        this.f2597b.f(iF);
        RecyclerView.e eVar = (RecyclerView.e) this.f2596a;
        View childAt = RecyclerView.this.getChildAt(iF);
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("called detach on an already detached child ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(d.a(RecyclerView.this, sb2));
            }
            childViewHolderInt.addFlags(256);
        }
        RecyclerView.this.detachViewFromParent(iF);
    }

    public View d(int i10) {
        return ((RecyclerView.e) this.f2596a).a(f(i10));
    }

    public int e() {
        return ((RecyclerView.e) this.f2596a).b() - this.f2598c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iB = ((RecyclerView.e) this.f2596a).b();
        int i11 = i10;
        while (i11 < iB) {
            int iB2 = i10 - (i11 - this.f2597b.b(i11));
            if (iB2 == 0) {
                while (this.f2597b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB2;
        }
        return -1;
    }

    public View g(int i10) {
        return RecyclerView.this.getChildAt(i10);
    }

    public int h() {
        return ((RecyclerView.e) this.f2596a).b();
    }

    public final void i(View view) {
        this.f2598c.add(view);
        RecyclerView.e eVar = (RecyclerView.e) this.f2596a;
        Objects.requireNonNull(eVar);
        RecyclerView.c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public int j(View view) {
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild == -1 || this.f2597b.d(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - this.f2597b.b(iIndexOfChild);
    }

    public boolean k(View view) {
        return this.f2598c.contains(view);
    }

    public void l(int i10) {
        int iF = f(i10);
        View viewA = ((RecyclerView.e) this.f2596a).a(iF);
        if (viewA == null) {
            return;
        }
        if (this.f2597b.f(iF)) {
            m(viewA);
        }
        ((RecyclerView.e) this.f2596a).c(iF);
    }

    public final boolean m(View view) {
        if (!this.f2598c.remove(view)) {
            return false;
        }
        RecyclerView.e eVar = (RecyclerView.e) this.f2596a;
        Objects.requireNonNull(eVar);
        RecyclerView.c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null) {
            return true;
        }
        childViewHolderInt.onLeftHiddenState(RecyclerView.this);
        return true;
    }

    public String toString() {
        return this.f2597b.toString() + ", hidden list:" + this.f2598c.size();
    }
}
