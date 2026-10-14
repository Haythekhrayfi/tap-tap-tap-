package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<n> f2716g = new ThreadLocal<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Comparator<c> f2717h = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2720e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<RecyclerView> f2718c = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c> f2721f = new ArrayList<>();

    public static class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        
            if (r0 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int compare(androidx.recyclerview.widget.n.c r7, androidx.recyclerview.widget.n.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.n$c r7 = (androidx.recyclerview.widget.n.c) r7
                androidx.recyclerview.widget.n$c r8 = (androidx.recyclerview.widget.n.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2729d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2729d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f2726a
                boolean r3 = r8.f2726a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f2727b
                int r2 = r7.f2727b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f2728c
                int r8 = r8.f2728c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.n.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f2724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2725d;

        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f2725d * 2;
            int[] iArr = this.f2724c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2724c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i12 * 2];
                this.f2724c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2724c;
            iArr4[i12] = i10;
            iArr4[i12 + 1] = i11;
            this.f2725d++;
        }

        public void b(RecyclerView recyclerView, boolean z10) {
            this.f2725d = 0;
            int[] iArr = this.f2724c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || oVar == null || !oVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z10) {
                if (!recyclerView.mAdapterHelper.g()) {
                    oVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                oVar.collectAdjacentPrefetchPositions(this.f2722a, this.f2723b, recyclerView.mState, this);
            }
            int i10 = this.f2725d;
            if (i10 > oVar.mPrefetchMaxCountObserved) {
                oVar.mPrefetchMaxCountObserved = i10;
                oVar.mPrefetchMaxObservedInInitialPrefetch = z10;
                recyclerView.mRecycler.m();
            }
        }

        public boolean c(int i10) {
            if (this.f2724c != null) {
                int i11 = this.f2725d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f2724c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f2729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2730e;
    }

    public void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f2719d == 0) {
            this.f2719d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.f2722a = i10;
        bVar.f2723b = i11;
    }

    public void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f2718c.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = this.f2718c.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i10 += recyclerView3.mPrefetchRegistry.f2725d;
            }
        }
        this.f2721f.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = this.f2718c.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.f2723b) + Math.abs(bVar.f2722a);
                for (int i14 = 0; i14 < bVar.f2725d * 2; i14 += 2) {
                    if (i12 >= this.f2721f.size()) {
                        cVar2 = new c();
                        this.f2721f.add(cVar2);
                    } else {
                        cVar2 = this.f2721f.get(i12);
                    }
                    int[] iArr = bVar.f2724c;
                    int i15 = iArr[i14 + 1];
                    cVar2.f2726a = i15 <= iAbs;
                    cVar2.f2727b = iAbs;
                    cVar2.f2728c = i15;
                    cVar2.f2729d = recyclerView4;
                    cVar2.f2730e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f2721f, f2717h);
        for (int i16 = 0; i16 < this.f2721f.size() && (recyclerView = (cVar = this.f2721f.get(i16)).f2729d) != null; i16++) {
            RecyclerView.c0 c0VarC = c(recyclerView, cVar.f2730e, cVar.f2726a ? RecyclerView.FOREVER_NS : j10);
            if (c0VarC != null && c0VarC.mNestedRecyclerView != null && c0VarC.isBound() && !c0VarC.isInvalid() && (recyclerView2 = c0VarC.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.b(recyclerView2, true);
                if (bVar2.f2725d != 0) {
                    try {
                        int i17 = l0.j.f32096a;
                        l0.j.a.a(RecyclerView.TRACE_NESTED_PREFETCH_TAG);
                        RecyclerView.z zVar = recyclerView2.mState;
                        RecyclerView.g gVar = recyclerView2.mAdapter;
                        zVar.f2508d = 1;
                        zVar.f2509e = gVar.getItemCount();
                        zVar.f2511g = false;
                        zVar.f2512h = false;
                        zVar.f2513i = false;
                        for (int i18 = 0; i18 < bVar2.f2725d * 2; i18 += 2) {
                            c(recyclerView2, bVar2.f2724c[i18], j10);
                        }
                        l0.j.a.b();
                    } catch (Throwable th) {
                        int i19 = l0.j.f32096a;
                        l0.j.a.b();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            cVar.f2726a = false;
            cVar.f2727b = 0;
            cVar.f2728c = 0;
            cVar.f2729d = null;
            cVar.f2730e = 0;
        }
    }

    public final RecyclerView.c0 c(RecyclerView recyclerView, int i10, long j10) {
        boolean z10;
        int iH = recyclerView.mChildHelper.h();
        int i11 = 0;
        while (true) {
            if (i11 >= iH) {
                z10 = false;
                break;
            }
            RecyclerView.c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.c0 c0VarK = vVar.k(i10, false, j10);
            if (c0VarK != null) {
                if (!c0VarK.isBound() || c0VarK.isInvalid()) {
                    vVar.a(c0VarK, false);
                } else {
                    vVar.h(c0VarK.itemView);
                }
            }
            return c0VarK;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i10 = l0.j.f32096a;
            l0.j.a.a(RecyclerView.TRACE_PREFETCH_TAG);
            if (this.f2718c.isEmpty()) {
                this.f2719d = 0L;
                return;
            }
            int size = this.f2718c.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = this.f2718c.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f2719d = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2720e);
                this.f2719d = 0L;
            }
        } finally {
            this.f2719d = 0L;
            int i12 = l0.j.f32096a;
            l0.j.a.b();
        }
    }
}
