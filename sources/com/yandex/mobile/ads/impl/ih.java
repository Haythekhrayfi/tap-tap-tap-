package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
abstract class ih implements i51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f21706a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<m51> f21707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityQueue<a> f21708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f21709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f21710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f21711f;

    public static final class a extends l51 implements Comparable<a> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f21712j;

        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x002d A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:15:0x002f A[ORIG_RETURN, RETURN] */
        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (f() != aVar2.f()) {
                if (f()) {
                    return 1;
                }
                return -1;
            }
            long j10 = this.f19006e - aVar2.f19006e;
            if (j10 == 0) {
                j10 = this.f21712j - aVar2.f21712j;
                if (j10 == 0) {
                    return 0;
                }
            }
            if (j10 > 0) {
                return 1;
            }
            return -1;
        }
    }

    public static final class b extends m51 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private bn.a<b> f21713e;

        public b(bn.a<b> aVar) {
            this.f21713e = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.bn
        public final void h() {
            this.f21713e.a(this);
        }
    }

    public ih() {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            this.f21706a.add(new a(i10));
        }
        this.f21707b = new ArrayDeque<>();
        while (i10 < 2) {
            this.f21707b.add(new b(new ho1(this)));
            i10++;
        }
        this.f21708c = new PriorityQueue<>();
    }

    @Override // com.yandex.mobile.ads.impl.i51
    public void a(long j10) {
        this.f21710e = j10;
    }

    public final void a(m51 m51Var) {
        m51Var.b();
        this.f21707b.add(m51Var);
    }

    public abstract void b(l51 l51Var);

    public abstract h51 c();

    @Override // com.yandex.mobile.ads.impl.xm
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(l51 l51Var) throws j51 {
        pa.a(l51Var == this.f21709d);
        a aVar = (a) l51Var;
        if (aVar.e()) {
            aVar.b();
            this.f21706a.add(aVar);
        } else {
            long j10 = this.f21711f;
            this.f21711f = 1 + j10;
            aVar.f21712j = j10;
            this.f21708c.add(aVar);
        }
        this.f21709d = null;
    }

    @Override // com.yandex.mobile.ads.impl.xm
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l51 b() throws j51 {
        pa.b(this.f21709d == null);
        if (this.f21706a.isEmpty()) {
            return null;
        }
        a aVarPollFirst = this.f21706a.pollFirst();
        this.f21709d = aVarPollFirst;
        return aVarPollFirst;
    }

    @Override // com.yandex.mobile.ads.impl.xm
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public m51 a() throws j51 {
        m51 m51VarPollFirst;
        if (this.f21707b.isEmpty()) {
            return null;
        }
        while (!this.f21708c.isEmpty()) {
            a aVarPeek = this.f21708c.peek();
            int i10 = da1.f19803a;
            if (aVarPeek.f19006e > this.f21710e) {
                break;
            }
            a aVarPoll = this.f21708c.poll();
            if (aVarPoll.f()) {
                m51VarPollFirst = this.f21707b.pollFirst();
                m51VarPollFirst.b(4);
            } else {
                b(aVarPoll);
                if (h()) {
                    h51 h51VarC = c();
                    m51VarPollFirst = this.f21707b.pollFirst();
                    m51VarPollFirst.a(aVarPoll.f19006e, h51VarC, RecyclerView.FOREVER_NS);
                } else {
                    aVarPoll.b();
                    this.f21706a.add(aVarPoll);
                }
            }
            aVarPoll.b();
            this.f21706a.add(aVarPoll);
            return m51VarPollFirst;
        }
        return null;
    }

    public final m51 f() {
        return this.f21707b.pollFirst();
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public void flush() {
        this.f21711f = 0L;
        this.f21710e = 0L;
        while (!this.f21708c.isEmpty()) {
            a aVarPoll = this.f21708c.poll();
            int i10 = da1.f19803a;
            aVarPoll.b();
            this.f21706a.add(aVarPoll);
        }
        a aVar = this.f21709d;
        if (aVar != null) {
            aVar.b();
            this.f21706a.add(aVar);
            this.f21709d = null;
        }
    }

    public final long g() {
        return this.f21710e;
    }

    public abstract boolean h();
}
