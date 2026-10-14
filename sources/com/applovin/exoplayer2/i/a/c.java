package com.applovin.exoplayer2.i.a;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.i.g;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
abstract class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f6853a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<k> f6854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityQueue<a> f6855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f6856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6858f;

    public static final class a extends j implements Comparable<a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f6859g;

        private a() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            if (c() != aVar.c()) {
                return c() ? 1 : -1;
            }
            long j10 = this.f4754d - aVar.f4754d;
            if (j10 == 0) {
                j10 = this.f6859g - aVar.f6859g;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i.a<b> f6860c;

        public b(i.a<b> aVar) {
            this.f6860c = aVar;
        }

        @Override // com.applovin.exoplayer2.c.i
        public final void f() {
            this.f6860c.releaseOutputBuffer(this);
        }
    }

    public c() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f6853a.add(new a());
        }
        this.f6854b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f6854b.add(new b(new i.a() { // from class: com.applovin.exoplayer2.i.a.f
                @Override // com.applovin.exoplayer2.c.i.a
                public final void releaseOutputBuffer(i iVar) {
                    this.f6863c.a((k) iVar);
                }
            }));
        }
        this.f6855c = new PriorityQueue<>();
    }

    private void a(a aVar) {
        aVar.a();
        this.f6853a.add(aVar);
    }

    @Override // com.applovin.exoplayer2.i.g
    public void a(long j10) {
        this.f6857e = j10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public abstract void a(j jVar);

    public void a(k kVar) {
        kVar.a();
        this.f6854b.add(kVar);
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(j jVar) throws h {
        com.applovin.exoplayer2.l.a.a(jVar == this.f6856d);
        a aVar = (a) jVar;
        if (aVar.b()) {
            a(aVar);
        } else {
            long j10 = this.f6858f;
            this.f6858f = 1 + j10;
            aVar.f6859g = j10;
            this.f6855c.add(aVar);
        }
        this.f6856d = null;
    }

    @Override // com.applovin.exoplayer2.c.d
    public void c() {
        this.f6858f = 0L;
        this.f6857e = 0L;
        while (!this.f6855c.isEmpty()) {
            a((a) ai.a(this.f6855c.poll()));
        }
        a aVar = this.f6856d;
        if (aVar != null) {
            a(aVar);
            this.f6856d = null;
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    public void d() {
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k b() throws h {
        k kVar;
        if (this.f6854b.isEmpty()) {
            return null;
        }
        while (!this.f6855c.isEmpty() && ((a) ai.a(this.f6855c.peek())).f4754d <= this.f6857e) {
            a aVar = (a) ai.a(this.f6855c.poll());
            if (aVar.c()) {
                kVar = (k) ai.a(this.f6854b.pollFirst());
                kVar.b(4);
            } else {
                a((j) aVar);
                if (f()) {
                    com.applovin.exoplayer2.i.f fVarG = g();
                    kVar = (k) ai.a(this.f6854b.pollFirst());
                    kVar.a(aVar.f4754d, fVarG, RecyclerView.FOREVER_NS);
                } else {
                    a(aVar);
                }
            }
            a(aVar);
            return kVar;
        }
        return null;
    }

    public abstract boolean f();

    public abstract com.applovin.exoplayer2.i.f g();

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public j a() throws h {
        com.applovin.exoplayer2.l.a.b(this.f6856d == null);
        if (this.f6853a.isEmpty()) {
            return null;
        }
        a aVarPollFirst = this.f6853a.pollFirst();
        this.f6856d = aVarPollFirst;
        return aVarPollFirst;
    }

    public final k j() {
        return this.f6854b.pollFirst();
    }

    public final long k() {
        return this.f6857e;
    }
}
