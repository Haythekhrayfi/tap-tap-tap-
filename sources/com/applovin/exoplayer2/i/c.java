package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.common.a.s;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f6922a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f6923b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque<k> f6924c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6926e;

    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f6927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s<com.applovin.exoplayer2.i.a> f6928b;

        public a(long j10, s<com.applovin.exoplayer2.i.a> sVar) {
            this.f6927a = j10;
            this.f6928b = sVar;
        }

        @Override // com.applovin.exoplayer2.i.f
        public int a(long j10) {
            return this.f6927a > j10 ? 0 : -1;
        }

        @Override // com.applovin.exoplayer2.i.f
        public long a(int i10) {
            com.applovin.exoplayer2.l.a.a(i10 == 0);
            return this.f6927a;
        }

        @Override // com.applovin.exoplayer2.i.f
        public List<com.applovin.exoplayer2.i.a> b(long j10) {
            return j10 >= this.f6927a ? this.f6928b : s.g();
        }

        @Override // com.applovin.exoplayer2.i.f
        public int f_() {
            return 1;
        }
    }

    public c() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f6924c.addFirst(new e(new d0.a(this)));
        }
        this.f6925d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        com.applovin.exoplayer2.l.a.b(this.f6924c.size() < 2);
        com.applovin.exoplayer2.l.a.a(!this.f6924c.contains(kVar));
        kVar.a();
        this.f6924c.addFirst(kVar);
    }

    @Override // com.applovin.exoplayer2.i.g
    public void a(long j10) {
    }

    @Override // com.applovin.exoplayer2.c.d
    public void a(j jVar) throws h {
        com.applovin.exoplayer2.l.a.b(!this.f6926e);
        com.applovin.exoplayer2.l.a.b(this.f6925d == 1);
        com.applovin.exoplayer2.l.a.a(this.f6923b == jVar);
        this.f6925d = 2;
    }

    @Override // com.applovin.exoplayer2.c.d
    public void c() {
        com.applovin.exoplayer2.l.a.b(!this.f6926e);
        this.f6923b.a();
        this.f6925d = 0;
    }

    @Override // com.applovin.exoplayer2.c.d
    public void d() {
        this.f6926e = true;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j a() throws h {
        com.applovin.exoplayer2.l.a.b(!this.f6926e);
        if (this.f6925d != 0) {
            return null;
        }
        this.f6925d = 1;
        return this.f6923b;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public k b() throws h {
        com.applovin.exoplayer2.l.a.b(!this.f6926e);
        if (this.f6925d != 2 || this.f6924c.isEmpty()) {
            return null;
        }
        k kVarRemoveFirst = this.f6924c.removeFirst();
        if (this.f6923b.c()) {
            kVarRemoveFirst.b(4);
        } else {
            j jVar = this.f6923b;
            kVarRemoveFirst.a(this.f6923b.f4754d, new a(jVar.f4754d, this.f6922a.a(((ByteBuffer) com.applovin.exoplayer2.l.a.b(jVar.f4752b)).array())), 0L);
        }
        this.f6923b.a();
        this.f6925d = 0;
        return kVarRemoveFirst;
    }
}
